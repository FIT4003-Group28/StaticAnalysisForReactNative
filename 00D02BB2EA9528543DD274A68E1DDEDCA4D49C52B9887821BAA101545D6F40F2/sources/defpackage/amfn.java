package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amfn  reason: default package */
/* loaded from: classes.dex */
public final class amfn extends amfm {
    private final byte[] d;

    public amfn(amfu amfuVar, byte[] bArr) {
        super(amfuVar);
        this.d = bArr;
    }

    @Override // defpackage.amfp
    protected final /* bridge */ /* synthetic */ Bitmap b() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        byte[] bArr = this.d;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }
}
