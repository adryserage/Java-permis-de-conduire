public class PermisConduire {
    private String numero;
    private TypePermis type;

    public PermisConduire(String numero, TypePermis type) {
        this.numero = numero;
        this.type = type;
    }

    public String getNumero() {
        return numero;
    }

    public TypePermis getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Permis de conduire{" +
                "numéro='" + numero + '\'' +
                ", type=" + type +
                " (" + type.getDescription() + ")" +
                '}';
    }
}
