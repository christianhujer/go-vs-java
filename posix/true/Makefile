.PHONY: all
all: test

.PHONY: test
test: true
	go test

true: true.go
	go build
.PHONY: clean
clean::
	$(RM) true *.[adios]
