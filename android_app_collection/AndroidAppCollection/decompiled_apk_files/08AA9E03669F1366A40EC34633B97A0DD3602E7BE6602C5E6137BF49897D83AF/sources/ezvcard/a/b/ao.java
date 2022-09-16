package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.RawProperty;
/* compiled from: RawPropertyScribe.java */
/* loaded from: classes.dex */
public class ao extends bg<RawProperty> {
    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    public ao(String str) {
        super(RawProperty.class, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public RawProperty b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        RawProperty rawProperty = new RawProperty(this.f5484c, str);
        rawProperty.setDataType(vCardDataType);
        return rawProperty;
    }
}
