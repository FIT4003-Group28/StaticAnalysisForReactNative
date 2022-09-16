package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: kuh  reason: default package */
/* loaded from: classes3.dex */
public final class kuh implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final azqb a;
    private final SharedPreferences b;
    private int c;

    public kuh(SharedPreferences sharedPreferences, azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = -1;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        int i = this.c;
        if (i == -1) {
            int i2 = this.b.getInt("animated_previews_setting", 2);
            this.c = i2;
            return i2;
        }
        return i;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("animated_previews_setting".equals(str)) {
            this.c = this.b.getInt("animated_previews_setting", 2);
        }
    }
}
