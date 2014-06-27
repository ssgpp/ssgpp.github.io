# author: Onur Derin <oderin at users.sourceforge.net>

SSGPP=~/kulucka/java_workspace/ssgpp.git

all: setup compile

setup:
	ln -sf $(SSGPP)/lib lib

compile: Main.java
	javac -cp $(SSGPP)/dist/ssgpp.jar:. $^

run: Main.class
	java -cp $(SSGPP)/dist/ssgpp.jar:. Main

clean:
	rm *.class
