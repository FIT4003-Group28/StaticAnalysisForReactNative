package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: derg  reason: default package */
/* loaded from: classes6.dex */
final class derg {
    private static derg a;
    private final SharedPreferences b;

    private derg(Context context) {
        this.b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized derg a(Context context) {
        derg dergVar;
        synchronized (derg.class) {
            if (a == null) {
                a = new derg(context);
            }
            dergVar = a;
        }
        return dergVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(String str, long j) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(long j) {
        return b("fire-global", j);
    }
}
