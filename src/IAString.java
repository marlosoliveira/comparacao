package iatools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IAString {
	public float similar(String s1, String s2) {
		s1 = s1.toUpperCase(); // deixa tudo maiusculo
		s2 = s2.toUpperCase();

		s1 = s1.replace("\\s+", " ");// remover os espaços duplicados (\s+ expressao regular)
		s2 = s2.replace("\\s+", " ");

		s1 = s1.trim(); // remover espaços do inicio e fim
		s2 = s2.trim();

		String palavra1[] = s1.split(" ");
		String palavra2[] = s2.split(" ");

		// melhor comparar com o List.contain, então vamos converter o array em list
		List<String> lista1 = Arrays.asList(palavra1);
		List<String> lista2 = Arrays.asList(palavra2);

		// vamos comparar palavra a palavra, dando um percentual no final baseado na s1
		// como sendo principal

		int i1 = lista1.size(); // numero de palavras em s1

		for (String s : lista1) {
			if (lista2.contains(s)) {

			} else {
				--i1;
			}
		}
	}
}