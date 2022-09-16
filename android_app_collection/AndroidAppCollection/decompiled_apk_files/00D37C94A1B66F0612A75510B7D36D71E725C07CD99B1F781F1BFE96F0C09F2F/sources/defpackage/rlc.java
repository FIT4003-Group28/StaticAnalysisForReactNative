package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: rlc  reason: default package */
/* loaded from: classes4.dex */
public final class rlc {
    final /* synthetic */ rlf a;
    private final String b;
    private final long c;
    private boolean d;
    private long e;

    public rlc(rlf rlfVar, String str, long j) {
        this.a = rlfVar;
        qnm.l(str);
        this.b = str;
        this.c = j;
    }

    public final long a() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.a().getLong(this.b, this.c);
        }
        return this.e;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putLong(this.b, j);
        edit.apply();
        this.e = j;
    }
}
