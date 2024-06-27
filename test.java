import java.io.*;

public class RDP {
    int inp;
    int var = 256; // Assuming var is set to a unique value for identification

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter an input string: ");
        InputStreamReader stdin = new InputStreamReader(System.in);
        RDP rdp = new RDP();
        rdp.inp = rdp.getInp(); // Initialize the first input
        rdp.parse();
    }

    RDP(String input, Apps aThis) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private RDP() {
        // Constructor should not throw an exception
    }

    void parse() {
        Expr();
        if (inp == '\r') { // End marker, computer reads the end marker as "\r"
            accept(); // If the string reached the end marker without rejection, accept the string
        } else {
            reject(); // If not found end marker, reject the string
        }
    }

    

    // Method for printing Accept message
    void accept() {
        System.out.println("Result: Accepted.");
    }

    // Method for printing Reject message
    void reject() {
        System.out.println("Result: Rejected.");
        System.exit(0); // Terminate parser
    }

    // Method for reading the next character of the input string
    char getInp() {
        try {
            return (char) System.in.read();
        } catch (IOException errormsg) {
            System.out.println("IO error: " + errormsg);
        }
        return '#'; // Must return a char
    }
}
