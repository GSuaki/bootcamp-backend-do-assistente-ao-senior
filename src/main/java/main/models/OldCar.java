package main.models;

import java.awt.Color;
import java.util.Objects;

public class OldCar {

  String model;
  int ano;
  Color color;

  public OldCar(String model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    OldCar car = (OldCar) o;

    return Objects.equals(model, car.model)
        && Objects.equals(ano, car.ano)
        && Objects.equals(color, car.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }
}
