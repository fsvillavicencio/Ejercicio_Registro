package clase03_proavanzada;

import java.util.ArrayList;

public class RegistroAcademico {

    ArrayList<Personas> listPersonas = new ArrayList<>();//Array list de la clase Personas,.
    ArrayList<ComponenteEducativo> listComponente = new ArrayList<>();//Array list de la clase Componente educativo.
    //Se agrega una nueva persona al array list.
    public void agregarPersona(Personas objp) {
        listPersonas.add(objp);
    }
    //Se agrega un nuevo componente.
    public void agregarComponente(ComponenteEducativo objc) {
        listComponente.add(objc);
    }
    //Se mustran las personas.
    public void mostrarPersona() {
        for (int i = 0; i < listPersonas.size(); i++) {
            System.out.println(listPersonas.get(i).toString());

        }
    }
    //Se mustran las personas mas el componente.
    public void mostrarComponente() {

        for (int i = 0; i < listPersonas.size(); i++) {
            System.out.println(listPersonas.get(i).toString() + listComponente.get(i).toString());
            
        }

    }

}
