package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.c;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import java.util.List;
@c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes.dex */
public class Label extends TextProperty {
    public Label(String str) {
        super(str);
    }

    public Label(Label label) {
        super(label);
    }

    public List<AddressType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.b<AddressType>(vCardParameters) { // from class: ezvcard.property.Label.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.c
            /* renamed from: _asObject */
            public AddressType mo221_asObject(String str) {
                return AddressType.a(str);
            }
        };
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
    /* renamed from: copy */
    public Label mo226copy() {
        return new Label(this);
    }
}
