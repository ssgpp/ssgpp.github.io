# author: Onur Derin <oderin at users.sourceforge.net>

# ssgpp.jar dosyasını içeren dizin
SSGPP=~/ssg++-1.0

all: setup compile

setup:
	ln -sf $(SSGPP)/lib lib

compile: Main.java
	javac -cp $(SSGPP)/ssgpp.jar:. $^

run: Main.class
	java -cp $(SSGPP)/ssgpp.jar:. Main

clean:
	rm *.class
