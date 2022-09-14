package ezvcard.property;

import ezvcard.parameter.ImageType;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class Logo extends ImageProperty {
    public Logo(String str, ImageType imageType) {
        super(str, imageType);
    }

    public Logo(byte[] bArr, ImageType imageType) {
        super(bArr, imageType);
    }

    public Logo(InputStream inputStream, ImageType imageType) {
        super(inputStream, imageType);
    }

    public Logo(File file, ImageType imageType) {
        super(file, imageType);
    }

    public Logo(Logo logo) {
        super(logo);
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
    public Logo mo226copy() {
        return new Logo(this);
    }
}
