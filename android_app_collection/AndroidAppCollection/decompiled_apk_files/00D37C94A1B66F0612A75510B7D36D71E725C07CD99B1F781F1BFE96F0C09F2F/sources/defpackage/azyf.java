package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: azyf  reason: default package */
/* loaded from: classes2.dex */
public final class azyf {
    private static final String a;

    static {
        Object p;
        Object p2;
        try {
            p = Class.forName("azrg").getCanonicalName();
        } catch (Throwable th) {
            p = azqj.p(th);
        }
        if (azqh.a(p) != null) {
            p = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) p;
        try {
            p2 = Class.forName("azyf").getCanonicalName();
        } catch (Throwable th2) {
            p2 = azqj.p(th2);
        }
        if (azqh.a(p2) != null) {
            p2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) p2;
    }

    public static final Throwable a(Throwable th, azrj azrjVar) {
        azqf o;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && azst.c(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (c(stackTrace[i2])) {
                        o = azqj.o(cause, stackTrace);
                        break;
                    }
                    i2++;
                } else {
                    o = azqj.o(th, new StackTraceElement[0]);
                    break;
                }
            }
        } else {
            o = azqj.o(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) o.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) o.b;
        Throwable a2 = azxs.a(th2);
        if (a2 == null || (!(th2 instanceof azuo) && !azst.c(a2.getMessage(), th2.getMessage()))) {
            a2 = null;
        }
        if (a2 == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = azrjVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (true != (azrjVar instanceof azrj)) {
                azrjVar = null;
            }
            azrjVar = azrjVar == null ? null : azrjVar.getCallerFrame();
            if (azrjVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = azrjVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                } else if (c(stackTraceElementArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    int i5 = length3 - 1;
                    StackTraceElement stackTraceElement3 = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && azst.c(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && azst.c(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && azst.c(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3 = i5;
                }
            }
        }
        arrayDeque.addFirst(new StackTraceElement(azst.a("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1));
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        String str = a;
        int length4 = stackTrace2.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length4) {
                i6 = -1;
                break;
            } else if (azst.c(str, stackTrace2[i6].getClassName())) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            a2.setStackTrace((StackTraceElement[]) array);
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + i6];
            if (i6 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    stackTraceElementArr2[i7] = stackTrace2[i7];
                    if (i8 >= i6) {
                        break;
                    }
                    i7 = i8;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + i6] = (StackTraceElement) it.next();
                i++;
            }
            a2.setStackTrace(stackTraceElementArr2);
        }
        return a2;
    }

    public static final Throwable b(Throwable th) {
        th.getClass();
        Throwable cause = th.getCause();
        if (cause != null && azst.c(cause.getClass(), th.getClass())) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (c(stackTraceElement)) {
                    return cause;
                }
            }
        }
        return th;
    }

    public static final boolean c(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        return className.startsWith("\b\b\b");
    }
}
