package defpackage;
/* compiled from: PG */
/* renamed from: aohc  reason: default package */
/* loaded from: classes2.dex */
public class aohc implements aogx {
    public final dcdc<dvay> a;
    public final dcdc<dwfl> b;
    public final dcdc<dvan> c;
    public final int d;
    public final dqjl e;

    public aohc(aogw aogwVar, dvay dvayVar) {
        dvav dvavVar;
        dvav dvavVar2;
        dvav dvavVar3;
        if (dvayVar.b == 14) {
            dvavVar = (dvav) dvayVar.c;
        } else {
            dvavVar = dvav.e;
        }
        dcdc<dvay> r = dcdc.r(dvavVar.b);
        this.a = r;
        dccx F = dcdc.F();
        int size = r.size();
        for (int i = 0; i < size; i++) {
            F.i(r.get(i).i);
        }
        this.b = F.f();
        dcdc<dvay> dcdcVar = this.a;
        dccx F2 = dcdc.F();
        int size2 = dcdcVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            F2.i(aogwVar.a(dcdcVar.get(i2)));
        }
        this.c = F2.f();
        if (dvayVar.b == 14) {
            dvavVar2 = (dvav) dvayVar.c;
        } else {
            dvavVar2 = dvav.e;
        }
        this.d = dvavVar2.c;
        if (dvayVar.b == 14) {
            dvavVar3 = (dvav) dvayVar.c;
        } else {
            dvavVar3 = dvav.e;
        }
        dqjl b = dqjl.b(dvavVar3.d);
        this.e = b == null ? dqjl.UNKNOWN_ACTIVITY_TYPE : b;
    }

    @Override // defpackage.aogx
    public final dcdc<dvay> a() {
        return this.a;
    }

    public final dwyn b() {
        dwyn dwynVar = this.a.get(0).f;
        return dwynVar == null ? dwyn.d : dwynVar;
    }

    public final dwyn c() {
        dwyn dwynVar = ((dvay) dcft.s(this.a)).g;
        return dwynVar == null ? dwyn.d : dwynVar;
    }

    public final dpop d() {
        dpoo bZ = dpop.d.bZ();
        long j = aogc.a(b()).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar = (dpop) bZ.b;
        dpopVar.a |= 1;
        dpopVar.b = j;
        long j2 = aogc.a(c()).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar2 = (dpop) bZ.b;
        dpopVar2.a |= 2;
        dpopVar2.c = j2;
        return bZ.bK();
    }
}
