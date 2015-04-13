package me.jiangyu.webcontainer.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

/**
 * Created by jiangyukun on 15/4/13.
 */

public class XmlUtil {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("me.jiangyu.webcontainer.util");
        Marshaller ms = jc.createMarshaller();
        ms.setProperty("jaxb.encoding", "UTF-8");
        ms.setProperty("jaxb.formatted.output", true);
        String xmlFilePath = XmlUtil.class.getResource("/").getPath() + "jaxb_test.xml";
        System.out.println(xmlFilePath);
        ms.marshal(ObjectFactory.createT(), new File(xmlFilePath));
    }

    @XmlRootElement
    static class T {
        private String id = "id";

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}

@XmlRegistry
class ObjectFactory {
    public static XmlUtil.T createT() {
        return new XmlUtil.T();
    }
}