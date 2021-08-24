package main.models;

import lombok.Value;

@Value // @Data só que IMUTÁVEL.
public class Invoice {
  public Long id;
  public String name;
  public String age;
  public String weight;
  public String size;
  public String mother;
}
