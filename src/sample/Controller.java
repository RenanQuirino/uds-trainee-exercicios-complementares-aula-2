package sample;
public class Controller {
    public static void main(String[] args) {
        sample.Macaco macaco = new sample.Macaco();
        macaco.andar();
        macaco.comerBanana();

        sample.PatoDeCabeçaVermelha pato = new sample.PatoDeCabeçaVermelha();
        pato.Voar();

        sample.PatoCibernetico pato2 = new sample.PatoCibernetico();
        pato2.Voar();
    }
}