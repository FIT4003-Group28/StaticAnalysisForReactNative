package f.c.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public class b {
    private b() {
    }

    private static <T extends Throwable> T a(T t) {
        a((Throwable) t, b.class.getName());
        return t;
    }

    static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
        a(illegalStateException);
        throw illegalStateException;
    }

    private static void a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        a(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a(str);
        throw null;
    }
}
