package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import main.models.Car;

/**
 * AULA 1 - FUNDAMENTOS DO JAVA 1. Tudo que é ESTÁTICO NÃO necessita de Instancia. 2. Encapsulamento significa esconder a propriedade e fornecer acesso a mesma via Getter e Setter - VERBOSO?. 3. Do
 * contrário do Encapsulamento, temos a Imutabilidade onde as propriedades são public e final e inicializamos as mesmas via construtor. 4. Uso do lombok para diminuir a verbosidade. (@Value para
 * imutabilidade e @Data para encapsulamento).
 *
 * // Equals, HashCode, toString
 *
 * // Dica de leitura: Effective Java 3rd Edition.
 *
 * AULA 2 - CONTINUAÇÃO
 *
 * 1. Utilizar a constante como base de comparação no equals.
 * 2. Sempre sobrescrever o equals (é usado em comparação de listas, por exemplo)
 * 3. Sempre sobrescrever o hashcode (é usado em HashMaps, por exemplo)
 * 4. Regra: Sempre que sobrescreber o equals, sobrescreva o hashCode também!
 * 5. Array:
 *      Manipulado através da posição ( arr[1] = 100 );
 *      Memória: Mais custoso porque precisa duplicar o array toda vez que for manipular e precisa ser sequencial na memória.
 * 6. ArrayList:
 *      Manipulado através do .add onde não me preocupo com index (é feito por de baixo dos panos) e dobra o array interno caso necessário
 *      Memória: Igual ao Array pois é um Array de baixo dos panos.
 * 7. LinkedList:
 *      Manipulado através do .add (é um List), aonde toda alteração adiciona um novo último elemento e muda as referencias do primeiro e agora penultimo elemento
 *      Memória: O que menos ocupa memória
 */
public class Aula1_FundamentosJava {

  public static final Integer CNPJ_LENGTH = 14;

  public static final String MIL_CONTRA = "/0001";

  public static final String MLC = "mlc";

  public static void main(String[] args) {

    // =
    // ==    -> comparação é feita por REFERENCIA (local em memória)

    Car onix = new Car("Etios");

    Car etios = new Car("Etios");
//    System.out.println("onix == etios? " + (onix == etios));
//    System.out.println("onix.equals(etios)? " + (onix.equals(etios)));

//    List<Car> cars = new ArrayList<>();
//    cars.add(onix);

//    Set<Car> cars = new HashSet<>();
//    cars.add(onix);
//    cars.add(etios);

    Map<Car, String> cars = new HashMap<>();
    cars.put(onix, onix.getModel());

    System.out.println("cars.containsKey(etios)? " + (cars.containsKey(etios)));
    System.out.println("cars.get(etios)? " + (cars.get(etios)));
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

  // BOA PRÁTICA: Utilizar a constante como base de comparação no equals.
  // É
  public static boolean isChile(final String country) {
    return MLC.equals(country);
  }

  public static boolean isValidCNPJ(final String cnpj) {

    boolean isValid = cnpj.length() == CNPJ_LENGTH;
    boolean containsMilContra = cnpj.contains(MIL_CONTRA);

//    MÁ PRATICA
//    if (isValid) {
//      if (containsMilContra) {
//        return true;
//      }
//    }
//
//    return false;

//  BOA PRATICA
    return isValid && containsMilContra;
  }
}