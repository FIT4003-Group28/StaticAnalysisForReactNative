package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b6 implements a7 {

    /* renamed from: b  reason: collision with root package name */
    private static final l6 f4072b = new a6();

    /* renamed from: a  reason: collision with root package name */
    private final l6 f4073a;

    public b6() {
        this(new d6(z4.a(), a()));
    }

    private b6(l6 l6Var) {
        e5.a(l6Var, "messageInfoFactory");
        this.f4073a = l6Var;
    }

    private static l6 a() {
        try {
            return (l6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4072b;
        }
    }

    private static boolean a(i6 i6Var) {
        return i6Var.f() == b5.f.i;
    }

    @Override // c.e.a.b.d.g.a7
    public final <T> b7<T> a(Class<T> cls) {
        d7.a((Class<?>) cls);
        i6 b2 = this.f4073a.b(cls);
        if (b2.j()) {
            return b5.class.isAssignableFrom(cls) ? r6.a(d7.c(), t4.a(), b2.l()) : r6.a(d7.a(), t4.b(), b2.l());
        } else if (!b5.class.isAssignableFrom(cls)) {
            boolean a2 = a(b2);
            s6 a3 = t6.a();
            u5 a4 = u5.a();
            return a2 ? p6.a(cls, b2, a3, a4, d7.a(), t4.b(), j6.a()) : p6.a(cls, b2, a3, a4, d7.b(), (r4<?>) null, j6.a());
        } else {
            boolean a5 = a(b2);
            s6 b3 = t6.b();
            u5 b4 = u5.b();
            u7<?, ?> c2 = d7.c();
            return a5 ? p6.a(cls, b2, b3, b4, c2, t4.a(), j6.b()) : p6.a(cls, b2, b3, b4, c2, (r4<?>) null, j6.b());
        }
    }
}
