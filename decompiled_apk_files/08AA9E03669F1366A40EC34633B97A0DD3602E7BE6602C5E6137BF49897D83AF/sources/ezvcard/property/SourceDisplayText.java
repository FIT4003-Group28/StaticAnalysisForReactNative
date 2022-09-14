package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
@c(a = {VCardVersion.V3_0})
/* loaded from: classes.dex */
public class SourceDisplayText extends TextProperty {
    public SourceDisplayText(String str) {
        super(str);
    }

    public SourceDisplayText(SourceDisplayText sourceDisplayText) {
        super(sourceDisplayText);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public SourceDisplayText mo226copy() {
        return new SourceDisplayText(this);
    }
}
