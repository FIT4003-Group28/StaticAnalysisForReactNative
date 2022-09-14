package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class SimpleProperty<T> extends VCardProperty {
    protected T value;

    public SimpleProperty(T t) {
        this.value = t;
    }

    public SimpleProperty(SimpleProperty<T> simpleProperty) {
        super(simpleProperty);
        this.value = simpleProperty.value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.VCardProperty
    public void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.value == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("value", this.value);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        return (super.hashCode() * 31) + (this.value == null ? 0 : this.value.hashCode());
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        SimpleProperty simpleProperty = (SimpleProperty) obj;
        if (this.value == null) {
            if (simpleProperty.value != null) {
                return false;
            }
        } else if (!this.value.equals(simpleProperty.value)) {
            return false;
        }
        return true;
    }
}
