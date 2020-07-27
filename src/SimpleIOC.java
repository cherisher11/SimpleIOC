import java.util.HashMap;
import java.util.Map;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

/*
* @author=pyx
* */
public class SimpleIOC {
    Map<String,Object> beanMap=new HashMap<>()
    public SimpleIOC(String XmlAddress){
        load(XmlAddress);
    }
    private boolean IsSingleton=false;

    private void load(String XmlAddress){
        SAXReader XmlReader=new SAXReader();
    }
}
