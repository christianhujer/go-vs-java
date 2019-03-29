package main

import (
	"os/exec"
	"testing"
)

func TestTrue(t *testing.T) {
	if err := exec.Command("./true").Run(); err != nil {
		t.Error(err)
	}
}