package ezvcard.a.b;

import com.b.a.a.b.e;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;
/* compiled from: GenderScribe.java */
/* loaded from: classes.dex */
public class s extends bg<Gender> {
    public s() {
        super(Gender.class, "GENDER");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Gender b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        e.a aVar = new e.a(str, 2);
        String a2 = aVar.a();
        if (a2 != null) {
            a2 = a2.toUpperCase();
        }
        String a3 = aVar.a();
        Gender gender = new Gender(a2);
        gender.setText(a3);
        return gender;
    }
}
