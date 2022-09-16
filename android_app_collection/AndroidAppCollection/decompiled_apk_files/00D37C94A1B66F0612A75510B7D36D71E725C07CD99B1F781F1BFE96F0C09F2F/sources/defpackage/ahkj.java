package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahkj  reason: default package */
/* loaded from: classes.dex */
public final class ahkj implements ahkl {
    public final HeadTransform a;
    public final Eye b;
    public final Viewport c;
    public GvrView.Renderer d;
    public boolean e;
    private final GLSurfaceView f;
    private final ViewGroup g;

    public ahkj(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        ahki ahkiVar = new ahki(this, context);
        this.f = ahkiVar;
        ahkiVar.setEGLContextClientVersion(2);
        ahkiVar.setPreserveEGLContextOnPause(true);
        frameLayout.addView(ahkiVar);
        this.a = new HeadTransform();
        this.b = new Eye(0);
        this.c = new Viewport();
    }

    @Override // defpackage.ahkl
    public final ViewGroup a() {
        return this.g;
    }

    @Override // defpackage.ahol
    public final void b(Runnable runnable) {
        this.f.queueEvent(runnable);
    }

    @Override // defpackage.ahkl
    public final GvrViewerParams c() {
        return new GvrViewerParams();
    }

    @Override // defpackage.ahkl
    public final void d() {
    }

    @Override // defpackage.ahkl
    public final void e() {
    }

    @Override // defpackage.ahkl
    public final void f(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.f.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.ahkl
    public final void g(Runnable runnable) {
    }

    @Override // defpackage.ahkl
    public final void h(Runnable runnable) {
    }

    @Override // defpackage.ahkl
    public final void i(GvrView.StereoRenderer stereoRenderer) {
        ahkg ahkgVar = new ahkg(stereoRenderer);
        this.d = ahkgVar;
        this.f.setRenderer(new ahkf(this, ahkgVar));
    }

    @Override // defpackage.ahkl
    public final void j(boolean z) {
        zep.b("Stereo mode (VR mode) not supported without GvrView support");
    }

    @Override // defpackage.ahkl
    public final void k() {
        ylr.c();
        if (!this.e) {
            zep.b("The GlSurfaceViewWrapper cannot be shutdown if it's not attached.");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        b(new ahkh(this, countDownLatch));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zep.d("Interrupted during shutdown", e);
        }
    }

    @Override // defpackage.ahkl
    public final void l(int i, int i2, int i3, int i4) {
        this.f.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }
}
