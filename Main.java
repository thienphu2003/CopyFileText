import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào đường dẫn của file nguồn :");
        String startPathFile = sc.nextLine();
        System.out.println("Hãy nhập vào đường dẫn của file đích ");
        String endPathFile = sc.nextLine();
        CreateFile engine = new CreateFile();
        engine.CreateFile(startPathFile,endPathFile);
    }
}
