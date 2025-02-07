public class TestProgram {
    public static void main(String[] args) {
        try {
            TestLogger.logInfo("Démarrage des tests");

            // Test 1: Création d'une personne
            testCreationPersonne();
            
            // Test 2: Création d'un permis
            testCreationPermis();
            
            // Test 3: Attribution d'un permis à une personne
            testAttributionPermis();
            
            // Test 4: Test des différents types de permis
            testDifferentsTypesPermis();
            
            TestLogger.logInfo("Tous les tests sont terminés avec succès!");
        } catch (Exception e) {
            TestLogger.logError("Erreur pendant l'exécution des tests", e);
        } finally {
            TestLogger.close();
        }
    }
    
    private static void testCreationPersonne() {
        try {
            TestLogger.logInfo("=== Test 1: Création d'une personne ===");
            Personne personne = new Personne("Dupont", "Jean", java.time.LocalDate.of(1990, 5, 15));
            TestLogger.logInfo("Nom: " + personne.getNom());
            TestLogger.logInfo("Prénom: " + personne.getPrenom());
            TestLogger.logInfo("Date de naissance: " + personne.getDateNaissance());
            TestLogger.logTestResult("Création Personne", true);
        } catch (Exception e) {
            TestLogger.logError("Test de création de personne", e);
            throw e;
        }
    }
    
    private static void testCreationPermis() {
        try {
            TestLogger.logInfo("=== Test 2: Création d'un permis ===");
            PermisConduire permis = new PermisConduire("B123456789", TypePermis.B);
            TestLogger.logInfo("Numéro de permis: " + permis.getNumero());
            TestLogger.logInfo("Type de permis: " + permis.getType());
            TestLogger.logInfo("Description: " + permis.getType().getDescription());
            TestLogger.logTestResult("Création Permis", true);
        } catch (Exception e) {
            TestLogger.logError("Test de création de permis", e);
            throw e;
        }
    }
    
    private static void testAttributionPermis() {
        try {
            TestLogger.logInfo("=== Test 3: Attribution d'un permis à une personne ===");
            Personne personne = new Personne("Dupont", "Jean", java.time.LocalDate.of(1990, 5, 15));
            PermisConduire permis = new PermisConduire("B123456789", TypePermis.B);
            personne.setPermis(permis);
            TestLogger.logInfo(personne.toString());
            TestLogger.logTestResult("Attribution Permis", true);
        } catch (Exception e) {
            TestLogger.logError("Test d'attribution de permis", e);
            throw e;
        }
    }
    
    private static void testDifferentsTypesPermis() {
        try {
            TestLogger.logInfo("=== Test 4: Test des différents types de permis ===");
            TypePermis[] types = TypePermis.values();
            for (TypePermis type : types) {
                TestLogger.logInfo("Type: " + type + " - Description: " + type.getDescription());
            }
            TestLogger.logTestResult("Test Types Permis", true);
        } catch (Exception e) {
            TestLogger.logError("Test des différents types de permis", e);
            throw e;
        }
    }
}
