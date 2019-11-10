import java.io.*;

public class FileController {
/*
    public static void SaveToFile(Chair chair) throws IOException {
        //Todo -> Save to file, (txt.file)

        FileOutputStream fileOutput = new FileOutputStream("chair.txt");
        ObjectOutputStream ObjectOutput = new ObjectOutputStream(fileOutput);
    
        ObjectOutput.writeObject(chair);

        fileOutput.close();
    }
}
*/

    public static void readFromFile() throws IOException, ClassNotFoundException {

    /*
    File file = new File("/Users/khoihoang/Desktop/Scoops/chair.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));

    String SS;
    while (( SS = br.readLine()) != null)
        System.out.println(SS);
        */

    FileInputStream fileInputStream = new FileInputStream(new File("chair.txt"));
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Chair chair = (Chair) objectInputStream.readObject();

        System.out.println(chair);
        System.out.println(chair.size);


    }
}