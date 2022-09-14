package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import ezvcard.parameter.Pid;
import ezvcard.parameter.RelatedType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.TelUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Related extends VCardProperty implements HasAltId {
    private String text;
    private String uri;

    public Related() {
    }

    public Related(String str) {
        setUri(str);
    }

    public Related(Related related) {
        super(related);
        this.uri = related.uri;
        this.text = related.text;
    }

    public static Related email(String str) {
        return new Related("mailto:" + str);
    }

    public static Related im(String str, String str2) {
        return new Related(str + ":" + str2);
    }

    public static Related telephone(TelUri telUri) {
        return new Related(telUri.toString());
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
        this.text = null;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
        this.uri = null;
    }

    public List<RelatedType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.b<RelatedType>(vCardParameters) { // from class: ezvcard.property.Related.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: _asObject */
            public RelatedType mo221_asObject(String str) {
                return RelatedType.a(str);
            }
        };
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
        if (this.uri == null && this.text == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Related mo226copy() {
        return new Related(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.text == null ? 0 : this.text.hashCode())) * 31;
        if (this.uri != null) {
            i = this.uri.hashCode();
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
        Related related = (Related) obj;
        if (this.text == null) {
            if (related.text != null) {
                return false;
            }
        } else if (!this.text.equals(related.text)) {
            return false;
        }
        if (this.uri == null) {
            if (related.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(related.uri)) {
            return false;
        }
        return true;
    }
}
