package clase03_proavanzada;
class Alumno extends Personas{
    private String strIdAlumno;
    public Alumno(String strIdentificacion, String strNombres, String strEmail) {//Cosntructor de la clase.
        super(strIdentificacion, strNombres, strEmail);
    }

    public Alumno(String strIdentificacion, String strNombres, String strEmail, String strIdAlumno) {//Constructor de la clase
        super(strIdentificacion, strNombres, strEmail);
        this.strIdAlumno = strIdAlumno;
    }

    @Override

    public String toString() {//to string
        return "----- Alumno -----" + super.toString() + "Id Alumno: " + strIdAlumno + '\n';
    }
    
    
}
