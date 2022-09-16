package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
/* compiled from: PG */
/* renamed from: zie  reason: default package */
/* loaded from: classes4.dex */
public final class zie {
    public static final Attributes a = new zic();
    private static final Map b;
    private final SAXParserFactory c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("http://xml.org/sax/features/namespaces", false);
        hashMap.put("http://xml.org/sax/features/namespace-prefixes", true);
        b = Collections.unmodifiableMap(hashMap);
    }

    public zie(Map map) {
        map.getClass();
        try {
            this.c = SAXParserFactory.newInstance();
            for (Map.Entry entry : map.entrySet()) {
                this.c.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("SAX initilization error", e);
        } catch (SAXNotRecognizedException e2) {
            throw new RuntimeException("SAX initilization error", e2);
        } catch (SAXNotSupportedException e3) {
            throw new RuntimeException("SAX initilization error", e3);
        }
    }

    public static zie a() {
        return new zie(b);
    }

    public final Object b(InputStream inputStream, zib zibVar) {
        XMLReader xMLReader;
        inputStream.getClass();
        zibVar.getClass();
        try {
            synchronized (this.c) {
                xMLReader = this.c.newSAXParser().getXMLReader();
            }
            zid zidVar = new zid(zibVar);
            xMLReader.setContentHandler(zidVar);
            xMLReader.parse(new InputSource(inputStream));
            Object obj = zidVar.a;
            if (obj != null) {
                return obj;
            }
            throw new zhz();
        } catch (ParserConfigurationException e) {
            throw new zia(e);
        } catch (SAXException e2) {
            throw new zia(e2);
        }
    }
}
