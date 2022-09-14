package c.e.a.b.d.g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y6 {

    /* renamed from: c  reason: collision with root package name */
    private static final y6 f4541c = new y6();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, b7<?>> f4543b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final a7 f4542a = new b6();

    private y6() {
    }

    public static y6 a() {
        return f4541c;
    }

    public final <T> b7<T> a(Class<T> cls) {
        e5.a(cls, "messageType");
        b7<T> b7Var = (b7<T>) this.f4543b.get(cls);
        if (b7Var == null) {
            b7<T> a2 = this.f4542a.a(cls);
            e5.a(cls, "messageType");
            e5.a(a2, "schema");
            b7<T> b7Var2 = (b7<T>) this.f4543b.putIfAbsent(cls, a2);
            return b7Var2 != null ? b7Var2 : a2;
        }
        return b7Var;
    }

    public final <T> b7<T> a(T t) {
        return a((Class) t.getClass());
    }
}
