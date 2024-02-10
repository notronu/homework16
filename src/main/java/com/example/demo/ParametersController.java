package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParametersController {
    private final ParametersService parametersService;
    public ParametersController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }
    String login = "fields74248_";
    String password = "7434263t_";
    String confirmPassword = "7434263t_";
    @GetMapping(path = "/service")
    public String validateParametersInfo(@RequestParam("login") String login,

                                         @RequestParam("password") String password,

                                         @RequestParam("confirmPassword") String confirmPassword) throws WrongPasswordException, WrongLoginException {

        try{
            parametersService.validateParameters(login,  password, confirmPassword);

        } catch (WrongLoginException e){
            return "Неверно введен логин";

        } catch (WrongPasswordException e) {
            return "Неверно введен пароль, либо пароль  не подтвержден";

        } finally {
            System.out.println("Конец");

        }
        return  "Конец" ;
    }
}

