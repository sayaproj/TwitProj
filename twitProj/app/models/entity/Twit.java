package models.entity;

import java.util.*;
import play.db.ebean.Model;
import play.data.validation.Constraints.*;
import javax.persistence.*;

/**
 * Twitモデル.
 */
@Entity
public class Twit extends Model{

    @Id
    public Long id;

    @Required
    public String label;

    public static Finder<Long, Twit> find = new Finder(
        Long.class, Twit.class
    );
    public static List<Twit> all() {
        return find.all();
    }

    public static void create(Twit twit) {
        twit.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }
}
