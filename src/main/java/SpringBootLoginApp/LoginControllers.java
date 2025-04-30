package SpringBootLoginApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginControllers {
	 @GetMapping("/")
	    public String home() {
	        return "login";
	    }

	    @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password, Model model) {
	        if ("admin".equals(username) && "admin123".equals(password)) {
	            model.addAttribute("message", "Login successful");
	            return "success";
	        } else {
	            model.addAttribute("message", "Login failed");
	            return "login";
	        }
	    }
	}
