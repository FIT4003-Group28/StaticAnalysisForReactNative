package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abts  reason: default package */
/* loaded from: classes2.dex */
public class abts implements ias, absq {
    public final absp a;
    public final absp b;
    public final gga d;
    public absp e;
    private final abta g;
    private final abfi h;
    private final dehq i;
    private final iaw j;
    public final List c = new ArrayList();
    public List<absp> f = dcdc.e();
    private List<absp> k = dcdc.e();
    private int l = 1;

    public abts(gga ggaVar, cqhn cqhnVar, cjqy cjqyVar, abtd abtdVar, dehq dehqVar, abtu abtuVar, abta abtaVar, abfi abfiVar) {
        this.d = ggaVar;
        this.a = new abtf(new abga(), abtdVar, true);
        this.i = dehqVar;
        this.b = new abtf(new abgv(), abtuVar, false);
        this.e = new abtf(new abfx(), abtc.a(null, abtaVar), true);
        this.g = abtaVar;
        this.h = abfiVar;
        iaw iawVar = new iaw(cqhnVar, cjqyVar, new abtq(this));
        this.j = iawVar;
        cqkx.j(iawVar, new cqhm(this) { // from class: abto
            private final abts a;

            {
                this.a = this;
            }

            @Override // defpackage.cqhm
            public final void a() {
                cqkx.p(this.a);
            }
        });
    }

    private final void k(int i, boolean z) {
        this.l = i;
        if (z) {
            for (absp abspVar : Pd()) {
                abspVar.a(true);
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.izf
    public List<absp> Pd() {
        ArrayList arrayList = new ArrayList();
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                arrayList.add(this.b);
            } else if (i2 == 2) {
                arrayList.add(this.e);
            } else if (!this.c.isEmpty()) {
                arrayList.addAll(this.k);
            } else {
                arrayList.addAll(this.f);
            }
            return arrayList;
        }
        throw null;
    }

    @Override // defpackage.hzw, defpackage.absq
    public hzv a() {
        return this.j.a();
    }

    @Override // defpackage.hzw
    public Integer b() {
        throw null;
    }

    @Override // defpackage.ias, defpackage.absq
    public cqqw c() {
        return !this.c.isEmpty() ? this.j.c() : new cqqw();
    }

    @Override // defpackage.ias, defpackage.absq
    public Integer d() {
        return Integer.valueOf(!this.c.isEmpty() ? this.j.d().intValue() : 0);
    }

    @Override // defpackage.absq
    public void e() {
        this.i.execute(new Runnable(this) { // from class: abtp
            private final abts a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                abts abtsVar = this.a;
                abtsVar.b.a(false);
                abtsVar.e.a(false);
                for (absp abspVar : abtsVar.f) {
                    abspVar.a(false);
                }
                abtsVar.a.a(false);
            }
        });
    }

    @Override // defpackage.absq
    public List f() {
        return this.c;
    }

    public void g() {
        if (this.l == 2) {
            return;
        }
        k(2, true);
    }

    public void h(@dzsi bttq bttqVar) {
        this.e = new abtf(new abfx(), abtc.a(bttqVar, this.g), true);
        k(3, true);
    }

    public void i(@dzsi dhym dhymVar) {
        boolean z = false;
        if (dhymVar != null) {
            this.f = this.h.a(dhymVar);
            this.k = this.h.b(dhymVar);
            dsrj<dqfq> dsrjVar = dhymVar.a;
            for (int i = 0; i < dsrjVar.size(); i++) {
                cjta b = cjtd.b();
                b.d = dtxo.cO;
                this.c.add(new abtr(this, i, dsrjVar.get(i).d, dsrjVar.get(i).b, b));
            }
        }
        if (this.l != 1) {
            z = true;
        }
        k(4, z);
    }

    public void j() {
        this.f = dcdc.e();
    }
}
