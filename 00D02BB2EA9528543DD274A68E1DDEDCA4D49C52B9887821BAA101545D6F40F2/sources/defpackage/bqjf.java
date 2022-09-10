package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqjf  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqjf {
    public abstract bqjh a();

    public abstract void b(boolean z);

    public abstract void c(dhpj dhpjVar);

    public abstract void d(boolean z);

    public abstract void e(Class<? extends bqld> cls);

    public abstract void f(dnqh dnqhVar);

    public abstract void g(boolean z);

    public abstract void h(List<bbtm> list);

    public abstract void i(dlif dlifVar);

    public abstract void j(int i);

    public abstract void k(String str);

    public abstract void l(boolean z);

    protected abstract void m(bqlh bqlhVar);

    public abstract void n(chbv chbvVar);

    public final bqjh o() {
        bqjh a = a();
        boolean z = true;
        dbsk.m(a.b() >= 0 && a.b() <= 5, "ratingToSubmit must be in [0..5]: %s");
        if (a.a() && a.b() <= 0) {
            z = false;
        }
        dbsk.m(z, "Published review submitted by one tap must have rating");
        return a;
    }

    public final void p(List<bbtm> list) {
        m(bqlh.d(list));
    }
}
