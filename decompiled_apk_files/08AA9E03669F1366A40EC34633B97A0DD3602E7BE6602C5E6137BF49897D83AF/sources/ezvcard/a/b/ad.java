package ezvcard.a.b;

import ezvcard.parameter.ImageType;
import ezvcard.property.Logo;
/* compiled from: LogoScribe.java */
/* loaded from: classes.dex */
public class ad extends v<Logo> {
    public ad() {
        super(Logo.class, "LOGO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    public Logo a(String str, ImageType imageType) {
        return new Logo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    public Logo a(byte[] bArr, ImageType imageType) {
        return new Logo(bArr, imageType);
    }
}
