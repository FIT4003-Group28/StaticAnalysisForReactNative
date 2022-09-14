package defpackage;

import android.os.PersistableBundle;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: avjz  reason: default package */
/* loaded from: classes3.dex */
public final class avjz {
    public static PersistableBundle a(avjy avjyVar) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("options", Base64.encodeToString(avjyVar.bS(), 3));
        return persistableBundle;
    }

    public static void b(@dzsi String str, avjr avjrVar) {
        if (str != null) {
            try {
                avjrVar.bx(Base64.decode(str, 0), dsqa.b());
            } catch (dsrm | IllegalArgumentException unused) {
            }
        }
    }

    public static boolean c(int i) {
        return i == 1;
    }

    public static avjx d(int i) {
        return (avjx) h(avjx.b(i), avjx.UNKNOWN_TIME_BUDGET);
    }

    public static avjt e(int i) {
        return (avjt) h(avjt.b(i), avjt.UNKNOWN_INTERVAL_CHECK);
    }

    public static avjv f(int i) {
        return (avjv) h(avjv.b(i), avjv.UNKNOWN_SCREEN_CHECK);
    }

    public static avjq g(int i) {
        return (avjq) h(avjq.b(i), avjq.UNKNOWN_BATTERY_CHECK);
    }

    private static <T> T h(@dzsi T t, T t2) {
        return t != null ? t : t2;
    }
}
