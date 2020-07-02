#!/bin/bash

function compilejavafile()
{

javac -d ./ classes/ -cp ./ classes/ $1
echo "file compile sucessfully"

}
for javafile in `find . -type  f -name ".java"`

do
	echo $javafile
	compilejavafile $javafile
done
