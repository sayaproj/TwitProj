package controllers;

import play.data.*;
import play.mvc.*;
import models.Twit;

import views.html.*;

public class Application extends Controller {

    static Form<Twit> twitForm = Form.form(Twit.class);

    public static Result index() {
        return redirect(routes.Application.twits());
    }

    public static Result twits() {
        return ok(
            views.html.index.render(Twit.all(), twitForm)
        );
    }

    public static Result newTwit() {
        return TODO;
    }

    public static Result deleteTwit(Long id) {
        return TODO;
    }
}
