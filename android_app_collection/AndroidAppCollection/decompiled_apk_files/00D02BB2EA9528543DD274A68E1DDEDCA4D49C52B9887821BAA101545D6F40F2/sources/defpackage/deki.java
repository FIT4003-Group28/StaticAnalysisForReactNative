package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: deki  reason: default package */
/* loaded from: classes.dex */
public final class deki {
    public static final dekc a;

    static {
        dekc dekgVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                dekgVar = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new dekf() : new dekg();
            } else {
                dekgVar = new dekh();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = dekg.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            dekgVar = new dekg();
        }
        a = dekgVar;
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void b(Throwable th) {
        a.c(th);
    }

    public static void c(Throwable th, PrintWriter printWriter) {
        a.e(th, printWriter);
    }

    public static void d(Throwable th, PrintStream printStream) {
        a.d(th, printStream);
    }
}
