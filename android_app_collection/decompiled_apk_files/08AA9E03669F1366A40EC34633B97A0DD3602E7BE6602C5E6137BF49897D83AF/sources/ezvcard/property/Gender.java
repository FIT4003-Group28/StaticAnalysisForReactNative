package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Gender extends VCardProperty {
    public static final String FEMALE = "F";
    public static final String MALE = "M";
    public static final String NONE = "N";
    public static final String OTHER = "O";
    public static final String UNKNOWN = "U";
    private String gender;
    private String text;

    public Gender(String str) {
        this.gender = str;
    }

    public Gender(Gender gender) {
        super(gender);
        this.gender = gender.gender;
        this.text = gender.text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public boolean isMale() {
        return MALE.equals(this.gender);
    }

    public boolean isFemale() {
        return FEMALE.equals(this.gender);
    }

    public boolean isOther() {
        return OTHER.equals(this.gender);
    }

    public boolean isNone() {
        return NONE.equals(this.gender);
    }

    public boolean isUnknown() {
        return UNKNOWN.equals(this.gender);
    }

    public static Gender male() {
        return new Gender(MALE);
    }

    public static Gender female() {
        return new Gender(FEMALE);
    }

    public static Gender other() {
        return new Gender(OTHER);
    }

    public static Gender none() {
        return new Gender(NONE);
    }

    public static Gender unknown() {
        return new Gender(UNKNOWN);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.gender == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gender", this.gender);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Gender mo226copy() {
        return new Gender(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.gender == null ? 0 : this.gender.hashCode())) * 31;
        if (this.text != null) {
            i = this.text.hashCode();
        }
        return hashCode + i;
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Gender gender = (Gender) obj;
        if (this.gender == null) {
            if (gender.gender != null) {
                return false;
            }
        } else if (!this.gender.equals(gender.gender)) {
            return false;
        }
        if (this.text == null) {
            if (gender.text != null) {
                return false;
            }
        } else if (!this.text.equals(gender.text)) {
            return false;
        }
        return true;
    }
}
