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
        Form<Twit> filledForm = twitForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest (
                views.html.index.render(Twit.all(), filledForm)
            );
        } else {
            Twit.create(filledForm.get());
            return redirect(routes.Application.twits());
        }
    }

    public static Result deleteTwit(Long id) {
        Twit.delete(id);
        return redirect(routes.Application.twits());
    }
}
