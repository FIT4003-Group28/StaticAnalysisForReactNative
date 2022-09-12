package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dyxk  reason: default package */
/* loaded from: classes6.dex */
public final class dyxk<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    public dyxk(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private final Method d(Class<?> cls) {
        Class<?> cls2;
        Method e = e(cls, this.b, this.c);
        if (e == null || (cls2 = this.a) == null || cls2.isAssignableFrom(e.getReturnType())) {
            return e;
        }
        return null;
    }

    private static Method e(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return e(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final boolean a(T t) {
        return d(t.getClass()) != null;
    }

    public final Object b(T t, Object... objArr) {
        try {
            Method d = d(t.getClass());
            if (d == null) {
                String str = this.b;
                String valueOf = String.valueOf(t);
                StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(valueOf).length());
                sb.append("Method ");
                sb.append(str);
                sb.append(" not supported for object ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            try {
                return d.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                String valueOf2 = String.valueOf(d);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb2.append("Unexpectedly could not call: ");
                sb2.append(valueOf2);
                AssertionError assertionError = new AssertionError(sb2.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final void c(T t, Object... objArr) {
        try {
            Method d = d(t.getClass());
            if (d == null) {
                return;
            }
            try {
                d.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
