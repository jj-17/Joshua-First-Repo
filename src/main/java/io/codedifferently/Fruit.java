package io.codedifferently;

public class Fruit 
{
  String type;
  int energy;  

  public Fruit(String type, int energy)
  {
      this.type = type;
      this.energy = energy;
  }

  public String getFruitType()
  {
      return this.type;
  }

  public int getEnergy()
  {
      return this.energy;
  }
}