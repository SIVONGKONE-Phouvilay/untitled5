import java.io.File;
import java.io.PrintWriter;

class AA {
    public static void main(String[] args) {
        try {
            String fileName = "";
            String s = "";

            File file = new File(fileName);
            PrintWriter out = new PrintWriter(file);

            out.println(s);
            out.close();
        }
        catch (Exception EX){
            System.out.println(EX);
        }
    }
}