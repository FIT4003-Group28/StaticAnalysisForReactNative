package defpackage;
/* compiled from: PG */
/* renamed from: iaq  reason: default package */
/* loaded from: classes6.dex */
public abstract class iaq {
    public static iap e() {
        hzf hzfVar = new hzf();
        hzfVar.c = ibm.D();
        return hzfVar;
    }

    public static iap f() {
        iap e = e();
        hzf hzfVar = (hzf) e;
        hzfVar.a = ibm.n();
        hzfVar.b = ibm.x();
        e.e(ibq.r());
        e.e(cqgr.co(cqrp.f(8.0d), false));
        return e;
    }

    public static iap g() {
        iap e = e();
        hzf hzfVar = (hzf) e;
        hzfVar.a = ibm.p();
        hzfVar.b = ibm.y();
        e.e(ibq.r());
        e.e(cqgr.co(cqrp.f(8.0d), false));
        return e;
    }

    @dzsi
    public abstract cqss a();

    @dzsi
    public abstract cqss b();

    public abstract dcdc<cqmp<iao>> c();

    public abstract cqss d();

    public final cqiw<iao> h() {
        return new iam(this);
    }
}
