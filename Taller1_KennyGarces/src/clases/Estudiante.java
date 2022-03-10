package clases;


public class Estudiante {
    
    public static int length;
    private long id_E;
    private String nombre_E;
    private String apellido_E;
    private int Semestre_E;
    
    //Constructor 
    public Estudiante(){ }
    public Estudiante(Long id_ELong, String nombre_E, String apellido_E, int semestre_E) {
        this.setId_E(id_E);
        this.setNombre_E(nombre_E);
        this.setApellido_E(apellido_E);
        this.setSemestre_E(semestre_E);
    }
    //

    public Long getId_E() {
        return id_E;
    }

    public void setId_E(long id_E2) {
        this.id_E = id_E2;
    }

    public String getNombre_E() {
        return nombre_E;
    }

    public void setNombre_E(String nombre_E) {
        this.nombre_E = nombre_E;
    }

    public String getApellido_E() {
        return apellido_E;
    }

    public void setApellido_E(String apellido_E) {
        this.apellido_E = apellido_E;
    }

    public int getSemestre_E() {
        return Semestre_E;
    }

    public void setSemestre_E(int semestre_E) {
        Semestre_E = semestre_E;
    }
    public static void add(Estudiante est) {
    }
    
    public  void v_estduiante (String nombre_p) throws Exception{
        if(!nombre_E.equals(getNombre_E()) ){
            throw new Excepcion("El estudinate no se ecuentra registrado");
        
        }else{
            nombre_E =getNombre_E();
        }}
}