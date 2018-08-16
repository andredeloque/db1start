import java.util.List;
import java.util.ArrayList;
public class NomeDasCores {

public static <Strings> void main(String[] args) {	
		List<String> cores = new ArrayList<String>();
	
		cores.add("vermelho");
        cores.add("amarelo");
        cores.add("verde");
     
		System.out.println("cores"+cores);
		System.out.println("quantidade"+cores.size());
		cores.remove("amarelo") ;
		System.out.println("removendo cor preferida"+cores);
	}

}
