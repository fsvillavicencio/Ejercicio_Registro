package clase03_proavanzada;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int intSeleccion;
        int intSeleccion2;
        String strIdentificacion;
        String strNombres;
        String strEmail;
        String strIdAlumno;
        String strIdDocente;
        int intTipoD;
        String strHClases;
        String strHTutoria;
        boolean estado = true;
        int intOpcMenu;
        //Arreglo de asignaturas.
        String strComponentes[] = {"Calculo", "Programacion", "Fisica", "Estadistica", "Ingles"};
        String strEspecializacion;
        Alumno objAlumno = null;
        DocenteAuxiliar objDocenteAuxilar;
        DocenteTitular objDocenteTitular;
        boolean mostrar = false;

        ComponenteEducativo objComponente = null;
        RegistroAcademico objRegistroAcademico = new RegistroAcademico();
        //Recorre las asignaturas.
        for (int i = 0; i < strComponentes.length; i++) {
            objComponente = new ComponenteEducativo("100" + i, strComponentes[i], 4);
            objRegistroAcademico.agregarComponente(objComponente);
        }
        while (estado) {
            System.out.println("---- MENU DE OPCIONES ----\n");
            System.out.println("1. Registro de Persona.");
            System.out.println("2. Registro de Componente Educativo.");
            System.out.println("3. Mostrar Registros.");
            System.out.println("Seleccione: ");
            intSeleccion = entrada.nextInt();
            switch (intSeleccion) {
                case 1:
                    
                    System.out.println("Seleccione tipo de persona:\n");
                    System.out.println("1. Alumno");
                    System.out.println("2. Docente");
                    System.out.println("Seleccione: ");
                    intSeleccion2 = entrada.nextInt();
                    switch (intSeleccion2) {
                        case 1:
                            entrada.nextLine();

                            System.out.println("Ingrese Identificacion del Alumno:");
                            strIdentificacion = entrada.nextLine();
                            System.out.println("Ingrese Nombres del Alumno :");
                            strNombres = entrada.nextLine();
                            System.out.println("Ingrese Email del Alumno :");
                            strEmail = entrada.nextLine();
                            System.out.println("Ingrese Id de Alumno :");
                            strIdAlumno = entrada.nextLine();
                            //Se envia datos a la clase alumno.
                            objAlumno = new Alumno(strIdentificacion, strNombres, strEmail, strIdAlumno);
                            objRegistroAcademico.agregarPersona(objAlumno);//Se agrega la persona a un Array list.
                            try {
                                File f = new File("Registro.csv");//Se crea un archivo.
                                FileWriter fw;
                                BufferedWriter bw;
                                if (f.exists()) {//Si existe se sobreescribe el texto.
                                    fw = new FileWriter(f, true);
                                    bw = new BufferedWriter(fw);
                                    bw.newLine();
                                    bw.write(objAlumno.toString() + objComponente.toString());

                                } else {
                                    //Si no exite se escribe el texto.
                                    fw = new FileWriter(f, true);
                                    bw = new BufferedWriter(fw);
                                    bw.newLine();
                                    bw.write(objAlumno.toString() + objComponente.toString());
                                }
                                bw.close(); // cierra el archivo 
                                fw.close(); // cierra el archivo    
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                            mostrar = true;
                            System.out.println("Desea realizar otra operacion:\n1. SI\n2. NO\nSeleccione:");
                            intOpcMenu = entrada.nextInt();
                            if (intOpcMenu == 2) {
                                estado = false;
                            }

                            break;
                        case 2:
                            entrada.nextLine();

                            System.out.println("Ingrese Identificacion del Docente :");
                            strIdentificacion = entrada.nextLine();
                            System.out.println("Ingrese Nombres del Docente :");
                            strNombres = entrada.nextLine();
                            System.out.println("Ingrese Email del Docente :");
                            strEmail = entrada.nextLine();
                            System.out.println("Ingrese Id del Docente :");
                            strIdDocente = entrada.nextLine();
                            System.out.println("Ingrese la especializacion del Docente :");
                            strEspecializacion = entrada.nextLine();
                            System.out.println("Ingrese tipo de Docente :");
                            System.out.println("1. Titular");
                            System.out.println("2. Auxiliar");
                            intTipoD = entrada.nextInt();
                            if (intTipoD == 1) {
                                entrada.nextLine();
                                System.out.println("Docente Titular");
                                System.out.println("Ingrese el horario de clases del Docente :");
                                strHClases = entrada.nextLine();
                                //Se envia datos a la clase docente titular.
                                objDocenteTitular = new DocenteTitular(strIdentificacion, strNombres, strEmail, strHClases, strIdDocente, strEspecializacion, "Titular");
                                objRegistroAcademico.agregarPersona(objDocenteTitular);//Se agrega la persona a un Array list.
                                try {
                                    File f = new File("Registro.csv");
                                    FileWriter fw;
                                    BufferedWriter bw;
                                    if (f.exists()) {
                                        fw = new FileWriter(f, true);
                                        bw = new BufferedWriter(fw);
                                        bw.newLine();
                                        bw.write(objDocenteTitular.toString() + objComponente.toString());

                                    } else {
                                        fw = new FileWriter(f, true);
                                        bw = new BufferedWriter(fw);
                                        bw.newLine();
                                        bw.write(objDocenteTitular.toString() + objComponente.toString());
                                    }
                                    bw.close(); // cierra el archivo 
                                    fw.close(); // cierra el archivo    
                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            } else if (intTipoD == 2) {
                                entrada.nextLine();
                                System.out.println("Docente Auxiliar");
                                System.out.println("Ingrese el horario de tutorias del Docente :");
                                strHTutoria = entrada.nextLine();
                                //Se envia datos a la clase auxiliar.
                                objDocenteAuxilar = new DocenteAuxiliar(strIdentificacion, strNombres, strEmail, strHTutoria, strIdDocente, strEspecializacion, "Auxiliar");
                                objRegistroAcademico.agregarPersona(objDocenteAuxilar);//Se agrega la persona a un Array list.
                                try {
                                    File f = new File("Registro.csv");
                                    FileWriter fw;
                                    BufferedWriter bw;
                                    if (f.exists()) {
                                        fw = new FileWriter(f, true);
                                        bw = new BufferedWriter(fw);
                                        bw.newLine();
                                        bw.write(objDocenteAuxilar.toString());

                                    } else {
                                        fw = new FileWriter(f, true);
                                        bw = new BufferedWriter(fw);

                                        bw.newLine();
                                        bw.write(objDocenteAuxilar.toString());
                                    }
                                    bw.close(); // cierra el archivo 
                                    fw.close(); // cierra el archivo    
                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            }

                            mostrar = true;

                            System.out.println("Desea realizar otra operacion:\n1. SI\n2. NO\nSeleccione:");
                            intOpcMenu = entrada.nextInt();
                            if (intOpcMenu == 2) {
                                estado = false;
                            }
                            break;
                    }
                    break;
                case 2:
                    //Se registran los componentes educativos que estan en el arreglo.
                    for (int i = 0; i < strComponentes.length; i++) {
                        objComponente = new ComponenteEducativo("100" + i, strComponentes[i], 4);
                        objRegistroAcademico.agregarComponente(objComponente);
                    }
                    mostrar = false;
                    System.out.println("Componentes Educativos Registrados");
                    System.out.println("Desea realizar otra operacion:\n1. SI\n2. NO\nSeleccione:");
                    intOpcMenu = entrada.nextInt();
                    if (intOpcMenu == 2) {
                        estado = false;
                    }
                    break;
                case 3:
                    //Se muestran las personas registradas.
                    if (mostrar == true) {
                        objRegistroAcademico.mostrarPersona();
                    } else if (mostrar == false) {
                        objRegistroAcademico.mostrarComponente();
                    }

                    break;
            }
        }
    }
}
