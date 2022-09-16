package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import java.util.List;
@c(a = {VCardVersion.V3_0})
/* loaded from: classes.dex */
public class Profile extends TextProperty {
    public Profile() {
        super("VCARD");
    }

    public Profile(Profile profile) {
        super(profile);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (!"VCARD".equalsIgnoreCase((String) this.value)) {
            list.add(new ValidationWarning(18, this.value));
        }
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Profile mo226copy() {
        return new Profile(this);
    }
}
