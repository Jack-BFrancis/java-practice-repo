public class Animal{
    private String species;

    public Animal{
        this.species= "Unknown";
    }
public Animal(String species){
    this.species = species;
}
public String getSpecies(){
    return species;
}
public void setSpecies(String species){
    this.species= species;
}
@Override
public String toString(){
    return "Animal [species= "+ species+ "]";
}
@Override
public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Animal animal = (Animal) obj;
      return species.equals(animal.species);
  }
}