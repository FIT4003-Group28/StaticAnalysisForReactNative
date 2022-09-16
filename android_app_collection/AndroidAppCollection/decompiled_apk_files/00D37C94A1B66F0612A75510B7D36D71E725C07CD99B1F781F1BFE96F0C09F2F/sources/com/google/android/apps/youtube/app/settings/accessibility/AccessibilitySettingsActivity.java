package com.google.android.apps.youtube.app.settings.accessibility;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.accessibility.AccessibilitySettingsActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilitySettingsActivity extends lih implements bjo, acth {
    public gfu a;
    public acti b;
    boolean c = false;

    @Override // defpackage.bjo
    public final boolean a(Preference preference) {
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            return false;
        }
        if (getSupportFragmentManager().f("PREF_DIALOG") != null) {
            return true;
        }
        lie aL = lie.aL(preference.s);
        aL.aD(getSupportFragmentManager().e(R.id.settings_fragments));
        aL.qv(getSupportFragmentManager(), "PREF_DIALOG");
        return true;
    }

    @Override // defpackage.lih
    public final void b() {
        if (!this.c) {
            super.b();
            this.c = true;
        }
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b();
        if (this.a.a() == gfs.DARK) {
            setTheme(2132083926);
        } else {
            setTheme(2132083925);
            emn.D(this);
        }
        super.onCreate(bundle);
        setContentView(R.layout.single_column_settings_with_toolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().j(true);
            toolbar.q(zag.f(this, 2131233316, R.attr.ytTextPrimary));
            toolbar.r(new View.OnClickListener() { // from class: lia
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessibilitySettingsActivity.this.onBackPressed();
                }
            });
        }
        if (bundle == null) {
            dy i = getSupportFragmentManager().i();
            getClassLoader();
            dp c = i.c(AccessibilityPrefsFragment.class.getName());
            ex l = getSupportFragmentManager().l();
            l.i = 0;
            l.y(R.id.settings_fragments, c);
            l.d();
            setTitle(R.string.accessibility_settings_title);
            eo supportFragmentManager = getSupportFragmentManager();
            lhz lhzVar = new lhz(this);
            if (supportFragmentManager.i == null) {
                supportFragmentManager.i = new ArrayList();
            }
            supportFragmentManager.i.add(lhzVar);
        }
        this.b.d(acuo.a(85013), null, null);
        this.b.n(new acte(actj.ACCESSIBILITY_PLAYER_SETTINGS_TOGGLE_BUTTON));
    }
}
