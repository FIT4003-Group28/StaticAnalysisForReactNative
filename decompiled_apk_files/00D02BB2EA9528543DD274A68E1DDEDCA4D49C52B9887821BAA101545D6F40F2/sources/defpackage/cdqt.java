package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cdqt  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdqt implements Serializable {
    public static cdqt e(dmbq dmbqVar) {
        bvrt b = bvrt.b(dmbqVar);
        dmas dmasVar = dmbqVar.b;
        if (dmasVar == null) {
            dmasVar = dmas.f;
        }
        cdqc cdqcVar = new cdqc(bvrt.b(dmasVar));
        dmau dmauVar = dmbqVar.c;
        if (dmauVar == null) {
            dmauVar = dmau.f;
        }
        return new cdqb(b, cdqcVar, new cdqd(bvrt.b(dmauVar)));
    }

    private static dmbc h(dmbc dmbcVar, int i) {
        dsqp dsqpVar = (dsqp) dmbcVar.cu(5);
        dsqpVar.bC(dmbcVar);
        dmbb dmbbVar = (dmbb) dsqpVar;
        dmbu dmbuVar = dmbcVar.c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        dsqp dsqpVar2 = (dsqp) dmbuVar.cu(5);
        dsqpVar2.bC(dmbuVar);
        dmbr dmbrVar = (dmbr) dsqpVar2;
        if (dmbrVar.c) {
            dmbrVar.bF();
            dmbrVar.c = false;
        }
        dmbu dmbuVar2 = (dmbu) dmbrVar.b;
        dmbuVar2.d = i - 1;
        dmbuVar2.a |= 8;
        if (dmbbVar.c) {
            dmbbVar.bF();
            dmbbVar.c = false;
        }
        dmbc dmbcVar2 = (dmbc) dmbbVar.b;
        dmbu bK = dmbrVar.bK();
        bK.getClass();
        dmbcVar2.c = bK;
        dmbcVar2.a |= 2;
        return dmbbVar.bK();
    }

    public abstract bvrt<dmbq> a();

    public abstract cdqr b();

    public abstract cdqs c();

    public final dmbq d() {
        return a().e((dssr) dmbq.f.cu(7), dmbq.f);
    }

    public final cdqt f(dbsg<cdjd> dbsgVar) {
        dmbq d = d();
        dsqp dsqpVar = (dsqp) d.cu(5);
        dsqpVar.bC(d);
        dmbp dmbpVar = (dmbp) dsqpVar;
        dmau dmauVar = ((dmbq) dmbpVar.b).c;
        if (dmauVar == null) {
            dmauVar = dmau.f;
        }
        dsqp dsqpVar2 = (dsqp) dmauVar.cu(5);
        dsqpVar2.bC(dmauVar);
        dmat dmatVar = (dmat) dsqpVar2;
        dmbw dmbwVar = ((dmau) dmatVar.b).b;
        if (dmbwVar == null) {
            dmbwVar = dmbw.d;
        }
        dsqp dsqpVar3 = (dsqp) dmbwVar.cu(5);
        dsqpVar3.bC(dmbwVar);
        dmbv dmbvVar = (dmbv) dsqpVar3;
        if (!dbsgVar.a()) {
            dmbc dmbcVar = ((dmbw) dmbvVar.b).b;
            if (dmbcVar == null) {
                dmbcVar = dmbc.h;
            }
            dmbg dmbgVar = dmbcVar.d;
            if (dmbgVar == null) {
                dmbgVar = dmbg.i;
            }
            if ((dmbgVar.a & 1) != 0) {
                if (dmatVar.c) {
                    dmatVar.bF();
                    dmatVar.c = false;
                }
                dmau dmauVar2 = (dmau) dmatVar.b;
                dmauVar2.a |= 4;
                dmauVar2.d = false;
            }
            if (dmbvVar.c) {
                dmbvVar.bF();
                dmbvVar.c = false;
            }
            dmbw dmbwVar2 = (dmbw) dmbvVar.b;
            dmbwVar2.b = null;
            dmbwVar2.a &= -2;
        } else {
            cdjd b = dbsgVar.b();
            dmbc h = h(b.i(), 2);
            if (dmbvVar.c) {
                dmbvVar.bF();
                dmbvVar.c = false;
            }
            dmbw dmbwVar3 = (dmbw) dmbvVar.b;
            h.getClass();
            dmbwVar3.b = h;
            dmbwVar3.a |= 1;
            if (b.c().e().a()) {
                if (dmatVar.c) {
                    dmatVar.bF();
                    dmatVar.c = false;
                }
                dmau dmauVar3 = (dmau) dmatVar.b;
                dmauVar3.a |= 4;
                dmauVar3.d = true;
            }
        }
        if (dmatVar.c) {
            dmatVar.bF();
            dmatVar.c = false;
        }
        dmau dmauVar4 = (dmau) dmatVar.b;
        dmbw bK = dmbvVar.bK();
        bK.getClass();
        dmauVar4.b = bK;
        dmauVar4.a |= 1;
        if (dmbpVar.c) {
            dmbpVar.bF();
            dmbpVar.c = false;
        }
        dmbq dmbqVar = (dmbq) dmbpVar.b;
        dmau bK2 = dmatVar.bK();
        bK2.getClass();
        dmbqVar.c = bK2;
        dmbqVar.a |= 2;
        return e(dmbpVar.bK());
    }

    public final cdqt g(dbsg<cdjd> dbsgVar) {
        dmbq d = d();
        dsqp dsqpVar = (dsqp) d.cu(5);
        dsqpVar.bC(d);
        dmbp dmbpVar = (dmbp) dsqpVar;
        dmau dmauVar = ((dmbq) dmbpVar.b).c;
        if (dmauVar == null) {
            dmauVar = dmau.f;
        }
        dsqp dsqpVar2 = (dsqp) dmauVar.cu(5);
        dsqpVar2.bC(dmauVar);
        dmat dmatVar = (dmat) dsqpVar2;
        dmbw dmbwVar = ((dmau) dmatVar.b).b;
        if (dmbwVar == null) {
            dmbwVar = dmbw.d;
        }
        dsqp dsqpVar3 = (dsqp) dmbwVar.cu(5);
        dsqpVar3.bC(dmbwVar);
        dmbv dmbvVar = (dmbv) dsqpVar3;
        if (dbsgVar.a()) {
            dmbc h = h(dbsgVar.b().i(), 3);
            if (dmbvVar.c) {
                dmbvVar.bF();
                dmbvVar.c = false;
            }
            dmbw dmbwVar2 = (dmbw) dmbvVar.b;
            h.getClass();
            dmbwVar2.c = h;
            dmbwVar2.a |= 2;
        } else {
            if (dmbvVar.c) {
                dmbvVar.bF();
                dmbvVar.c = false;
            }
            dmbw dmbwVar3 = (dmbw) dmbvVar.b;
            dmbwVar3.c = null;
            dmbwVar3.a &= -3;
        }
        if (dmatVar.c) {
            dmatVar.bF();
            dmatVar.c = false;
        }
        dmau dmauVar2 = (dmau) dmatVar.b;
        dmbw bK = dmbvVar.bK();
        bK.getClass();
        dmauVar2.b = bK;
        dmauVar2.a |= 1;
        if (dmbpVar.c) {
            dmbpVar.bF();
            dmbpVar.c = false;
        }
        dmbq dmbqVar = (dmbq) dmbpVar.b;
        dmau bK2 = dmatVar.bK();
        bK2.getClass();
        dmbqVar.c = bK2;
        dmbqVar.a |= 2;
        return e(dmbpVar.bK());
    }
}
