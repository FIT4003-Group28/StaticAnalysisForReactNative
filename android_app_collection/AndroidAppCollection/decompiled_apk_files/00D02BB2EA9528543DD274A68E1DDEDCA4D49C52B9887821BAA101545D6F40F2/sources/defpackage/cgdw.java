package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cgdw  reason: default package */
/* loaded from: classes4.dex */
public final class cgdw<T> extends btrh<T> {
    private final int d;

    public cgdw(Class<?> cls, T t) {
        super(cls, t);
        this.d = 2;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        akqq aj;
        akqi akqiVar;
        int i = this.d;
        if (i == 0) {
            cgdv cgdvVar = (cgdv) this.a;
            alhx alhxVar = (alhx) obj;
            if (!cgdvVar.aD) {
                return;
            }
            cgdvVar.bA();
            cgdvVar.bE();
        } else if (i == 1) {
            cgdv cgdvVar2 = (cgdv) this.a;
            alhl alhlVar = (alhl) obj;
            if (!cgdvVar2.aD) {
                return;
            }
            cgdvVar2.bA();
            cgdvVar2.bE();
        } else if (i != 2) {
            int i2 = 0;
            if (i != 3) {
                cgdv cgdvVar3 = (cgdv) this.a;
                alho alhoVar = (alho) obj;
                if (!cgdvVar3.aD) {
                    return;
                }
                alaq alaqVar = alhoVar.a;
                if (!(alaqVar instanceof alap) || (akqiVar = ((alap) alaqVar).g) == null) {
                    return;
                }
                if (!cgdvVar3.e.f().booleanValue()) {
                    long j = akqiVar.c;
                    List<cgwi> b = cgdvVar3.e.b();
                    while (i2 < b.size()) {
                        if (b.get(i2).z().ai().c == j) {
                            cgdvVar3.bG(i2);
                            return;
                        }
                        i2++;
                    }
                    return;
                }
                cgdvVar3.e.s();
                return;
            }
            cgdv cgdvVar4 = (cgdv) this.a;
            alie alieVar = (alie) obj;
            if (!cgdvVar4.aD) {
                return;
            }
            if (cgdvVar4.e.f().booleanValue()) {
                cgdvVar4.e.s();
                return;
            }
            cgdr cgdrVar = cgdvVar4.aP;
            akqs a = alao.a(cgdvVar4.bj.d);
            if (a == null) {
                return;
            }
            double y = akra.f(a.j()).y(akra.f(a.k()));
            Double.isNaN(y);
            double d = y / 6.0d;
            List<cgwi> b2 = cgdvVar4.e.b();
            int intValue = cgdvVar4.e.e().intValue();
            int i3 = -1;
            while (i2 < b2.size()) {
                if (i2 != intValue && (aj = b2.get(i2).z().aj()) != null) {
                    double y2 = alieVar.a.y(akra.e(aj.a, aj.b));
                    if (y2 < d) {
                        i3 = i2;
                        d = y2;
                    }
                }
                i2++;
            }
            float f = Float.MAX_VALUE;
            for (dwyg dwygVar : cgdvVar4.aj.values()) {
                dpum dpumVar = dwygVar.c;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                akqq f2 = akqq.f(dpumVar);
                f = Math.min(f, alieVar.a.y(akra.e(f2.a, f2.b)));
            }
            if (f < d || i3 < 0) {
                return;
            }
            cgdvVar4.bG(i3);
        } else {
            cgdv cgdvVar5 = (cgdv) this.a;
            ardp ardpVar = (ardp) obj;
            if (!cgdvVar5.aD) {
                return;
            }
            cgdvVar5.bj.c().m().h(amwd.OFF);
            cgdvVar5.bA();
            cgdvVar5.bE();
        }
    }

    public cgdw(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
