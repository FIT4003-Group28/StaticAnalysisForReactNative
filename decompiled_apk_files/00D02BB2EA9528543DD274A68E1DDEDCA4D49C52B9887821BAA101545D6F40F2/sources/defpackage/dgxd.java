package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: dgxd  reason: default package */
/* loaded from: classes6.dex */
public final class dgxd<T> {
    public final Class<? super T> a;
    public final Type b;
    final int c;

    protected dgxd() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.b = dgtv.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            throw null;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static dgxd<?> a(Type type) {
        return new dgxd<>(type);
    }

    public static <T> dgxd<T> b(Class<T> cls) {
        return new dgxd<>(cls);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dgxd) && dgtv.d(this.b, ((dgxd) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return dgtv.e(this.b);
    }

    public dgxd(Type type) {
        dgtr.b(type);
        Type b = dgtv.b(type);
        this.b = b;
        this.a = (Class<? super T>) dgtv.c(b);
        this.c = b.hashCode();
    }
}
