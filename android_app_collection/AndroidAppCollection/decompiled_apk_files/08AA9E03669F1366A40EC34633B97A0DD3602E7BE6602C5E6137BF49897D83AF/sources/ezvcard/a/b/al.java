package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.PlaceProperty;
import ezvcard.util.GeoUri;
/* compiled from: PlacePropertyScribe.java */
/* loaded from: classes.dex */
public abstract class al<T extends PlaceProperty> extends bg<T> {
    protected abstract T b();

    public al(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        T b2 = b();
        String a2 = com.b.a.a.b.e.a(str);
        if (vCardDataType == VCardDataType.e) {
            b2.setText(a2);
            return b2;
        } else if (vCardDataType == VCardDataType.f5461d) {
            try {
                b2.setGeoUri(GeoUri.a(a2));
            } catch (IllegalArgumentException unused) {
                b2.setUri(a2);
            }
            return b2;
        } else {
            b2.setText(a2);
            return b2;
        }
    }
}
