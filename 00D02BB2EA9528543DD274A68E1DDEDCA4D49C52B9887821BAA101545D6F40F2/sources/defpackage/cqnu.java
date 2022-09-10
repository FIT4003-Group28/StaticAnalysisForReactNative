package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: PG */
/* renamed from: cqnu  reason: default package */
/* loaded from: classes.dex */
public final class cqnu implements InvocationHandler {
    public static final cqnu a = new cqnu(cqnr.a);
    final cqnr<?, ?> b;

    public cqnu(cqnr<?, ?> cqnrVar) {
        this.b = cqnrVar;
    }

    public static <T> T a(Class<T> cls, cqnu cqnuVar) {
        return (T) Proxy.newProxyInstance(cqnw.class.getClassLoader(), new Class[]{cqnv.class, cls}, cqnuVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        cqnr<?, ?> cqnrVar = ((cqnu) Proxy.getInvocationHandler(obj)).b;
        cqnr cqnrVar2 = new cqnr(method, objArr, cqnw.a.get());
        cqnrVar2.b = cqnrVar;
        Class<?> returnType = method.getReturnType();
        if (returnType == Void.class) {
            return null;
        }
        try {
            if (!returnType.isInterface()) {
                Object a2 = cqns.a(returnType);
                cqqe<Object, Object> cqqeVar = cqny.a;
                cqny.d(a2);
                cqqeVar.b(a2, cqnrVar2);
                return a2;
            }
            return a(returnType, new cqnu(cqnrVar2));
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(returnType);
            String valueOf2 = String.valueOf(method);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
            sb.append("Unable to create proxy for return type ");
            sb.append(valueOf);
            sb.append(" of ");
            sb.append(valueOf2);
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
