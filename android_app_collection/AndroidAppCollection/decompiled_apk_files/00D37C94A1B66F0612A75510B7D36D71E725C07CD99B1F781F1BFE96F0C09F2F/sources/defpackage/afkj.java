package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afkj  reason: default package */
/* loaded from: classes.dex */
public final class afkj {
    public static final Map a = new EnumMap(afki.class);

    static {
        afki[] values;
        for (afki afkiVar : afki.values()) {
            a.put(afkiVar, anay.n(afkiVar.p));
        }
    }

    public static void a(afki afkiVar, Object obj) {
        b(afkiVar, "%s", obj);
    }

    public static void b(afki afkiVar, String str, Object... objArr) {
        ((anav) ((anav) ((anay) a.get(afkiVar)).f()).i("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 159, "MediaLog.java")).w(str, objArr);
    }

    public static void c(afki afkiVar, Throwable th, String str, Object... objArr) {
        ((anav) ((anav) ((anav) ((anay) a.get(afkiVar)).f()).h(th)).i("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 153, "MediaLog.java")).w(str, objArr);
    }

    public static void d(afki afkiVar, Object obj) {
        e(afkiVar, "%s", obj);
    }

    public static void e(afki afkiVar, String str, Object... objArr) {
        ((anav) ((anav) ((anay) a.get(afkiVar)).g()).i("com/google/android/libraries/youtube/media/utils/MediaLog", "w", 130, "MediaLog.java")).w(str, objArr);
    }

    public static afki f() {
        return afki.MEDIAFETCH;
    }

    public static void g(amzz amzzVar) {
        anha.c(amzzVar, "lazy arg");
    }
}
