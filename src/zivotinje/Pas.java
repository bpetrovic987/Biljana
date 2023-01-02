package zivotinje;

public class Pas extends Zivotinja {

    private String rasa;

    public Pas (String imePsa, String boja, String rasa){
        super(imePsa, boja);
        this.rasa=rasa;
    }

    public Pas (String imePsa, String boja){
        super(imePsa, boja);
    }

    public String getRasa(){
        return this.rasa;
    }

    public void setRasa(String rasa){
        this.rasa=rasa;
    }

    @Override
    public void animalSound() {
        System.out.println("Pas laje");
    }
}
