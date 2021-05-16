#!/bin/zsh
FILES=/Users/ayushyadav/Work/Semesters/Semester_8/Data_Modelling/project/RDF-2/rdf/src/main/java/travel
IMPL_FILES=/Users/ayushyadav/Work/Semesters/Semester_8/Data_Modelling/project/RDF-2/rdf/src/main/java/travel/impl


#updating the package names of the interfaces 
#for c in $FILES/*
#do
#    echo "Updating $c file"
#    sed -i '' "s/package protegeGenCode.pizza/package protegeGenCode.pizza/g" "$c"
#done
#
##updating the package names of the implemented classes
#for c in $IMPL_FILES/*
#do
#    echo "Updating $c file"
#    sed -i '' "s/package pizza.impl/package protegeGenCode.pizza.impl/g" "$c"
#    sed -i '' "s/package pizza.*/package protegeGenCode.pizza.*/g" "$c"
#done

for c in $IMPL_FILES/*
do
    echo "Updating classes in $c file"
    sed -i '' "s/public class/@Entity\n public class/g" "$c"
    og_string="`grep "public class" "$c"`"
    string="`echo "${og_string/{/}"`"
    ser_string="${string}, Serializable {\n\t private static final long serialVersionUID = 1L;\n\t @GeneratedValue\n\t private long id;\n\t @Id \n\t private String name;"
    
    collections="`grep "get.*{$" "$c"`"
    collections="${collections//\(/;}"
    
    updated_collections="`echo "${collections//public/private}"`"
    updated_collections="`echo "${updated_collections//;) {/;}"`"
    updated_collections="`echo "${updated_collections//get/ }"`"
    
    collect=""
    for s in ${(z)updated_collections}
    do
        echo "$s"
        if [ $s = "private" ];
        then
            collect="${collect}\n${s}"
        else
            collect="${collect} ${s}"
        fi;
    done
    
    ser_string="${ser_string}\n${collect}"
    echo "$ser_string" 
    sed -i '' "s/${og_string}/${ser_string}/g" "$c"

    super="super(inference, iri);"
    name="name = iri.toString();"

     
    var_instances="`grep -o "get.*{$" "$c"`"
    var_instances="`echo "${var_instances//\() {/=}"`"
    var_instances="`echo "${var_instances//get/}"`"

    final_string=""
    for a in ${(z)var_instances}; do
        if [ "$a" != ";" ]
        then
            rhs="`echo "${a//=/();}"`"
            final_string="$final_string\n\t$a get$rhs"
        fi;
    done

    new_constructor="$super\n\t$name\n\t$final_string"
    echo "$new_constructor"

    sed -i '' "s/${super}/${new_constructor}/g" "$c"
    
done


