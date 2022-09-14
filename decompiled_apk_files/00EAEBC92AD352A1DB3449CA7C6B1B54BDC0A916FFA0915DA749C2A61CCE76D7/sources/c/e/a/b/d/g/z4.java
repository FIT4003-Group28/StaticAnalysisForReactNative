package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
final class z4 implements l6 {

    /* renamed from: a  reason: collision with root package name */
    private static final z4 f4557a = new z4();

    private z4() {
    }

    public static z4 a() {
        return f4557a;
    }

    @Override // c.e.a.b.d.g.l6
    public final boolean a(Class<?> cls) {
        return b5.class.isAssignableFrom(cls);
    }

    @Override // c.e.a.b.d.g.l6
    public final i6 b(Class<?> cls) {
        if (!b5.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (i6) b5.a((Class<b5>) cls.asSubclass(b5.class)).a(b5.f.f4066c, (Object) null, (Object) null);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e2);
        }
    }
}
