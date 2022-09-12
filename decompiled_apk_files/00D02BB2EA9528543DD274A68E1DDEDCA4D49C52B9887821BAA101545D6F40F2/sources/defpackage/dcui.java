package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: dcui  reason: default package */
/* loaded from: classes.dex */
public final class dcui {
    private static final dcuk a = dcuk.a();

    public static StackTraceElement a(Class<?> cls, Throwable th, int i) {
        StackTraceElement stackTraceElement;
        dcuj.a(cls, "target");
        if (i < 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("skip count cannot be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        StackTraceElement[] stackTrace = a != null ? null : th.getStackTrace();
        boolean z = false;
        while (true) {
            try {
                dcuk dcukVar = a;
                if (dcukVar != null) {
                    stackTraceElement = dcukVar.b(th, i);
                } else {
                    stackTraceElement = stackTrace[i];
                }
                if (cls.getName().equals(stackTraceElement.getClassName())) {
                    z = true;
                } else if (z) {
                    return stackTraceElement;
                }
                i++;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static StackTraceElement[] b(Class<?> cls, Throwable th, int i) {
        int intValue;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement stackTraceElement;
        if (i <= 0 && i != -1) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("invalid maximum depth: ");
            sb.append(0);
            throw new IllegalArgumentException(sb.toString());
        }
        dcuk dcukVar = a;
        if (dcukVar != null) {
            try {
                intValue = ((Integer) dcukVar.b.invoke(dcukVar.a, th)).intValue();
                stackTraceElementArr = null;
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
        } else {
            stackTraceElementArr = th.getStackTrace();
            intValue = stackTraceElementArr.length;
        }
        boolean z = false;
        for (int i2 = 1; i2 < intValue; i2++) {
            dcuk dcukVar2 = a;
            StackTraceElement b = dcukVar2 != null ? dcukVar2.b(th, i2) : stackTraceElementArr[i2];
            if (cls.getName().equals(b.getClassName())) {
                z = true;
            } else if (z) {
                int i3 = intValue - i2;
                if (i <= 0 || i >= i3) {
                    i = i3;
                }
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
                stackTraceElementArr2[0] = b;
                for (int i4 = 1; i4 < i; i4++) {
                    dcuk dcukVar3 = a;
                    if (dcukVar3 != null) {
                        stackTraceElement = dcukVar3.b(th, i2 + i4);
                    } else {
                        stackTraceElement = stackTraceElementArr[i2 + i4];
                    }
                    stackTraceElementArr2[i4] = stackTraceElement;
                }
                return stackTraceElementArr2;
            }
        }
        return new StackTraceElement[0];
    }
}
