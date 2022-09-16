package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.DateOrTimeProperty;
import ezvcard.util.PartialDate;
import java.util.Date;
/* compiled from: DateOrTimePropertyScribe.java */
/* loaded from: classes.dex */
public abstract class l<T extends DateOrTimeProperty> extends bg<T> {
    protected abstract T b(PartialDate partialDate);

    protected abstract T b(String str);

    protected abstract T b(Date date, boolean z);

    public l(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                return null;
            case V4_0:
                return VCardDataType.i;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        String a2 = com.b.a.a.b.e.a(str);
        if (cVar.a() == VCardVersion.V4_0 && vCardDataType == VCardDataType.e) {
            return b(a2);
        }
        return a(a2, cVar);
    }

    private T a(String str, ezvcard.a.c cVar) {
        try {
            return b(h(str), str.contains("T"));
        } catch (IllegalArgumentException unused) {
            if (cVar.a() == VCardVersion.V2_1 || cVar.a() == VCardVersion.V3_0) {
                throw new ezvcard.a.a(5, new Object[0]);
            }
            try {
                return b(PartialDate.a(str));
            } catch (IllegalArgumentException unused2) {
                cVar.a(6, new Object[0]);
                return b(str);
            }
        }
    }
}
