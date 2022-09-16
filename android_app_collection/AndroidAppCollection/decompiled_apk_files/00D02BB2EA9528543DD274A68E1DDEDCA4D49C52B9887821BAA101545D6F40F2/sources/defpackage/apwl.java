package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: apwl  reason: default package */
/* loaded from: classes2.dex */
final class apwl implements degu<dgak> {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ ConcurrentHashMap c;
    final /* synthetic */ Map d;
    final /* synthetic */ deig e;
    final /* synthetic */ btlu f;
    final /* synthetic */ apwn g;

    public apwl(apwn apwnVar, int i, String str, ConcurrentHashMap concurrentHashMap, Map map, deig deigVar, btlu btluVar) {
        this.g = apwnVar;
        this.a = i;
        this.b = str;
        this.c = concurrentHashMap;
        this.d = map;
        this.e = deigVar;
        this.f = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.g.h(this.a, false, this.b);
        synchronized (this.c.get(this.b)) {
            this.e.k(th);
            if (this.d.containsKey(this.b)) {
                deig deigVar = this.e;
                dbsi dbsiVar = (dbsi) this.d.get(this.b);
                dbsk.s(dbsiVar);
                if (deigVar.equals(dbsiVar.b)) {
                    this.g.i(this.b, 2, this.f);
                    this.d.remove(this.b);
                }
            }
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dgak dgakVar) {
        apzn a;
        long j;
        dgak dgakVar2 = dgakVar;
        this.g.h(this.a, true, this.b);
        synchronized (this.c.get(this.b)) {
            if (this.d.containsKey(this.b) && this.e.equals(((dbsi) this.d.get(this.b)).b)) {
                if (this.a == 1) {
                    aqwq aqwqVar = this.g.e;
                    String str = this.b;
                    btlu btluVar = this.f;
                    synchronized (aqwqVar.e) {
                        aqxf aqxfVar = (aqxf) aqwqVar.d.N(aqwq.e(str), btluVar, (dssr) aqxf.c.cu(7), aqxf.c);
                        dbsk.s(aqxfVar);
                        dsqp dsqpVar = (dsqp) aqxfVar.cu(5);
                        dsqpVar.bC(aqxfVar);
                        aqxe aqxeVar = (aqxe) dsqpVar;
                        aqxk aqxkVar = aqxfVar.a;
                        if (aqxkVar == null) {
                            aqxkVar = aqxk.e;
                        }
                        dsqp dsqpVar2 = (dsqp) aqxkVar.cu(5);
                        dsqpVar2.bC(aqxkVar);
                        aqxg aqxgVar = (aqxg) dsqpVar2;
                        aqxj aqxjVar = aqxj.DISABLED;
                        if (aqxgVar.c) {
                            aqxgVar.bF();
                            aqxgVar.c = false;
                        }
                        ((aqxk) aqxgVar.b).a = aqxjVar.a();
                        aqxh aqxhVar = aqxh.BUSINESS_OPT_OUT;
                        if (aqxgVar.c) {
                            aqxgVar.bF();
                            aqxgVar.c = false;
                        }
                        ((aqxk) aqxgVar.b).b = aqxhVar.a();
                        aqxk bK = aqxgVar.bK();
                        if (aqxeVar.c) {
                            aqxeVar.bF();
                            aqxeVar.c = false;
                        }
                        bK.getClass();
                        ((aqxf) aqxeVar.b).a = bK;
                        aqxf bK2 = aqxeVar.bK();
                        aqwqVar.d.am(aqwq.e(str), btluVar, bK2);
                        a = aqwx.a(bK2);
                    }
                } else {
                    aqwq aqwqVar2 = this.g.e;
                    String str2 = this.b;
                    dbsk.s(dgakVar2);
                    btlu btluVar2 = this.f;
                    synchronized (aqwqVar2.e) {
                        synchronized (aqwqVar2.e) {
                            Set<String> E = aqwqVar2.d.E(aqwq.b, btluVar2, dcmr.a);
                            if (!E.contains(str2)) {
                                bvjj bvjjVar = aqwqVar2.d;
                                bvjk bvjkVar = aqwq.b;
                                dcen N = dcep.N();
                                N.i(E);
                                N.b(str2);
                                bvjjVar.ag(bvjkVar, btluVar2, N.f());
                            }
                        }
                        aqxk NV = aqwq.a.NV(dgakVar2);
                        aqxf aqxfVar2 = (aqxf) aqwqVar2.d.N(aqwq.e(str2), btluVar2, (dssr) aqxf.c.cu(7), aqxf.c);
                        if (aqxfVar2 != null) {
                            aqxk aqxkVar2 = aqxfVar2.a;
                            if (aqxkVar2 == null) {
                                aqxkVar2 = aqxk.e;
                            }
                            if (aqxkVar2.equals(NV)) {
                                if (!aqwqVar2.d.j(bvjk.ju, btluVar2)) {
                                    aqwqVar2.b(btluVar2);
                                }
                                a = aqwx.a(aqxfVar2);
                            }
                        }
                        boolean z = aqxfVar2 != null && aqxfVar2.b;
                        aqxe bZ = aqxf.c.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        aqxf aqxfVar3 = (aqxf) bZ.b;
                        NV.getClass();
                        aqxfVar3.a = NV;
                        aqxfVar3.b = z;
                        aqxf bK3 = bZ.bK();
                        aqwqVar2.d.am(aqwq.e(str2), btluVar2, bK3);
                        a = aqwx.a(bK3);
                        if (((apzj) a).a) {
                            aqwqVar2.d.T(bvjk.ju, btluVar2, true);
                        } else if (aqwqVar2.d.o(bvjk.ju, btluVar2, false)) {
                            aqwqVar2.b(btluVar2);
                        }
                    }
                }
                this.g.i(this.b, 3, this.f);
                this.e.j(a);
                this.d.remove(this.b);
                Map<dbsi<String, btlu>, Long> map = this.g.f;
                dbsi<String, btlu> a2 = dbsi.a(this.b, this.f);
                aqwq aqwqVar3 = this.g.e;
                String str3 = this.b;
                btlu btluVar3 = this.f;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (aqwqVar3.e) {
                    aqwqVar3.d.aa(aqwq.f(str3), btluVar3, currentTimeMillis);
                    j = new eapd(currentTimeMillis).e(eaow.d(aqwqVar3.c.getBusinessMessagingParameters().W)).a;
                }
                map.put(a2, Long.valueOf(j));
                return;
            }
            this.e.cancel(true);
        }
    }
}
