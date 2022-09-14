package c.d.b.a;

import c.d.b.a.a;
/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static g f2733a;

    private g() {
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f2733a == null) {
                f2733a = new g();
            }
            gVar = f2733a;
        }
        return gVar;
    }

    @Override // c.d.b.a.a
    public void a(a.EnumC0068a enumC0068a, Class<?> cls, String str, Throwable th) {
    }
}
