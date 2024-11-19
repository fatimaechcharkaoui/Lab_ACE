package stage.learningbycoding.ateliercouplagefaiblefort.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements EtudiantDAO {
    private Map<Integer, Etudiant> etudiantsMap = new HashMap<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        if (etudiantsMap.containsKey(etudiant.getId())) {
            throw new IllegalArgumentException("Un étudiant avec cet ID existe déjà !");
        }
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantsMap.values());
    }
}