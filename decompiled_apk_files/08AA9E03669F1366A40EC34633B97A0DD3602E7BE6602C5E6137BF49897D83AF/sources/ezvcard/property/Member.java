package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import ezvcard.parameter.Pid;
import ezvcard.util.TelUri;
import java.util.List;
@c(a = {VCardVersion.V4_0})
/* loaded from: classes.dex */
public class Member extends UriProperty implements HasAltId {
    public Member(String str) {
        super(str);
    }

    public Member(Member member) {
        super(member);
    }

    public static Member email(String str) {
        return new Member("mailto:" + str);
    }

    public static Member im(String str, String str2) {
        return new Member(str + ":" + str2);
    }

    public static Member telephone(TelUri telUri) {
        return new Member(telUri.toString());
    }

    public String getUri() {
        return getValue();
    }

    public void setUri(String str) {
        setValue(str);
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

    public String getMediaType() {
        return this.parameters.j();
    }

    public void setMediaType(String str) {
        this.parameters.e(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        super._validate(list, vCardVersion, vCard);
        if (vCard.b() == null || !vCard.b().isGroup()) {
            list.add(new ValidationWarning(17, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Member mo226copy() {
        return new Member(this);
    }
}
