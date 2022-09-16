package defpackage;

import android.opengl.Matrix;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahmj  reason: default package */
/* loaded from: classes.dex */
public final class ahmj extends ahlb {
    public static final float a = ahom.a(25.0f);
    public static final float b = ahom.a(9.0f);
    public static final float c = ahom.a(3.0f);
    public final ahjv[] e;
    public final ahjs f;
    public float g;
    public float h;
    private final ahjv i;
    private final ahjh j;
    private final ahli k;
    private final float[] m;
    private final ahmi n;
    private final ahly o;
    private float p;
    private float[] q;
    private boolean r;

    public ahmj(azqb azqbVar, int[] iArr, float f, ahoo ahooVar, ahmi ahmiVar) {
        aqxo.p(true);
        this.h = f;
        this.n = ahmiVar;
        this.j = new ahjh();
        ahoo clone = ahooVar.clone();
        this.k = new ahli(clone, this.h, 1.0f);
        this.f = new ahjs(new ahli(clone, this.h, a));
        ahon a2 = ahon.a(1.0f, 1.0f, ahon.c);
        int length = iArr.length;
        this.e = new ahjv[length];
        float[] fArr = new float[length];
        this.q = fArr;
        this.m = new float[length];
        fArr[0] = 1.0f;
        for (int i = 0; i < iArr.length; i++) {
            this.e[i] = new ahjv(a2, ahooVar.clone(), ahjv.s(ahjv.h(iArr[i]), a2.f), azqbVar);
        }
        g(this.q);
        ahon a3 = ahon.a(ahom.a(1.0f), b, ahon.c);
        ahjv ahjvVar = new ahjv(a3, ahooVar.clone(), ahjv.s(new float[]{1.0f, 1.0f, 1.0f, 1.0f}, a3.f), azqbVar);
        this.i = ahjvVar;
        ahjvVar.n((-this.h) / 2.0f, 0.0f, 0.0f);
        this.o = new ahly(ahjvVar, 1.0f, 0.0f);
        for (ahjv ahjvVar2 : this.e) {
            this.f.q(ahjvVar2);
        }
        q(this.f);
        q(this.i);
    }

    public final void a() {
        int i = 0;
        float f = 0.0f;
        while (true) {
            ahjv[] ahjvVarArr = this.e;
            if (i < ahjvVarArr.length) {
                float f2 = (((this.q[i] / 2.0f) + f) - 0.5f) * this.h;
                this.m[i] = f2;
                ahjvVarArr[i].n(f2, 0.0f, 0.0f);
                f += this.q[i];
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            ahjv[] ahjvVarArr = this.e;
            if (i < ahjvVarArr.length) {
                ahjvVarArr[i].n(-this.m[i], 0.0f, 0.0f);
                i++;
            } else {
                return;
            }
        }
    }

    public final void d(boolean z) {
        this.f.k(z);
    }

    public final void g(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        double d = f;
        if (d >= 1.01d || d <= 0.99d) {
            String valueOf = String.valueOf(Arrays.toString(fArr));
            zep.b(valueOf.length() != 0 ? "Invalid sized widths!".concat(valueOf) : new String("Invalid sized widths!"));
            return;
        }
        c();
        this.q = fArr;
        a();
    }

    public final void h(float f) {
        ahjv ahjvVar = this.i;
        float f2 = this.h;
        ahoo ahooVar = ((ahjj) ahjvVar).a;
        Matrix.setIdentityM(ahooVar.c, 0);
        Matrix.translateM(ahooVar.c, 0, f2 * f, 0.0f, 0.0f);
        ahooVar.h();
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
        if (this.f.b) {
            this.n.d(this.k.a(ahjyVar).a());
        }
    }

    public final boolean k() {
        return !v() && this.f.b;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        if (!v()) {
            boolean k = k();
            if (this.r && !k) {
                this.n.c();
            }
            this.r = k;
            this.j.b(k, ahjyVar.b);
            float f = b;
            float f2 = c;
            this.p = ((f - f2) * this.j.a()) + f2;
            this.o.a(!k, ahjyVar.b);
            if (k) {
                float a2 = this.k.a(ahjyVar).a();
                this.g = a2;
                h(a2);
                this.n.a(this.g);
            }
            int i = 0;
            while (true) {
                ahjv[] ahjvVarArr = this.e;
                if (i >= ahjvVarArr.length) {
                    break;
                }
                ahjvVarArr[i].rT(this.q[i] * this.h, this.p, 1.0f);
                i++;
            }
        }
        super.m(ahjyVar);
    }
}
