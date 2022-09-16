package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import ezvcard.util.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Xml extends VCardProperty implements HasAltId {
    private Document value;

    public Xml(String str) {
        this(str == null ? null : k.a(str));
    }

    public Xml(Element element) {
        this(element == null ? null : detachElement(element));
    }

    private static Document detachElement(Element element) {
        Document a2 = k.a();
        a2.appendChild(a2.importNode(element, true));
        return a2;
    }

    public Xml(Document document) {
        this.value = document;
    }

    public Xml(Xml xml) {
        super(xml);
        if (xml.value != null) {
            Element documentElement = xml.value.getDocumentElement();
            this.value = documentElement == null ? k.a() : detachElement(documentElement);
        }
    }

    public Document getValue() {
        return this.value;
    }

    public void setValue(Document document) {
        this.value = document;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.a();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.a2(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.value == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("value", this.value == null ? "null" : k.a(this.value));
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy  reason: collision with other method in class */
    public Xml mo226copy() {
        return new Xml(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        return (super.hashCode() * 31) + (this.value == null ? 0 : k.a(this.value).hashCode());
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Xml xml = (Xml) obj;
        if (this.value == null) {
            if (xml.value != null) {
                return false;
            }
        } else if (xml.value == null || !k.a(this.value).equals(k.a(xml.value))) {
            return false;
        }
        return true;
    }
}
