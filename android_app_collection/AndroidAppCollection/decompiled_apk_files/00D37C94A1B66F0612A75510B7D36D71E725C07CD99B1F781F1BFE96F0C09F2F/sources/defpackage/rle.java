package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: rle  reason: default package */
/* loaded from: classes4.dex */
public final class rle {
    final /* synthetic */ rlf a;
    private final String b;
    private boolean c;
    private String d;

    public rle(rlf rlfVar, String str) {
        this.a = rlfVar;
        qnm.l(str);
        this.b = str;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.a.a().getString(this.b, null);
        }
        return this.d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putString(this.b, str);
        edit.apply();
        this.d = str;
    }
}
