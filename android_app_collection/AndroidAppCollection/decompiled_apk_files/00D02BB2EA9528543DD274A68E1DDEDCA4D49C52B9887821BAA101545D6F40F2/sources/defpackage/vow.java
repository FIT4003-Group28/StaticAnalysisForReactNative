package defpackage;
/* compiled from: PG */
/* renamed from: vow  reason: default package */
/* loaded from: classes7.dex */
public abstract class vow {
    public static final vow f = new vlt(false, false, 0, -1, dcdc.e());
    public static final vow g = new vlt(true, true, 0, -1, dcdc.e());

    public static vow f(int i) {
        return new vlt(true, false, i, -1, dcdc.e());
    }

    public static vow g(int i, dcdc<akqq> dcdcVar) {
        return new vlt(true, false, i, -1, dcdcVar);
    }

    public static vow h(int i, int i2, dcdc<akqq> dcdcVar) {
        return new vlt(true, false, i, i2, dcdcVar);
    }

    public static vow i(int i, dcdc<akqq> dcdcVar) {
        return new vlt(false, false, 0, i, dcdcVar);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract int c();

    public abstract int d();

    public abstract dcdc<akqq> e();
}
