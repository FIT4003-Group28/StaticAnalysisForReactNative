package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dcuk  reason: default package */
/* loaded from: classes.dex */
final class dcuk {
    public final Object a;
    public final Method b;
    private final Method c;

    private dcuk(Object obj, Method method, Method method2) {
        this.a = obj;
        this.c = method;
        this.b = method2;
    }

    public static dcuk a() {
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", Throwable.class);
            StackTraceElement stackTraceElement = (StackTraceElement) method.invoke(invoke, new Throwable(), 0);
            Integer num = (Integer) method2.invoke(invoke, new Throwable());
            return new dcuk(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final StackTraceElement b(Throwable th, int i) {
        try {
            return (StackTraceElement) this.c.invoke(this.a, th, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            if (!(e2.getCause() instanceof Error)) {
                throw new RuntimeException(e2.getCause());
            }
            throw ((Error) e2.getCause());
        }
    }
}
