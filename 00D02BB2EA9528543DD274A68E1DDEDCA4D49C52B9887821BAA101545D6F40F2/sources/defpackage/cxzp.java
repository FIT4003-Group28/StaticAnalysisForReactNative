package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: cxzp  reason: default package */
/* loaded from: classes5.dex */
final class cxzp implements degu<cyps> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ cyer b;
    final /* synthetic */ dehn c;
    final /* synthetic */ cxzq d;

    public cxzp(cxzq cxzqVar, dbtp dbtpVar, cyer cyerVar, dehn dehnVar) {
        this.d = cxzqVar;
        this.a = dbtpVar;
        this.b = cyerVar;
        this.c = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!dyaz.c() || (!(th instanceof CancellationException) && !this.c.isCancelled())) {
            cyph cyphVar = this.d.d;
            cype h = cypf.h();
            h.e(cyfa.c(this.b));
            h.b(0);
            ((cyoo) h).a = null;
            cypg.g(cyphVar, 10, 4, h.a(), null, cyor.a);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyps cypsVar) {
        cyps cypsVar2 = cypsVar;
        cyph cyphVar = this.d.d;
        int i = cypsVar2.b.isEmpty() ? 3 : 2;
        cype h = cypf.h();
        h.e(cyfa.c(cypsVar2.a));
        h.b(cypsVar2.b.size());
        ((cyoo) h).a = this.a;
        cypg.g(cyphVar, 10, i, h.a(), null, cyor.a);
        cxzq cxzqVar = this.d;
        dcpd<cywm> it = cypsVar2.b.values().iterator();
        while (it.hasNext()) {
            cywm next = it.next();
            if (next.a.a == 1) {
                dbsg<dsgt> a = next.a();
                if (a.a()) {
                    dsgv dsgvVar = a.b().d;
                    if (dsgvVar == null) {
                        dsgvVar = dsgv.f;
                    }
                    if ((1 & dsgvVar.a) != 0) {
                        dsig dsigVar = dsgvVar.b;
                        if (dsigVar == null) {
                            dsigVar = dsig.d;
                        }
                        int a2 = dsif.a(dsigVar.c);
                        if (a2 != 0 && a2 == 4) {
                            cxzqVar.d.c(37, cyor.a);
                        }
                    }
                }
            }
        }
        cygf cygfVar = cygf.EMAIL;
        int ordinal = this.b.ordinal();
        if (ordinal == 7) {
            cxzq cxzqVar2 = this.d;
            cxzqVar2.d.d(6, cypsVar2.b.size(), cyor.a);
            cxzqVar2.d.d(5, cypsVar2.c.size(), cyor.a);
        } else if (ordinal != 8) {
        } else {
            cxzq cxzqVar3 = this.d;
            dcpd<cygg> it2 = cypsVar2.b.keySet().iterator();
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            boolean z3 = false;
            while (it2.hasNext()) {
                int ordinal2 = it2.next().b().ordinal();
                if (ordinal2 == 0) {
                    i3++;
                    z3 = true;
                } else if (ordinal2 == 1) {
                    i4++;
                    z = true;
                } else if (ordinal2 == 2) {
                    i5++;
                    z2 = true;
                }
            }
            dcpd<cygg> it3 = cypsVar2.c.iterator();
            boolean z4 = z3;
            int i6 = 0;
            boolean z5 = z2;
            boolean z6 = z;
            int i7 = 0;
            while (it3.hasNext()) {
                int ordinal3 = it3.next().b().ordinal();
                if (ordinal3 == 0) {
                    i2++;
                    z4 = true;
                } else if (ordinal3 == 1) {
                    i6++;
                    z6 = true;
                } else if (ordinal3 == 2) {
                    i7++;
                    z5 = true;
                }
            }
            if (z4) {
                cxzqVar3.d.d(7, i3, cyor.a);
                cxzqVar3.d.d(8, i2, cyor.a);
            }
            if (z6) {
                cxzqVar3.d.d(11, i4, cyor.a);
                cxzqVar3.d.d(12, i6, cyor.a);
            }
            if (!z5) {
                return;
            }
            cxzqVar3.d.d(9, i5, cyor.a);
            cxzqVar3.d.d(10, i7, cyor.a);
        }
    }
}
