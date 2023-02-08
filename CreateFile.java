import java.io.*;
import java.util.Scanner;
public class CreateFile {
    public void CreateFile(String path,String destinationPath)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            File source = new File(path);
            File destination = new File(destinationPath);
            if(source.createNewFile())
            {
                System.out.println("File tạo thành công,Hãy nhập nội dung file :");
                String s =sc.nextLine();
                writeIntoSourceFile(path,s);
            }else
            {
                System.out.println("SourceFile đã tồn tại,Hãy nhập nội dung file :");
                String s =sc.nextLine();
                writeIntoSourceFile(path,s);
            }
            if(destination.createNewFile())
            {
                System.out.println("File đích tạo thành công");
            }else
            {
                System.out.println("Nội dung của destination file đã được cập nhật ");
            }
            BufferedReader reader = new BufferedReader(new FileReader(source));
            String line = "";
            while ((line =reader.readLine())!=null)
            {
                char[] lineToChar =line.toCharArray();
                this.writeFile(destinationPath,lineToChar);
            }
            reader.close();

        }catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }
    public void writeFile(String filePath,char[] arr)
    {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(arr);
            bufferedWriter.write('\n');
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeIntoSourceFile(String filePath,String string)
    {

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(string+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
