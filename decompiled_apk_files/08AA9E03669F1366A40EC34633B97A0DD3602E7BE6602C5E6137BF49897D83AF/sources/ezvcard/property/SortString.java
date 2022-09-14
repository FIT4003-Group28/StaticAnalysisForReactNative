package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V3_0})
/* loaded from: classes.dex */
public class SortString extends TextProperty {
    public SortString(String str) {
        super(str);
    }

    public SortString(SortString sortString) {
        super(sortString);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public SortString mo226copy() {
        return new SortString(this);
    }
}
