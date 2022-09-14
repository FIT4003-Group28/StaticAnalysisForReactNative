package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Related;
/* compiled from: RelatedScribe.java */
/* loaded from: classes.dex */
public class ap extends bg<Related> {
    public ap() {
        super(Related.class, "RELATED");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f5461d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Related b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        String a2 = com.b.a.a.b.e.a(str);
        Related related = new Related();
        if (vCardDataType == VCardDataType.e) {
            related.setText(a2);
        } else {
            related.setUri(a2);
        }
        return related;
    }
}
