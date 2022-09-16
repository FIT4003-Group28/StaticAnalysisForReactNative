package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baix  reason: default package */
/* loaded from: classes3.dex */
public abstract class baix implements baev {
    private final btpc a;
    private final btrg b;
    private final Executor c;
    public final iic d;
    public iib e;
    public final bnjv f;
    private crzo<Map<azxb, ilo>> h;
    public dcdn<azxb, baig> g = dcmn.a;
    private final crzp<Map<azxb, ilo>> i = new baiw(this);

    public baix(huc hucVar, btpc btpcVar, btrg btrgVar, Executor executor, bnjv bnjvVar, final cjtd cjtdVar, bvpe bvpeVar) {
        this.a = btpcVar;
        this.b = btrgVar;
        this.c = executor;
        this.f = bnjvVar;
        iic j = iid.j();
        j.e(dcdc.e());
        ifj ifjVar = (ifj) j;
        ifjVar.f = cjtdVar;
        ifjVar.e = new bvob(bvpeVar.b, hucVar.a(new htz(cjtdVar) { // from class: baiu
            private final cjtd a;

            {
                this.a = cjtdVar;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        this.d = j;
        this.e = j.f();
    }

    @Override // defpackage.baev
    public iib b() {
        return this.e;
    }

    public void c(dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3) {
        bnju bnjuVar;
        bvrj.UI_THREAD.d();
        dcdc<baig> d = d(dcdcVar, dcdcVar2, dcdcVar3);
        final dcdg p = dcdn.p();
        dccx F = dcdc.F();
        for (int i = 0; i < d.size(); i++) {
            baig baigVar = d.get(i);
            azxb azxbVar = baigVar.g;
            baig baigVar2 = this.g.get(azxbVar);
            if (baigVar2 == null || (bnjuVar = baigVar2.j) == null) {
                F.g(azxbVar);
            } else {
                baigVar.l(bnjuVar);
            }
            baigVar.m = i;
            p.f(azxbVar, baigVar);
        }
        final dcdc<azxb> f = F.f();
        this.c.execute(new Runnable(this, p, f) { // from class: baiv
            private final baix a;
            private final dcdg b;
            private final dcdc c;

            {
                this.a = this;
                this.b = p;
                this.c = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                baix baixVar = this.a;
                dcdg dcdgVar = this.b;
                dcdc dcdcVar4 = this.c;
                baixVar.g = dcdgVar.b();
                if (!dcdcVar4.isEmpty()) {
                    dccx F2 = dcdc.F();
                    dcpd<baig> it = baixVar.g.values().iterator();
                    while (it.hasNext()) {
                        F2.g(cqgr.fT(new bacm(), it.next()));
                    }
                    iic iicVar = baixVar.d;
                    iicVar.e(F2.f());
                    baixVar.e = iicVar.f();
                }
                cqkx.p(baixVar);
            }
        });
        synchronized (this) {
            f();
            if (!f.isEmpty() && this.a.i()) {
                btrg btrgVar = this.b;
                diar bZ = diaw.g.bZ();
                dias bZ2 = diat.d.bZ();
                dnyc bZ3 = dnzj.Z.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnzj.c((dnzj) bZ3.b);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnzj dnzjVar = (dnzj) bZ3.b;
                dnzjVar.a |= 512;
                dnzjVar.j = false;
                dnzj.d(dnzjVar);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnzj dnzjVar2 = (dnzj) bZ3.b;
                dnzjVar2.b |= 16384;
                dnzjVar2.C = false;
                dnzj.j((dnzj) bZ3.b);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnzj.k((dnzj) bZ3.b);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnzj dnzjVar3 = (dnzj) bZ3.b;
                int i2 = dnzjVar3.b | 33554432;
                dnzjVar3.b = i2;
                dnzjVar3.H = true;
                dnzjVar3.b = i2 | 134217728;
                dnzjVar3.I = true;
                dnzj.l(dnzjVar3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                diat diatVar = (diat) bZ2.b;
                dnzj bK = bZ3.bK();
                bK.getClass();
                diatVar.b = bK;
                diatVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                diaw diawVar = (diaw) bZ.b;
                diat bK2 = bZ2.bK();
                bK2.getClass();
                diawVar.e = bK2;
                diawVar.a |= 4;
                for (azxb azxbVar2 : f) {
                    if (akqi.d(azxbVar2.a())) {
                        diap bZ4 = diaq.d.bZ();
                        dppq bZ5 = dppt.e.bZ();
                        dppw bZ6 = dppz.c.bZ();
                        dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
                        if (bZ6.c) {
                            bZ6.bF();
                            bZ6.c = false;
                        }
                        dppz dppzVar = (dppz) bZ6.b;
                        dppzVar.b = dppyVar.e;
                        dppzVar.a |= 1;
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        dppt dpptVar = (dppt) bZ5.b;
                        dppz bK3 = bZ6.bK();
                        bK3.getClass();
                        dpptVar.d = bK3;
                        dpptVar.a |= 1;
                        dpsn i3 = azxbVar2.a().i();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        dppt dpptVar2 = (dppt) bZ5.b;
                        i3.getClass();
                        dpptVar2.c = i3;
                        dpptVar2.b = 2;
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        diaq diaqVar = (diaq) bZ4.b;
                        dppt bK4 = bZ5.bK();
                        bK4.getClass();
                        diaqVar.b = bK4;
                        diaqVar.a |= 1;
                        bZ.a(bZ4);
                    }
                }
                crzo<Map<azxb, ilo>> crzoVar = new crzo<>();
                deha.q(btrgVar.d(bZ.bK()), new baip(crzoVar), dege.a);
                this.h = crzoVar;
                crzoVar.a.d(this.i, this.c);
            }
        }
    }

    protected abstract dcdc<baig> d(dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3);

    public boolean e() {
        return !this.g.isEmpty();
    }

    public final synchronized void f() {
        crzo<Map<azxb, ilo>> crzoVar = this.h;
        if (crzoVar != null) {
            crzoVar.a.c(this.i);
            this.h = null;
        }
    }
}
