import java.awt.image.PackedColorModel;
import java.util.regex.Pattern;

public class Polifier {


    private final String expressao;
    private Pattern regex;
    public Polifier(String expressao){
        this.expressao = expressao;
    }
    public void selectRegex(){
        switch (new IdentificadorDeEquacoesPolinomiais(this.expressao).getMaiorGrau()){
            case 1:
                this.regex = new Pattern("");
        }
    }

}
