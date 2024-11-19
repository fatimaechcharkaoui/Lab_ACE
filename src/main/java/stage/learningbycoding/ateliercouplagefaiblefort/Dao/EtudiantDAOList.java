package stage.learningbycoding.ateliercouplagefaiblefort.Dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAOList implements EtudiantDAO {
    private List<Etudiant> etudiantsList = new ArrayList<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        if (etudiantsList.stream().anyMatch(e -> e.getEmail().equals(etudiant.getEmail()))) {
            throw new IllegalArgumentException("L'email est déjà utilisé !");
        }
        etudiantsList.add(etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantsList;
    }
}
