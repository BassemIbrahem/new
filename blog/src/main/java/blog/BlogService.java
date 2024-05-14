package blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

	@Autowired
	BlogRepository blogRepository;

	public BlogService(BlogRepository blogRepository ) {
		this.blogRepository = blogRepository;
	
	}

	public List<Blog> getAllBlogs() {
		return blogRepository.findAll();
	}

}
