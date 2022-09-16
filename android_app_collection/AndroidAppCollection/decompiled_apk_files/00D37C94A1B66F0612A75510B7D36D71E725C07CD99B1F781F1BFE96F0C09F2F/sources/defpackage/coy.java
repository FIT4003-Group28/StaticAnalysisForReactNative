package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: coy  reason: default package */
/* loaded from: classes3.dex */
public class coy implements cku, ckr {
    public final Bitmap a;
    private final cld b;

    public coy(Bitmap bitmap, cld cldVar) {
        hy.R(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        hy.R(cldVar, "BitmapPool must not be null");
        this.b = cldVar;
    }

    public static coy f(Bitmap bitmap, cld cldVar) {
        if (bitmap == null) {
            return null;
        }
        return new coy(bitmap, cldVar);
    }

    @Override // defpackage.cku
    public final int a() {
        return cvd.a(this.a);
    }

    @Override // defpackage.cku
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.cku
    public final /* bridge */ /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ckr
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.cku
    public final void e() {
        this.b.d(this.a);
    }
}
