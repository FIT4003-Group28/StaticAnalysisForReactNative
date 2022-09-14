package ezvcard.a.b;

import ezvcard.parameter.ImageType;
import ezvcard.property.Photo;
/* compiled from: PhotoScribe.java */
/* loaded from: classes.dex */
public class ak extends v<Photo> {
    public ak() {
        super(Photo.class, "PHOTO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    public Photo a(String str, ImageType imageType) {
        return new Photo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.d
    public Photo a(byte[] bArr, ImageType imageType) {
        return new Photo(bArr, imageType);
    }
}
