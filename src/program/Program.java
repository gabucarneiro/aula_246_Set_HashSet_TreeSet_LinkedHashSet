package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.TreeSet;
import java.util.Set;

import entities.LogUsers;

public class Program {

	public static void main(String[] args) {
		//Utilizando SET - HashSet - TreeSet - LinkedHashSet
		
		//Set não aceita repetições - ou seja, ao definir que o método de comparação é através do nome -
		// LogUsers.hashCode() e LogUsers.equals() - ele apenas inseriu um único de cada.
		
		//TreeSet utiliza o compareTo() para fazer a comparação e já organiza em sequência
		// Portanto, se o objetivo é deixar o nome em ordem alfabética, deve ser comparado o nome.
		
		//LinkedHashSet apenas adiciona na ordem que recebe.
		
		String inputFile = "F:\\eclipse\\workspace\\aula_246_Set_HashSet_TreeSet_LinkedHashSet\\input.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
			String line;
			Set<LogUsers> set = new TreeSet<>();
			while((line = br.readLine()) != null) {
				String[] linhaArquivo = line.split(" ");
				Date dataAcesso = Date.from(Instant.parse(linhaArquivo[1]));
				LogUsers log = new LogUsers(linhaArquivo[0], dataAcesso);
				set.add(log);
			}
			System.out.println("Total users: " + set.size());
			for(LogUsers l : set) {
				System.out.println(l);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
