import java.io.*;

public class RDP {
    char inp;
    String input;
    int index;
    final int VAR = 'a'; // Assume 'var' represents the character 'a' for simplicity

    // Constructor to accept input string
    RDP(String input) {
        this.input = input;
        this.index = 0;
        this.inp = input.charAt(index); // Initialize the first character
    }

    void parse() {
        Expr();
        if (index == input.length()) { // End of string marker
            accept(); // If the string reached the end without rejection, accept the string
        } else {
            reject(); // If not found end marker, reject the string
        }
    }

    void Expr() {
        if (inp == '(' || inp == VAR) { // Apply rule 1
            Term();
            Elist();
        } else {
            reject();
        }
    }

    void Elist() {
        if (inp == '+') { // Apply rule 2
            inp = getInp();
            Term();
            Elist();
        } else if (inp == '-') { // Apply rule 9
            inp = getInp();
            Term();
            Elist();
        } else if (inp == ')' || index == input.length()) {
            // Apply rule 3: epsilon production, do nothing
        } else {
            reject();
        }
    }

    void Term() {
        if (inp == '(' || inp == VAR) { // Apply rule 4
            Factor();
            Tlist();
        } else {
            reject();
        }
    }

    void Tlist() {
        if (inp == '*') { // Apply rule 5
            inp = getInp();
            Factor();
            Tlist();
        } else if (inp == '/') { // Apply rule 10
            inp = getInp();
            Factor();
            Tlist();
        } else if (inp == '+' || inp == '-' || inp == ')' || index == input.length()) {
            // Apply rule 6: epsilon production, do nothing
        } else {
            reject();
        }
    }

    void Factor() {
        if (inp == '(') { // Apply rule 7
            inp = getInp();
            Expr();
            if (inp == ')') {
                inp = getInp();
            } else {
                reject();
            }
        } else if (inp == VAR) { // Apply rule 8
            inp = getInp();
        } else {
            reject();
        }
    }

    // Method for printing Accept message
    void accept() {
        throw new RuntimeException("Accepted"); // Use exception to communicate result
    }

    // Method for printing Reject message
    void reject() {
        throw new RuntimeException("Rejected"); // Use exception to communicate result
    }

    // Method for reading the next character of the input string
    char getInp() {
        index++;
        if (index < input.length()) {
            return input.charAt(index);
        } else {
            return '\0'; // End of string
        }
    }
}
