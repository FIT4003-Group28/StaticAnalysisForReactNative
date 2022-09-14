package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.LruCache;
/* compiled from: PG */
/* renamed from: xcw  reason: default package */
/* loaded from: classes7.dex */
public final class xcw implements xdi {
    private static final cqrp a = cqrp.d(12.0d);
    private static final cqrp b = cqrp.d(18.0d);
    private final Activity c;
    private final LruCache<xcv, Bitmap> d = new LruCache<>(2);

    public xcw(Activity activity) {
        this.c = activity;
    }

    private final Bitmap e(@dzsi cqtd cqtdVar, cqrp cqrpVar) {
        if (cqtdVar == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        int e = cqrpVar.e(this.c);
        xcv xcvVar = new xcv();
        Bitmap bitmap = this.d.get(xcvVar);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap c = bvlf.c(cqtdVar.a(this.c), e, e, Bitmap.Config.ARGB_8888);
        this.d.put(xcvVar, c);
        return c;
    }

    @Override // defpackage.xdi
    public final Bitmap a(@dzsi cqtd cqtdVar) {
        return e(cqtdVar, a);
    }

    @Override // defpackage.xdi
    public final Bitmap b(@dzsi cqtd cqtdVar) {
        return e(cqtdVar, b);
    }

    @Override // defpackage.xdi
    public final dmlo c() {
        return dmlo.CENTER;
    }

    @Override // defpackage.xdi
    public final void d() {
        this.d.evictAll();
    }
}
