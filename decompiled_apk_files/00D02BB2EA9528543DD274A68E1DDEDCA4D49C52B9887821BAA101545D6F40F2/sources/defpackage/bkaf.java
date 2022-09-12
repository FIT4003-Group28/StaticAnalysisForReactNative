package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkaf  reason: default package */
/* loaded from: classes3.dex */
public class bkaf implements bjwz {
    public final bjyc b;
    public final bjyj c;
    public final bkae d;
    public final bwrs<ilo> e;
    public final List<bjwy> f;
    public final Runnable g;
    private final bver h;
    private final Executor i;
    private final cjtd j;

    public bkaf(final gga ggaVar, jmx jmxVar, cqhn cqhnVar, cqhu cqhuVar, bver bverVar, Executor executor, bjyc bjycVar, bjyj bjyjVar, bwrs<ilo> bwrsVar, bkae bkaeVar) {
        this.h = bverVar;
        this.i = executor;
        this.b = bjycVar;
        this.c = bjyjVar;
        this.d = bkaeVar;
        this.e = bwrsVar;
        ilo c = bwrsVar.c();
        c.getClass();
        this.j = cjtd.c(c.bZ()).a();
        this.f = dchl.a();
        this.g = new Runnable(ggaVar) { // from class: bkab
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jmw.d(this.a, null);
            }
        };
    }

    @Override // defpackage.bjwz
    public cjtd a() {
        cjta c = cjtd.c(this.j);
        c.d = dtxy.gE;
        return c.a();
    }

    @Override // defpackage.bjwz
    public List<bjwy> b() {
        return this.f;
    }

    @Override // defpackage.bjwz
    public cqqw c() {
        return new bkac(this);
    }

    public void d(String str) {
        ilo c = this.e.c();
        c.getClass();
        didf bZ = didg.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didg didgVar = (didg) bZ.b;
        str.getClass();
        didgVar.a |= 1;
        didgVar.b = str;
        String o = c.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didg didgVar2 = (didg) bZ.b;
        o.getClass();
        didgVar2.a |= 2;
        didgVar2.c = o;
        djai djaiVar = c.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didg didgVar3 = (didg) bZ.b;
        dqcuVar.getClass();
        didgVar3.d = dqcuVar;
        didgVar3.a |= 4;
        this.h.b(bZ.bK(), new bkad(this), this.i);
    }

    public final void e() {
        this.f.clear();
    }
}
