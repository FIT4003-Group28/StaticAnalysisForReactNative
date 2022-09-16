package ezvcard.property;

import ezvcard.parameter.Pid;
import java.util.List;
/* loaded from: classes.dex */
public class Organization extends TextListProperty implements HasAltId {
    public Organization() {
    }

    public Organization(Organization organization) {
        super(organization);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public String getType() {
        return this.parameters.o();
    }

    public void setType(String str) {
        this.parameters.f(str);
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

    public List<String> getSortAs() {
        return this.parameters.m();
    }

    public void setSortAs(String str) {
        this.parameters.a(str);
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Organization mo226copy() {
        return new Organization(this);
    }
}
