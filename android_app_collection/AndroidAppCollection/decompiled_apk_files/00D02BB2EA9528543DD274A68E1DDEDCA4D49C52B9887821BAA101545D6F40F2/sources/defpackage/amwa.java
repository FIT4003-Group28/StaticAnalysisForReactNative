package defpackage;
/* compiled from: PG */
/* renamed from: amwa  reason: default package */
/* loaded from: classes2.dex */
public abstract class amwa {
    public abstract amwb a();

    public abstract void b(String str);

    public abstract void c(long j);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g(float f);

    public abstract void h(bvrt<dgas> bvrtVar);

    public abstract void i(bvrt<dpad> bvrtVar);

    public abstract void j(bvrt<dgas> bvrtVar);

    public abstract void k(bvrt<dnpq> bvrtVar);

    public final void l(dgas dgasVar) {
        if (dgasVar == null) {
            return;
        }
        h(bvrt.b(dgasVar));
    }

    public final void m(dpad dpadVar) {
        if (dpadVar == null) {
            return;
        }
        i(bvrt.b(dpadVar));
    }

    public final void n(dgas dgasVar) {
        if (dgasVar == null) {
            return;
        }
        j(bvrt.b(dgasVar));
    }

    public final void o(@dzsi dnpq dnpqVar) {
        if (dnpqVar == null) {
            return;
        }
        k(bvrt.b(dnpqVar));
    }
}
