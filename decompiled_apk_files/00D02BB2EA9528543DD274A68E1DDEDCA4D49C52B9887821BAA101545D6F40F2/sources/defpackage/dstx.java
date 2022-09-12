package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dstx  reason: default package */
/* loaded from: classes.dex */
public abstract class dstx<T, B> {
    public abstract void a(B b, int i, long j);

    public abstract void b(B b, int i, int i2);

    public abstract void c(B b, int i, long j);

    public abstract void d(B b, int i, dspd dspdVar);

    public abstract void e(B b, int i, T t);

    public abstract B f();

    public abstract T g(B b);

    public abstract void h(Object obj, T t);

    public abstract T i(Object obj);

    public abstract B j(Object obj);

    public abstract void k(Object obj, B b);

    public abstract void l(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b, dssw dsswVar) {
        int b2 = dsswVar.b();
        int b3 = dsut.b(b2);
        int a = dsut.a(b2);
        if (a == 0) {
            a(b, b3, dsswVar.g());
            return true;
        } else if (a == 1) {
            c(b, b3, dsswVar.i());
            return true;
        } else if (a == 2) {
            d(b, b3, dsswVar.s());
            return true;
        } else if (a != 3) {
            if (a == 4) {
                return false;
            }
            if (a == 5) {
                b(b, b3, dsswVar.j());
                return true;
            }
            throw dsrm.f();
        } else {
            B f = f();
            int c = dsut.c(b3, 4);
            while (dsswVar.a() != Integer.MAX_VALUE && m(f, dsswVar)) {
            }
            if (c != dsswVar.b()) {
                throw dsrm.e();
            }
            e(b, b3, g(f));
            return true;
        }
    }

    public abstract T n(T t, T t2);

    public abstract int o(T t);

    public abstract int p(T t);

    public abstract boolean q();

    public abstract void r(T t, dspq dspqVar);

    public abstract void s(T t, dspq dspqVar);
}
