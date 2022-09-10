package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aben  reason: default package */
/* loaded from: classes.dex */
public final class aben extends itb implements abfb {
    private final gga a;

    public aben(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.abfb
    public final void e(abse abseVar) {
        gga ggaVar = this.a;
        absj bZ = absk.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        absk abskVar = (absk) bZ.b;
        abseVar.getClass();
        abskVar.c = abseVar;
        abskVar.a |= 2;
        abew abewVar = new abew();
        abewVar.B(bvrs.d(bZ.bK()));
        ggaVar.D(abewVar);
    }

    @Override // defpackage.abfb
    public final void f(dhjx dhjxVar) {
        gga ggaVar = this.a;
        absh bZ = absi.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        absi absiVar = (absi) bZ.b;
        dhjxVar.getClass();
        absiVar.b = dhjxVar;
        absiVar.a |= 1;
        abep abepVar = new abep();
        abepVar.B(bvrs.d(bZ.bK()));
        ggaVar.D(abepVar);
    }

    @Override // defpackage.abfb
    public final void i(dpsv dpsvVar, int i, List<dpuz> list, dhjx dhjxVar) {
        gga ggaVar = this.a;
        absm bZ = absn.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        absn absnVar = (absn) bZ.b;
        absnVar.b = dpsvVar.i;
        int i2 = absnVar.a | 1;
        absnVar.a = i2;
        dhjxVar.getClass();
        absnVar.c = dhjxVar;
        absnVar.a = i2 | 2;
        absn absnVar2 = (absn) bZ.b;
        dsrf dsrfVar = absnVar2.e;
        if (!dsrfVar.a()) {
            absnVar2.e = dsqw.cg(dsrfVar);
        }
        for (dpuz dpuzVar : list) {
            absnVar2.e.h(dpuzVar.e);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        absn absnVar3 = (absn) bZ.b;
        absnVar3.g = i - 1;
        absnVar3.a |= 8;
        abet abetVar = new abet();
        abetVar.B(bvrs.d(bZ.bK()));
        ggaVar.D(abetVar);
    }
}
