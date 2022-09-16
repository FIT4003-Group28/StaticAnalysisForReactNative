package defpackage;

import android.content.SharedPreferences;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vlq  reason: default package */
/* loaded from: classes4.dex */
public final class vlq {
    public final SharedPreferences a;
    private final Set b;

    public vlq(SharedPreferences sharedPreferences, Set set) {
        this.a = sharedPreferences;
        this.b = set;
    }

    public final int a(String str, int i) {
        SharedPreferences sharedPreferences = this.a;
        g(str);
        return sharedPreferences.getInt(str, i);
    }

    public final long b(String str, long j) {
        SharedPreferences sharedPreferences = this.a;
        g(str);
        return sharedPreferences.getLong(str, j);
    }

    public final amup c() {
        aqxo.q(this.b == null, "SharedPreferencesView#getAll() not available on key migration");
        return amup.j(this.a.getAll());
    }

    public final String d(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        g(str);
        return sharedPreferences.getString(str, str2);
    }

    public final boolean e(String str) {
        SharedPreferences sharedPreferences = this.a;
        g(str);
        return sharedPreferences.contains(str);
    }

    public final boolean f(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        g(str);
        return sharedPreferences.getBoolean(str, z);
    }

    public final void g(String str) {
        Set set = this.b;
        if (set != null) {
            aqxo.u(set.contains(str), "Can't access key outside migration: %s", str);
        }
    }
}
