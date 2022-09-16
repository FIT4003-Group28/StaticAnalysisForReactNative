package com.google.android.apps.youtube.app.settings.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.accessibility.AccessibilityPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityPrefsFragment extends lif implements AccessibilityManager.AccessibilityStateChangeListener {
    private ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreListPreference c;
    public kjo d;
    public acth e;

    private final void aK() {
        this.ae.ae(Boolean.valueOf(this.d.c()));
        ankt ad = this.ae.ad();
        lcz lczVar = lcz.p;
        final ProtoDataStoreListPreference protoDataStoreListPreference = this.c;
        protoDataStoreListPreference.getClass();
        ylx.n(this, ad, lczVar, new zdt() { // from class: lhy
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ProtoDataStoreListPreference.this.G(((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // defpackage.bjr
    public final void aG() {
        mJ().setTitle(R.string.accessibility_settings_title);
        this.e.oi().d(acuo.a(85013), null, null);
        this.e.oi().n(new acte(actj.ACCESSIBILITY_PLAYER_SETTINGS_TOGGLE_BUTTON));
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.a.g("youtube");
        p(R.xml.accessibility_prefs);
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ov("accessibility_player_setting_key");
        protoDataStoreSwitchPreference.getClass();
        this.ae = protoDataStoreSwitchPreference;
        ProtoDataStoreListPreference protoDataStoreListPreference = (ProtoDataStoreListPreference) ov("accessibility_hide_player_controls_setting_key");
        protoDataStoreListPreference.getClass();
        this.c = protoDataStoreListPreference;
        this.ae.c = new lhx(this, 1);
        this.c.o = new bjg() { // from class: lhw
            @Override // defpackage.bjg
            public final boolean b(Preference preference) {
                AccessibilityPrefsFragment.this.e.oi().n(new acte(actj.ACCESSIBILITY_SETTINGS_CONTROLS_TIMEOUT_DIALOG));
                return true;
            }
        };
        this.c.G = new lhx(this);
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mS() {
        super.mS();
        zdg.g(rb(), this);
        aK();
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        zdg.h(rb(), this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        aK();
    }
}
