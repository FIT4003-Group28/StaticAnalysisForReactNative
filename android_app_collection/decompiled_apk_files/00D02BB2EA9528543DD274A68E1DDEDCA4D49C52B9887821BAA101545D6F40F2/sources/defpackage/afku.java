package defpackage;

import android.content.Intent;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afku  reason: default package */
/* loaded from: classes.dex */
public final class afku {
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern b = Pattern.compile("^https?://(maps|local|ditu)\\.google\\..+", 2);
    private static final Pattern c = Pattern.compile("^https?://www\\.google\\.[^/]+/maps(\\?|/(preview/)?(search|dir|place|@)).+", 2);
    public static final Pattern a = Pattern.compile("^https?://goo\\.gl/maps/.+", 2);

    static {
        Pattern.compile("^https?://maps\\.app\\.goo\\.gl/.+", 2);
        d = Pattern.compile("^https?://www\\.google\\.[^/]+/maps/d.+", 2);
        e = Pattern.compile("^https?://mapsengine\\.google\\.com/map/.+", 2);
    }

    public static boolean a(@dzsi String str, btvv btvvVar) {
        if (str != null) {
            for (Pattern pattern : btvvVar.a) {
                if (pattern.matcher(str).find()) {
                    return false;
                }
            }
            return b(str);
        }
        return false;
    }

    public static boolean b(@dzsi String str) {
        if (str == null) {
            return false;
        }
        return c.matcher(str).matches() || d(str) || d.matcher(str).matches() || e.matcher(str).matches();
    }

    public static boolean c(String str) {
        return str != null && b.matcher(str).matches();
    }

    public static boolean d(String str) {
        return !dbsj.d(str) && a.matcher(str).matches();
    }

    public static void e(Intent intent, duqi duqiVar) {
        intent.putExtra("action", duqiVar.M);
    }

    @dzsi
    public static duqi f(Intent intent) {
        if (!intent.hasExtra("action")) {
            return null;
        }
        return duqi.b(intent.getIntExtra("action", 0));
    }

    public static void g(Intent intent, int i) {
        intent.putExtra("original_notification_id", i);
    }

    @dzsi
    public static Integer h(Intent intent) {
        if (!intent.hasExtra("original_notification_id")) {
            return null;
        }
        return Integer.valueOf(intent.getIntExtra("original_notification_id", 0));
    }
}
