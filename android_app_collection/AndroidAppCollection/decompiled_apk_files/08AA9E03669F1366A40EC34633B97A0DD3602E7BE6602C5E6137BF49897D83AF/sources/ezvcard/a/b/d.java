package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.BinaryProperty;
/* compiled from: BinaryPropertyScribe.java */
/* loaded from: classes.dex */
public abstract class d<T extends BinaryProperty<U>, U extends MediaTypeParameter> extends bg<T> {
    protected abstract U a(String str);

    protected abstract T a(String str, U u);

    protected abstract T a(byte[] bArr, U u);

    protected abstract U b(String str);

    protected abstract U c(String str);

    public d(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                return null;
            case V4_0:
                return VCardDataType.f5461d;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(com.b.a.a.b.e.a(str), vCardDataType, vCardParameters, cVar.a());
    }

    protected T a(String str, VCardVersion vCardVersion, U u) {
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                if (str.startsWith("http")) {
                    return a(str, (String) u);
                }
                return a(ezvcard.util.a.a.a.a.a.a.a(str), (byte[]) u);
            case V4_0:
                return a(str, (String) u);
            default:
                return null;
        }
    }

    private U a(String str, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                String o = vCardParameters.o();
                if (o != null) {
                    return b(o);
                }
                break;
            case V4_0:
                String j = vCardParameters.j();
                if (j != null) {
                    return a(j);
                }
                break;
        }
        String d2 = d(str);
        if (d2 == null) {
            return null;
        }
        return c(d2);
    }

    private T a(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        U a2 = a(str, vCardParameters, vCardVersion);
        switch (vCardVersion) {
            case V2_1:
            case V3_0:
                if (vCardDataType == VCardDataType.f5458a || vCardDataType == VCardDataType.f5461d) {
                    return a(str, (String) a2);
                }
                ezvcard.parameter.a d2 = vCardParameters.d();
                if (d2 == ezvcard.parameter.a.f5570b || d2 == ezvcard.parameter.a.e) {
                    return a(ezvcard.util.a.a.a.a.a.a.a(str), (byte[]) a2);
                }
                break;
            case V4_0:
                try {
                    ezvcard.util.d a3 = ezvcard.util.d.a(str);
                    U a4 = a(a3.b());
                    try {
                        return a(a3.a(), (byte[]) a4);
                    } catch (IllegalArgumentException unused) {
                        a2 = a4;
                        break;
                    }
                } catch (IllegalArgumentException unused2) {
                    break;
                }
        }
        return a(str, vCardVersion, (VCardVersion) a2);
    }

    protected static String d(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1 || str.lastIndexOf(47) > lastIndexOf) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }
}
