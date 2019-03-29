package main

import (
	"io"
	"net/http"
	"os"
)

func main() {
	if response, err := http.Get(os.Args[1]); err != nil {
		panic(err)
	} else if _, err := io.Copy(os.Stdout, response.Body); err != nil {
		panic(err)
	}
}
