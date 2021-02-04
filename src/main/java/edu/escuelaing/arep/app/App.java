package edu.escuelaing.arep.app;
import edu.escuelaing.arep.stat.Stat;

import static spark.Spark.*;
public class App
{
        public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        post("/stat" , (request, response) -> {
            Stat calculator = new Stat();
            calculator.readJson(request.body());
            return "{\"mean\":" + calculator.mean() + ", \"stddev\":" + calculator.stddev() + "}";
        });
    }

        static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
