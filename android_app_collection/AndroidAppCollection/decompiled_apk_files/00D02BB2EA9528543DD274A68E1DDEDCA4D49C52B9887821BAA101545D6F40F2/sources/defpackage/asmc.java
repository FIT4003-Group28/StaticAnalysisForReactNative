package defpackage;
/* compiled from: PG */
/* renamed from: asmc  reason: default package */
/* loaded from: classes2.dex */
public final class asmc<T> extends btrh<T> {
    private final int d;

    private asmc(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    public static void c(btrm btrmVar, asmb asmbVar) {
        dceq a = dcet.a();
        a.b(alhw.class, new asmc(0, alhw.class, asmbVar, bvrj.UI_THREAD));
        a.b(alhx.class, new asmc(1, alhx.class, asmbVar, bvrj.UI_THREAD));
        a.b(alco.class, new asmc(2, alco.class, asmbVar, bvrj.UI_THREAD));
        a.b(alie.class, new asmc(3, alie.class, asmbVar, bvrj.UI_THREAD));
        a.b(alhk.class, new asmc(4, alhk.class, asmbVar, bvrj.UI_THREAD));
        a.b(crhk.class, new asmc(5, crhk.class, asmbVar, bvrj.UI_THREAD));
        a.b(alho.class, new asmc(6, alho.class, asmbVar, bvrj.UI_THREAD));
        a.b(aryn.class, new asmc(7, aryn.class, asmbVar, bvrj.UI_THREAD));
        a.b(alia.class, new asmc(8, alia.class, asmbVar, bvrj.UI_THREAD));
        btrmVar.g(asmbVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        switch (this.d) {
            case 0:
                asmb asmbVar = (asmb) this.a;
                alhw alhwVar = (alhw) obj;
                if (!asmb.c(asmbVar.a)) {
                    return;
                }
                akzh k = asmbVar.b.k();
                if (alhwVar.a == alje.FIRST_FINGER_DOWN) {
                    asmbVar.d = k.p().j;
                    asmbVar.e = Float.valueOf(k.p().m);
                    return;
                } else if (alhwVar.a != alje.LAST_FINGER_UP) {
                    return;
                } else {
                    akra akraVar = asmbVar.d;
                    Float f = asmbVar.e;
                    if (akraVar == null || f == null) {
                        return;
                    }
                    asma asmaVar = asmbVar.c;
                    float floatValue = f.floatValue();
                    alad p = k.p();
                    float abs = Math.abs(bvop.c(p.m - floatValue));
                    boolean z = false;
                    if ((akraVar.y(p.j) / akyx.e(k)) / k.B() < 40.0f && abs < 25.0f) {
                        z = true;
                    }
                    asmaVar.a(z);
                    asmbVar.d = null;
                    asmbVar.e = null;
                    return;
                }
            case 1:
                asmb asmbVar2 = (asmb) this.a;
                alhx alhxVar = (alhx) obj;
                if (!asmb.c(asmbVar2.a)) {
                    return;
                }
                asmbVar2.c.b(alhxVar.a);
                return;
            case 2:
                asmb asmbVar3 = (asmb) this.a;
                alco alcoVar = (alco) obj;
                if (!asmb.c(asmbVar3.a)) {
                    return;
                }
                asmbVar3.c.c(alcoVar);
                return;
            case 3:
                asmb asmbVar4 = (asmb) this.a;
                alie alieVar = (alie) obj;
                if (!asmb.c(asmbVar4.a)) {
                    return;
                }
                asmbVar4.c.d(alieVar);
                return;
            case 4:
                asmb asmbVar5 = (asmb) this.a;
                alhk alhkVar = (alhk) obj;
                if (!asmb.c(asmbVar5.a)) {
                    return;
                }
                asmbVar5.c.e(alhkVar);
                return;
            case 5:
                asmb asmbVar6 = (asmb) this.a;
                crhk crhkVar = (crhk) obj;
                if (!asmb.c(asmbVar6.a)) {
                    return;
                }
                asmbVar6.c.f(crhkVar);
                return;
            case 6:
                asmb asmbVar7 = (asmb) this.a;
                alho alhoVar = (alho) obj;
                if (!asmb.c(asmbVar7.a)) {
                    return;
                }
                asmbVar7.c.g(alhoVar);
                return;
            case 7:
                asmb asmbVar8 = (asmb) this.a;
                aryn arynVar = (aryn) obj;
                if (!asmb.c(asmbVar8.a)) {
                    return;
                }
                asmbVar8.c.h(arynVar);
                return;
            default:
                alia aliaVar = (alia) obj;
                asmb.c(((asmb) this.a).a);
                return;
        }
    }
}
