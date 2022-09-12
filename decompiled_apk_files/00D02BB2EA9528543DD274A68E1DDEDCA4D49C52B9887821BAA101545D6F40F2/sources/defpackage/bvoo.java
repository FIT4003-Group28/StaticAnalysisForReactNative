package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvoo  reason: default package */
/* loaded from: classes.dex */
public final class bvoo {
    public static btsg a;
    private static volatile int b;

    static {
        TimeUnit.MILLISECONDS.toNanos(1L);
    }

    static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error formatting log message: ");
            sb.append(str);
            sb.append(": [");
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append(a(obj));
                    sb.append(", ");
                }
            }
            sb.append("]: ");
            sb.append(a(e));
            return sb.toString();
        }
    }

    static void c(Throwable th) {
        btsg btsgVar;
        int i = b + 1;
        b = i;
        if (i <= 10 && (btsgVar = a) != null) {
            ((btsc) btsgVar).a(th, "NON_FATAL_EXCEPTION", false, false);
        }
    }

    public static void d(Throwable th) {
        th.getMessage();
        c(th);
    }

    public static void e() {
        dcqe.b.v(dcqz.FULL);
        dcqe.b.v(dcqz.FULL);
        dcqe.b.v(dcqz.FULL);
        dcqe.b.v(dcqz.FULL);
        dcqe.b.v(dcqz.FULL);
    }

    public static <T extends Throwable> void f(T t) {
        c(t);
    }

    public static void g(Throwable th) {
        btsg btsgVar = a;
        if (btsgVar != null) {
            btsc btscVar = (btsc) btsgVar;
            btscVar.b.a().getSystemHealthParameters();
            btscVar.a(th, "CRASH_REPORT", true, true);
        }
    }

    public static void h(String str, Object... objArr) {
        i(new bvon(str, objArr));
    }

    public static <T extends Throwable> void i(T t) {
        c(t);
    }

    public static void j(Throwable th) {
        c(th);
    }

    public static void k(Throwable th) {
        c(th);
    }
}
