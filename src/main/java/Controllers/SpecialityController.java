package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.kyrsach2.api.SpecialityApi;
import ru.vlsu.kyrsach2.model.Speciality;

import javax.validation.Valid;

@RestController
public class SpecialityController implements SpecialityApi {
    @Override
    public ResponseEntity<Speciality> addSpeciality(@Valid Speciality body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteSpeciality(Long specialityId) {
        return null;
    }

    @Override
    public ResponseEntity<Speciality> getSpecialityById(Long specialityId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateSpeciality(Long specialityId, String name, Long code) {
        return null;
    }
}
