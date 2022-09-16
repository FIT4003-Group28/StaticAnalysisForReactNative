package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: agw  reason: default package */
/* loaded from: classes.dex */
public class agw {
    ahc a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public agv e;

    public agw() {
    }

    public static final boolean l(ahc ahcVar) {
        return ahcVar.l <= 1;
    }

    public final ahc a(boolean[] zArr, ahc ahcVar) {
        int i;
        int i2 = this.e.a;
        ahc ahcVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                ahc d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != ahcVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    ahcVar2 = d;
                }
            }
        }
        return ahcVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahc ahcVar) {
        ahc ahcVar2 = this.a;
        if (ahcVar2 != null) {
            this.e.g(ahcVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(ahcVar, true);
        this.a = ahcVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        agv agvVar = this.e;
        int i = agvVar.f;
        for (int i2 = 0; i != -1 && i2 < agvVar.a; i2++) {
            float[] fArr = agvVar.e;
            fArr[i] = fArr[i] / f;
            i = agvVar.d[i];
        }
    }

    public final void c(agy agyVar, ahc ahcVar, boolean z) {
        if (ahcVar == null || !ahcVar.g) {
            return;
        }
        this.b += ahcVar.f * this.e.a(ahcVar);
        this.e.c(ahcVar, z);
        if (z) {
            ahcVar.b(this);
        }
        if (this.e.a != 0) {
            return;
        }
        this.d = true;
        agyVar.c = true;
    }

    public void d(agy agyVar, agw agwVar, boolean z) {
        agv agvVar = this.e;
        float a = agvVar.a(agwVar.a);
        agvVar.c(agwVar.a, z);
        agv agvVar2 = agwVar.e;
        int i = agvVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            ahc d = agvVar2.d(i2);
            agvVar.e(d, agvVar2.a(d) * a, z);
        }
        this.b += agwVar.b * a;
        if (z) {
            agwVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        agyVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(agy agyVar, int i) {
        this.e.g(agyVar.p(i), 1.0f);
        this.e.g(agyVar.p(i), -1.0f);
    }

    public final void g(ahc ahcVar, ahc ahcVar2, ahc ahcVar3, ahc ahcVar4, float f) {
        this.e.g(ahcVar, -1.0f);
        this.e.g(ahcVar2, 1.0f);
        this.e.g(ahcVar3, f);
        this.e.g(ahcVar4, -f);
    }

    public final void j(ahc ahcVar, ahc ahcVar2, ahc ahcVar3, ahc ahcVar4, float f) {
        this.e.g(ahcVar3, 0.5f);
        this.e.g(ahcVar4, 0.5f);
        this.e.g(ahcVar, -0.5f);
        this.e.g(ahcVar2, -0.5f);
        this.b = -f;
    }

    public ahc k(boolean[] zArr) {
        return a(zArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agw.toString():java.lang.String");
    }

    public agw(agx agxVar) {
        this.e = new agv(this, agxVar);
    }

    public final void h(ahc ahcVar, ahc ahcVar2, ahc ahcVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(ahcVar, 1.0f);
                this.e.g(ahcVar2, -1.0f);
                this.e.g(ahcVar3, -1.0f);
                return;
            }
        }
        this.e.g(ahcVar, -1.0f);
        this.e.g(ahcVar2, 1.0f);
        this.e.g(ahcVar3, 1.0f);
    }

    public final void i(ahc ahcVar, ahc ahcVar2, ahc ahcVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(ahcVar, 1.0f);
                this.e.g(ahcVar2, -1.0f);
                this.e.g(ahcVar3, 1.0f);
                return;
            }
        }
        this.e.g(ahcVar, -1.0f);
        this.e.g(ahcVar2, 1.0f);
        this.e.g(ahcVar3, -1.0f);
    }
}
