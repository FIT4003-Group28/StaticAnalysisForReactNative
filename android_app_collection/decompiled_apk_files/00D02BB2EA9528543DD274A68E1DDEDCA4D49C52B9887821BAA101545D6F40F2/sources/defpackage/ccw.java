package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: ccw  reason: default package */
/* loaded from: classes4.dex */
public final class ccw extends ccr {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ccr
    protected final Bitmap c(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        return cee.g(bxnVar, bitmap, i, i2);
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        return obj instanceof ccw;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return 1101716364;
    }
}
