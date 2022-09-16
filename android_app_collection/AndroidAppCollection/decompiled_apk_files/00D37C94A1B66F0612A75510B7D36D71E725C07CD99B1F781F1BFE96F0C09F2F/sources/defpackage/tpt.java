package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: tpt  reason: default package */
/* loaded from: classes4.dex */
public final class tpt extends Exception {
    public final amuk a;

    private tpt(String str, Throwable th, amuk amukVar) {
        super(str, th);
        this.a = amukVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? a(cause) : th;
    }

    public static void b(Collection collection, Object... objArr) {
        Iterator it = collection.iterator();
        amuf amufVar = null;
        while (it.hasNext()) {
            try {
                anlz.y((ankt) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (amufVar == null) {
                    amufVar = amuk.f();
                }
                amufVar.h(a(e));
            }
        }
        if (amufVar == null) {
            return;
        }
        amuk g = amufVar.g();
        String format = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i = ((amxx) g).c;
        if (i > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 34);
            sb.append(format);
            sb.append("\n");
            sb.append(i);
            sb.append(" failure(s) in total:\n");
            String sb2 = sb.toString();
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                if (sb2 != null) {
                    try {
                        printWriter.println(sb2);
                    } catch (Throwable th) {
                        try {
                            printWriter.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
                int i2 = 0;
                while (i2 < ((amxx) g).c) {
                    i2++;
                    printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                    printWriter.println(c((Throwable) g.get(i2), 1));
                }
                printWriter.println("-------------------------------------------");
                format = stringWriter.toString();
                printWriter.close();
                stringWriter.close();
            } catch (Throwable th2) {
                String valueOf = String.valueOf(th2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb3.append("Failed to build string from throwables: ");
                sb3.append(valueOf);
                format = sb3.toString();
            }
        }
        throw new tpt(format, (Throwable) g.get(0), g);
    }

    private static String c(Throwable th, int i) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
        sb.append(name);
        sb.append(": ");
        sb.append(message);
        String sb2 = sb.toString();
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i >= 5) {
                return String.valueOf(sb2).concat("\n(...)");
            }
            String c = c(cause, i + 1);
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12 + String.valueOf(c).length());
            sb3.append(sb2);
            sb3.append("\nCaused by: ");
            sb3.append(c);
            return sb3.toString();
        }
        return sb2;
    }
}
