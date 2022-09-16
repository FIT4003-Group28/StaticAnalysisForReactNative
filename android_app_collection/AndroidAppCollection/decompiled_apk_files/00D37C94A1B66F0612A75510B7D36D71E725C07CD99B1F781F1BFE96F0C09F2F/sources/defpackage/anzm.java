package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: anzm  reason: default package */
/* loaded from: classes.dex */
final class anzm {
    private static anzm a;
    private final SharedPreferences b;

    private anzm(Context context) {
        this.b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized anzm a(Context context) {
        anzm anzmVar;
        synchronized (anzm.class) {
            if (a == null) {
                a = new anzm(context);
            }
            anzmVar = a;
        }
        return anzmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(String str, long j) {
        if (this.b.contains(str)) {
            if (j - this.b.getLong(str, -1L) < 86400000) {
                return false;
            }
            this.b.edit().putLong(str, j).apply();
            return true;
        }
        this.b.edit().putLong(str, j).apply();
        return true;
    }
}
