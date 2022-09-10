package defpackage;

import defpackage.dssj;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: tkv  reason: default package */
/* loaded from: classes7.dex */
public final class tkv<M extends dssj> implements tlz<M> {
    public static final dcqe a = dcqe.c("tkv");
    public final dxio<akfa> b;
    public final dxio<cqat> c;
    public final dssr<M> d;
    public final dbsg<eaow> e;
    private final ConcurrentHashMap<btlu, bwrg<tmt>> f = new ConcurrentHashMap<>();
    private final bwre g;
    private final String h;
    private final bwrh<tmt> i;

    public tkv(dxio<cqat> dxioVar, dxio<akfa> dxioVar2, dbsg<eaow> dbsgVar, bwre bwreVar, String str, dssr<M> dssrVar, bwrh<tmt> bwrhVar) {
        this.b = dxioVar2;
        this.c = dxioVar;
        this.e = dbsgVar;
        this.g = bwreVar;
        this.h = str;
        this.d = dssrVar;
        this.i = bwrhVar;
    }

    public static String d(btlu btluVar) {
        if (btluVar.o()) {
            return "no_account";
        }
        String h = btlu.h(btluVar);
        dbsk.s(h);
        return h;
    }

    private final synchronized bwrg<tmt> e(btlu btluVar) {
        bwrg<tmt> bwrgVar;
        ConcurrentHashMap<btlu, bwrg<tmt>> concurrentHashMap = this.f;
        bwre bwreVar = this.g;
        concurrentHashMap.putIfAbsent(btluVar, this.i.a((dssr) tmt.e.cu(7), bwreVar, String.format("directions_%s_%s_%s.pb", d(btluVar), this.h, bwreVar.name())));
        bwrgVar = this.f.get(btluVar);
        dbsk.s(bwrgVar);
        return bwrgVar;
    }

    @Override // defpackage.tlz
    public final dehn<dbsg<M>> a(final btlu btluVar) {
        if (btluVar.m()) {
            return deha.a(dbpy.a);
        }
        bwrg<tmt> e = e(btluVar);
        final deig d = deig.d();
        e.h(new dbsz(this, d, btluVar) { // from class: tku
            private final tkv a;
            private final deig b;
            private final btlu c;

            {
                this.a = this;
                this.b = d;
                this.c = btluVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                tkv tkvVar = this.a;
                deig deigVar = this.b;
                btlu btluVar2 = this.c;
                tmt tmtVar = (tmt) obj;
                if (!bvrj.BACKGROUND_THREADPOOL.b()) {
                    bvoo.h("Attempted to load data while not on a background thread", new Object[0]);
                    deigVar.j(dbpy.a);
                }
                if (tmtVar == null) {
                    deigVar.j(dbpy.a);
                    return;
                }
                eapd eapdVar = new eapd(tmtVar.b);
                if (!tkvVar.e.a() || !eapdVar.e(tkvVar.e.b()).J(tkvVar.c.a().b())) {
                    dbsg dbsgVar = dbpy.a;
                    try {
                        if ((tmtVar.a & 2) != 0) {
                            if (tmtVar.c.equals("no_account")) {
                                dbsgVar = dbsg.i(btlu.b);
                            } else {
                                dbsgVar = dbsg.j(tkvVar.b.a().n(tmtVar.c));
                            }
                        }
                        if (!dbsgVar.a()) {
                            deigVar.j(dbpy.a);
                            return;
                        }
                        btlu btluVar3 = (btlu) dbsgVar.b();
                        dbsk.s(btluVar3);
                        if (!btluVar3.equals(btluVar2)) {
                            tkv.d(btluVar2);
                            deigVar.j(dbpy.a);
                            return;
                        }
                        try {
                            deigVar.j(dbsg.i((dssj) tkvVar.d.l(tmtVar.d)));
                            return;
                        } catch (dsrm unused) {
                            bvoo.h("Failed to parse model state", new Object[0]);
                            deigVar.j(dbpy.a);
                            return;
                        }
                    } catch (IllegalStateException unused2) {
                        bvoo.h("Failed to load account data", new Object[0]);
                        deigVar.j(dbpy.a);
                        return;
                    }
                }
                deigVar.j(dbpy.a);
            }
        });
        return d;
    }

    @Override // defpackage.tlz
    public final void b(btlu btluVar, M m) {
        if (btlu.i(btluVar) == btlt.INCOGNITO) {
            return;
        }
        bwrg<tmt> e = e(btluVar);
        tms bZ = tmt.e.bZ();
        String d = d(btluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        tmt tmtVar = (tmt) bZ.b;
        d.getClass();
        tmtVar.a |= 2;
        tmtVar.c = d;
        long b = this.c.a().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        tmt tmtVar2 = (tmt) bZ.b;
        tmtVar2.a |= 1;
        tmtVar2.b = b;
        dspd bR = m.bR();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        tmt tmtVar3 = (tmt) bZ.b;
        bR.getClass();
        tmtVar3.a |= 4;
        tmtVar3.d = bR;
        e.e(bZ.bK());
    }

    @Override // defpackage.tlz
    public final void c(btlu btluVar) {
        if (btlu.i(btluVar) == btlt.INCOGNITO) {
            return;
        }
        e(btluVar).g();
    }
}
