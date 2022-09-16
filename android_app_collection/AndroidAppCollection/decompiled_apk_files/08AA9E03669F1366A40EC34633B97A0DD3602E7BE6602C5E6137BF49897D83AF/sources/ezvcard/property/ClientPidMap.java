package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class ClientPidMap extends VCardProperty {
    private Integer pid;
    private String uri;

    public ClientPidMap(Integer num, String str) {
        this.pid = num;
        this.uri = str;
    }

    public ClientPidMap(ClientPidMap clientPidMap) {
        super(clientPidMap);
        this.pid = clientPidMap.pid;
        this.uri = clientPidMap.uri;
    }

    public static ClientPidMap random(Integer num) {
        String uuid = UUID.randomUUID().toString();
        return new ClientPidMap(num, "urn:uuid:" + uuid);
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer num) {
        this.pid = num;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.pid == null && this.uri == null) {
            list.add(new ValidationWarning(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pid", this.pid);
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public ClientPidMap mo226copy() {
        return new ClientPidMap(this);
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.pid == null ? 0 : this.pid.hashCode())) * 31;
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
        ClientPidMap clientPidMap = (ClientPidMap) obj;
        if (this.pid == null) {
            if (clientPidMap.pid != null) {
                return false;
            }
        } else if (!this.pid.equals(clientPidMap.pid)) {
            return false;
        }
        if (this.uri == null) {
            if (clientPidMap.uri != null) {
                return false;
            }
        } else if (!this.uri.equals(clientPidMap.uri)) {
            return false;
        }
        return true;
    }
}
