package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: ljb  reason: default package */
/* loaded from: classes3.dex */
public final class ljb implements zbu {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ yve b;

    public ljb(SharedPreferences sharedPreferences, yve yveVar) {
        this.a = sharedPreferences;
        this.b = yveVar;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        boolean z = this.a.getBoolean(agks.WIFI_POLICY, false);
        return anii.h(this.b.b(new ehf(z, 14)), new ehf(z, 15), anjk.a);
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.edit().putBoolean(agks.WIFI_POLICY, bool.booleanValue()).apply();
        return this.b.b(new liw(bool, 3));
    }
}
