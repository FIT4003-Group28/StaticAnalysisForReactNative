package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Xml;
import org.xml.sax.SAXException;
/* compiled from: XmlScribe.java */
/* loaded from: classes.dex */
public class bh extends bg<Xml> {
    public bh() {
        super(Xml.class, "XML");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Xml b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        try {
            return new Xml(com.b.a.a.b.e.a(str));
        } catch (SAXException unused) {
            throw new ezvcard.a.a(21, new Object[0]);
        }
    }
}
