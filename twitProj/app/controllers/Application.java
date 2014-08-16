package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result twits() {
        return TODO;
    }

    public static Result newTwit() {
        return TODO;
    }

    public static Result deleteTwit(Long id) {
        return TODO;
    }
}
