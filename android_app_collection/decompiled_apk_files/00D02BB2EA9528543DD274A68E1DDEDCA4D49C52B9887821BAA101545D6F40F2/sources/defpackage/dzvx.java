package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dzvx  reason: default package */
/* loaded from: classes6.dex */
public final class dzvx {
    private dzvx() {
    }

    public static void a(String str) {
        dztb dztbVar = new dztb("lateinit property " + str + " has not been initialized");
        e(dztbVar);
        throw dztbVar;
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
        e(nullPointerException);
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            f(str);
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T extends Throwable> void e(T t) {
        String name = dzvx.class.getName();
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    private static void f(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        e(nullPointerException);
        throw nullPointerException;
    }
}
