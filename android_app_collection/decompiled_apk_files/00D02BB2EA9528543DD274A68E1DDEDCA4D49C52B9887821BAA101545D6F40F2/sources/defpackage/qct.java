package defpackage;
/* compiled from: PG */
/* renamed from: qct  reason: default package */
/* loaded from: classes7.dex */
public abstract class qct implements qcz {
    public static qcr u(qbn qbnVar, qbs qbsVar) {
        qcr x = x();
        ((qao) x).e = qbnVar;
        x.f(qbsVar);
        return x;
    }

    public static qcs v(amte amteVar) {
        qcs qcsVar = new qcs(x(), amteVar);
        qcsVar.b(Integer.valueOf(amteVar.i));
        qcsVar.d(qbs.DEFAULT);
        return qcsVar;
    }

    private static qcr x() {
        qao qaoVar = new qao();
        qaoVar.k(false);
        qaoVar.j(false);
        qaoVar.a = false;
        qaoVar.h(false);
        qaoVar.d = false;
        qaoVar.g(false);
        qaoVar.i(false);
        qaoVar.e(false);
        qaoVar.d(false);
        qaoVar.b = false;
        qaoVar.i = 1;
        qaoVar.c = false;
        qaoVar.c(false);
        return qaoVar;
    }

    @Override // defpackage.qcz
    public final <T> T Op(qcy<T> qcyVar) {
        return qcyVar.a(this);
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    @Override // defpackage.qcz
    public abstract boolean l();

    @Override // defpackage.qcz
    public abstract qbs m();

    @Override // defpackage.qcz
    @dzsi
    public abstract qbn n();

    public abstract boolean o();

    @dzsi
    public abstract Integer p();

    @dzsi
    public abstract String q();

    @dzsi
    public abstract duqc r();

    @dzsi
    public abstract crmw s();
}
