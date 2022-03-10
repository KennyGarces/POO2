package clases;


public class Asignatura {

    private String nomMa;
    private String estudianteM;
    private String profesorM;
    private Float nota;
    

    //Constructor
    public Asignatura(String nonMa,String estudianteM, String profesorM, Float nota ){
        this.setNomMa(nomMa);
        this.setEstudianteM(estudianteM);
        this.setProfesorM(profesorM);   
        this.setNota(nota);
    }

    public Asignatura() {
    }

    public String getnomMa(){
        return  nomMa;
    }

    public String getEstudianteM() {
        return estudianteM;
    }

    public void setEstudianteM(String estudianteM) {
        this.estudianteM = estudianteM;
    }

    public String getProfesorM() {
        return profesorM;
    }

    public void setProfesorM(String profesorM) {
        this.profesorM = profesorM;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public void setNomMa(String nomMa) {
        this.nomMa= nomMa;
    }


    public static void add(Asignatura asig) {
    }

    public  void v_nota (Float nota) throws Exception{
        if(nota > 5 ){
            throw new Excepcion("la nota supera el limite de 5.0");
        }else if( nota < 0){
            throw new Exception("la nota se encuentra por debajo del limite 0.0");
        }else{
            nota = getNota();
        }
    }    





    
    
}
