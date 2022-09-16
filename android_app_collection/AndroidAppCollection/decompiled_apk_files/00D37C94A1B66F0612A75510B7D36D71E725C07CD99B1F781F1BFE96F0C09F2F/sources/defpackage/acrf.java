package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: acrf  reason: default package */
/* loaded from: classes.dex */
public final class acrf implements afvr {
    public final SharedPreferences a;

    public acrf(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    static final String d(afvm afvmVar) {
        String d = afvmVar.d();
        return d.length() != 0 ? "client_event_id_manager_client_count_identity_".concat(d) : new String("client_event_id_manager_client_count_identity_");
    }

    public static final String e(afvm afvmVar) {
        String d = afvmVar.d();
        return d.length() != 0 ? "client_event_id_manager_event_id_for_identity_".concat(d) : new String("client_event_id_manager_event_id_for_identity_");
    }

    private final synchronized void f(afvm afvmVar) {
        if (afvmVar == null) {
            return;
        }
        String d = d(afvmVar);
        if (this.a.contains(d)) {
            this.a.edit().remove(d).apply();
        }
        String e = e(afvmVar);
        if (!this.a.contains(e)) {
            return;
        }
        this.a.edit().remove(e).apply();
    }

    public final synchronized long a(afvm afvmVar) {
        String d = d(afvmVar);
        long j = this.a.getLong(d, -1L);
        if (j == -1) {
            return j;
        }
        long j2 = 1;
        if (j < 65535) {
            j2 = 1 + j;
        }
        this.a.edit().putLong(d, j2).apply();
        return j;
    }

    @Override // defpackage.afvr
    public final void b(afvm afvmVar) {
        f(afvmVar);
    }

    public final synchronized void c(afvm afvmVar) {
        String d = d(afvmVar);
        if (!this.a.contains(d)) {
            this.a.edit().putLong(d, 1L).apply();
        }
    }
}
