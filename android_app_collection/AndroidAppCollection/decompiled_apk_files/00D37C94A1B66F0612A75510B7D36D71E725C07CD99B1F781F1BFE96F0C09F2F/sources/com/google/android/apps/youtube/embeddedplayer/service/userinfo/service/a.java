package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements afzu, aaqx {
    private final SharedPreferences a;
    private final String b;

    public a(SharedPreferences sharedPreferences, f fVar) {
        zgh.m(fVar.a);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = String.format("%s_%s", "visitor_id", fVar.a);
    }

    @Override // defpackage.afxq
    public final aswe a() {
        return aswe.VISITOR_ID;
    }

    @Override // defpackage.afxq
    public final void b(Map map, afye afyeVar) {
        String string = this.a.getString(this.b, null);
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }

    @Override // defpackage.aaqx
    public final void c(arpa arpaVar) {
        if (!TextUtils.isEmpty(arpaVar.c)) {
            if (arpaVar.c.equals(this.a.getString(this.b, null))) {
                return;
            }
            this.a.edit().putString(this.b, arpaVar.c).apply();
        }
    }

    @Override // defpackage.afxq
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aaqx
    public final /* synthetic */ boolean e(aaqs aaqsVar) {
        return true;
    }
}
