package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dgn  reason: default package */
/* loaded from: classes3.dex */
public final class dgn extends dgp implements dgm {
    private final dgr e;
    private long f;

    public dgn() {
        this(null);
    }

    @Override // defpackage.dgp
    public final float a(long j) {
        double d;
        boolean z;
        double d2;
        boolean z2;
        boolean z3;
        dgn dgnVar = this;
        long j2 = j;
        if (dgnVar.f == Long.MIN_VALUE) {
            dgnVar.f = j2;
            float f = dgnVar.f("initial").c;
            float f2 = dgnVar.f("end").c;
            dgr dgrVar = dgnVar.e;
            dgrVar.b.a = f;
            Iterator it = dgrVar.h.iterator();
            while (it.hasNext()) {
                ((dgt) it.next()).d();
            }
            dgq dgqVar = dgrVar.b;
            double d3 = dgqVar.a;
            dgrVar.e = d3;
            dgrVar.d.a = d3;
            dgqVar.b = 0.0d;
            dgnVar.e.b(f2);
            return f;
        }
        float f3 = dgnVar.f("end").c;
        dgnVar.e.b(f3);
        if (b()) {
            return f3;
        }
        double d4 = j2 - dgnVar.f;
        Double.isNaN(d4);
        double d5 = d4 / 1.0E9d;
        dgr dgrVar2 = dgnVar.e;
        boolean a = dgrVar2.a();
        if (!a || !dgrVar2.f) {
            if (d5 > 0.064d) {
                d5 = 0.064d;
            }
            dgrVar2.g += d5;
            dgs dgsVar = dgrVar2.a;
            double d6 = dgsVar.d;
            double d7 = dgsVar.c;
            dgq dgqVar2 = dgrVar2.b;
            double d8 = dgqVar2.a;
            double d9 = dgqVar2.b;
            dgq dgqVar3 = dgrVar2.d;
            double d10 = d9;
            double d11 = d8;
            double d12 = dgqVar3.a;
            double d13 = dgqVar3.b;
            while (true) {
                d = dgrVar2.g;
                if (d < 0.001d) {
                    break;
                }
                double d14 = d - 0.001d;
                dgrVar2.g = d14;
                if (d14 < 0.001d) {
                    dgq dgqVar4 = dgrVar2.c;
                    dgqVar4.a = d11;
                    dgqVar4.b = d10;
                }
                double d15 = dgrVar2.e;
                double d16 = ((d15 - d12) * d6) - (d7 * d10);
                double d17 = d10 + (d16 * 0.001d * 0.5d);
                double d18 = ((d15 - (d11 + ((d10 * 0.001d) * 0.5d))) * d6) - (d7 * d17);
                double d19 = d10 + (d18 * 0.001d * 0.5d);
                double d20 = ((d15 - (d11 + ((d17 * 0.001d) * 0.5d))) * d6) - (d7 * d19);
                double d21 = d11 + (d19 * 0.001d);
                double d22 = d10 + (d20 * 0.001d);
                double d23 = d17 + d19;
                double d24 = d18 + d20;
                d11 += (d10 + d23 + d23 + d22) * 0.16666666666666666d * 0.001d;
                d10 += (d16 + d24 + d24 + (((d15 - d21) * d6) - (d7 * d22))) * 0.16666666666666666d * 0.001d;
                d12 = d21;
                d13 = d22;
            }
            dgq dgqVar5 = dgrVar2.d;
            dgqVar5.a = d12;
            dgqVar5.b = d13;
            dgq dgqVar6 = dgrVar2.b;
            dgqVar6.a = d11;
            dgqVar6.b = d10;
            if (d > 0.0d) {
                double d25 = d / 0.001d;
                dgq dgqVar7 = dgrVar2.c;
                double d26 = 1.0d - d25;
                z = a;
                d2 = d6;
                dgqVar6.a = (d11 * d25) + (dgqVar7.a * d26);
                dgqVar6.b = (d10 * d25) + (dgqVar7.b * d26);
            } else {
                z = a;
                d2 = d6;
            }
            boolean z4 = true;
            if (!dgrVar2.a()) {
                z2 = z;
            } else {
                if (d2 > 0.0d) {
                    dgrVar2.b.a = dgrVar2.e;
                } else {
                    dgrVar2.e = dgrVar2.b.a;
                }
                dgq dgqVar8 = dgrVar2.b;
                if (dgqVar8.b != 0.0d) {
                    dgqVar8.b = 0.0d;
                }
                z2 = true;
            }
            if (dgrVar2.f) {
                dgrVar2.f = false;
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                dgrVar2.f = true;
            } else {
                z4 = false;
            }
            Iterator it2 = dgrVar2.h.iterator();
            while (it2.hasNext()) {
                dgt dgtVar = (dgt) it2.next();
                if (z3) {
                    dgtVar.a();
                }
                dgtVar.d();
                if (z4) {
                    dgtVar.b();
                }
            }
            dgnVar = this;
            j2 = j;
        }
        dgnVar.f = j2;
        return (float) dgnVar.e.b.a;
    }

    @Override // defpackage.dgm
    public final boolean b() {
        return this.e.a();
    }

    public dgn(dgs dgsVar) {
        this.f = Long.MIN_VALUE;
        dgr dgrVar = new dgr();
        this.e = dgrVar;
        if (dgsVar != null) {
            dgrVar.a = dgsVar;
        }
    }
}
