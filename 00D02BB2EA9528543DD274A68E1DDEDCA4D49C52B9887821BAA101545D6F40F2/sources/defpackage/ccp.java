package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
/* compiled from: PG */
/* renamed from: ccp  reason: default package */
/* loaded from: classes4.dex */
public final class ccp extends ccj<Bitmap> {
    private final bxn b = new bxo();

    @Override // defpackage.ccj
    protected final bxd<Bitmap> d(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        return new ccq(ImageDecoder.decodeBitmap(source, onHeaderDecodedListener), this.b);
    }
}
