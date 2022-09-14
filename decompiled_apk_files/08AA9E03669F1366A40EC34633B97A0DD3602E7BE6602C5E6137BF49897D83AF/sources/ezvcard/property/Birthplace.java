package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Birthplace extends PlaceProperty {
    public Birthplace() {
    }

    public Birthplace(double d2, double d3) {
        super(d2, d3);
    }

    public Birthplace(String str) {
        super(str);
    }

    public Birthplace(Birthplace birthplace) {
        super(birthplace);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Birthplace mo226copy() {
        return new Birthplace(this);
    }
}
