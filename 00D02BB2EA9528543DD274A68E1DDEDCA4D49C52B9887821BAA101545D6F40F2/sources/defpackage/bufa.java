package defpackage;

import defpackage.dssj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bufa  reason: default package */
/* loaded from: classes4.dex */
public final class bufa<S extends dssj> {
    public static final dyhs<dtyp> a = dyhs.c("grpc-status-details-bin", dyyq.c(dtyp.d));
    public final ckcw b;
    private final dssj c;
    private final buex d;
    private final btvg e;
    private final dzsj<dkiy> f;

    public bufa(dssj dssjVar, buex buexVar, btvg btvgVar, dzsj<dkiy> dzsjVar, ckcw ckcwVar) {
        this.c = dssjVar;
        this.d = buexVar;
        this.e = btvgVar;
        this.f = dzsjVar;
        this.b = ckcwVar;
    }

    public static dbsg<String> c(buid buidVar, buic buicVar) {
        buidVar.c(buicVar);
        buab<String> b = buicVar.b("Authorization");
        return b != null ? dbsg.i(b.b()) : dbpy.a;
    }

    public final dehn<S> a(dbsg<String> dbsgVar, List<dyey> list, btzu btzuVar) {
        return b(this.c, dbsgVar, list, btzuVar);
    }

    @Deprecated
    public final dehn<S> b(dssj dssjVar, dbsg<String> dbsgVar, List<dyey> list, btzu btzuVar) {
        csag csagVar;
        dbsk.a(dssjVar.getClass().equals(this.c.getClass()));
        try {
            btve c = this.e.c();
            try {
                dyhi a2 = c.a();
                boolean z = c instanceof btvc;
                boolean z2 = this.f.a().aS;
                ArrayList arrayList = new ArrayList();
                if (dbsgVar.a()) {
                    arrayList.add(new drta(dyjp.a(new buey(dbsgVar.b()))));
                }
                if (z2) {
                    if (z) {
                        arrayList.add(csan.b());
                    } else {
                        csag csagVar2 = csag.a;
                        if (csagVar2 == null) {
                            synchronized (csag.class) {
                                csagVar = csag.a;
                                if (csagVar == null) {
                                    csagVar = new csag(csan.b());
                                    csag.a = csagVar;
                                }
                            }
                            csagVar2 = csagVar;
                        }
                        arrayList.add(csagVar2);
                    }
                }
                arrayList.addAll(list);
                dyeu b = dyfa.b(a2, arrayList);
                dssj dssjVar2 = this.c;
                Class<?> cls = dssjVar2.getClass();
                dyib a3 = this.d.a(dssjVar2);
                dbuh.c(a3, "No descriptor found for %s", cls);
                String str = a3.b;
                dyex a4 = b.a(a3, dykb.o(dyet.a, buhg.c(cls, btzuVar)));
                dbuh.c(a4, "Interceptors may be miswired?", new Object[0]);
                return new buez(this, dyzf.d(a4, dssjVar));
            } catch (IOException e) {
                throw new btzz(btzy.c.b(e));
            }
        } catch (btzz e2) {
            return deha.b(e2);
        }
    }
}
