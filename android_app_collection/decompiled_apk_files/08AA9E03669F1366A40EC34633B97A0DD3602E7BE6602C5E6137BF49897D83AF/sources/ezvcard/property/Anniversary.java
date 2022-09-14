package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
import ezvcard.util.PartialDate;
import java.util.Date;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Anniversary extends DateOrTimeProperty {
    public Anniversary(Date date) {
        super(date);
    }

    public Anniversary(Date date, boolean z) {
        super(date, z);
    }

    public Anniversary(PartialDate partialDate) {
        super(partialDate);
    }

    public Anniversary(String str) {
        super(str);
    }

    public Anniversary(Anniversary anniversary) {
        super(anniversary);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Anniversary mo226copy() {
        return new Anniversary(this);
    }
}
