package stage.learningbycoding.ateliercouplagefaiblefort.Dao;

import java.util.ArrayList;
import java.util.List;

public interface EtudiantDAO {

    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();

}
