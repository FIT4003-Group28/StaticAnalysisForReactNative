package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfgv  reason: default package */
/* loaded from: classes4.dex */
public class cfgv {
    public cfgi a = cfgj.h.bZ();
    public final List<cfjf> b = new ArrayList();

    public final dlno a() {
        dlno dlnoVar = ((cfgj) this.a.b).b;
        return dlnoVar == null ? dlno.f : dlnoVar;
    }

    public final dbsg<cfgc> b(dspd dspdVar) {
        dbsg<cfgd> e = e(dspdVar);
        return (!e.a() || e.b().f.isEmpty()) ? dbpy.a : dbsg.i(e.b().f.get(e.b().f.size() - 1));
    }

    public final dbsg<cfgc> c(dspd dspdVar, dspd dspdVar2) {
        dbsg<cfgd> e = e(dspdVar);
        if (e.a()) {
            for (cfgc cfgcVar : e.b().f) {
                if (cfgcVar.b.equals(dspdVar2)) {
                    return dbsg.i(cfgcVar);
                }
            }
        }
        return dbpy.a;
    }

    public final void d(dspd dspdVar, final cfgc cfgcVar) {
        cfga cfgaVar = (cfga) e(dspdVar).h(cfgt.a).c(cfgd.h.bZ());
        dcdc z = dcbg.b(Collections.unmodifiableList(((cfgd) cfgaVar.b).f)).o(new dbsl(cfgcVar) { // from class: cfgu
            private final cfgc a;

            {
                this.a = cfgcVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !((cfgc) obj).b.equals(this.a.b);
            }
        }).z();
        if (cfgaVar.c) {
            cfgaVar.bF();
            cfgaVar.c = false;
        }
        ((cfgd) cfgaVar.b).f = cfgd.ck();
        if (cfgaVar.c) {
            cfgaVar.bF();
            cfgaVar.c = false;
        }
        cfgd cfgdVar = (cfgd) cfgaVar.b;
        cfgdVar.c();
        dsod.bv(z, cfgdVar.f);
        if (cfgaVar.c) {
            cfgaVar.bF();
            cfgaVar.c = false;
        }
        cfgd cfgdVar2 = (cfgd) cfgaVar.b;
        cfgcVar.getClass();
        cfgdVar2.c();
        cfgdVar2.f.add(cfgcVar);
        f(dspdVar, cfgaVar.bK());
    }

    public final dbsg<cfgd> e(dspd dspdVar) {
        for (cfgh cfghVar : Collections.unmodifiableList(((cfgj) this.a.b).g)) {
            if (dspdVar.equals(cfghVar.b)) {
                cfgd cfgdVar = cfghVar.c;
                if (cfgdVar == null) {
                    cfgdVar = cfgd.h;
                }
                return dbsg.i(cfgdVar);
            }
        }
        return dbpy.a;
    }

    public final void f(dspd dspdVar, cfgd cfgdVar) {
        cfgg bZ = cfgh.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgh cfghVar = (cfgh) bZ.b;
        dspdVar.getClass();
        int i = cfghVar.a | 1;
        cfghVar.a = i;
        cfghVar.b = dspdVar;
        cfgdVar.getClass();
        cfghVar.c = cfgdVar;
        cfghVar.a = i | 2;
        cfgh bK = bZ.bK();
        boolean z = false;
        for (int i2 = 0; i2 < ((cfgj) this.a.b).g.size(); i2++) {
            if (dspdVar.equals(this.a.a(i2).b)) {
                cfgi cfgiVar = this.a;
                if (cfgiVar.c) {
                    cfgiVar.bF();
                    cfgiVar.c = false;
                }
                cfgj cfgjVar = (cfgj) cfgiVar.b;
                bK.getClass();
                cfgjVar.c();
                cfgjVar.g.set(i2, bK);
                z = true;
            }
        }
        if (!z) {
            cfgi cfgiVar2 = this.a;
            if (cfgiVar2.c) {
                cfgiVar2.bF();
                cfgiVar2.c = false;
            }
            cfgj cfgjVar2 = (cfgj) cfgiVar2.b;
            bK.getClass();
            cfgjVar2.c();
            cfgjVar2.g.add(bK);
        }
    }
}
