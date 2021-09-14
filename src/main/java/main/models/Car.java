package main.models;

import java.awt.Color;
import java.util.Objects;

public class Car {

  String model;
  int ano;
  Color color;

  public Car(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Car car = (Car) o;

    return Objects.equals(model, car.model)
        && Objects.equals(ano, car.ano)
        && Objects.equals(color, car.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }
}
