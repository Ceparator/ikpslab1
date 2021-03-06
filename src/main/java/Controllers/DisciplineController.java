package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.kyrsach2.api.DisciplineApi;
import ru.vlsu.kyrsach2.model.Discipline;

import javax.validation.Valid;

@RestController
public class DisciplineController implements DisciplineApi {
    @Override
    public ResponseEntity<Discipline> addDiscipline(@Valid Discipline body) {
        Discipline disc = new Discipline();
        disc.setName(body.getName());
        return ResponseEntity.accepted().body(disc);
    }

    @Override
    public ResponseEntity<Void> deleteDiscipline(Long disciplineId) {
        return null;
    }

    @Override
    public ResponseEntity<Discipline> getDisciplineById(Long disciplineId) {
        Discipline disc = new Discipline();
        disc.setName("somename");
        return ResponseEntity.accepted().body(disc);
    }

    @Override
    public ResponseEntity<Void> updateDiscipline(Long disciplineId, String name) {
        return null;
    }
}
