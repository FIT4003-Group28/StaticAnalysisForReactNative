package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: eail  reason: default package */
/* loaded from: classes6.dex */
final class eail<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    public eail(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (1 != (r4.getModifiers() & 1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.reflect.Method d(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.b
            java.lang.Class[] r1 = r3.c
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L14
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L12
            r1 = 1
            r0 = r0 & r1
            if (r1 == r0) goto L15
            goto L14
        L12:
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L26
            java.lang.Class<?> r0 = r3.a
            if (r0 == 0) goto L26
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L26
            return r2
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eail.d(java.lang.Class):java.lang.reflect.Method");
    }

    public final boolean a(T t) {
        return d(t.getClass()) != null;
    }

    public final Object b(T t, Object... objArr) {
        try {
            Method d = d(t.getClass());
            if (d == null) {
                throw new AssertionError("Method " + this.b + " not supported for object " + t);
            }
            try {
                return d.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + d);
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
