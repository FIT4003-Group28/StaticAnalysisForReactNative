package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cbtb  reason: default package */
/* loaded from: classes4.dex */
public final class cbtb implements cbsj {
    private final gga a;
    private final cbsg b;
    private final ges c;
    private cbtv d;

    public cbtb(gga ggaVar, cbsg cbsgVar, cbtv cbtvVar, ges gesVar) {
        this.a = ggaVar;
        this.b = cbsgVar;
        this.c = gesVar;
        this.d = cbtvVar;
    }

    public static djtf g(String str, int i) {
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

    private final cbtz h() {
        cbuj cbujVar;
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        dcdc z = dcbg.b(cbujVar.b.subList(0, cbujVar.c)).t(cbsz.a).s(cbta.a).z();
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

    @Override // defpackage.cbsj
    public final void a(List<cbts> list) {
        cbuj cbujVar;
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        dcep B = dcbg.b(list).s(cbst.a).B();
        int i = cbujVar.c;
        if (i < cbujVar.b.size()) {
            dcep B2 = dcbg.b(cbujVar.b.get(i).a).s(cbsu.a).B();
            dbsk.m(B2.containsAll(B), "Selected reviews cannot be found in current task.");
            this.b.a(dcbg.b(B).s(cbsv.a).m(dcbg.b(dcep.K(dcnm.p(B2, B))).s(cbsw.a)).z(), this.d);
            cbtv cbtvVar2 = this.d;
            dsqp dsqpVar = (dsqp) cbtvVar2.cu(5);
            dsqpVar.bC(cbtvVar2);
            cbtt cbttVar = (cbtt) dsqpVar;
            dsqp dsqpVar2 = (dsqp) cbujVar.cu(5);
            dsqpVar2.bC(cbujVar);
            cbui cbuiVar = (cbui) dsqpVar2;
            int i2 = i + 1;
            if (cbuiVar.c) {
                cbuiVar.bF();
                cbuiVar.c = false;
            }
            cbuj cbujVar2 = (cbuj) cbuiVar.b;
            cbujVar2.a |= 1;
            cbujVar2.c = i2;
            if (cbttVar.c) {
                cbttVar.bF();
                cbttVar.c = false;
            }
            cbtv cbtvVar3 = (cbtv) cbttVar.b;
            cbuj bK = cbuiVar.bK();
            bK.getClass();
            cbtvVar3.b = bK;
            cbtvVar3.a = 2;
            this.d = cbttVar.bK();
        }
    }

    @Override // defpackage.cbsj
    public final void b() {
        cbuj cbujVar;
        cbtv cbtvVar = this.d;
        if (cbtvVar.a == 2) {
            cbujVar = (cbuj) cbtvVar.b;
        } else {
            cbujVar = cbuj.d;
        }
        int i = cbujVar.c;
        if (i < cbujVar.b.size()) {
            this.b.a(dcbg.b(dcbg.b(cbujVar.b.get(i).a).s(cbsx.a).B()).s(cbsy.a).z(), this.d);
            cbtv cbtvVar2 = this.d;
            dsqp dsqpVar = (dsqp) cbtvVar2.cu(5);
            dsqpVar.bC(cbtvVar2);
            cbtt cbttVar = (cbtt) dsqpVar;
            dsqp dsqpVar2 = (dsqp) cbujVar.cu(5);
            dsqpVar2.bC(cbujVar);
            cbui cbuiVar = (cbui) dsqpVar2;
            int i2 = i + 1;
            if (cbuiVar.c) {
                cbuiVar.bF();
                cbuiVar.c = false;
            }
            cbuj cbujVar2 = (cbuj) cbuiVar.b;
            cbujVar2.a |= 1;
            cbujVar2.c = i2;
            if (cbttVar.c) {
                cbttVar.bF();
                cbttVar.c = false;
            }
            cbtv cbtvVar3 = (cbtv) cbttVar.b;
            cbuj bK = cbuiVar.bK();
            bK.getClass();
            cbtvVar3.b = bK;
            cbtvVar3.a = 2;
            this.d = cbttVar.bK();
        }
    }

    @Override // defpackage.cbsj
    public final void c() {
        this.c.Nw(h());
        this.a.g().e();
    }

    @Override // defpackage.cbsj
    public final void d(int i) {
        cbtz h = h();
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
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
        this.c.Nw(cbtyVar.bK());
    }

    @Override // defpackage.cbsj
    public final void e() {
        cbtz h = h();
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
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
        this.c.Nw(cbtyVar.bK());
    }

    @Override // defpackage.cbsj
    public final cbtv f() {
        return this.d;
    }
}
