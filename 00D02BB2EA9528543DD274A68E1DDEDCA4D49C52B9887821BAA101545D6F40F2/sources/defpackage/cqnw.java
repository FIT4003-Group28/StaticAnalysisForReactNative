package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cqnw  reason: default package */
/* loaded from: classes.dex */
public final class cqnw {
    public static final ThreadLocal<Map<Object, cqnq<?>>> a = new cqnt();

    private cqnw() {
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof cqnv)) {
            return cqny.a.c(obj) instanceof cqnx;
        }
        return true;
    }

    public static <T, V> T b(Class<T> cls) {
        return (T) cqnu.a(cls, cqnu.a);
    }

    public static <T> T c(Class<T> cls) {
        cqnq<?> cqnqVar = new cqnq<>(cls);
        a.get().put(cqnqVar.b, cqnqVar);
        return cqnqVar.b;
    }

    public static void d(Object obj) {
        dbsk.g(!a(obj), "Argument shouldn't be a proxy object: %s", obj);
    }
}
