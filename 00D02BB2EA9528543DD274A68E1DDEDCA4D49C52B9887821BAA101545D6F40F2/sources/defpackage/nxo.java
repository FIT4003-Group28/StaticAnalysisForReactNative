package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: nxo  reason: default package */
/* loaded from: classes7.dex */
public final class nxo {
    public final List<bwnf> a;
    @dzsi
    public dthb b;
    private final List<nxn> c;
    private final dtmv d;

    public nxo(bwnf bwnfVar, List<nxn> list) {
        dthb dthbVar;
        dbsk.s(bwnfVar);
        this.a = dchl.b(bwnfVar);
        dbsk.s(list);
        this.c = dchl.c(list);
        dtmr a = bwnfVar.a();
        if ((a.a & 512) != 0) {
            dthbVar = a.j;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
        } else {
            dthbVar = null;
        }
        this.b = dthbVar;
        dtmv dtmvVar = a.e;
        this.d = dtmvVar == null ? dtmv.b : dtmvVar;
    }

    public final synchronized void a(nxo nxoVar) {
        if (!d().equals(nxoVar.d())) {
            return;
        }
        this.a.addAll(nxoVar.a);
        this.c.addAll(nxoVar.c);
        this.b = nxoVar.b;
    }

    public final synchronized void b(nxo nxoVar) {
        if (!d().equals(nxoVar.d())) {
            return;
        }
        if (nxoVar.c().size() != 1) {
            nxoVar.c().size();
            return;
        }
        nxn nxnVar = nxoVar.c().get(0);
        List<nxn> list = this.c;
        nxn nxnVar2 = list.get(list.size() - 1);
        String str = nxoVar.a.get(0).a;
        dvnp dvnpVar = nxoVar.a.get(0).b;
        ArrayList a = dchl.a();
        for (bwns bwnsVar : nxn.b(nxnVar.b.b, nxnVar.c)) {
            a.add(new cjzs(bwnsVar, str, dvnpVar));
        }
        nvf nvfVar = nxnVar2.f;
        if (nvfVar != null) {
            nvfVar.a.a(a);
        } else {
            bvoo.h("cardViewModelHolder hasn't been initialized.", new Object[0]);
        }
        this.b = nxoVar.b;
    }

    public final synchronized List<nxn> c() {
        return this.c;
    }

    public final synchronized bwnh d() {
        return bwni.a(this.a.get(0).a());
    }

    public final boolean e() {
        int a;
        dtmv dtmvVar = this.d;
        return (dtmvVar == null || (a = dtmu.a(dtmvVar.a)) == 0 || a != 3) ? false : true;
    }

    public final boolean f() {
        int a;
        dtmv dtmvVar = this.d;
        return (dtmvVar == null || (a = dtmu.a(dtmvVar.a)) == 0 || a != 2) ? false : true;
    }
}
