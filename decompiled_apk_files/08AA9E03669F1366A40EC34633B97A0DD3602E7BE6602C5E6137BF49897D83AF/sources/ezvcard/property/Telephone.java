package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.Pid;
import ezvcard.parameter.TelephoneType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.TelUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class Telephone extends VCardProperty implements HasAltId {
    private String text;
    private TelUri uri;

    public Telephone(String str) {
        setText(str);
    }

    public Telephone(TelUri telUri) {
        setUri(telUri);
    }

    public Telephone(Telephone telephone) {
        super(telephone);
        this.text = telephone.text;
        this.uri = telephone.uri;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
        this.uri = null;
    }

    public TelUri getUri() {
        return this.uri;
    }

    public void setUri(TelUri telUri) {
        this.text = null;
        this.uri = telUri;
    }

    public List<TelephoneType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.b<TelephoneType>(vCardParameters) { // from class: ezvcard.property.Telephone.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: _asObject */
            public TelephoneType mo221_asObject(String str) {
                return TelephoneType.a(str);
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
        if (this.uri != null && (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0)) {
            list.add(new ValidationWarning(19, new Object[0]));
        }
        for (TelephoneType telephoneType : getTypes()) {
            if (telephoneType != TelephoneType.k && !telephoneType.a(vCardVersion)) {
                list.add(new ValidationWarning(9, telephoneType.c()));
            }
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
    public Telephone mo226copy() {
        return new Telephone(this);
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
        Telephone telephone = (Telephone) obj;
        if (this.text == null) {
            if (telephone.text != null) {
                return false;
            }
        } else if (!this.text.equals(telephone.text)) {
            return false;
        }
        if (this.uri == null) {
            if (telephone.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(telephone.uri)) {
            return false;
        }
        return true;
    }
}
