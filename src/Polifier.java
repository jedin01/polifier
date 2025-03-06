import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Polifier {


    private final String expressao;
    private List<Pattern> regex;
    public Polifier(String expressao){
        this.expressao = expressao;
        this.regex = new ArrayList<Pattern>();
        this.simplificar();
    }
    public void selectRegex(){
        IdentificadorDeEquacoesPolinomiais funcao = new IdentificadorDeEquacoesPolinomiais(this.expressao);

        if(funcao.getMaiorGrau()==1){
            this.regex.add(Pattern.compile("(\\d*\\.?\\d*?)x(\\^[" + funcao.getMaiorGrau() + "])"));
            this.regex.add(Pattern.compile("(\\d*\\.?\\d*?)x(\\^[" + funcao.getMaiorGrau() - 1 + "])"));
        }
        else if (funcao.getMaiorGrau()==2) {
            this.regex.add(Pattern.compile("(\\d*\\.?\\d*?)x(\\^["+funcao.getMaiorGrau()+"])"));
            this.regex.add(Pattern.compile("(\\d*\\.?\\d*?)x(\\^["+funcao.getMaiorGrau()-1+"])"));
        }


    }
    public void simplificar(){

    }
    public String getSimplified(){
        return this.expressao;
    }

}
