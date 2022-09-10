package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cdrr  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdrr implements cdjd {
    private final cdro a = new cdro(this);
    private final cdrq b = new cdrq(this);
    private final cdrn c = new cdrn(this);

    public static cdrr q(docg docgVar, dqgr dqgrVar) {
        cdja cdjaVar = cdja.UNKNOWN;
        dqgr dqgrVar2 = dqgr.UNKNOWN_REVIEW_STATE;
        return r(docgVar, dqgrVar.ordinal() != 2 ? cdja.PUBLISHED : cdja.DRAFT);
    }

    public static cdrr r(docg docgVar, cdja cdjaVar) {
        dbsg<cdrt> dbsgVar;
        dbsg<cdrh> dbsgVar2;
        dbsg<cdis> dbsgVar3;
        cdqj cdqjVar = new cdqj();
        cdqjVar.a = bvrt.b(docgVar);
        if (cdjaVar != null) {
            cdqjVar.b = cdjaVar;
            if ((docgVar.a & 1024) != 0) {
                cdrs h = cdrt.h();
                h.c(docgVar.r);
                if ((docgVar.a & 4096) != 0) {
                    h.f(docgVar.s);
                }
                if ((docgVar.a & 16384) != 0) {
                    ((cdqm) h).a = dbsg.i(bvom.b(docgVar.u));
                }
                if (!docgVar.v.isEmpty()) {
                    h.b(docgVar.v);
                }
                h.d(docgVar.t);
                h.e(docgVar.t);
                dbsgVar = dbsg.i(h.a());
            } else {
                dbsgVar = dbpy.a;
            }
            cdqjVar.c(dbsgVar);
            if ((docgVar.a & ImageMetadata.SHADING_MODE) != 0) {
                cdqh cdqhVar = new cdqh();
                dnti dntiVar = docgVar.A;
                if (dntiVar == null) {
                    dntiVar = dnti.k;
                }
                cdqhVar.c = bvrt.b(dntiVar);
                dnti dntiVar2 = docgVar.A;
                if (dntiVar2 == null) {
                    dntiVar2 = dnti.k;
                }
                cdqhVar.b(dntiVar2.g);
                if (docgVar.e == 41) {
                    cdqhVar.a = dbsg.i((String) docgVar.f);
                }
                if (docgVar.g == 43) {
                    cdqhVar.b = dbsg.i((String) docgVar.h);
                }
                dbsgVar2 = dbsg.i(cdqhVar.a());
            } else {
                dbsgVar2 = dbpy.a;
            }
            cdqjVar.b(dbsgVar2);
            if ((docgVar.a & 16) != 0) {
                cdqf cdqfVar = new cdqf();
                dnpq dnpqVar = docgVar.m;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                cdqfVar.a = bvrt.b(dnpqVar);
                if ((docgVar.a & 32) != 0) {
                    dnfg dnfgVar = docgVar.n;
                    if (dnfgVar == null) {
                        dnfgVar = dnfg.c;
                    }
                    cdqfVar.b = dbsg.i(bvrt.b(dnfgVar));
                }
                String str = cdqfVar.a == null ? " authorLinkSerializable" : "";
                if (!str.isEmpty()) {
                    throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
                }
                dbsgVar3 = dbsg.i(new cdqg(cdqfVar.a, cdqfVar.b));
            } else {
                dbsgVar3 = dbpy.a;
            }
            cdqjVar.c = dbsgVar3;
            return cdqjVar.a();
        }
        throw new NullPointerException("Null publicationState");
    }

    @Override // defpackage.cdjd
    public final cdjb a() {
        return this.a;
    }

    @Override // defpackage.cdjd
    public final cdjc b() {
        return this.b;
    }

    @Override // defpackage.cdjd
    public final cdiz c() {
        return this.c;
    }

    @Override // defpackage.cdjd
    public final dbsg<cdiy> d() {
        return m().h(cdrk.a);
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd e(final boolean z) {
        cdrl o = o();
        o.c(l().h(new dbrn(z) { // from class: cdri
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                boolean z2 = this.a;
                cdrs g = ((cdrt) obj).g();
                g.e(z2);
                return g.a();
            }
        }));
        return o.a();
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd f(final boolean z) {
        cdrl o = o();
        o.b(m().h(new dbrn(z) { // from class: cdrj
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                boolean z2 = this.a;
                cdrg h = ((cdrh) obj).h();
                h.b(z2);
                return h.a();
            }
        }));
        return o.a();
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd g(int i, dqjh dqjhVar) {
        docg p = p();
        dsqp dsqpVar = (dsqp) p.cu(5);
        dsqpVar.bC(p);
        docc doccVar = (docc) dsqpVar;
        if (doccVar.c) {
            doccVar.bF();
            doccVar.c = false;
        }
        docg docgVar = (docg) doccVar.b;
        docg docgVar2 = docg.M;
        int i2 = docgVar.a | 4194304;
        docgVar.a = i2;
        docgVar.D = i;
        docgVar.C = dqjhVar.e;
        docgVar.a = 2097152 | i2;
        return r(doccVar.bK(), k());
    }

    @Override // defpackage.cdjd
    public final docg h() {
        return p();
    }

    @Override // defpackage.cdjd
    public final dmbc i() {
        docg p = p();
        cdja cdjaVar = cdja.UNKNOWN;
        dqgr dqgrVar = dqgr.UNKNOWN_REVIEW_STATE;
        int i = 2;
        if (k().ordinal() == 2) {
            i = 3;
        }
        return cdpy.d(p, i);
    }

    public abstract bvrt<docg> j();

    public abstract cdja k();

    public abstract dbsg<cdrt> l();

    public abstract dbsg<cdrh> m();

    public abstract dbsg<cdis> n();

    public abstract cdrl o();

    public final docg p() {
        return j().e((dssr) docg.M.cu(7), docg.M);
    }
}
