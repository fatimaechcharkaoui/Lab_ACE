package stage.learningbycoding.ateliercouplagefaiblefort.Presentation;

import stage.learningbycoding.ateliercouplagefaiblefort.Dao.Etudiant;
import stage.learningbycoding.ateliercouplagefaiblefort.Dao.EtudiantDAO;
import stage.learningbycoding.ateliercouplagefaiblefort.Dao.EtudiantDAODictionary;
import stage.learningbycoding.ateliercouplagefaiblefort.Metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAODictionary();
        EtudiantManager manager = new EtudiantManager(etudiantDAO);

        manager.addEtudiant(new Etudiant(1, "fatima", "fatima", "fatima@example.com"));
        manager.addEtudiant(new Etudiant(2, "abdelmajid", "majid", "majid@example.com"));
        manager.addEtudiant(new Etudiant(3, "Med", "med", "fatimed@example.com"));


        manager.addEtudiant(new Etudiant(4, "maryame", "mery", "fatima@example.com"));


        System.out.println("Liste des étudiants :");
        manager.getAllEtudiants().forEach(System.out::println);

        try {
            manager.addEtudiant(new Etudiant(5, "rayane", "ray", "majid@example.com"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}