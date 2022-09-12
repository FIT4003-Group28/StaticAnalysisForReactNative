package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnsq  reason: default package */
/* loaded from: classes3.dex */
public class bnsq extends TextureView implements TextureView.SurfaceTextureListener, bnss {
    @dzsi
    private bnsr a;
    @dzsi
    private bnsv b;
    @dzsi
    private bnst c;
    private boolean d;
    @dzsi
    private final alra e;

    public bnsq(Context context) {
        super(context);
        this.e = null;
    }

    @Override // defpackage.bnss
    public final View a() {
        return this;
    }

    @Override // defpackage.bnss
    public final void b() {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.h();
        }
    }

    @Override // defpackage.bnss
    public void c() {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.a();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        bnsr bnsrVar = this.a;
        return bnsrVar == null ? super.canScrollHorizontally(i) : bnsrVar.a();
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        bnsr bnsrVar = this.a;
        return bnsrVar == null ? super.canScrollVertically(i) : bnsrVar.a();
    }

    @Override // defpackage.bnss
    public void d() {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.b();
        }
    }

    @Override // defpackage.bnss
    public final void e() {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.c();
            this.b = null;
        }
    }

    @Override // defpackage.bnss
    public final void f() {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.j();
        }
    }

    protected final void finalize() {
        try {
            bnsv bnsvVar = this.b;
            if (bnsvVar != null) {
                bnsvVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(Runnable runnable) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.k(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        bnsv bnsvVar;
        super.onAttachedToWindow();
        bnst bnstVar = this.c;
        if (this.d && bnstVar != null && ((bnsvVar = this.b) == null || bnsvVar.d())) {
            bnsx bnsxVar = new bnsx(bnstVar);
            this.b = bnsxVar;
            bnsxVar.a();
        }
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.e(surfaceTexture);
            this.b.f(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.g();
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.f(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.bnss
    public void setGestureController(bnsr bnsrVar) {
        this.a = bnsrVar;
    }

    @Override // defpackage.bnss
    public void setTimeRemainingCallback(bnsu bnsuVar) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.i(bnsuVar);
        }
    }

    @Override // defpackage.bnss
    public void setTransparent(boolean z) {
        if (z) {
            setAlpha(0.0f);
            setOpaque(false);
            return;
        }
        setAlpha(1.0f);
        setOpaque(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            alra alraVar = this.e;
            if (alraVar == null) {
                return;
            }
            alraVar.a(i);
        }
    }

    public bnsq(Context context, alra alraVar) {
        super(context);
        this.e = alraVar;
    }

    @Override // defpackage.bnss
    public void setRenderer(bnst bnstVar) {
        if (this.b == null) {
            this.c = bnstVar;
            this.b = new bnsx(bnstVar);
            setSurfaceTextureListener(this);
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }
}
