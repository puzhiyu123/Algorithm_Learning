/*
 * this is a simple game-playing program, the program generates a random number
 *      between 1 and 100, which the user attempts to guess in as few tries
 *      as possible.
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// define a global variable here
#define MAX_NUMBER 100

// another way of defining global
int secret_number;

// called these three functions here
void initialize_number_generator(void);
void choose_new_secret_number(void);
void read_guesses(void);

int main(void)
{
    char command;
    printf("Guess the secret number between 1 and %d.\n\n", MAX_NUMBER);

    initialize_number_generator();
    do {
        choose_new_secret_number();
        printf("A new number has been chosen.\n");
        read_guesses();
        printf("Play again (Y/N) ");
        scanf(" %c", &command);
        printf("\n");
    } while (command == y || command ==  Y);

    return 0;
}

void initialize_number_generator(void)
{
    srand((unsigned) time(NULL));
}

void choose_new_secret_number(void)
{
    secret_number =  rand() % MAX_NUMBER + 1;
}

void read_guesses(void)
{
    int guess, num_guesses = 0;

    for(;;) {
        num_guesses++;
        printf("Enter your guess: ");
        scanf("%d", &guess);

        if (guess == secret_number) {
            printf("You won in %d guesses!\n\n", num_guesses);
            return;
        } else if (guess < secret_number)
            printf("Too low; please try again.\n");
        else
            printf("Too high; try again lol. \n");

    }
}

