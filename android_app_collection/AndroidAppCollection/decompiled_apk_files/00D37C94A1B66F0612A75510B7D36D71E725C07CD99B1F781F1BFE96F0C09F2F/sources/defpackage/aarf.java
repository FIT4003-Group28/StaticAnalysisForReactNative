package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aarf  reason: default package */
/* loaded from: classes.dex */
public final class aarf implements aaqx {
    private final SharedPreferences a;
    private final afvn b;

    public aarf(SharedPreferences sharedPreferences, afvn afvnVar) {
        this.a = sharedPreferences;
        this.b = afvnVar;
    }

    @Override // defpackage.aaqx
    public final void c(arpa arpaVar) {
        if ((arpaVar.b & 2) == 0 || TextUtils.isEmpty(arpaVar.c)) {
            return;
        }
        String str = arpaVar.c;
        if (this.b.c().g()) {
            if (str.equals(this.a.getString("incognito_visitor_id", null))) {
                return;
            }
            this.a.edit().putString("incognito_visitor_id", str).apply();
        } else if (str.equals(this.a.getString("visitor_id", null))) {
        } else {
            this.a.edit().putString("visitor_id", str).apply();
        }
    }

    @Override // defpackage.aaqx
    public final boolean e(aaqs aaqsVar) {
        if (!aaqsVar.m()) {
            return !aaqsVar.m.equals("visitor_id") || this.b.c().g();
        }
        return false;
    }
}
