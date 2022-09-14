package defpackage;

import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aery  reason: default package */
/* loaded from: classes2.dex */
final class aery {
    public static final Set<Character> a = new HashSet(Arrays.asList('2', '6', 'a', 'e', 'A', 'E'));
    private PrintStream b;
    private int c;
    private final long d = (System.currentTimeMillis() * 1000000) - System.nanoTime();

    public aery(OutputStream outputStream) {
        try {
            this.b = new PrintStream(new BufferedOutputStream(outputStream), false, "UTF-8");
            e("metadata_log_format", "6 # system and sensor generated timestamps");
            e("metadata_system_time", String.valueOf(System.currentTimeMillis()));
            e("metadata_surveyName", "STP");
            e("metadata_notes", "".replaceAll("[\\n\\r\\f]", " "));
            e("metadata_deviceInfo", "Board: " + Build.BOARD + " Brand: " + Build.BRAND + " Device: " + Build.DEVICE + " Hardware: " + Build.HARDWARE + " Manufacturer: " + Build.MANUFACTURER + " Model: " + Build.MODEL + " Product: " + Build.PRODUCT + " Release: " + Build.VERSION.RELEASE + " Radio version: " + Build.RADIO);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Standard Charset UTF-8 is not supported!", e);
        }
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.toLowerCase(Locale.US).endsWith("_nomap");
    }

    private final void e(String str, String str2) {
        c(d(), i(str), i(str2));
    }

    private final synchronized void f(long j) {
        PrintStream printStream = this.b;
        if (printStream != null) {
            printStream.print(j);
            this.b.print(";");
        }
    }

    private final synchronized void g(String str) {
        PrintStream printStream = this.b;
        if (printStream != null) {
            printStream.print(str);
            this.b.print(";");
        }
    }

    private final synchronized void h() {
        PrintStream printStream = this.b;
        if (printStream != null) {
            printStream.print("\n");
            int i = this.c + 1;
            this.c = i;
            if (i % 100 == 0) {
                this.b.flush();
            }
        }
    }

    private static String i(String str) {
        return str.replaceAll("[;\\n\\r\\f]", " ");
    }

    public final synchronized void a() {
        PrintStream printStream = this.b;
        if (printStream != null) {
            printStream.close();
            this.b = null;
        }
    }

    public final synchronized void c(long j, String str, String str2) {
        if (this.b != null) {
            f(j);
            g(str);
            this.b.print(str2);
            h();
        }
    }

    public final long d() {
        return this.d + System.nanoTime();
    }
}
