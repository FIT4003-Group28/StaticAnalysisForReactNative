package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/* compiled from: PG */
/* renamed from: cqnq  reason: default package */
/* loaded from: classes.dex */
final class cqnq<T> {
    private static final InvocationHandler d = new cqnp();
    public final Class<?> a;
    public final T b;
    public boolean c;

    public cqnq(Class<T> cls) {
        this.a = cls;
        if (cls.isInterface()) {
            this.b = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, d);
        } else {
            this.b = (T) cqns.a(cls);
        }
    }
}
