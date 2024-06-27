
import java.io.*;

public class RDP {
    int inp;
    int var = 256;

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter an input string : ");
        InputStreamReader stdin = new InputStreamReader(System.in);
        RDP rdp = new RDP();
        rdp.parse();
    }

    RDP(String input, Apps aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    private RDP() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    void parse() {
        inp = getInp();
        if (inp == '\r') // end marker, computer read the end marker as "\r"
        {
            accept(); // if the string reached the end marker without reject, accept the string
        } else {
            reject(); // if not found end marker, reject the string
        }
    }

    void Expr() {
        if (inp == '(' || inp == var) { // Apply rule 1
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
        } else if (inp == ')' || inp == '\r') {
            // Apply rule 3: epsilon production, do nothing
        } else {
            reject();
        }
    }

    void Term() {
        if (inp == '(' || inp == var) { // Apply rule 4
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
        } else if (inp == '+' || inp == '-' || inp == ')' || inp == '\r') {
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
        } else if (inp == var) { // Apply rule 8
            inp = getInp();
        } else {
            reject();
        }
    }

    // method for print Accept message
    void accept() // Accept the input
    {
        System.out.println("Result: Accepted.");
    }

    // method for print Reject message
    void reject() // Reject the input
    {
        System.out.println("Result : Rejected.");
        System.exit(0); // terminate parser
    }

    // method for reading the input string character
    char getInp() {
        try {
            return (char) System.in.read();
        } catch (IOException errormsg) {
            System.out.println("IO error " + errormsg);
        }
        return '#'; // must return a char
    }
}
