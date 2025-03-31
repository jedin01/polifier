import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polifier {

    private Pattern padrao;
    private Matcher matcher;
    private Integer grau;
    private List<String[]> montardor;

    public Polifier(){
            // there's nothing to do with cats and dogs!
    }

    public void simplificar(String expressao){
        this.grau = new IdentificadorDeEquacoesPolinomiais(expressao).getMaiorGrau();

        this.montardor = new ArrayList<>();

        for (int i = 0; this.grau-i==0; i++){
            this.padrao = Pattern.compile("([-+]?\\d*\\.?\\d*)x?(\\^[%d]".formatted(this.grau-i));
            this.matcher = padrao.matcher(expressao);
            String[] strings = new String[5];
            while (matcher.find()){

                strings[i] = matcher.group(1);
                System.out.println(strings[i]);

            }
            montardor.add(strings);
        }
        System.out.println(montardor);

    }

}
