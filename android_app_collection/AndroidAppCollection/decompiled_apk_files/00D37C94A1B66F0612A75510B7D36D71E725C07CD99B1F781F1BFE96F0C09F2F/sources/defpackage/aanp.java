package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aanp  reason: default package */
/* loaded from: classes.dex */
public final class aanp {
    private static final zer b = new aann();
    public static final zer a = new aano();

    public static String a(String str) {
        Matcher matcher = ((Pattern) b.get()).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String b(String str) {
        return str.split(";", 2)[0];
    }

    public static boolean c(String str) {
        return str.startsWith("audio");
    }

    public static boolean d(String str) {
        return str.startsWith("video");
    }

    public static boolean e(String str) {
        return b(str).endsWith("webm");
    }
}
