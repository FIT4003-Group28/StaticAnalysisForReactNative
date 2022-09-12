package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: czuf  reason: default package */
/* loaded from: classes5.dex */
public final class czuf {
    public static final Level a = Level.ALL;
    private static final String b = "logw";
    private static Logger c;

    public static void a(String str, Object... objArr) {
        if (c(Level.INFO)) {
            e().logp(Level.INFO, "com.google.android.libraries.view.utils.LogWrapper", "i", d(str, objArr));
        }
    }

    public static void b(String str, Throwable th, Object... objArr) {
        if (c(Level.SEVERE)) {
            e().logp(Level.SEVERE, "com.google.android.libraries.view.utils.LogWrapper", "e", d(str, objArr), th);
        }
    }

    public static boolean c(Level level) {
        return a.intValue() <= level.intValue();
    }

    public static String d(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" ");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb.toString();
    }

    private static synchronized Logger e() {
        Logger logger;
        synchronized (czuf.class) {
            if (c == null) {
                c = Logger.getLogger(b);
            }
            logger = c;
        }
        return logger;
    }
}
