package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: cfky  reason: default package */
/* loaded from: classes4.dex */
public class cfky implements cfhn {
    private final dspd a;
    private final dlnk b;
    private final dddi c;
    private final cfgv d;
    private boolean e;
    private final cfla f;

    public cfky(cfgv cfgvVar, dddi dddiVar, dspd dspdVar, dlnk dlnkVar, cfla cflaVar) {
        this.a = dspdVar;
        this.b = dlnkVar;
        this.c = dddiVar;
        this.f = cflaVar;
        this.d = cfgvVar;
        dspd dspdVar2 = dlnkVar.a;
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        boolean z = false;
        if (e.a() && e.b().d.contains(dspdVar2)) {
            z = true;
        }
        this.e = z;
    }

    @Override // defpackage.cfhn
    public String a() {
        return this.b.b;
    }

    @Override // defpackage.cfhn
    public String b() {
        return this.b.c;
    }

    @Override // defpackage.cfhn
    public cqkl c() {
        cflb cflbVar;
        boolean z = !this.e;
        this.e = z;
        cfgv cfgvVar = this.d;
        dspd dspdVar = this.a;
        final dspd dspdVar2 = this.b.a;
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        cfga bZ = cfgd.h.bZ();
        if (e.a()) {
            bZ.bC(e.b());
        }
        boolean contains = Collections.unmodifiableList(((cfgd) bZ.b).d).contains(dspdVar2);
        if (contains) {
            if (!z) {
                dcdc q = dcdc.q(dcft.i(Collections.unmodifiableList(((cfgd) bZ.b).d), new dbsl(dspdVar2) { // from class: cfgs
                    private final dspd a;

                    {
                        this.a = dspdVar2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return !((dspd) obj).equals(this.a);
                    }
                }));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((cfgd) bZ.b).d = cfgd.ck();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ.b;
                cfgdVar.b();
                dsod.bv(q, cfgdVar.d);
                cfgvVar.f(dspdVar, bZ.bK());
                cqkx.p(this);
                this.f.a.a.a(Boolean.valueOf(!cflbVar.d().booleanValue()));
                return cqkl.a;
            }
            z = true;
        }
        if (!contains && z) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cfgd cfgdVar2 = (cfgd) bZ.b;
            dspdVar2.getClass();
            cfgdVar2.b();
            cfgdVar2.d.add(dspdVar2);
        }
        cfgvVar.f(dspdVar, bZ.bK());
        cqkx.p(this);
        this.f.a.a.a(Boolean.valueOf(!cflbVar.d().booleanValue()));
        return cqkl.a;
    }

    @Override // defpackage.cfhn
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.ol;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.c;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.b.a;
        if (dddhVar.c) {
            dddhVar.bF();
            dddhVar.c = false;
        }
        dddi dddiVar2 = (dddi) dddhVar.b;
        dspdVar.getClass();
        dddiVar2.a |= 2;
        dddiVar2.c = dspdVar;
        dddi bK = dddhVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        bK.getClass();
        dddgVar.d = bK;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }

    @Override // defpackage.cfhn
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }
}
