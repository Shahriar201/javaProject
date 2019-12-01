package tokenization;

import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author EIMDADUL
 */
public class Tokenization {

    void isDelimiter(String ch) {
        if (",".equals(ch)
                || ";".equals(ch)
                || "(".equals(ch)
                || ")".equals(ch)
                || "{".equals(ch)
                || "}".equals(ch)
                || "[".equals(ch)
                || "]".equals(ch)
                || "_".equals(ch)) {

            System.out.println("");
            System.out.println(ch + "" + " : Delimiter");
            System.out.println("");

        }

    }

    void isOperator(String ch) {
        if ("/".equals(ch)
                || "+".equals(ch)
                || "-".equals(ch)
                || "*".equals(ch)
                || ">".equals(ch)
                || "<".equals(ch)
                || "=".equals(ch)) {

            System.out.println("");
            System.out.println(ch + "" + " : Operator");
            System.out.println("");
        }
    }

    void isKeyword(String ch) {

        if (ch.compareTo("int") == 0
                || ch.compareTo("float") == 0
                || ch.compareTo("double") == 0
                || ch.compareTo("boolean") == 0) {

            System.out.println("");
            System.out.println(ch + "" + " : Keyword");
            System.out.println("");

        }
    }

    void isNumeric(String ch) {

        try {
            int number = (int) Double.parseDouble(ch);

            if (number < 0 || number > 0) {

                System.out.println("");
                System.out.print(ch + "" + " : Numaric valur");
                System.out.println("");
            }
        } catch (Exception e) {

        }
    }

    void isIdentifier(String ch) {

        if (ch.compareTo("int") != 0
                && ch.compareTo("float") != 0
                && ch.compareTo("double") != 0
                && ch.compareTo("boolean") != 0) {

            char chr = ch.charAt(0);

            try {
                String str = String.valueOf(chr);
                int number = (int) Double.parseDouble(str);

                if (number > 0 || number < 0) {
                    System.out.println("");
                    System.out.print(ch + "" + " : Invalid Identifier");
                    System.out.println("");
                }
            } catch (Exception e) {

            }

            if (chr >= 'a' && chr <= 'z' || chr == '_') {
                System.out.println("");
                System.out.print(ch + "" + " : Identifier");
                System.out.println("");
            } else if (chr >= 'A' && chr <= 'Z') {
                System.out.println("");
                System.out.print(ch + "" + " : Identifier");
                System.out.println("");
            }

        }

    }

    public static void main(String[] args) {
        Tokenization object = new Tokenization();
        Scanner input = new Scanner(System.in);
        String ch = input.nextLine();

        StringTokenizer obj = new StringTokenizer(ch);

        while (obj.hasMoreTokens()) {

            String Token = obj.nextToken();
            object.isOperator(Token);
            object.isKeyword(Token);
            object.isDelimiter(Token);
            object.isNumeric(Token);
            object.isIdentifier(Token);

        }

    }

}
