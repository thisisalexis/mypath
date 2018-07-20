package ve.com.thisisalexis.mypath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("paths")
public class PathController {

	@RequestMapping("list")
	public String list(Model model) {
		return "paths/list";
	}
	
	@RequestMapping("add")
	public String add() {
		return "paths/add";
	}
	
	@RequestMapping("view")
	public String view(int pathId) {
		return "paths/view";
	}
	
	@RequestMapping("edit/{pathId}")
	public String edit( @PathVariable(value="pathId") int pathId) {
		return "paths/edit";
	}
	
}