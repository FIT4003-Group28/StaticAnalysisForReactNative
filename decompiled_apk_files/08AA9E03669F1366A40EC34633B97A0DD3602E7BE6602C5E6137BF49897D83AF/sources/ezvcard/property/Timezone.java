package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.Pid;
import ezvcard.util.UtcOffset;
import ezvcard.util.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class Timezone extends VCardProperty implements HasAltId {
    private UtcOffset offset;
    private String text;

    public Timezone(String str) {
        this(null, str);
    }

    public Timezone(UtcOffset utcOffset) {
        this(utcOffset, null);
    }

    public Timezone(UtcOffset utcOffset, String str) {
        setOffset(utcOffset);
        setText(str);
    }

    public Timezone(TimeZone timeZone) {
        this(UtcOffset.a(timeZone), timeZone.getID());
    }

    public Timezone(Timezone timezone) {
        super(timezone);
        this.offset = timezone.offset;
        this.text = timezone.text;
    }

    public UtcOffset getOffset() {
        return this.offset;
    }

    public void setOffset(UtcOffset utcOffset) {
        this.offset = utcOffset;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public TimeZone toTimeZone() {
        TimeZone b2;
        if (this.text == null || (b2 = i.b(this.text)) == null) {
            if (this.offset == null) {
                return null;
            }
            return new SimpleTimeZone((int) this.offset.a(), this.text == null ? "" : this.text);
        }
        return b2;
    }

    public String getType() {
        return this.parameters.o();
    }

    public void setType(String str) {
        this.parameters.f(str);
    }

    public String getMediaType() {
        return this.parameters.j();
    }

    public void setMediaType(String str) {
        this.parameters.e(str);
    }

    @Override // ezvcard.property.VCardProperty
    public List<Pid> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
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
        if (this.offset == null && this.text == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
        if (this.offset == null && vCardVersion == VCardVersion.V2_1) {
            list.add(new ValidationWarning(20, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offset", this.offset);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Timezone mo226copy() {
        return new Timezone(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.offset == null ? 0 : this.offset.hashCode())) * 31;
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
        Timezone timezone = (Timezone) obj;
        if (this.offset == null) {
            if (timezone.offset != null) {
                return false;
            }
        } else if (!this.offset.equals(timezone.offset)) {
            return false;
        }
        if (this.text == null) {
            if (timezone.text != null) {
                return false;
            }
        } else if (!this.text.equals(timezone.text)) {
            return false;
        }
        return true;
    }
}
