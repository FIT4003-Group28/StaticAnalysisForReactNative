package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.google.cardboard.sdk.CardboardView;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahke  reason: default package */
/* loaded from: classes.dex */
public final class ahke implements ahkl {
    private static final String c = "ahke";
    public final CardboardView a;
    public final ahkd b;
    private boolean d;

    public ahke(Context context) {
        CardboardView.setUseGvrGlSurfaceView(true);
        final CardboardView cardboardView = new CardboardView(context);
        this.a = cardboardView;
        cardboardView.setOnSettingsButtonClick(new Runnable() { // from class: ahka
            @Override // java.lang.Runnable
            public final void run() {
                CardboardView.this.onSettingsButtonClick();
            }
        });
        cardboardView.setOnViewDetachedRunnable(new Runnable() { // from class: ahjz
            @Override // java.lang.Runnable
            public final void run() {
                ahke.this.k();
            }
        });
        this.b = new ahkd();
    }

    @Override // defpackage.ahkl
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.ahol
    public final void b(Runnable runnable) {
        this.a.queueEvent(runnable);
        zep.m(c, "QE");
    }

    @Override // defpackage.ahkl
    public final GvrViewerParams c() {
        return new GvrViewerParams();
    }

    @Override // defpackage.ahkl
    public final void d() {
        this.a.onPause();
    }

    @Override // defpackage.ahkl
    public final void e() {
        this.a.onResume();
    }

    @Override // defpackage.ahkl
    public final void f(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.ahkl
    public final void g(Runnable runnable) {
        this.a.setOnTriggerEvent(runnable);
    }

    @Override // defpackage.ahkl
    public final void h(Runnable runnable) {
        this.a.setOnBackButtonClick(runnable);
    }

    @Override // defpackage.ahkl
    public final void i(GvrView.StereoRenderer stereoRenderer) {
        this.a.setRenderer(this.b);
        ahkd ahkdVar = this.b;
        ahkdVar.a = stereoRenderer;
        ahkdVar.b = true;
    }

    @Override // defpackage.ahkl
    public final void j(boolean z) {
        this.a.setStereoRenderMode(z);
    }

    @Override // defpackage.ahkl
    public final void k() {
        String str = c;
        boolean isGlViewAttached = this.a.isGlViewAttached();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("S | ");
        sb.append(isGlViewAttached);
        sb.append(" | ");
        sb.append(z);
        zep.m(str, sb.toString());
        ylr.c();
        if (!this.a.isGlViewAttached() || this.d) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.shutdownCalled();
        b(new ahkb(this, countDownLatch));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zep.d("Interrupted during shutdown", e);
        }
        this.d = true;
    }

    @Override // defpackage.ahkl
    public final void l(int i, int i2, int i3, int i4) {
        this.a.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }
}
