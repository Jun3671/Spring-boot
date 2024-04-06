package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


public class ModelView {
    private  String Viewname;
    private Map<String,Object> model = new HashMap<>();

    public ModelView(String viewname) {
        Viewname = viewname;
    }

    public String getViewname() {
        return Viewname;
    }

    public void setViewname(String viewname) {
        Viewname = viewname;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
