package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: qcx  reason: default package */
/* loaded from: classes7.dex */
public abstract class qcx implements Serializable, qcz {
    public static qcw x() {
        qaq qaqVar = new qaq();
        qaqVar.k(qbs.DEFAULT);
        qaqVar.b(dcdc.e());
        qaqVar.t(duqc.f);
        qaqVar.j(false);
        qaqVar.f(false);
        qaqVar.b = false;
        qaqVar.a = false;
        qaqVar.e(false);
        qaqVar.d(false);
        qaqVar.i(1);
        qaqVar.q(false);
        qaqVar.c(dcmr.a);
        qaqVar.p(false);
        return qaqVar;
    }

    @Override // defpackage.qcz
    public final <T> T Op(qcy<T> qcyVar) {
        return qcyVar.b(this);
    }

    @Override // defpackage.qcz
    public final dbsg<dnqh> a() {
        return u().h(qcv.a);
    }

    @dzsi
    public abstract dqvj f();

    @dzsi
    public abstract amvh g();

    public abstract dcdc<amvh> h();

    @dzsi
    @Deprecated
    public abstract String i();

    @dzsi
    public abstract dspd j();

    @dzsi
    public abstract String k();

    public abstract boolean l();

    public abstract qbs m();

    @Override // defpackage.qcz
    @dzsi
    public final qbn n() {
        return null;
    }

    public abstract dcep<dpjs> o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    @dzsi
    public abstract bvrt<dwao> s();

    public abstract dbsg<bvrt<dnqh>> u();

    @dzsi
    public abstract bvrt<duqc> v();

    public abstract qcw w();

    @dzsi
    public final dwao y() {
        bvrt<dwao> s = s();
        if (s != null) {
            return s.e((dssr) dwao.R.cu(7), dwao.R);
        }
        return null;
    }

    @dzsi
    public final duqc z() {
        bvrt<duqc> v = v();
        if (v == null) {
            return null;
        }
        return v.e((dssr) duqc.f.cu(7), duqc.f);
    }
}
