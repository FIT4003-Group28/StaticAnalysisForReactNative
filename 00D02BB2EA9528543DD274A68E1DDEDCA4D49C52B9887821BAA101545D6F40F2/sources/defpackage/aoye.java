package defpackage;
/* compiled from: PG */
/* renamed from: aoye  reason: default package */
/* loaded from: classes2.dex */
abstract class aoye {
    public abstract aoyg a();

    public abstract void b(@dzsi dspd dspdVar);

    public abstract void c(dbsg<bttq> dbsgVar);

    public abstract void d(dcdc<aoxt> dcdcVar);

    public abstract void e(dcdc<aoxt> dcdcVar);

    public abstract void f(aoyf aoyfVar);

    public final aoyg g() {
        aoyg a = a();
        boolean a2 = a.g().a();
        aoyf b = a.b();
        dbsk.j(a2 == b.a(), "Error code is %s for %s", true != a2 ? "missing" : "present", b);
        return a;
    }
}
