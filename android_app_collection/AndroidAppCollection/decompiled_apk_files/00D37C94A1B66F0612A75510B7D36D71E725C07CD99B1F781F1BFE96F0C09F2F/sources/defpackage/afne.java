package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
/* compiled from: PG */
/* renamed from: afne  reason: default package */
/* loaded from: classes.dex */
public class afne extends afna implements SurfaceHolder.Callback {
    protected SurfaceView a;
    private final View b;
    private volatile boolean c;
    private int i;
    private ahdq j;

    public afne(Context context) {
        super(context);
        F();
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // defpackage.afnh
    public final Surface A() {
        return this.a.getHolder().getSurface();
    }

    @Override // defpackage.afna, defpackage.afnh
    public final SurfaceHolder B() {
        return this.a.getHolder();
    }

    public afnk C() {
        return afnk.SURFACE;
    }

    @Override // defpackage.afmu
    public final void D() {
        Surface surface = this.a.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afmu
    public final boolean E() {
        return this.c;
    }

    public final void F() {
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.a = surfaceView;
        surfaceView.getHolder().addCallback(this);
        addView(this.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void H() {
        this.b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void I() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.afna, defpackage.afnh
    public SurfaceControl f() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.a.getSurfaceControl();
        }
        return null;
    }

    @Override // defpackage.afna, defpackage.afmu
    public void l(final Bitmap bitmap, final yiw yiwVar) {
        if (Build.VERSION.SDK_INT >= 24 && this.j == null) {
            this.j = new ahdq();
        }
        ahdq ahdqVar = this.j;
        Surface A = A();
        if (ahdqVar == null || A == null || !A.isValid() || !bitmap.isMutable()) {
            super.l(bitmap, yiwVar);
            return;
        }
        PixelCopy.request(A, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: afnb
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                yiw yiwVar2 = yiw.this;
                Bitmap bitmap2 = bitmap;
                if (i == 0) {
                    yiwVar2.b(bitmap2, bitmap2);
                } else {
                    yiwVar2.a(bitmap2, null);
                }
            }
        }, this.d);
    }

    @Override // defpackage.afnh
    public final void o() {
        this.c = false;
        post(new Runnable() { // from class: afnd
            @Override // java.lang.Runnable
            public final void run() {
                afne afneVar = afne.this;
                afneVar.a.getHolder().removeCallback(afneVar);
                afneVar.surfaceDestroyed(afneVar.a.getHolder());
                afneVar.removeView(afneVar.a);
                afneVar.F();
            }
        });
    }

    @Override // defpackage.afna, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        G(this.a, i5, i6);
        if (this.b.getVisibility() != 8) {
            G(this.b, i5, i6);
        }
    }

    @Override // defpackage.afna, defpackage.afnh
    public final void q() {
        if (this.i == 842094169) {
            o();
            this.i = 0;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.a.setVisibility(i);
        this.b.setVisibility(i);
        super.setVisibility(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afng afngVar = this.g;
        if (afngVar != null) {
            afngVar.b();
        }
        this.i = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.c = true;
        afng afngVar = this.g;
        if (afngVar != null) {
            afngVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.c = false;
        afng afngVar = this.g;
        if (afngVar != null) {
            afngVar.d();
        }
        k();
    }

    @Override // defpackage.afna, defpackage.afmu
    public final void v(int i, int i2) {
        if (afnh.h) {
            this.a.getHolder().setFixedSize(i, i2);
        }
        super.v(i, i2);
    }
}
