package gallary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/gallary")
public class GallaryController {
	@Autowired
	GallaryService gallaryService;
	
	@GetMapping
	public List<Gallary> getAllPics() {
		return gallaryService.getAllPics();
	}

}
