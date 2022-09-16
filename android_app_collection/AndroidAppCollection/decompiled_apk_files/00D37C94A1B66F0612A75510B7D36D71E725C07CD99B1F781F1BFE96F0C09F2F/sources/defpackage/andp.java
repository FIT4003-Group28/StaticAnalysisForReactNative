package defpackage;
/* compiled from: PG */
/* renamed from: andp  reason: default package */
/* loaded from: classes.dex */
public final class andp {
    private static final String[] a;
    private static final ands b;

    static {
        ands andtVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        a = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                andtVar = new andt();
                break;
            }
            try {
                andtVar = (ands) Class.forName(strArr[i]).asSubclass(ands.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                andtVar = null;
            }
            if (andtVar != null) {
                break;
            }
            i++;
        }
        b = andtVar;
    }

    public static StackTraceElement a(Class cls) {
        anha.c(cls, "target");
        return b.a(cls);
    }

    public static StackTraceElement[] b(Class cls, int i) {
        if (i > 0 || i == -1) {
            return b.b(cls, i);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
