import java.io.*;
import java.util.*;
import javax.persistence.*;
import travel.*;
import travel.impl.*;

public class Parser {
	public static String parseQuery(String query) {
		/*
		 	This method converts the SPARQL query to an ObjectDB or JPQL query
		 	Args:
		 		The SPARQL query
		 	Returns:
		 		The equivalent JPQL query
		 */
		
//		Hashmaps that are used to store the objeccts parsed from the query
		HashMap<String, String> prefix = new HashMap<String, String>();
		HashMap<String, String> subject = new HashMap<String, String>();
		HashMap<String, String> predicate = new HashMap<String, String>();
		HashMap<String, String> object = new HashMap<String, String>();
		HashMap<String, String> vars = new HashMap<String, String>();
		HashMap<String, String> instances = new HashMap<String, String>();
		
//		This splits the SPARQL query into tokens
		String delims = "[{}() ]";
		String[] tokens = query.split(delims);
		ArrayList<String> tokenList = new ArrayList<String>();
		for(String s: tokens) {
			if(s.trim().length()!=0 && !s.equals("."))
				tokenList.add(s);
		}
		
//		Tokens are stored in this ArrayList which also removes all the unnecessary tokens that are parsed
		int len = tokenList.size();
		int flag = 0;
		int start = 0;
		int end = 0;
		String filename = "";
		
//		We then iterate through the tokens to identify what they are
		for(int i=0; i<len; i++) {
			if(tokenList.get(i).equals("PREFIX")) {
				prefix.put(tokenList.get(i+1), tokenList.get(i+2));
				
//				The OWL file to which which the corresponding query
				if(tokenList.get(i+2).contains(".owl")) {
					String[] temp = tokenList.get(i+2).split("[/# ]");
					for(String s : temp) {
						if(s.contains(".owl") && !s.contains(".com")) {
							filename += s.replace(".owl", "") + ".impl.Default";
							break;
						}
					}
				}
			}
			else if (tokenList.get(i).equals("SELECT")) {
				flag=1;
				i++;
			}
			else if(tokenList.get(i).equals("WHERE")) {
				flag=2;
				i++;
			}
			
			if(flag==1) {
				vars.put(tokenList.get(i), "0");
			}
//			Subjects and predicates are then separeted 
			if(flag==2) {
				if(vars.containsKey(tokenList.get(i)) && (tokenList.get(i).contains("?") || tokenList.get(i).contains("$")) && tokenList.get(i+1).contains(":")) {
					vars.replace(tokenList.get(i), "sub");
					if(tokenList.get(i+1).equals("rdf:type")) {
						start = prefix.get(tokenList.get(i+2)).indexOf("#")+1;
						end = prefix.get(tokenList.get(i+2)).indexOf(">");
						subject.put(tokenList.get(i), filename+prefix.get(tokenList.get(i+2)).substring(start,end));
					}
					else {
						start = prefix.get(tokenList.get(i+1)).indexOf("#")+1;
						end = prefix.get(tokenList.get(i+1)).indexOf(">");
						predicate.put(tokenList.get(i), prefix.get(tokenList.get(i+1)).substring(start, end));
					}
				}
			}
		}
		
//		The objectDB query begins
		String odbQuery = "SELECT";
		String obj = "obj";
		int count = 1;
		
//		The instances that are required to extract from the objects of the objectDB and mapped to the class they belong to
		for(String s : vars.keySet()) {
			if(vars.get(s).equals("sub"))
				instances.put(subject.get(s), obj+count);
			count++;
		}
		
//		The attributes to be retrieved are then mapped to the corresponding instances created
		count = 1;
		for(String s : vars.keySet()) {
			if(vars.get(s).equals("sub"))
				odbQuery += " " + instances.get(subject.get(s)) + ".name";
			if(count!=vars.keySet().size())
				odbQuery += ",";
			count++;
		}
		
//		Defines which class a particular instance belongs to
		odbQuery += " FROM";
		count = 1;
		for(String s : instances.keySet()) {
			odbQuery += " " + s + " " +instances.get(s);
			if(count != instances.keySet().size())
				odbQuery += ",";
		}
		
//		The predicate defined in the SPARQL query comes under the WHERE clause
		if(predicate.size()>0) {
			odbQuery += " WHERE";
			count = 1;
			for(String s : predicate.keySet()) {
				odbQuery += " " + instances.get(subject.get(s)) + "." + predicate.get(s) + " IS NOT EMPTY";
				if(count != predicate.keySet().size())
					odbQuery += ",";
			}
		}
		return odbQuery;
	}
	
	public static void retrieveQuery(String odbPath, String odbQuery) {
		/*
		 	This takes the converted JPQL query and then process it to the ObjectDB that retrieves the desired output of the query.
		 	Args:
		 		The path of the ObjectDB to which query corresponds to
		 		The converted ObjectDB query
		 	Returns:
		 		Prints the output retrieved after processing the ObjectDB query
		 */
		
//		The path to ObjectDB is given to EntitiyManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(odbPath);
		EntityManager em = emf.createEntityManager();
		
//		The query is then processed from the output of parseQuery
		Query q1 = em.createQuery(odbQuery);
		System.out.println(q1.getSingleResult());
	}
	
	public static void main(String[] args) {
//		Here are some sample SPARQL queries
//		String query = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX owl: <http://www.w3.org/2002/07/owl#> PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> PREFIX capital: <http://www.owl-ontologies.com/travel.owl#Capital> SELECT  ?subject WHERE {?subject rdf:type capital:}";
//		String query = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX owl: <http://www.w3.org/2002/07/owl#> PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> PREFIX capital: <http://www.owl-ontologies.com/travel.owl#Capital> PREFIX hasPart: <http://www.owl-ontologies.com/travel.owl#hasPart> SELECT ?subject WHERE {?subject rdf:type capital: . ?subject hasPart: ?object }";
//		String query = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX owl: <http://www.w3.org/2002/07/owl#> PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> PREFIX pizza_type: <http://www.co-ode.org/ontologies/pizza/pizza.owl#Country> SELECT ?subject WHERE { ?subject rdf:type  pizza_type:}";
		Scanner sc = new Scanner(System.in);
		String query = sc.nextLine();
		String odbQuery =  parseQuery(query);
		retrieveQuery()
	}
}