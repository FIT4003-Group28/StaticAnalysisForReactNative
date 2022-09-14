package ezvcard.a.b;

import ezvcard.parameter.ImageType;
import ezvcard.property.ImageProperty;
/* compiled from: ImagePropertyScribe.java */
/* loaded from: classes.dex */
public abstract class v<T extends ImageProperty> extends d<T, ImageType> {
    public v(Class<T> cls, String str) {
        super(cls, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    /* renamed from: e */
    public ImageType b(String str) {
        return ImageType.b(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    /* renamed from: f */
    public ImageType a(String str) {
        return ImageType.b(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    /* renamed from: g */
    public ImageType c(String str) {
        return ImageType.a(null, null, str);
    }
}
