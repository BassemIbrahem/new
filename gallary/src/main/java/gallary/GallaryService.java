package gallary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GallaryService {

	@Autowired
	GallaryRepository gallaryRepository;
	public List<Gallary> getAllPics() {
		return gallaryRepository.findAll();
	}

}
