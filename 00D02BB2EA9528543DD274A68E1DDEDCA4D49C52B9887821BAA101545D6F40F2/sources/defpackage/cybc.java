package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cybc  reason: default package */
/* loaded from: classes5.dex */
public final class cybc implements degu<cxzq> {
    final /* synthetic */ List a;
    final /* synthetic */ cxzs b;

    public cybc(List list, cxzs cxzsVar) {
        this.a = list;
        this.b = cxzsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cxzs cxzsVar = this.b;
        dcdn<Object, Object> dcdnVar = dcmn.a;
        cxzt f = cxzu.f();
        f.c(true);
        f.d(dcep.K(this.a));
        f.b(dcdc.f(cydx.c(cyer.PEOPLE_STACK_LOOKUP_DATABASE, cyet.a(th))));
        cxzsVar.a(dcdnVar, f.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cxzq cxzqVar) {
        cxzq cxzqVar2 = cxzqVar;
        final List<cygg> list = this.a;
        cxzs cxzsVar = this.b;
        dbtp f = cypg.f(cxzqVar2.d, 10, list.size(), null, cyor.a);
        cypq cypqVar = cxzqVar2.b;
        final ClientConfigInternal clientConfigInternal = cxzqVar2.a;
        final cypp cyppVar = (cypp) cypqVar;
        dbtp b = cyppVar.d.b();
        dcdd a = dcde.a();
        for (cygg cyggVar : list) {
            a.b(cyggVar.b(), cyggVar);
        }
        dcde a2 = a.a();
        ArrayList arrayList = new ArrayList();
        dcpd it = a2.J().iterator();
        while (it.hasNext()) {
            final cygf cygfVar = (cygf) it.next();
            final dcdc h = a2.h(cygfVar);
            final long b2 = cyppVar.a.b() - clientConfigInternal.p;
            arrayList.add(cyppVar.c.c(new Callable(cyppVar, cygfVar, h, b2) { // from class: cypm
                private final cypp a;
                private final cygf b;
                private final List c;
                private final long d;

                {
                    this.a = cyppVar;
                    this.b = cygfVar;
                    this.c = h;
                    this.d = b2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cypp cyppVar2 = this.a;
                    cygf cygfVar2 = this.b;
                    List list2 = this.c;
                    return cyppVar2.b.h().f(cygfVar2.name(), dchl.k(list2, cypn.a), this.d);
                }
            }));
            a2 = a2;
        }
        dehn<cyps> g = deew.g(deha.j(arrayList), new defg(cyppVar, clientConfigInternal, list) { // from class: cypl
            private final cypp a;
            private final ClientConfigInternal b;
            private final List c;

            {
                this.a = cyppVar;
                this.b = clientConfigInternal;
                this.c = list;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cypp cyppVar2 = this.a;
                ClientConfigInternal clientConfigInternal2 = this.b;
                List list2 = this.c;
                long b3 = cyppVar2.a.b() - clientConfigInternal2.o;
                cypr a3 = cyps.a();
                a3.a = cyer.PEOPLE_STACK_LOOKUP_DATABASE;
                a3.b = cyes.SUCCESS;
                a3.c.addAll(list2);
                for (List<cysi> list3 : (List) obj) {
                    for (cysi cysiVar : list3) {
                        cyge c = cygg.c();
                        c.c(cygf.a(cysiVar.a));
                        c.b(cysiVar.b);
                        cygg a4 = c.a();
                        dspd dspdVar = cysiVar.d;
                        if (dspdVar == null) {
                            a3.b(a4);
                        } else {
                            dsqa c2 = dsqa.c();
                            dsgk dsgkVar = dsgk.c;
                            try {
                                dspj s = dspdVar.s();
                                dsqw dsqwVar = (dsqw) dsgkVar.cu(4);
                                try {
                                    dstc b4 = dsst.a.b(dsqwVar);
                                    b4.f(dsqwVar, dspk.n(s), c2);
                                    b4.j(dsqwVar);
                                    try {
                                        s.b(0);
                                        dsqw.cv(dsqwVar);
                                        cywm cywmVar = new cywm((dsgk) dsqwVar);
                                        cywmVar.e(cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID);
                                        a3.d(a4, cywmVar);
                                    } catch (dsrm e) {
                                        throw e;
                                    }
                                } catch (IOException e2) {
                                    if (!(e2.getCause() instanceof dsrm)) {
                                        throw new dsrm(e2.getMessage());
                                    }
                                    throw ((dsrm) e2.getCause());
                                } catch (RuntimeException e3) {
                                    if (e3.getCause() instanceof dsrm) {
                                        throw ((dsrm) e3.getCause());
                                    }
                                    throw e3;
                                }
                            } catch (dsrm e4) {
                                throw e4;
                            }
                        }
                        if (cysiVar.c <= b3) {
                            a3.d.b(a4);
                        }
                    }
                }
                dcpd it2 = dcep.K(a3.c).iterator();
                while (it2.hasNext()) {
                    cygg cyggVar2 = (cygg) it2.next();
                    cygf cygfVar2 = cygf.EMAIL;
                    int ordinal = cyggVar2.b().ordinal();
                    if (ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
                        a3.b(cyggVar2);
                    }
                }
                return deha.a(a3.a());
            }
        }, dege.a);
        deha.q(g, new cypo(cyppVar, b), dege.a);
        cxzqVar2.b(g, cyer.PEOPLE_STACK_LOOKUP_DATABASE, f);
        deha.q(g, new cxzn(cxzqVar2, cxzsVar, f, list), dege.a);
    }
}
