package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahof  reason: default package */
/* loaded from: classes.dex */
public final class ahof extends ahlb implements ahms {
    public final ahrs a;
    public final ahmt b;
    public final ahoo c;
    public final Set e;
    public final Set f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public ahmq m;
    private final ahoo n;
    private final ahoo o;
    private final axdi p;
    private final float[] q;
    private final Set r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    public ahof(Handler handler, ahrz ahrzVar, ahol aholVar, float f, axdi axdiVar, ahot ahotVar) {
        ahoo b = ahoo.b();
        this.c = b;
        ahoo b2 = ahoo.b();
        this.n = b2;
        ahoo b3 = ahoo.b();
        this.o = b3;
        this.q = new float[16];
        this.e = new HashSet();
        this.f = new HashSet();
        this.r = new HashSet();
        this.k = 1;
        handler.getClass();
        aholVar.getClass();
        this.p = axdiVar;
        ahrs ahrsVar = new ahrs(ahrzVar, ahotVar);
        this.a = ahrsVar;
        b.f(0.0f, 0.0f, ahoj.a);
        b.d(b2);
        ahmt ahmtVar = new ahmt(handler, b2, b3, aholVar, this, ahrsVar, ahotVar);
        this.b = ahmtVar;
        d(f);
        q(ahmtVar);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        Boolean bool = ahom.a;
    }

    private final void w() {
        double d = ahoj.a;
        Double.isNaN(d);
        float tan = (float) (Math.tan(Math.toRadians((this.v + this.u) / 4.0f)) * 1.399999976158142d * d);
        double d2 = tan + tan;
        double atan = (float) Math.atan(1.0f / this.w);
        double sin = Math.sin(atan);
        Double.isNaN(d2);
        this.s = (float) Math.abs(sin * d2);
        double cos = Math.cos(atan);
        Double.isNaN(d2);
        this.t = (float) Math.abs(d2 * cos);
    }

    public final void a(ahod ahodVar) {
        this.e.add(ahodVar);
    }

    public final void c(ahoe ahoeVar) {
        this.r.add(ahoeVar);
    }

    public final void d(float f) {
        this.w = f;
        w();
        p();
    }

    public final void g(ahod ahodVar) {
        this.e.remove(ahodVar);
    }

    public final void h(ahoe ahoeVar) {
        this.r.remove(ahoeVar);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void i() {
        this.a.e();
        super.i();
    }

    public final void k(ahjy ahjyVar) {
        float[] fArr = ahjyVar.a;
        aqxo.p(true);
        float f = fArr[6];
        float degrees = (float) Math.toDegrees(-(Math.sqrt((double) (1.0f - (f * f))) >= 0.009999999776482582d ? (float) Math.atan2(-fArr[2], fArr[10]) : 0.0f));
        double degrees2 = Math.toDegrees(-Math.asin(fArr[6]));
        this.n.c();
        this.n.i(degrees, 0.0f, 1.0f);
        this.n.i((float) degrees2, 1.0f, 0.0f);
        this.o.c();
        this.o.i(degrees, 0.0f, 1.0f);
    }

    public final void l(float f) {
        this.b.d(f);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        if (this.j) {
            k(ahjyVar);
            this.j = false;
        }
        super.m(ahjyVar);
        ahmq ahmqVar = this.m;
        if (ahmqVar != null) {
            float[] fArr = ahjyVar.a;
            if (ahmqVar.f) {
                ahmp ahmpVar = ahmqVar.c;
                if (!ahmpVar.g) {
                    long j = ahmpVar.j;
                    long currentTimeMillis = (System.currentTimeMillis() - ahmpVar.k) + j;
                    long j2 = ahmpVar.l;
                    if (currentTimeMillis > j2) {
                        if (j <= j2) {
                            j = currentTimeMillis;
                        }
                        if (j <= 2000 + j2 || j2 == -1) {
                            ahmpVar.l = j;
                            Handler handler = ahmpVar.a;
                            if (handler != null) {
                                handler.post(new ahmn(ahmpVar, fArr, j));
                            }
                        }
                    }
                }
            }
        }
        Matrix.invertM(this.q, 0, ahjyVar.a, 0);
        this.p.b(this.q);
        GLES20.glClear(16640);
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void qQ(ahoh ahohVar) {
        ahoi ahoiVar = ahohVar.d;
        float f = ahoiVar.a + ahoiVar.c;
        float f2 = ahoiVar.b + ahoiVar.d;
        if (!ahom.j(f, this.u, 0.1f) && !ahom.j(f2, this.v, 0.1f)) {
            this.u = f;
            this.v = f2;
            ahmq ahmqVar = this.m;
            if (ahmqVar != null && (f != ahmqVar.d || f2 != ahmqVar.e)) {
                ahmqVar.a.post(new ahml(ahmqVar, f, f2));
                ahmqVar.d = f;
                ahmqVar.e = f2;
            }
            w();
            p();
        }
        super.qQ(ahohVar);
    }

    public final void t(int i) {
        ahmt ahmtVar = this.b;
        if (i != ahmtVar.g.j()) {
            int i2 = i - 1;
            aanv aanvVar = aanv.RECTANGULAR_2D;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                ahmtVar.g = ahmtVar.e;
            } else if (i2 == 1) {
                ahmtVar.g = ahmtVar.f;
            }
            ahmtVar.g.g();
            ahmtVar.j = true;
        }
    }

    public final void p() {
        float f;
        float f2;
        float f3 = this.w;
        if (f3 < 1.0f) {
            f = this.t;
            f2 = f3 * f;
            this.h = f2;
            this.i = f;
        } else {
            float f4 = this.s;
            this.h = f4;
            float f5 = f4 / f3;
            this.i = f5;
            f = f5;
            f2 = f4;
        }
        if (this.g) {
            f2 *= 1.42f;
            this.h = f2;
            f *= 1.42f;
            this.i = f;
        }
        ahmt ahmtVar = this.b;
        ahmtVar.k = f2;
        ahmtVar.m = f;
        if (ahmtVar.h == aanv.RECTANGULAR_2D || ahmtVar.h == aanv.RECTANGULAR_3D) {
            ahmtVar.g();
        }
        for (ahoe ahoeVar : this.r) {
            ahoeVar.c(this.h, this.i);
        }
    }
}
