package defpackage;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnsp  reason: default package */
/* loaded from: classes.dex */
public final class bnsp extends SurfaceView implements SurfaceHolder.Callback, bnss {
    @dzsi
    private bnsr a;
    @dzsi
    private bnsv b;
    @dzsi
    private final alra c;

    public bnsp(Context context) {
        super(context);
        this.c = null;
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
    public final void c() {
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
    public final void d() {
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

    @Override // defpackage.bnss
    public void setGestureController(bnsr bnsrVar) {
        this.a = bnsrVar;
    }

    @Override // defpackage.bnss
    public void setRenderer(bnst bnstVar) {
        this.b = new bnsx(bnstVar);
        getHolder().addCallback(this);
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
        } else {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            alra alraVar = this.c;
            if (alraVar == null) {
                return;
            }
            alraVar.a(i);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.f(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.e(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bnsv bnsvVar = this.b;
        if (bnsvVar != null) {
            bnsvVar.g();
        }
    }

    public bnsp(Context context, alra alraVar) {
        super(context);
        this.c = alraVar;
    }
}
