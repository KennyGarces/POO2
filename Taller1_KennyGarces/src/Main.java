import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import clases.Asignatura;
import clases.Estudiante;
import clases.Profesor;
import clases.Excepcion;
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int option;
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        List<Profesor> profesores = new ArrayList<Profesor>();
        List<Asignatura> asignaturas = new ArrayList<Asignatura>();
        do {
            System.out.println("\n     Registro_Universidad");
            System.out.println("Ingrese una opción:\n");
            System.out.println("1. Registrar estudiante.\n2. Buscar estudiante.\n3. Mostrar estudiante.\n ");
            System.out.println("4. Registrar profesor.\n5. Buscar profesor.\n6. Mostrar profesor. \n");
            System.out.println("7. Registar materia.\n8. Buscar materia.\n9. Mostrar materias. \n");
            System.out.println("0. Salir" );
            option = scan.nextInt();
            switch(option){
                case 1:// Registrar estudiante
                    try {
                        System.out.println("Ingrese id:");
                        long id_E = scan.nextLong();
                        System.out.println("Ingrese el nombre:");
                        String nombre_E = scan.next();
                        System.out.println("Ingrese el Apellido:");
                        String apellido_E = scan.next();
                        System.out.println("Semestre:");
                        Integer semestre_E = scan.nextInt();

                        Estudiante est = new Estudiante();
                        est.setId_E(id_E);
                        est.setNombre_E(nombre_E);
                        est.setApellido_E(apellido_E);
                        est.setSemestre_E(semestre_E);
                     
                        estudiantes.add(est);
                        
                } catch (Exception e) {
                  //  TODO: handle exception
                }

                break;

                case 2:// Buscar estudiante 
                    System.out.println("Ingresar el nombre para iniciar la busqueda:");
                    String texto = scan.next();
                        
                try {
                    List<Estudiante> estudiantes2 = estudiantes.stream()
                        .filter(v -> v.getNombre_E().startsWith(texto))
                        .collect(Collectors.toList());
                        
                    estudiantes2.forEach((v) -> System.out.println("\n-Id:"+ v.getId_E()+ "\n-Nombre:"+ v.getNombre_E()+ "\n-Apellido:"+ v.getApellido_E() + "\n-Semestre:"+ v.getSemestre_E()));        


                } catch (Exception e) {
                    System.out.println("Error:" + e.getMessage());
                }
                break;
                //Idiotas :Dyo sipordos
                case 3:// Mostrar estudiante 
                try {
                    estudiantes.forEach((p)-> System.out.println("\n-Id:"+ p.getId_E()+ "\n-Nombre:"+ p.getNombre_E()+ "\n-Apellido:"+ p.getApellido_E() + "\n-Semestre:"+ p.getSemestre_E()));
                    break;
                } catch (Exception e) {
                    //TODO: handle exception
                }

                break;

                case 4:// Registrar profesor
                try {
                    System.out.println("Ingrese id:");
                    long id_P = scan.nextLong();
                    System.out.println("Ingrese el nombre:");
                    String nombre_P = scan.next();
                    System.out.println("Ingrese el Apellido:");
                    String apellido_p = scan.next();
                    System.out.println("Ingrese el tipo de contrato:\n  1.Tiempo completo\n  2.Catedra");
                    Integer contrato_P = scan.nextInt();
                   
                    Profesor Prof = new Profesor();
                    Prof.setId_P(id_P);
                    Prof.setNombre_P(nombre_P);
                    Prof.setApellido_P(apellido_p);
                    Prof.setContrato_P(contrato_P);
                    Prof.contratoT(contrato_P);
                    profesores.add(Prof);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                break;

                case 5:// Buscar profesor
                    System.out.println("Ingresar el nombre para iniciar la busqueda:");
                    String texto1 = scan.next();
                try {
                    List<Profesor> profe = profesores.stream()
                        .filter(v -> v.getNombre_P().startsWith(texto1))
                        .collect(Collectors.toList());
                    profe.forEach((v) -> System.out.println("\n-Id:"+ v.getId_P()+ "\n-Nombre:"+ v.getNombre_P()+ "\n-Apellido:"+ v.getApellido_P() + "\n-Tipo de contrato:"+ v.getContrato_P())); 

                } catch (Exception e) {
                    System.out.println("ERROR:"+ e.getMessage());
                }
                break;

                case 6:// Mostrar profesor
                try {
                    profesores.forEach((p)-> System.out.println("\n-Id:"+ p.getId_P()+ "\n-Nombre:"+ p.getNombre_P()+ "\n-Apellido:"+ p.getApellido_P() + "\n-Tipo de contrato:"+ p.getContrato_P()));
                    break;
                    
                } catch (Exception e) {
                    //TODO: handle exception
                }
                break;

                case 7:// Registrar Materia/Asignatura 
                try {

                    System.out.println("Ingrese el nombre de la materia:");
                    String nomMa = scan.next();
                    System.out.println("Ingrese el nombre del estudiante:");
                    String estudianteM = scan.next();
                    System.out.println("Ingrese el profesor:");
                    String profesorM = scan.next();
                    System.out.println("Ingrese la nota:");
                    Float nota = scan.nextFloat();

                    Asignatura Asig = new Asignatura();
                    Asig.setNota(nota);
                    Asig.setEstudianteM(estudianteM);
                    Asig.setProfesorM(profesorM);
                    Asig.setNomMa(nomMa);
                    Asig.v_nota(nota);
                    asignaturas.add(Asig);
                   
                    
                } catch (Exception e) {
                    System.out.println("Error, no se pudo registrar: " + e.getMessage());
                }
                break;  

                case 8:// Buscar Materia
                    System.out.println("Ingresar el nombre para iniciar busqueda:");
                    String texto2 = scan.next();
                try {
                    List<Asignatura> asign = asignaturas.stream()
                    .filter(v -> v.getnomMa().startsWith(texto2))
                    .collect(Collectors.toList());
                asign.forEach((v) -> System.out.println("\n-Nombre de la materia:"+ v.getnomMa()+ "\n-Nombre del estudiante:"+ v.getEstudianteM()+ "\n-Nombre del maestro:"+ v.getProfesorM() + "\n-Nota:"+ v.getNota()));        
            }
                 catch (Exception e) {
                    //TODO: handle exception
                }
                break;

                case 9:// Mostrar Materia
                try {
                    asignaturas.forEach((p)-> System.out.println("\n-Nombre de la materia:"+ p.getnomMa()+ "\n-Nombre del estudiante:"+ p.getEstudianteM()+ "\n-Nombre del maestro:"+ p.getProfesorM() + "\n-Nota:"+ p.getNota()));
                    break;
                    
                } catch (Exception e) {
                    //TODO: handle exception
                }
                break;


            }
 
        } while (option != 0);
               
    }
}

