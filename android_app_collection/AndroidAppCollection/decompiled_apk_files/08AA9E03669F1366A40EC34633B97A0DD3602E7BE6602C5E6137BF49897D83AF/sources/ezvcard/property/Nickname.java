package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
import ezvcard.parameter.Pid;
import java.util.List;
@c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Nickname extends TextListProperty implements HasAltId {
    public Nickname() {
    }

    public Nickname(Nickname nickname) {
        super(nickname);
    }

    public String getType() {
        return this.parameters.o();
    }

    public void setType(String str) {
        this.parameters.f(str);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
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
    /* renamed from: copy */
    public Nickname mo226copy() {
        return new Nickname(this);
    }
}
