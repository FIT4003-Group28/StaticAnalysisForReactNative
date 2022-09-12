package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cdq  reason: default package */
/* loaded from: classes4.dex */
public final class cdq extends ccr {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ccr
    protected final Bitmap c(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        return cee.b(bxnVar, bitmap, i, i2);
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        return obj instanceof cdq;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return 1572326941;
    }
}
