package zivotinje;

public class Macka extends Zivotinja {

    public Macka (String ime, String boja){
        super(ime, boja);
    }

    @Override
    public void animalSound() {
        System.out.println("Macka mjauce");
    }
}
