package stage.learningbycoding.ateliercouplagefaiblefort.Metier;

import stage.learningbycoding.ateliercouplagefaiblefort.Dao.Etudiant;
import stage.learningbycoding.ateliercouplagefaiblefort.Dao.EtudiantDAO;
import stage.learningbycoding.ateliercouplagefaiblefort.Dao.EtudiantDAODictionary;

import java.util.List;

public class EtudiantManager {
    private EtudiantDAO etudiantDAO;

    // Injection de EtudiantDAO
    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        // Vérification de l'email unique
        List<Etudiant> etudiants = etudiantDAO.getAllEtudiants();
        for (Etudiant e : etudiants) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                throw new IllegalArgumentException("L'email est déjà utilisé !");
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}