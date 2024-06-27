/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author U S E R
 */
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private RDP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if (inp == '(' || inp == var) // apply rule 1
        {
            Term();
            Elist();
        } // end rule 1
        else {
            reject();
        }
    }
    void Elist() {
        if (inp == '+') // apply rule 2
        {
            getInp();
            Term();
            Elist();
        } // end rule 2
        else if (inp == '-') { //apply rule 9
            getInp();
            Term();
            Elist();
        } else if (inp == ')' || inp == 'N') ; // apply rule 3
        else {
            reject();
       }
   }
    void Term() {
        if (inp == '(' || inp == var) // apply rule 4
       {
            Factor();
            Tlist();
        } // end rule 4
        else {
            reject();
       }
    }
    void Tlist() {
        if (inp == '*') // apply rule 5
        {
            getInp();
            Factor();
            Tlist();
        } // end rule 5
        else if (inp == '/') //apply rule 10
        {
            getInp();
            Factor();
            Tlist();
        } else if (inp == '+' || inp == ')' || inp == 'N'); // apply rule 6
        else {
            reject();
        }
    }
    void Factor() {
        if (inp == '(') // apply rule 7
        {
            getInp();
            Expr();
            if (inp == ')') {
                getInp();
            } else {
                reject();
            }
        } // end rule 7
        else if (inp == var) {
            getInp(); // apply rule 8
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

    
