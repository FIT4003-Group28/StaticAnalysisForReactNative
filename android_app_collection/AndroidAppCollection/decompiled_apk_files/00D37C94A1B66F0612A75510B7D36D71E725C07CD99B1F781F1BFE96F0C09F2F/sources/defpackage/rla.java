package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: rla  reason: default package */
/* loaded from: classes4.dex */
public final class rla {
    final /* synthetic */ rlf a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    public rla(rlf rlfVar, String str, boolean z) {
        this.a = rlfVar;
        qnm.l(str);
        this.b = str;
        this.c = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putBoolean(this.b, z);
        edit.apply();
        this.e = z;
    }

    public final boolean b() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.a().getBoolean(this.b, this.c);
        }
        return this.e;
    }
}
