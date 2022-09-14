package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
import ezvcard.util.PartialDate;
import java.util.Date;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Deathdate extends DateOrTimeProperty {
    public Deathdate(Date date) {
        super(date);
    }

    public Deathdate(Date date, boolean z) {
        super(date, z);
    }

    public Deathdate(PartialDate partialDate) {
        super(partialDate);
    }

    public Deathdate(String str) {
        super(str);
    }

    public Deathdate(Deathdate deathdate) {
        super(deathdate);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Deathdate mo226copy() {
        return new Deathdate(this);
    }
}
