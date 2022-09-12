package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: acgp  reason: default package */
/* loaded from: classes2.dex */
public final class acgp implements bnte, achg {
    volatile boolean a = false;
    @dzsi
    public volatile Bitmap b = null;
    @dzsi
    public Bitmap c = null;
    @dzsi
    public final achf d;
    private final gga e;
    private final dxio<akox> f;
    private final bvrb g;

    public acgp(@dzsi achf achfVar, gga ggaVar, dxio<akox> dxioVar, bvrb bvrbVar) {
        this.d = achfVar;
        this.e = ggaVar;
        this.f = dxioVar;
        this.g = bvrbVar;
    }

    public static achg d(@dzsi achf achfVar, gga ggaVar, final akox akoxVar, bvrb bvrbVar) {
        acgp acgpVar = new acgp(achfVar, ggaVar, new dxio(akoxVar) { // from class: acgn
            private final akox a;

            {
                this.a = akoxVar;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return this.a;
            }
        }, bvrbVar);
        acgpVar.b = null;
        if (acgpVar.f.a().aj() != null) {
            acgpVar.f.a().aj().ah().b(acgpVar);
            Window window = acgpVar.e.getWindow();
            if (window != null) {
                acgpVar.b = e(window.getDecorView().getRootView());
            }
        }
        fd K = acgpVar.e.K();
        if (K instanceof gen) {
            acgpVar.c = e(K.P);
        }
        return acgpVar;
    }

    @dzsi
    private static Bitmap e(@dzsi View view) {
        Bitmap drawingCache;
        Bitmap bitmap = null;
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        if (view.getDrawingCache() != null && (drawingCache = view.getDrawingCache()) != null) {
            bitmap = drawingCache.copy(drawingCache.getConfig(), true);
        }
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    @Override // defpackage.achg
    @dzsi
    public final Bitmap a() {
        Bitmap bitmap = this.a ? this.b : null;
        this.b = null;
        return bitmap;
    }

    @Override // defpackage.achg
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.bnte
    public final ByteBuffer c(int i) {
        return null;
    }

    @Override // defpackage.bnte
    public final void f(@dzsi Bitmap bitmap) {
        this.g.b(new acgo(this, bitmap), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.bnte
    public final Bitmap g(int i, int i2) {
        return null;
    }
}
