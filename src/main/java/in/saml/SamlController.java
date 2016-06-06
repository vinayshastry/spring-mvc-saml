package in.saml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/kc")
public class SamlController {

    @RequestMapping(value = "/callback", method = RequestMethod.POST)
    public @ResponseBody String samlCallback(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
        return "got Saml callback " + body;
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public @ResponseBody String samlHome() {
        return "PROFILE PAGE";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public @ResponseBody String samlProfile() {
        return "HOME PAGE";
    }

}
