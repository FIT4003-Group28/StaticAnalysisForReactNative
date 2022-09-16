package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: lbm  reason: default package */
/* loaded from: classes3.dex */
public final class lbm implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final axnm a;

    public lbm(axnm axnmVar) {
        this.a = axnmVar;
    }

    public static void a(aupg aupgVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editor;
        boolean z = aupgVar.c;
        if (sharedPreferences.getBoolean("enable_on_device_suggest", false) != z) {
            editor = sharedPreferences.edit();
            editor.putBoolean("enable_on_device_suggest", z);
        } else {
            editor = null;
        }
        boolean z2 = aupgVar.e;
        if (sharedPreferences.getBoolean("enable_on_device_suggest_counterfactual_logging", false) != z2) {
            if (editor == null) {
                editor = sharedPreferences.edit();
            }
            editor.putBoolean("enable_on_device_suggest_counterfactual_logging", z2);
        }
        if (z || z2) {
            String str = aupgVar.d;
            if (!sharedPreferences.getString("current_on_device_suggest_index_url", "").equals(str) && !sharedPreferences.getString("latest_on_device_suggest_index_url", "").equals(str)) {
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                editor.putString("latest_on_device_suggest_index_url", str);
            }
        }
        if (editor != null) {
            editor.apply();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.getBoolean("enable_on_device_suggest", false) || sharedPreferences.getBoolean("enable_on_device_suggest_counterfactual_logging", false)) {
            if (!"latest_on_device_suggest_index_url".equals(str) && !"enable_on_device_suggest".equals(str) && !"enable_on_device_suggest_counterfactual_logging".equals(str)) {
                return;
            }
            ((akgv) this.a.get()).a();
        }
    }
}
