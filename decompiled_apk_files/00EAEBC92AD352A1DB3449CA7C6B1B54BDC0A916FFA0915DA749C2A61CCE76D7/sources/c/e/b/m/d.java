package c.e.b.m;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f4874b;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4875a;

    private d(Context context) {
        this.f4875a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f4874b == null) {
                f4874b = new d(context);
            }
            dVar = f4874b;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(long j) {
        return a("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(String str, long j) {
        if (!this.f4875a.contains(str)) {
            this.f4875a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f4875a.getLong(str, -1L) < 86400000) {
            return false;
        } else {
            this.f4875a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
