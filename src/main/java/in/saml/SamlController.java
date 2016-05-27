package in.saml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/saml")
public class SamlController {

    @RequestMapping(value = "/callback", method = RequestMethod.POST)
    public @ResponseBody String samlCallback(@RequestBody String body) {
        return "got Saml callback " + body;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public @ResponseBody String samlLogin() {
        return "logging in";
    }

}
