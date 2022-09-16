package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: tvh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvh implements ampg {
    public final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ int b;

    public /* synthetic */ tvh(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public /* synthetic */ tvh(SharedPreferences sharedPreferences, int i) {
        this.b = i;
        this.a = sharedPreferences;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            SharedPreferences sharedPreferences = this.a;
            Void r4 = (Void) obj;
            boolean z = tvs.a;
            sharedPreferences.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
            return null;
        }
        this.a.edit().putString(agks.QUALITY, ((ljp) obj).d).apply();
        return null;
    }
}
