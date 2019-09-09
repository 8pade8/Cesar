import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String alphabetString = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    static char[] alphabetChars = alphabetString.toCharArray();

    public static void main(String[] args) throws IOException {
        String alphabetString = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char[] alphabetChars = alphabetString.toCharArray();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for (int i = 0; i < alphabetChars.length; i++) {
            System.out.println(getEncryptCesar(s, i));
        }
        reader.readLine();
        reader.close();
    }

    public static String getEncryptCesar(String s, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int N = getLetterNumber(c);
            N +=key;
            N = N>(alphabetChars.length-1)?N-alphabetChars.length:N;
            stringBuilder.append(alphabetChars[N]);
        }
        return stringBuilder.toString();
    }

    public static int getLetterNumber(char letter) {
        for (int i = 0; i < alphabetChars.length; i++) {
            if (alphabetChars[i] == letter) {
                return i;
            }
        }
        return 0;
    }
}

