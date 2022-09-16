package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dedw  reason: default package */
/* loaded from: classes6.dex */
public final class dedw implements InvocationHandler {
    public static final /* synthetic */ int b = 0;
    private static final dcdn<String, Method> c;
    public final dedv<?> a;

    static {
        Method[] methods;
        dcdg p = dcdn.p();
        for (Method method : dedv.class.getMethods()) {
            if (method.getDeclaringClass().equals(dedv.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                p.f(method.getName(), method);
            }
        }
        c = p.b();
    }

    public dedw(dedv<?> dedvVar) {
        this.a = dedvVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = c.get(name);
        if (method2 == null) {
            throw new UnsupportedOperationException(name);
        }
        try {
            return method2.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
