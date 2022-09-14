package ezvcard.property;

import com.b.a.a.a;
import com.b.a.a.c.b;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class RawProperty extends TextProperty {
    private VCardDataType dataType;
    private String propertyName;

    public RawProperty(String str, String str2) {
        this(str, str2, null);
    }

    public RawProperty(String str, String str2, VCardDataType vCardDataType) {
        super(str2);
        this.propertyName = str;
        this.dataType = vCardDataType;
    }

    public RawProperty(RawProperty rawProperty) {
        super(rawProperty);
        this.propertyName = rawProperty.propertyName;
        this.dataType = rawProperty.dataType;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public void setPropertyName(String str) {
        this.propertyName = str;
    }

    public VCardDataType getDataType() {
        return this.dataType;
    }

    public void setDataType(VCardDataType vCardDataType) {
        this.dataType = vCardDataType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        a syntaxStyle = vCardVersion.getSyntaxStyle();
        com.b.a.a.c.a b2 = b.b(syntaxStyle, true);
        if (!b2.a(this.propertyName)) {
            if (syntaxStyle == a.OLD) {
                list.add(new ValidationWarning(33, this.propertyName, b2.a().a(true)));
            } else {
                list.add(new ValidationWarning(24, this.propertyName));
            }
        }
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", this.propertyName);
        linkedHashMap.put("dataType", this.dataType);
        linkedHashMap.put("value", this.value);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public RawProperty mo226copy() {
        return new RawProperty(this);
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.dataType == null ? 0 : this.dataType.hashCode())) * 31;
        if (this.propertyName != null) {
            i = this.propertyName.toLowerCase().hashCode();
        }
        return hashCode + i;
    }

    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        RawProperty rawProperty = (RawProperty) obj;
        if (this.dataType == null) {
            if (rawProperty.dataType != null) {
                return false;
            }
        } else if (!this.dataType.equals(rawProperty.dataType)) {
            return false;
        }
        if (this.propertyName == null) {
            if (rawProperty.propertyName != null) {
                return false;
            }
        } else if (!this.propertyName.equalsIgnoreCase(rawProperty.propertyName)) {
            return false;
        }
        return true;
    }
}
