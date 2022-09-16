package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cbsp  reason: default package */
/* loaded from: classes4.dex */
public final class cbsp implements cbsj {
    private final gga a;
    private final ges b;
    private final cbsg c;
    private cbtv d;

    public cbsp(gga ggaVar, cbsg cbsgVar, cbtv cbtvVar, ges gesVar) {
        this.a = ggaVar;
        this.b = gesVar;
        this.c = cbsgVar;
        this.d = cbtvVar;
    }

    private final cbtz g() {
        cbub cbubVar;
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        dcdc z = dcbg.b(cbubVar.b.subList(0, cbubVar.c)).s(cbsn.a).s(cbso.a).z();
        cbty bZ = cbtz.f.bZ();
        String str = this.d.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cbtz cbtzVar = (cbtz) bZ.b;
        str.getClass();
        cbtzVar.a |= 1;
        cbtzVar.b = str;
        bZ.a(z);
        return bZ.bK();
    }

    private final void h(Iterable<djtf> iterable) {
        this.c.a(iterable, this.d);
    }

    private final void i(String str, dqjh dqjhVar) {
        cbsg cbsgVar = this.c;
        djve bZ = djvf.d.bZ();
        dqjd bZ2 = dqjf.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjf dqjfVar = (dqjf) bZ2.b;
        dqjfVar.b = 1;
        int i = dqjfVar.a | 1;
        dqjfVar.a = i;
        str.getClass();
        dqjfVar.a = i | 2;
        dqjfVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djvf djvfVar = (djvf) bZ.b;
        dqjf bK = bZ2.bK();
        bK.getClass();
        djvfVar.b = bK;
        djvfVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djvf djvfVar2 = (djvf) bZ.b;
        djvfVar2.c = dqjhVar.e;
        djvfVar2.a |= 2;
        cbsgVar.a.b(bZ.bK(), cbsg.b("Failed to submit review thumbs vote"), dege.a);
    }

    private static djtf j(String str, int i) {
        djte bZ = djtf.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djtf djtfVar = (djtf) bZ.b;
        str.getClass();
        int i2 = djtfVar.a | 1;
        djtfVar.a = i2;
        djtfVar.b = str;
        djtfVar.c = i - 1;
        djtfVar.a = i2 | 2;
        return bZ.bK();
    }

    @Override // defpackage.cbsj
    public final void a(List<cbts> list) {
        cbub cbubVar;
        dcep B = dcbg.b(list).s(cbsm.a).B();
        dbsk.m(B.size() <= 1, "At most one review can be selected in a single review task.");
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        int i = cbubVar.c;
        if (i < cbubVar.b.size()) {
            cbts cbtsVar = cbubVar.b.get(i).a;
            if (cbtsVar == null) {
                cbtsVar = cbts.e;
            }
            String str = cbtsVar.c;
            if (B.size() == 1) {
                dbsk.m(B.contains(str), "Selected review cannot be found in the current task.");
                h(dcdc.f(j(str, 2)));
                i(str, dqjh.THUMBS_UP);
            } else {
                h(dcdc.f(j(str, 3)));
                i(str, dqjh.THUMBS_DOWN);
            }
            cbtv cbtvVar2 = this.d;
            dsqp dsqpVar = (dsqp) cbtvVar2.cu(5);
            dsqpVar.bC(cbtvVar2);
            cbtt cbttVar = (cbtt) dsqpVar;
            dsqp dsqpVar2 = (dsqp) cbubVar.cu(5);
            dsqpVar2.bC(cbubVar);
            cbua cbuaVar = (cbua) dsqpVar2;
            int i2 = i + 1;
            if (cbuaVar.c) {
                cbuaVar.bF();
                cbuaVar.c = false;
            }
            cbub cbubVar2 = (cbub) cbuaVar.b;
            cbubVar2.a = 1 | cbubVar2.a;
            cbubVar2.c = i2;
            if (cbttVar.c) {
                cbttVar.bF();
                cbttVar.c = false;
            }
            cbtv cbtvVar3 = (cbtv) cbttVar.b;
            cbub bK = cbuaVar.bK();
            bK.getClass();
            cbtvVar3.b = bK;
            cbtvVar3.a = 6;
            this.d = cbttVar.bK();
        }
    }

    @Override // defpackage.cbsj
    public final void b() {
        cbub cbubVar;
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 6) {
            cbubVar = (cbub) cbtvVar.b;
        } else {
            cbubVar = cbub.e;
        }
        int i = cbubVar.c;
        if (i < cbubVar.b.size()) {
            cbts cbtsVar = cbubVar.b.get(i).a;
            if (cbtsVar == null) {
                cbtsVar = cbts.e;
            }
            h(dcdc.f(j(cbtsVar.c, 4)));
            cbtv cbtvVar2 = this.d;
            dsqp dsqpVar = (dsqp) cbtvVar2.cu(5);
            dsqpVar.bC(cbtvVar2);
            cbtt cbttVar = (cbtt) dsqpVar;
            dsqp dsqpVar2 = (dsqp) cbubVar.cu(5);
            dsqpVar2.bC(cbubVar);
            cbua cbuaVar = (cbua) dsqpVar2;
            int i2 = i + 1;
            if (cbuaVar.c) {
                cbuaVar.bF();
                cbuaVar.c = false;
            }
            cbub cbubVar2 = (cbub) cbuaVar.b;
            cbubVar2.a |= 1;
            cbubVar2.c = i2;
            if (cbttVar.c) {
                cbttVar.bF();
                cbttVar.c = false;
            }
            cbtv cbtvVar3 = (cbtv) cbttVar.b;
            cbub bK = cbuaVar.bK();
            bK.getClass();
            cbtvVar3.b = bK;
            cbtvVar3.a = 6;
            this.d = cbttVar.bK();
        }
    }

    @Override // defpackage.cbsj
    public final void c() {
        cbtz g = g();
        this.a.g().e();
        this.b.Nw(g);
    }

    @Override // defpackage.cbsj
    public final void d(int i) {
        cbtz g = g();
        dsqp dsqpVar = (dsqp) g.cu(5);
        dsqpVar.bC(g);
        cbty cbtyVar = (cbty) dsqpVar;
        if (cbtyVar.c) {
            cbtyVar.bF();
            cbtyVar.c = false;
        }
        cbtz cbtzVar = (cbtz) cbtyVar.b;
        cbtz cbtzVar2 = cbtz.f;
        cbtzVar.a |= 4;
        cbtzVar.e = i;
        int a = cbuh.a(this.d.g);
        if (a == 0) {
            a = 1;
        }
        if (cbtyVar.c) {
            cbtyVar.bF();
            cbtyVar.c = false;
        }
        cbtz cbtzVar3 = (cbtz) cbtyVar.b;
        cbtzVar3.d = a;
        cbtzVar3.a |= 2;
        this.a.g().e();
        this.b.Nw(cbtyVar.bK());
    }

    @Override // defpackage.cbsj
    public final void e() {
        cbtz g = g();
        dsqp dsqpVar = (dsqp) g.cu(5);
        dsqpVar.bC(g);
        cbty cbtyVar = (cbty) dsqpVar;
        int a = cbuh.a(this.d.g);
        if (a == 0) {
            a = 1;
        }
        if (cbtyVar.c) {
            cbtyVar.bF();
            cbtyVar.c = false;
        }
        cbtz cbtzVar = (cbtz) cbtyVar.b;
        cbtz cbtzVar2 = cbtz.f;
        cbtzVar.d = a;
        cbtzVar.a |= 2;
        this.a.g().e();
        this.b.Nw(cbtyVar.bK());
    }

    @Override // defpackage.cbsj
    public final cbtv f() {
        return this.d;
    }
}
