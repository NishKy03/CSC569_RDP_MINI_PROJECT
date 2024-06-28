class RDP {
    String inp; 
    int index;    

    public RDP (String inp){
        this.inp = inp;
        this.index = 0;
    }

    public static void main(String[] args) {
        RDP parser = new RDP("your_input_here");
        try {
            parser.parse();
            System.out.println("Input accepted by parser.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    void parse() {
        S(); 
        if (index == inp.length()) {
            accept(); 
        } else {
            reject("Extra characters at the end of the input");
        }
    }

    void S() {
        Expr();
    }

    void Elist() {
        if (index < inp.length() && (inp.charAt(index) == '+' || inp.charAt(index) == '-')) {
            index++;
            Term();
            Elist();
        }
    }

    void Expr() {
        Term();
        Elist();
    }

    void Term() {
        Factor();
        Tlist();
    }

    void Tlist() {
        if (index < inp.length() && (inp.charAt(index) == '*' || inp.charAt(index) == '/')) {
            index++;
            Factor();
            Tlist();
        }
    }

    void Factor() {
        if (index < inp.length() && inp.charAt(index) == '(') {
            index++;
            Expr();
            if (index < inp.length() && inp.charAt(index) == ')') {
                index++;
            } else {
                reject("Missing closing parenthesis");
            }
        } else if (index < inp.length() && Character.isLetter(inp.charAt(index))) {
            while (index < inp.length() && Character.isLetter(inp.charAt(index))) {
                index++; 
            }
        } else {
            reject("\nInvalid character in input: " + inp.charAt(index));
        }
    }

    void accept() {
        throw new RuntimeException("Input accepted by parser.");
    }

    void reject(String message) {
        throw new RuntimeException("Input rejected by parser: " + message);
    }
}
