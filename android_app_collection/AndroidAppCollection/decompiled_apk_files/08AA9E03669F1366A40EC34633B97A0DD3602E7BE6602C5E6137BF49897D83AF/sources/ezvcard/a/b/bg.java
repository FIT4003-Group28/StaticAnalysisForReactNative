package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import java.util.Date;
import javax.xml.namespace.QName;
/* compiled from: VCardPropertyScribe.java */
/* loaded from: classes.dex */
public abstract class bg<T extends VCardProperty> {

    /* renamed from: b  reason: collision with root package name */
    protected final Class<T> f5483b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f5484c;

    /* renamed from: d  reason: collision with root package name */
    protected final QName f5485d;

    protected abstract VCardDataType a(VCardVersion vCardVersion);

    protected abstract T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar);

    public bg(Class<T> cls, String str) {
        this(cls, str, new QName(VCardVersion.V4_0.getXmlNamespace(), str.toLowerCase()));
    }

    public bg(Class<T> cls, String str, QName qName) {
        this.f5483b = cls;
        this.f5484c = str;
        this.f5485d = qName;
    }

    public Class<T> c() {
        return this.f5483b;
    }

    public String d() {
        return this.f5484c;
    }

    public QName e() {
        return this.f5485d;
    }

    public final VCardDataType b(VCardVersion vCardVersion) {
        return a(vCardVersion);
    }

    public final T c(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        T b2 = b(str, vCardDataType, vCardParameters, cVar);
        b2.setParameters(vCardParameters);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Date h(String str) {
        return ezvcard.util.i.a(str);
    }
}
