public enum TypePermis {
    B("Permis de conduire standard pour les voitures"),
    A("Permis de conduire pour les motocyclettes"),
    C("Permis de conduire pour les véhicules de transport de marchandises lourds"),
    D("Permis de conduire pour les véhicules de transport en commun"),
    BE("Permis de conduire pour les remorques attachées à un véhicule de catégorie B"),
    CE("Permis de conduire pour les véhicules articulés lourds"),
    DE("Permis de conduire pour les véhicules de transport en commun avec remorque");

    private final String description;

    TypePermis(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
