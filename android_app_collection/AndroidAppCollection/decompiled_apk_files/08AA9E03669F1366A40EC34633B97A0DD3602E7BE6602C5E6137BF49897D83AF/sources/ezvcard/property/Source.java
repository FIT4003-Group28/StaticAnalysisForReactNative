package ezvcard.property;

import ezvcard.parameter.Pid;
import java.util.List;
/* loaded from: classes.dex */
public class Source extends UriProperty implements HasAltId {
    public Source(String str) {
        super(str);
    }

    public Source(Source source) {
        super(source);
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
    public Source mo226copy() {
        return new Source(this);
    }
}
