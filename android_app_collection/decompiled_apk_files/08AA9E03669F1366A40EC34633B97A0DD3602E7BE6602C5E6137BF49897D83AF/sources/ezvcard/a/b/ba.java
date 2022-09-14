package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Telephone;
import ezvcard.util.TelUri;
/* compiled from: TelephoneScribe.java */
/* loaded from: classes.dex */
public class ba extends bg<Telephone> {
    public ba() {
        super(Telephone.class, "TEL");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Telephone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(com.b.a.a.b.e.a(str), vCardDataType, cVar);
    }

    private Telephone a(String str, VCardDataType vCardDataType, ezvcard.a.c cVar) {
        try {
            return new Telephone(TelUri.a(str));
        } catch (IllegalArgumentException unused) {
            if (vCardDataType == VCardDataType.f5461d) {
                cVar.a(18, new Object[0]);
            }
            return new Telephone(str);
        }
    }
}
