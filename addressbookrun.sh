#! /bin/bash


for i in `find -type f -name "*.class"`
do
	echo $i
done
 java -classpath ./classes/ com/addressbook/test/$1
