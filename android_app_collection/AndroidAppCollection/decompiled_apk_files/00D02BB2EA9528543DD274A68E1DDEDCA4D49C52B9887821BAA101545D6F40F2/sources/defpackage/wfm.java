package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: wfm  reason: default package */
/* loaded from: classes7.dex */
public final class wfm implements wdy, wdx {
    private final bvjj a;
    private final dbty<Boolean> b;

    public wfm(bvjj bvjjVar, final wdw wdwVar) {
        this.a = bvjjVar;
        wdwVar.getClass();
        this.b = dbud.a(new dbty(wdwVar) { // from class: wfl
            private final wdw a;

            {
                this.a = wdwVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.b());
            }
        });
    }

    private final synchronized wfj c() {
        return (wfj) this.a.L(bvjk.kd, (dssr) wfj.g.cu(7), wfj.g);
    }

    private final synchronized void d(wfj wfjVar) {
        this.a.al(bvjk.kd, wfjVar);
    }

    private static dbsg<Integer> e(List<wfi> list, long j) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).b == j) {
                return dbsg.i(Integer.valueOf(i));
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.wdx
    public final void a(wdv wdvVar, int i) {
        wfj c = c();
        dsqp dsqpVar = (dsqp) c.cu(5);
        dsqpVar.bC(c);
        wfg wfgVar = (wfg) dsqpVar;
        int b = wdvVar.b();
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        }
        boolean z = true;
        if (i2 == 0) {
            boolean z2 = i == 2;
            if (wfgVar.c) {
                wfgVar.bF();
                wfgVar.c = false;
            }
            wfj wfjVar = (wfj) wfgVar.b;
            wfj wfjVar2 = wfj.g;
            wfjVar.a |= 1;
            wfjVar.c = z2;
        } else if (i2 == 1) {
            if (i != 2) {
                z = false;
            }
            if (wfgVar.c) {
                wfgVar.bF();
                wfgVar.c = false;
            }
            wfj wfjVar3 = (wfj) wfgVar.b;
            wfj wfjVar4 = wfj.g;
            wfjVar3.a |= 2;
            wfjVar3.d = z;
        } else if (i2 == 2) {
            if (i != 2) {
                z = false;
            }
            if (wfgVar.c) {
                wfgVar.bF();
                wfgVar.c = false;
            }
            wfj wfjVar5 = (wfj) wfgVar.b;
            wfj wfjVar6 = wfj.g;
            wfjVar5.a |= 4;
            wfjVar5.e = z;
        } else if (i2 == 3) {
            if (i != 2) {
                z = false;
            }
            if (wfgVar.c) {
                wfgVar.bF();
                wfgVar.c = false;
            }
            wfj wfjVar7 = (wfj) wfgVar.b;
            wfj wfjVar8 = wfj.g;
            wfjVar7.a |= 8;
            wfjVar7.f = z;
        } else if (i2 == 4) {
            int b2 = wdvVar.b();
            boolean z3 = b2 == 5;
            if (b2 != 0) {
                dbsk.l(z3);
                List unmodifiableList = Collections.unmodifiableList(((wfj) wfgVar.b).b);
                Long a = wdvVar.a();
                dbsk.s(a);
                dbsg<Integer> e = e(unmodifiableList, a.longValue());
                if (i == 1) {
                    if (e.a()) {
                        int intValue = e.b().intValue();
                        if (wfgVar.c) {
                            wfgVar.bF();
                            wfgVar.c = false;
                        }
                        wfj wfjVar9 = (wfj) wfgVar.b;
                        wfjVar9.b();
                        wfjVar9.b.remove(intValue);
                    }
                } else if (!e.a()) {
                    wfh bZ = wfi.c.bZ();
                    Long a2 = wdvVar.a();
                    dbsk.s(a2);
                    long longValue = a2.longValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    wfi wfiVar = (wfi) bZ.b;
                    wfiVar.a |= 1;
                    wfiVar.b = longValue;
                    wfi bK = bZ.bK();
                    if (wfgVar.c) {
                        wfgVar.bF();
                        wfgVar.c = false;
                    }
                    wfj wfjVar10 = (wfj) wfgVar.b;
                    bK.getClass();
                    wfjVar10.b();
                    wfjVar10.b.add(bK);
                }
            } else {
                throw null;
            }
        }
        d(wfgVar.bK());
    }

    @Override // defpackage.wdy
    public final boolean b(wdv wdvVar) {
        if (!this.b.a().booleanValue()) {
            return true;
        }
        wfj c = c();
        int b = wdvVar.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i == 0) {
            return !c.c;
        } else if (i == 1) {
            return !c.d;
        } else if (i == 2) {
            return !c.e;
        } else if (i == 3) {
            return !c.f;
        } else if (i != 4) {
            return false;
        } else {
            int b2 = wdvVar.b();
            boolean z = b2 == 5;
            if (b2 != 0) {
                dbsk.l(z);
                dbsk.s(wdvVar.a());
                dsrj<wfi> dsrjVar = c.b;
                Long a = wdvVar.a();
                dbsk.s(a);
                return !e(dsrjVar, a.longValue()).a();
            }
            throw null;
        }
    }
}
