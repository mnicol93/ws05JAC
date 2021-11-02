import java.io.*;
public class StudentInput {

	public static void main(String[] args) {
		Student student = new Student();
		String studentLine="";
		try {
			System.out.println("Please, introduce Student id, name, last "
					+ "name and courses.\nPress enter after every field, "
					+ "and press enter again when finished:");
			BufferedReader studentBuffer = 
					new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fileOut = 
					new FileOutputStream("./files/file.out");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			while((studentLine = studentBuffer.readLine()).length()!=0) {
				out.writeObject(student);
			} 
			out.flush();
			out.close();
			fileOut.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
