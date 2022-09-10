package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* compiled from: PG */
/* renamed from: cdnv  reason: default package */
/* loaded from: classes4.dex */
public final class cdnv extends cdjp {
    public final bbtu a;
    public final eaou b;
    private static final cdjm d = new cdjm();
    static final dbrh<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams, cdph> c = new cdnt();

    public cdnv(bbtu bbtuVar, eaou eaouVar) {
        this.a = bbtuVar;
        this.b = eaouVar;
    }

    @Override // defpackage.cdjp
    public final void b(bqjh bqjhVar, cdpc cdpcVar) {
        if (bqjhVar.b() != 0) {
            int b = bqjhVar.b();
            if (cdpcVar.c) {
                cdpcVar.bF();
                cdpcVar.c = false;
            }
            cdpd cdpdVar = (cdpd) cdpcVar.b;
            cdpd cdpdVar2 = cdpd.l;
            cdpdVar.a |= 1;
            cdpdVar.b = b;
        }
    }

    @Override // defpackage.cdjp
    public final void c(bqjh bqjhVar, cdpc cdpcVar) {
        boolean l = bqjhVar.l();
        if (cdpcVar.c) {
            cdpcVar.bF();
            cdpcVar.c = false;
        }
        cdpd cdpdVar = (cdpd) cdpcVar.b;
        cdpd cdpdVar2 = cdpd.l;
        cdpdVar.a |= 2;
        cdpdVar.c = l;
    }

    @Override // defpackage.cdjp
    public final void d(bqjh bqjhVar, cdpc cdpcVar) {
        cdpb NV = d.NV(bqjhVar.h());
        if (cdpcVar.c) {
            cdpcVar.bF();
            cdpcVar.c = false;
        }
        cdpd cdpdVar = (cdpd) cdpcVar.b;
        cdpd cdpdVar2 = cdpd.l;
        cdpdVar.d = NV.e;
        cdpdVar.a |= 4;
    }

    @Override // defpackage.cdjp
    public final void e(bqjh bqjhVar, cdpc cdpcVar) {
        String canonicalName;
        Class<? extends bqld> n = bqjhVar.n();
        if (n == null || (canonicalName = n.getCanonicalName()) == null) {
            return;
        }
        if (cdpcVar.c) {
            cdpcVar.bF();
            cdpcVar.c = false;
        }
        cdpd cdpdVar = (cdpd) cdpcVar.b;
        cdpd cdpdVar2 = cdpd.l;
        canonicalName.getClass();
        cdpdVar.a |= 16;
        cdpdVar.f = canonicalName;
    }

    @Override // defpackage.cdjp
    public final void f(bqjh bqjhVar, cdpc cdpcVar) {
        String c2 = bqjhVar.c();
        if (!dbsj.d(c2)) {
            if (cdpcVar.c) {
                cdpcVar.bF();
                cdpcVar.c = false;
            }
            cdpd cdpdVar = (cdpd) cdpcVar.b;
            cdpd cdpdVar2 = cdpd.l;
            c2.getClass();
            cdpdVar.a |= 32;
            cdpdVar.g = c2;
        }
    }

    @Override // defpackage.cdjp
    public final void g(bqjh bqjhVar, cdpc cdpcVar) {
        dcdc z = dcbg.b(bqjhVar.g().b()).s(new dbrn(this) { // from class: cdnu
            private final cdnv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cdnv cdnvVar = this.a;
                return cdnvVar.a.b((bbtm) obj, cdnvVar.b);
            }
        }).z();
        if (cdpcVar.c) {
            cdpcVar.bF();
            cdpcVar.c = false;
        }
        cdpd cdpdVar = (cdpd) cdpcVar.b;
        cdpd cdpdVar2 = cdpd.l;
        dsrj<dwfl> dsrjVar = cdpdVar.h;
        if (!dsrjVar.a()) {
            cdpdVar.h = dsqw.cl(dsrjVar);
        }
        dsod.bv(z, cdpdVar.h);
    }
}
