package at.ac.fh_kufstein.uebung.Aufgabe4;

public class Freund
{
    private String name;

    public Freund(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return getName()+ " ";
    }

}