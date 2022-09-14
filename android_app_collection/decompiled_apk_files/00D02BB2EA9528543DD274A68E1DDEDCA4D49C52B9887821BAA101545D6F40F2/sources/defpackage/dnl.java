package defpackage;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
/* compiled from: PG */
/* renamed from: dnl  reason: default package */
/* loaded from: classes6.dex */
public final class dnl {
    private final ff f;
    private final SensorManager g;
    public final dzgj<dam> a = dzgj.a(dam.UNKNOWN);
    private final SensorEventListener h = new dnk(this);
    private final aou i = new e() { // from class: com.google.android.apps.gmm.ar.common.tilt.TiltObserver$2
        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
        }

        @Override // defpackage.f
        public final void f(m mVar) {
            dnl.this.b();
        }
    };
    public final float[] b = new float[9];
    public final float[] c = new float[3];
    public float d = -1000.0f;
    public boolean e = false;

    public dnl(ff ffVar) {
        this.f = ffVar;
        this.g = (SensorManager) ffVar.getSystemService("sensor");
    }

    public final void a() {
        if (this.e || this.f.isDestroyed()) {
            return;
        }
        this.g.registerListener(this.h, this.g.getDefaultSensor(15), 3);
        this.e = true;
        this.f.g.a(this.i);
    }

    public final void b() {
        this.g.unregisterListener(this.h);
        this.e = false;
        this.f.g.b(this.i);
    }
}
