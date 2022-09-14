package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Timezone;
import ezvcard.util.UtcOffset;
/* compiled from: TimezoneScribe.java */
/* loaded from: classes.dex */
public class bb extends bg<Timezone> {
    public bb() {
        super(Timezone.class, "TZ");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                return VCardDataType.n;
            case V4_0:
                return VCardDataType.e;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Timezone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(com.b.a.a.b.e.a(str), vCardDataType, cVar);
    }

    private Timezone a(String str, VCardDataType vCardDataType, ezvcard.a.c cVar) {
        if (str == null || str.length() == 0) {
            return new Timezone((String) null);
        }
        switch (cVar.a()) {
            case V2_1:
                try {
                    return new Timezone(UtcOffset.a(str));
                } catch (IllegalArgumentException unused) {
                    throw new ezvcard.a.a(19, new Object[0]);
                }
            case V3_0:
            case V4_0:
                try {
                    return new Timezone(UtcOffset.a(str));
                } catch (IllegalArgumentException unused2) {
                    if (vCardDataType == VCardDataType.n) {
                        cVar.a(20, new Object[0]);
                    }
                    return new Timezone(str);
                }
            default:
                return new Timezone((String) null);
        }
    }
}
