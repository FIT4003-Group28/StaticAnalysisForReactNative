package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes.dex */
public class Mailer extends TextProperty {
    public Mailer(String str) {
        super(str);
    }

    public Mailer(Mailer mailer) {
        super(mailer);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Mailer mo226copy() {
        return new Mailer(this);
    }
}
