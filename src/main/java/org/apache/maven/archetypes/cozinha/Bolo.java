package org.apache.maven.archetypes.cozinha;

public class Bolo {
    private int farinha;
    private int acucar;
    private boolean isCobertura;
    private int ovos;

    public void Bolo(){
    }

    public Bolo(int farinha, int acucar, boolean isCobertura, int ovos){
        this.farinha = farinha;
        this.acucar = acucar;
        this.isCobertura = isCobertura;
        this.ovos = ovos;
    }

    public void misturarIngredientes(){
        System.out.println("Quantidade de farinha usada: " + farinha);
        System.out.println("Quantidade de açucar usado: " + acucar);
        System.out.println("Quantidade de ovos usados: " + ovos);
        System.out.println("INGREDIENTES MISTURADOS!!!");
    }


    public void assarBolo(int tempo){
        System.out.println("Bolo assado por " + tempo + "minutos");
    }

    public void fazerCobertura(){
        if (isCobertura){
        System.out.println("Cobertura adicionada");
        } else {
            System.out.println("Não tem cobertura");
        }
    }
}
