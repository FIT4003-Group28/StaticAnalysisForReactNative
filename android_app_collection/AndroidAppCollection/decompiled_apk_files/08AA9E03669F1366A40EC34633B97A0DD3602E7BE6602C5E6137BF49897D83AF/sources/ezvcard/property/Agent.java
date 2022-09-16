package ezvcard.property;

import com.google.android.gms.common.internal.ImagesContract;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes.dex */
public class Agent extends VCardProperty {
    private String url;
    private VCard vcard;

    public Agent() {
    }

    public Agent(String str) {
        setUrl(str);
    }

    public Agent(VCard vCard) {
        setVCard(vCard);
    }

    public Agent(Agent agent) {
        super(agent);
        this.url = agent.url;
        this.vcard = agent.vcard == null ? null : new VCard(agent.vcard);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
        this.vcard = null;
    }

    public VCard getVCard() {
        return this.vcard;
    }

    public void setVCard(VCard vCard) {
        this.vcard = vCard;
        this.url = null;
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        NumberFormat integerInstance;
        int intValue;
        if (this.url == null && this.vcard == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
        if (this.vcard != null) {
            NumberFormat.getIntegerInstance().setMinimumIntegerDigits(2);
            Iterator<Map.Entry<VCardProperty, List<ValidationWarning>>> it = this.vcard.b(vCardVersion).iterator();
            while (it.hasNext()) {
                Map.Entry<VCardProperty, List<ValidationWarning>> next = it.next();
                VCardProperty key = next.getKey();
                for (ValidationWarning validationWarning : next.getValue()) {
                    list.add(new ValidationWarning(10, key == null ? "" : key.getClass().getSimpleName(), validationWarning.a().intValue() >= 0 ? "W" + integerInstance.format(intValue) : "", validationWarning.b()));
                }
            }
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ImagesContract.URL, this.url);
        linkedHashMap.put("vcard", this.vcard);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Agent mo226copy() {
        return new Agent(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.url == null ? 0 : this.url.hashCode())) * 31;
        if (this.vcard != null) {
            i = this.vcard.hashCode();
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
        Agent agent = (Agent) obj;
        if (this.url == null) {
            if (agent.url != null) {
                return false;
            }
        } else if (!this.url.equals(agent.url)) {
            return false;
        }
        if (this.vcard == null) {
            if (agent.vcard != null) {
                return false;
            }
        } else if (!this.vcard.equals(agent.vcard)) {
            return false;
        }
        return true;
    }
}
