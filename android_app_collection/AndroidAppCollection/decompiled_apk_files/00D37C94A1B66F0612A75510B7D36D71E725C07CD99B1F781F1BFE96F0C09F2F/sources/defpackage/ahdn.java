package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: ahdn  reason: default package */
/* loaded from: classes.dex */
public final class ahdn {
    private final SharedPreferences a;
    private final afvn b;

    public ahdn(SharedPreferences sharedPreferences, afvn afvnVar) {
        this.a = sharedPreferences;
        this.b = afvnVar;
    }

    private static final String d(afvm afvmVar) {
        return zhn.q("%s_uses_offline", afvmVar.d());
    }

    public final synchronized int a() {
        afvm c = this.b.c();
        if (c.z()) {
            return 2;
        }
        String d = d(c);
        if (!this.a.contains(d)) {
            return 0;
        }
        return this.a.getBoolean(d, false) ? 1 : 2;
    }

    public final synchronized void b(boolean z) {
        afvm c = this.b.c();
        if (c.z()) {
            return;
        }
        this.a.edit().putBoolean(d(c), z).apply();
    }

    public final boolean c() {
        return a() != 2;
    }
}
