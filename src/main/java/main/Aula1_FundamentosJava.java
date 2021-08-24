package main;

/**
 * AULA 1 - FUNDAMENTOS DO JAVA
 * 1. Tudo que é ESTÁTICO NÃO necessita de Instancia.
 * 2. Encapsulamento significa esconder a propriedade e fornecer acesso a mesma via Getter e Setter - VERBOSO?.
 * 3. Do contrário do Encapsulamento, temos a Imutabilidade onde as propriedades são public e final e inicializamos as mesmas via construtor.
 * 4. Uso do lombok para diminuir a verbosidade. (@Value para imutabilidade e @Data para encapsulamento).
 *
 * // Equals, HashCode, toString
 *
 * // Dica de leitura: Effective Java 3rd Edition.
 */
public class Aula1_FundamentosJava {

  public static void main(String[] args) {

  }

  // MODIFICADOR DE ACESSO (public, private, protected, default)
  // MODIFICADOR DE ACESSO    TIPO DO RETORNO     NOME DO MÉTODO     (PARAMETROS DE ENTRADA)
  public int bruno(int idade, long peso) {
    return idade;
  }

  public String c3p0(String cor) {
    return "";
  }

  public static Float areaDoTriangulo(Float base, Float altura) {
    return base * altura;
  }
}