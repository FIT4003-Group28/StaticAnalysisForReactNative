package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
/* compiled from: PG */
/* renamed from: bxbx  reason: default package */
/* loaded from: classes4.dex */
public final class bxbx extends FrameLayout {
    private static final boolean d = true;
    public amfi a;
    public bnsq b;
    public boolean c;
    private Choreographer.FrameCallback e;
    private bwvf f;

    static {
        NativeHelper.a();
    }

    public bxbx(Context context) {
        this(context, null);
    }

    public final boolean a() {
        return this.f != null;
    }

    public final void b(dfxs dfxsVar, Runnable runnable) {
        int i;
        if (!d) {
            return;
        }
        bwve bwveVar = (bwve) this.f;
        bwveVar.g = runnable;
        dfwp dfwpVar = dfxsVar.b;
        if (dfwpVar == null) {
            dfwpVar = dfwp.d;
        }
        dftc bZ = dftd.d.bZ();
        dfwn b = dfwn.b(dfwpVar.b);
        if (b == null) {
            b = dfwn.IMAGE_UNKNOWN;
        }
        if (b == dfwn.IMAGE_ALLEYCAT) {
            i = 2;
        } else {
            i = b == dfwn.IMAGE_FIFE ? 3 : b == dfwn.IMAGE_CONTENT_FIFE ? 4 : b == dfwn.MEDIA_GUESSABLE_FIFE ? 7 : 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftd dftdVar = (dftd) bZ.b;
        dftdVar.b = i - 1;
        int i2 = dftdVar.a | 1;
        dftdVar.a = i2;
        String str = dfwpVar.c;
        str.getClass();
        dftdVar.a = i2 | 2;
        dftdVar.c = str;
        bwveVar.f = bZ.bK();
        bwvd bwvdVar = bwveVar.k;
        if (bwvdVar != null) {
            synchronized (bwvdVar) {
                bwvdVar.a = true;
            }
            Renderer renderer = bwveVar.e;
            RendererSwigJNI.Renderer_abandonPendingCallbacks(renderer.a, renderer);
        }
        bwveVar.k = new bwvd(bwveVar);
        dfuk dfukVar = bwveVar.j.a;
        dbsk.s(dfukVar);
        dfukVar.a(bwveVar.f, dhjz.e, bwveVar.k);
        invalidate();
    }

    public final void c() {
        if (!d) {
            return;
        }
        ((bwve) this.f).f = dftd.d;
        invalidate();
    }

    public final void d() {
        if (!d) {
            return;
        }
        this.b.animate().cancel();
        this.b.setAlpha(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (!d) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e(int i) {
        if (!d) {
            return;
        }
        this.b.animate().alpha(1.0f).setDuration(i);
    }

    @dzsi
    public final bwuj f() {
        bwvf bwvfVar;
        if (!d || (bwvfVar = this.f) == null) {
            return null;
        }
        return ((bwve) bwvfVar).d;
    }

    public final void g(bvrb bvrbVar, btvo btvoVar, ckcw ckcwVar) {
        if (!d) {
            return;
        }
        bwve bwveVar = new bwve(getContext(), this.b, bvrbVar, ckcwVar, btvoVar.getImageryViewerParameters(), this.a, ((buth) btsr.a(buth.class)).rF());
        this.f = bwveVar;
        this.b.setRenderer(bwveVar);
        this.b.c();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (d && !this.c) {
            this.c = true;
            if (this.e == null) {
                this.e = new bxbw(this);
            }
            Choreographer.getInstance().postFrameCallback(this.e);
        }
    }

    public bxbx(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        if (!d) {
            return;
        }
        ((bxby) bttc.a(bxby.class, this)).xC(this);
        bxbv bxbvVar = new bxbv(context);
        this.b = bxbvVar;
        bxbvVar.setVisibility(0);
        this.b.setOpaque(false);
        this.b.setAlpha(0.0f);
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    }
}
