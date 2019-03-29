.PHONY: all
all: false-c false-go False.jar

false-c: false.c
	$(COMPILE.c) -o $@ $^

false-go: false.go
	go build -o $@ $^

False.jar: False.class
	jar cfe $@ False $^

False.class: False.java
	javac $^

.PHONY: clean
clean::
	$(RM) false-c false-go False.jar *.class *.[adios]
