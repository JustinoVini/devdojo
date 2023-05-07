package academy.devdojo.maratonajava.introducao;

/*
* Classe usada para aula 2-3-4
*/

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 100000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = (float) 200.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String umNomeGrande = "Um graaaaaaaaaaaaande texto";

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(idade);
        System.out.println(umNomeGrande);
    }
}
