package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akzr  reason: default package */
/* loaded from: classes2.dex */
public final class akzr {
    public final akse c;
    public final akse d;
    public final akse e;
    public final akse f;
    public final amkz g;
    public akrk h;
    private final akse[][] m;
    private final akra i = new akra(0, 0);
    private final float[] j = new float[8];
    public final akse a = new akse(0.0f, 0.0f);
    public final akse b = new akse(0.0f, 0.0f);
    private final amkz k = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
    private final akse l = new akse(0.0f, 0.0f);

    public akzr(amkz amkzVar, akrk akrkVar) {
        this.g = amkzVar;
        this.h = akrkVar;
        dbsk.a(akrkVar.l() > 0);
        akse akseVar = new akse(amkzVar.a, amkzVar.b);
        this.c = akseVar;
        akse akseVar2 = new akse(amkzVar.a, amkzVar.d);
        this.d = akseVar2;
        akse akseVar3 = new akse(amkzVar.c, amkzVar.b);
        this.e = akseVar3;
        akse akseVar4 = new akse(amkzVar.c, amkzVar.d);
        this.f = akseVar4;
        this.m = new akse[][]{new akse[]{akseVar, akseVar2}, new akse[]{akseVar2, akseVar4}, new akse[]{akseVar4, akseVar3}, new akse[]{akseVar3, akseVar}};
    }

    public final int a(akzh akzhVar, int i, akse akseVar, akse akseVar2) {
        if (i == this.h.l() - 1) {
            akseVar2.s(akseVar);
            return i;
        }
        akse akseVar3 = this.b;
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i + 1;
            if (!b(akzhVar, i3, akseVar3)) {
                return -1;
            }
            if (this.g.e(akseVar3)) {
                if (i3 != this.h.l() - 1) {
                    akseVar.s(akseVar3);
                    i2++;
                    i = i3;
                } else {
                    akseVar2.s(akseVar3);
                    return i3;
                }
            } else if (!d(akseVar, akseVar3, akseVar2)) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final boolean b(akzh akzhVar, int i, akse akseVar) {
        this.h.n(i, this.i);
        if (!akyx.o(akzhVar, this.i, this.j)) {
            return false;
        }
        float[] fArr = this.j;
        akseVar.r((int) fArr[0], (int) fArr[1]);
        return true;
    }

    public final boolean c(akse akseVar, akse akseVar2, boolean z, akse akseVar3) {
        akse[][] akseVarArr = this.m;
        float f = Float.MAX_VALUE;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            akse[] akseVarArr2 = akseVarArr[i2];
            if (akse.h(akseVar, akseVar2, akseVarArr2[0], akseVarArr2[1], this.l)) {
                if (z) {
                    akseVar3.s(this.l);
                    return true;
                }
                float e = akse.e(this.l, akseVar2);
                if (i == 0 || e < f) {
                    akseVar3.s(this.l);
                    f = e;
                }
                i++;
                if (i == 2) {
                    break;
                }
            }
        }
        return i > 0;
    }

    public final boolean d(akse akseVar, akse akseVar2, akse akseVar3) {
        this.k.a(Math.min(akseVar.b, akseVar2.b), Math.min(akseVar.c, akseVar2.c), Math.max(akseVar.b, akseVar2.b), Math.max(akseVar.c, akseVar2.c));
        return this.g.d(this.k) && c(akseVar, akseVar2, false, akseVar3);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akzr)) {
            return false;
        }
        akzr akzrVar = (akzr) obj;
        return this.g.equals(akzrVar.g) && this.h == akzrVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.h});
    }
}
