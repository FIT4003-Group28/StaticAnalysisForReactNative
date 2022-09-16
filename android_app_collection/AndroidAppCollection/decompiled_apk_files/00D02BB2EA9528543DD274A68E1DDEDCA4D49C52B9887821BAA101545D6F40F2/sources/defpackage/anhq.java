package defpackage;
/* compiled from: PG */
/* renamed from: anhq  reason: default package */
/* loaded from: classes2.dex */
public abstract class anhq {
    public abstract anhy a();

    public abstract void b(eapg eapgVar);

    public abstract void c(eapd eapdVar);

    public abstract void d(anhu anhuVar);

    public abstract void e(anhu anhuVar);

    public abstract void f(anhu anhuVar);

    public abstract void g(anhw anhwVar);

    public abstract void h(eaou eaouVar);

    public abstract void i(int i);

    public abstract void j(dbsg<String> dbsgVar);

    public final anhy k() {
        anhy a = a();
        boolean z = false;
        dbsk.l((a.a() == anhw.SEGMENT_EDITING && a.e() == null) ? false : true);
        if (a.a() != anhw.EXPERIENCES_IN_PLACE || !dbsj.d(a.h())) {
            z = true;
        }
        dbsk.l(z);
        return a;
    }

    public final void l(String str) {
        if (!str.isEmpty()) {
            try {
                h(eaou.j(str));
            } catch (IllegalArgumentException unused) {
                int i = anhy.k;
            }
        }
    }

    public final void m(long j) {
        c(new eapd(j));
    }
}
