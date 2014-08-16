package models;

import java.util.*;
import play.data.validation.Constraints.*;

/**
 * Twitモデル.
 */
public class Twit {

    public Long id;
    @Required
    public String label;

    public static List<Twit> all() {
        return new ArrayList<Twit>();
    }

    public static void create(Twit twit) {

    }

    public static void delete(Long id) {

    }
}
