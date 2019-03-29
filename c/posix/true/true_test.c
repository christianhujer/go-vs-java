#include <err.h>
#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <unistd.h>

int main(void)
{
    pid_t pidOfChild = fork();
    if (pidOfChild == 0) {
        static char *const argv[] = {"./true-c", NULL};
        execv("./true-c", argv);
        err(127, NULL);
    }
    int wstatus;
    waitpid(pidOfChild, &wstatus, 0);
    if (wstatus != EXIT_SUCCESS) {
        fprintf(stderr, "Expected exit status to be 0 but got %d\n", wstatus);
        exit(EXIT_FAILURE);
    }
}