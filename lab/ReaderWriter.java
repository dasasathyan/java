import java.util.*;
import java.io.*;

class Venue {
	private String vName;
	private String vAddress;
	private String vCountry;
	private String vSport;

	public void readData() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter vName...");
		vName = br.readLine();

		System.out.println("Enter vAddress...");
		vAddress = br.readLine();

		System.out.println("Enter vCountry...");
		vCountry = br.readLine();

		System.out.println("Enter vSport...");
		vSport = br.readLine();

		System.out.println("All Data Entered.");
	}

	public void displayData() {
		System.out.println("\nVenue Data...");
		System.out.println("vName...\t" + vName);
		System.out.println("vAddress...\t" + vAddress);
		System.out.println("vSport...\t" + vSport);
	}

	public String toString() {
		return (vName + "\t" + vAddress + "\t" + vCountry + "\t" + vSport);
	}
}

public class ReaderWriter {
	static String fileName = "Venue.txt";
	static Venue vObj = new Venue();

	public static void main(String[] args) throws Exception {
		vObj.readData();
		vObj.displayData();

		System.out.println("\nWriter...");
		writer_Demo();

		System.out.println("\nReader...");
		reader_Demo();

		System.out.println("\n");
	}

	public static void writer_Demo() throws Exception {
		Writer writer = new BufferedWriter(new FileWriter(fileName));

		String temp = vObj.toString();
		System.out.println("toString...\n" + temp);

		writer.write(temp);

		writer.close();
	}

	public static void reader_Demo() throws Exception {
		Reader reader = new BufferedReader(new FileReader(fileName));

		int cc=0;
		while ((cc=reader.read()) != -1) {
			System.out.print((char)cc);
		}

		reader.close();
	}
}
