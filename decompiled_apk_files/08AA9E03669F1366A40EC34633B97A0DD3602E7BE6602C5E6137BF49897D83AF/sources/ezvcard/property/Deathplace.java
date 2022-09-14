package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Deathplace extends PlaceProperty {
    public Deathplace() {
    }

    public Deathplace(double d2, double d3) {
        super(d2, d3);
    }

    public Deathplace(String str) {
        super(str);
    }

    public Deathplace(Deathplace deathplace) {
        super(deathplace);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Deathplace mo226copy() {
        return new Deathplace(this);
    }
}
