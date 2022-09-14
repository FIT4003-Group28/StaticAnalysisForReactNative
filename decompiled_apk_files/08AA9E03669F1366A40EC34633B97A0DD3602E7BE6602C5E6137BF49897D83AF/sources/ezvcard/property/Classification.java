package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V3_0})
/* loaded from: classes.dex */
public class Classification extends TextProperty {
    public Classification(String str) {
        super(str);
    }

    public Classification(Classification classification) {
        super(classification);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Classification mo226copy() {
        return new Classification(this);
    }
}
