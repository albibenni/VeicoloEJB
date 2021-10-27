package servlet;


import javafx.application.Application;
import javafx.stage.Stage;

import javax.ws.rs.ApplicationPath;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class RestApplication extends Application {
    private Set<Object> singletons;
    private Set<Class<?>> classes;

//    @Override
    public Set<Object> getSingletons() {
        if (singletons == null) {
            singletons = new HashSet<>();
        }
        return Collections.unmodifiableSet(singletons);
    }

//    @Override
    public Set<Class<?>> getClasses() {
        if (classes == null) {
            classes = new HashSet<>();
            classes.add(RestController.class);
        }
        return Collections.unmodifiableSet(classes);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}