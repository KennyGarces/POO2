package clases;



public class Profesor {

    private long id_P;
    private String nombre_P;
    private String apellido_P;
    private Integer contrato_P;
    
    //Constructor 
    public Profesor(){ }
    public Profesor(Double id, String nombre, String apellido, Integer contrato) {
        this.setId_P(id_P);
        this.setNombre_P(nombre_P);
        this.setApellido_P(apellido_P);
        this.setContrato_P(contrato_P);
    }

    public Long getId_P() {
        return id_P;
    }

    public void setId_P(long id_P2) {
        this.id_P = id_P2;
    }

    public String getNombre_P() {
        return nombre_P;
    }

    public void setNombre_P(String nombre_P) {
        this.nombre_P = nombre_P;
    }

    public String getApellido_P() {
        return apellido_P;
    }

    public void setApellido_P(String apellido_P) {
        this.apellido_P = apellido_P;
    }

    public Integer getContrato_P() {
        return contrato_P;
    }

    public void setContrato_P(Integer contrato_P) {
        this.contrato_P = contrato_P;
    }
    public static void add(Profesor prof) {
    }
            

    public void contratoT(int tipo){
        if(tipo == 1){
            System.out.println("Contrato de tiempo completo");

        }
        else if(tipo == 2){
            System.out.println("Contrato de catedra");
        
        }
            
        
        


        
    }

    

        

 }

