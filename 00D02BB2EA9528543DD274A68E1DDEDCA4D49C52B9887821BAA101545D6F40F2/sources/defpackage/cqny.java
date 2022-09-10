package defpackage;

import java.lang.reflect.Proxy;
/* compiled from: PG */
/* renamed from: cqny  reason: default package */
/* loaded from: classes.dex */
public final class cqny {
    private static final Class<?>[] b = new Class[0];
    private static final dcdc<Object> c = dcdc.h("", Boolean.TRUE, Boolean.FALSE);
    public static final cqqe<Object, Object> a = new cqqe<>();

    public static <T, V> cqnx<T, V> a(Object obj) {
        return g(obj);
    }

    public static boolean b(@dzsi Object obj) {
        if (obj == null) {
            return false;
        }
        return (obj instanceof cqnv) || a.c(obj) != null;
    }

    public static void c(Object obj) {
        if ((obj instanceof cqnx) || (obj instanceof cqjb)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("Expected ProxiedMethod or PropertyCallback: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(Object obj) {
        if (cqjh.a) {
            dcdc<Object> dcdcVar = c;
            int size = dcdcVar.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (obj == dcdcVar.get(i)) {
                    throw new IllegalArgumentException("Unsafe proxy key.");
                }
                i = i2;
            }
        }
    }

    public static <T extends cqkp, V> void e(V v, cqjb<T, V> cqjbVar) {
        cqqe<Object, Object> cqqeVar = a;
        d(v);
        cqqeVar.b(v, cqjbVar);
    }

    @dzsi
    public static Object f(@dzsi Object obj) {
        cqnr<?, ?> cqnrVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof cqnv) {
            try {
                cqnrVar = ((cqnu) Proxy.getInvocationHandler(obj)).b;
            } catch (IllegalArgumentException e) {
                String name = obj.getClass().getName();
                boolean isAssignableFrom = Proxy.class.isAssignableFrom(obj.getClass());
                boolean isProxyClass = Proxy.isProxyClass(obj.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 78);
                sb.append("Failed to resolve proxy for object: ");
                sb.append(name);
                sb.append(" isAssignableFrom:");
                sb.append(isAssignableFrom);
                sb.append(" isProxyClass:");
                sb.append(isProxyClass);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        return cqnrVar == null ? a.c(obj) : cqnrVar;
    }

    public static <T, V> cqnx<T, V> g(Object obj) {
        cqnx<T, V> cqnxVar = (cqnx) f(obj);
        dbsk.s(cqnxVar);
        return cqnxVar;
    }
}
