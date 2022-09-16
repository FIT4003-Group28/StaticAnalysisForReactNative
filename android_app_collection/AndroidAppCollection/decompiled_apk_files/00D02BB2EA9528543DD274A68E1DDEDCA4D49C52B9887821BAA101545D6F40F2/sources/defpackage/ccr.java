package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ccr  reason: default package */
/* loaded from: classes4.dex */
public abstract class ccr implements bue<Bitmap> {
    protected abstract Bitmap c(bxn bxnVar, Bitmap bitmap, int i, int i2);

    @Override // defpackage.bue
    public final bxd<Bitmap> b(Context context, bxd<Bitmap> bxdVar, int i, int i2) {
        if (!cjp.b(i, i2)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Cannot apply transformation on width: ");
            sb.append(i);
            sb.append(" or height: ");
            sb.append(i2);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        bxn bxnVar = brc.a(context).a;
        Bitmap b = bxdVar.b();
        if (i == Integer.MIN_VALUE) {
            i = b.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = b.getHeight();
        }
        Bitmap c = c(bxnVar, b, i, i2);
        return b.equals(c) ? bxdVar : ccq.f(c, bxnVar);
    }
}
