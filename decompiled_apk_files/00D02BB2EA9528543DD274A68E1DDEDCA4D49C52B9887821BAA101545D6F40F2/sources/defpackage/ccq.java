package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ccq  reason: default package */
/* loaded from: classes.dex */
public final class ccq implements bxd, bwy {
    private final Bitmap a;
    private final bxn b;

    public ccq(Bitmap bitmap, bxn bxnVar) {
        cjn.e(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        cjn.e(bxnVar, "BitmapPool must not be null");
        this.b = bxnVar;
    }

    public static ccq f(Bitmap bitmap, bxn bxnVar) {
        if (bitmap == null) {
            return null;
        }
        return new ccq(bitmap, bxnVar);
    }

    @Override // defpackage.bxd
    public final Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // defpackage.bxd
    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.bxd
    public final int c() {
        return cjp.a(this.a);
    }

    @Override // defpackage.bxd
    public final void d() {
        this.b.a(this.a);
    }

    @Override // defpackage.bwy
    public final void e() {
        this.a.prepareToDraw();
    }
}
