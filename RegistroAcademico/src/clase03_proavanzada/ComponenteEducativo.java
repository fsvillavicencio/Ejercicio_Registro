package clase03_proavanzada;

public class ComponenteEducativo {
    private String strCodigo;
    private String strNombre;
    private int intNumCreditos;

    public ComponenteEducativo(String strCodigo, String strNombre, int intNumCreditos) {//Constructor de la clase.
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.intNumCreditos = intNumCreditos;
    }
    // Set y Get de cada atributo.
    public String getStrCodigo() {
        return strCodigo;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public int getIntNumCreditos() {
        return intNumCreditos;
    }

    public void setIntNumCreditos(int intNumCreditos) {
        this.intNumCreditos = intNumCreditos;
    }

    @Override
    public String toString() {//to String
        return "Componentes Educativos\n" + "Codigo: " + strCodigo + "\nNombre: " + strNombre + "\nCreditos: " + intNumCreditos;
    }
    
}
