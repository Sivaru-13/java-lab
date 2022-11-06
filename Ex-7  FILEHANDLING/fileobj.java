import java.io.*;
class student implements Serializable
{
String name = "Sivaru";
String roll = "920420uad030";
}
class fileobj
{
public static void main(String arg[]) throws Exception
{
File file = new File("file1.txt");
ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
student s1=new student();
oos.writeObject(s1.name);
oos.close();
}
}