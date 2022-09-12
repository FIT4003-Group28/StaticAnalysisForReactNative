package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbue  reason: default package */
/* loaded from: classes5.dex */
public final class dbue {
    private static final Object a;

    static {
        Object h = h();
        a = h;
        if (h != null) {
            i("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (h == null) {
            return;
        }
        j();
    }

    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (!cls.isInstance(th)) {
            return;
        }
        throw cls.cast(th);
    }

    public static void b(Throwable th) {
        dbsk.s(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static <X extends Throwable> void c(Throwable th, Class<X> cls) {
        a(th, cls);
        b(th);
    }

    @Deprecated
    public static RuntimeException d(Throwable th) {
        b(th);
        throw new RuntimeException(th);
    }

    public static Throwable e(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause != null) {
                if (cause == th2) {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                return th;
            }
        }
    }

    public static List<Throwable> f(Throwable th) {
        dbsk.s(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th != null) {
                arrayList.add(th);
                if (th == th2) {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th);
                }
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        deki.c(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object h() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method i(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void j() {
        try {
            Method i = i("getStackTraceDepth", Throwable.class);
            if (i == null) {
                return;
            }
            i.invoke(h(), new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
