package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ljo  reason: default package */
/* loaded from: classes3.dex */
public final class ljo {
    public final yve a;
    public final Activity b;
    public String c;
    public boolean d = true;
    private final yve e;
    private final yve f;
    private final SharedPreferences g;
    private final fvf h;
    private final ayor i;
    private SharedPreferences.OnSharedPreferenceChangeListener j;

    public ljo(Activity activity, aacz aaczVar, yve yveVar, yve yveVar2, yve yveVar3, SharedPreferences sharedPreferences, fvf fvfVar, ayor ayorVar) {
        this.b = activity;
        this.e = yveVar;
        this.a = yveVar2;
        this.f = yveVar3;
        this.g = sharedPreferences;
        this.h = fvfVar;
        this.i = ayorVar;
        if (!eog.az(aaczVar)) {
            return;
        }
        yveVar.d().C(ktg.h).n().G(ayorVar).J(new ljn(this, 1)).Y();
        yveVar3.d().C(ktg.g).n().G(ayorVar).J(new ljn(this)).Y();
        this.c = sharedPreferences.getString(agks.QUALITY, null);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ljk
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                String str2;
                ljo ljoVar = ljo.this;
                if (str.equals(agks.QUALITY) || str.equals(agks.WIFI_POLICY) || str.equals(ymf.UPLOAD_NETWORK_POLICY)) {
                    ljoVar.a();
                }
                if (!str.equals(agks.QUALITY) || (str2 = ljoVar.c) == null) {
                    return;
                }
                ljoVar.a.b(new fct(str2, 10));
                ljoVar.c = sharedPreferences2.getString(agks.QUALITY, null);
            }
        };
        this.j = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        fvg d = fvl.d();
        d.k(this.b.getString(R.string.data_saving_snack_bar_text));
        d.i(-1);
        d.m(this.b.getString(R.string.data_saving_snack_bar_action_button), new View.OnClickListener() { // from class: ljl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity = ljo.this.b;
                activity.startActivity(new Intent().setClassName(activity, etk.e("settings.SettingsActivity")).putExtra(":android:show_fragment", etk.e("settings.datasaving.DataSavingPrefsFragment")).setFlags(335544320));
            }
        });
        this.h.i(d.b());
    }
}
