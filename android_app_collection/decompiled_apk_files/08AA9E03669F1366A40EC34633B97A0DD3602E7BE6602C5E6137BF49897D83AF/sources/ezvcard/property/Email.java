package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.parameter.EmailType;
import ezvcard.parameter.Pid;
import ezvcard.parameter.VCardParameters;
import java.util.List;
/* loaded from: classes.dex */
public class Email extends TextProperty implements HasAltId {
    public Email(String str) {
        super(str);
    }

    public Email(Email email) {
        super(email);
    }

    public List<EmailType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.b<EmailType>(vCardParameters) { // from class: ezvcard.property.Email.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: _asObject */
            public EmailType mo221_asObject(String str) {
                return EmailType.a(str);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
        super._validate(list, vCardVersion, vCard);
        for (EmailType emailType : getTypes()) {
            if (emailType != EmailType.f5529c && !emailType.a(vCardVersion)) {
                list.add(new ValidationWarning(9, emailType.c()));
            }
        }
    }

    @Override // ezvcard.property.VCardProperty
    /* renamed from: copy */
    public Email mo226copy() {
        return new Email(this);
    }
}
