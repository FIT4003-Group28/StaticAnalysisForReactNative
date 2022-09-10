package defpackage;
/* compiled from: PG */
/* renamed from: byxr  reason: default package */
/* loaded from: classes4.dex */
public abstract class byxr {
    public abstract byxs a();

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract void f(dcdc<String> dcdcVar);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(int i);

    public abstract void j(ih ihVar);

    public abstract void k(String str);

    public final void l(String str, String str2) {
        g(str);
        e(str2);
        ia iaVar = new ia();
        iaVar.f(str);
        iaVar.e(str2);
        j(iaVar);
    }

    public final void m(String str, dcdc<String> dcdcVar) {
        ie ieVar = new ie();
        ieVar.i(str);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            ieVar.h(dcdcVar.get(i));
        }
        g(str);
        f(dcdcVar);
        j(ieVar);
    }
}
