package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: rld  reason: default package */
/* loaded from: classes4.dex */
public final class rld {
    final String a;
    public final String b;
    public final String c;
    public final long d;
    final /* synthetic */ rlf e;

    public rld(rlf rlfVar, long j) {
        this.e = rlfVar;
        qnm.l("health_monitor");
        qnm.c(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final long a() {
        return this.e.a().getLong(this.a, 0L);
    }

    public final void b() {
        this.e.n();
        this.e.Q();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.e.a().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }
}
