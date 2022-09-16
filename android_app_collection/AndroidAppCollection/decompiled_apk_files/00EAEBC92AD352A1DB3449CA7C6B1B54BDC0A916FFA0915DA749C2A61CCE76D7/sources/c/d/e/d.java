package c.d.e;

import c.d.d.d.l;
/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    static class a implements l<c<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f2894a;

        a(Throwable th) {
            this.f2894a = th;
        }

        @Override // c.d.d.d.l
        /* renamed from: get */
        public c<T> mo139get() {
            return d.b(this.f2894a);
        }
    }

    public static <T> l<c<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> c<T> b(Throwable th) {
        h j = h.j();
        j.a(th);
        return j;
    }
}
