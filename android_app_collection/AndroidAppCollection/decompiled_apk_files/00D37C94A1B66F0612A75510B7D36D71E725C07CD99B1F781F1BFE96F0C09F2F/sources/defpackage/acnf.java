package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acnf  reason: default package */
/* loaded from: classes.dex */
public final class acnf implements SurfaceHolder.Callback, absj {
    public final boolean a;
    public final boolean b;
    public final Activity c;
    public final abss d;
    public final abta e;
    public final abrw f;
    public absz g;
    public abrz h;
    public absi i;
    public abrx j;
    public abro k;
    public absx l;
    public abtj m;
    public boolean o;
    public volatile boolean p;
    public final Object q = new Object();
    public CameraStreamViewManager$CameraModelData n = new CameraStreamViewManager$CameraModelData();

    public acnf(boolean z, boolean z2, SurfaceView surfaceView, final Activity activity, final abss abssVar, abrw abrwVar) {
        this.a = z;
        this.b = z2;
        this.c = activity;
        abssVar.getClass();
        this.d = abssVar;
        this.f = abrwVar;
        this.e = new abta(surfaceView, this);
        surfaceView.getHolder().addCallback(this);
        abssVar.c(new absp() { // from class: acmw
            @Override // defpackage.absp
            public final void a() {
                acnf acnfVar = acnf.this;
                Activity activity2 = activity;
                abss abssVar2 = abssVar;
                synchronized (acnfVar.q) {
                    if (acnfVar.p) {
                        return;
                    }
                    acnfVar.m = new abtj(acnfVar.f, abtp.c(activity2, R.raw.external_texture_frag), abtp.c(activity2, R.raw.sampler2d_texture_frag), acnfVar, acnfVar.n.c, abssVar2.a().b);
                    abssVar2.i(acnfVar.m);
                }
            }
        });
    }

    @Override // defpackage.absj
    public final void a() {
        abro abroVar;
        abss abssVar = this.d;
        if (abssVar.b.a) {
            abssVar.g();
        }
        if (this.a || (abroVar = this.k) == null || !abroVar.c) {
            return;
        }
        Handler handler = abroVar.b;
        if (handler != null) {
            handler.post(abroVar.d);
        } else {
            abroVar.d.run();
        }
    }

    public final int b() {
        return this.f.a;
    }

    public final void c() {
        ylr.c();
        this.f.e();
        this.n.a = this.f.b();
        this.n.b = this.f.a();
    }

    public final void d(CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData) {
        int i;
        ylr.c();
        if (cameraStreamViewManager$CameraModelData != null) {
            if (!cameraStreamViewManager$CameraModelData.d && (i = this.n.c) != cameraStreamViewManager$CameraModelData.c) {
                this.n = cameraStreamViewManager$CameraModelData;
                cameraStreamViewManager$CameraModelData.c = i;
            } else {
                this.n = cameraStreamViewManager$CameraModelData;
            }
            this.f.h(this.n.a);
            abtj abtjVar = this.m;
            if (abtjVar != null) {
                abtjVar.g(this.n.c);
            } else {
                this.d.a.post(new acnc(this, 1));
            }
        } else {
            this.f.j();
            this.n.a = this.f.b();
            this.n.b = this.f.a();
        }
        abtj abtjVar2 = this.m;
        if (abtjVar2 != null) {
            abtjVar2.f();
        }
        a();
    }

    public final void e(boolean z) {
        ylr.c();
        aqxo.z(this.e != null, "camera is not started yet");
        this.e.b(z);
    }

    public final void f(int i) {
        int i2 = (360 - (i * 90)) % 360;
        ylr.c();
        CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = this.n;
        if (!cameraStreamViewManager$CameraModelData.d || cameraStreamViewManager$CameraModelData.c % 180 == i2 % 180) {
            cameraStreamViewManager$CameraModelData.c = i2;
            abtj abtjVar = this.m;
            if (abtjVar == null) {
                return;
            }
            abtjVar.g(i2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.d.a.post(new acnb(this, surfaceHolder, i2, i3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d.a.post(new acnc(this));
    }
}
