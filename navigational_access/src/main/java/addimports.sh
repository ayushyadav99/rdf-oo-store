#!/bin/zsh
IMPL_FILES=/Users/ayushyadav/Work/Semesters/Semester_8/Data_Modelling/project/RDF-2/rdf/src/main/java/travel/impl

for c in $IMPL_FILES/*
do
    echo "Updating $c file"
    sed -i '' "s/import java.net.URI;/import java.net.URI;\nimport java.io.Serializable;\nimport javax.jdo.annotations.Embedded;\nimport javax.persistence.Basic;\nimport javax.persistence.Entity;\nimport javax.persistence.GeneratedValue;\nimport javax.persistence.Id;\n/g" "$c"
done
