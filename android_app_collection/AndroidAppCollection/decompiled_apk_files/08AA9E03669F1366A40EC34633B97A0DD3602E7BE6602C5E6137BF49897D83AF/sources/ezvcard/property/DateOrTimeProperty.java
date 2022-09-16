package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.Calscale;
import ezvcard.util.PartialDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class DateOrTimeProperty extends VCardProperty implements HasAltId {
    private Date date;
    private boolean dateHasTime;
    private PartialDate partialDate;
    private String text;

    public DateOrTimeProperty(Date date) {
        this(date, false);
    }

    public DateOrTimeProperty(Date date, boolean z) {
        setDate(date, z);
    }

    public DateOrTimeProperty(PartialDate partialDate) {
        setPartialDate(partialDate);
    }

    public DateOrTimeProperty(String str) {
        setText(str);
    }

    public DateOrTimeProperty(DateOrTimeProperty dateOrTimeProperty) {
        super(dateOrTimeProperty);
        this.text = dateOrTimeProperty.text;
        this.date = dateOrTimeProperty.date == null ? null : new Date(dateOrTimeProperty.date.getTime());
        this.partialDate = dateOrTimeProperty.partialDate;
        this.dateHasTime = dateOrTimeProperty.dateHasTime;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date, boolean z) {
        this.date = date;
        if (date == null) {
            z = false;
        }
        this.dateHasTime = z;
        this.text = null;
        this.partialDate = null;
    }

    public PartialDate getPartialDate() {
        return this.partialDate;
    }

    public void setPartialDate(PartialDate partialDate) {
        this.partialDate = partialDate;
        this.dateHasTime = partialDate == null ? false : partialDate.g();
        this.text = null;
        this.date = null;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
        this.date = null;
        this.partialDate = null;
        this.dateHasTime = false;
    }

    public boolean hasTime() {
        return this.dateHasTime;
    }

    public Calscale getCalscale() {
        return this.parameters.b();
    }

    public void setCalscale(Calscale calscale) {
        this.parameters.a(calscale);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.a();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.a2(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.date == null && this.partialDate == null && this.text == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
        if (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0) {
            if (this.text != null) {
                list.add(new ValidationWarning(11, new Object[0]));
            }
            if (this.partialDate == null) {
                return;
            }
            list.add(new ValidationWarning(12, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        linkedHashMap.put("date", this.date);
        linkedHashMap.put("dateHasTime", Boolean.valueOf(this.dateHasTime));
        linkedHashMap.put("partialDate", this.partialDate);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((((((super.hashCode() * 31) + (this.date == null ? 0 : this.date.hashCode())) * 31) + (this.dateHasTime ? 1231 : 1237)) * 31) + (this.partialDate == null ? 0 : this.partialDate.hashCode())) * 31;
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
        DateOrTimeProperty dateOrTimeProperty = (DateOrTimeProperty) obj;
        if (this.date == null) {
            if (dateOrTimeProperty.date != null) {
                return false;
            }
        } else if (!this.date.equals(dateOrTimeProperty.date)) {
            return false;
        }
        if (this.dateHasTime != dateOrTimeProperty.dateHasTime) {
            return false;
        }
        if (this.partialDate == null) {
            if (dateOrTimeProperty.partialDate != null) {
                return false;
            }
        } else if (!this.partialDate.equals(dateOrTimeProperty.partialDate)) {
            return false;
        }
        if (this.text == null) {
            if (dateOrTimeProperty.text != null) {
                return false;
            }
        } else if (!this.text.equals(dateOrTimeProperty.text)) {
            return false;
        }
        return true;
    }
}
