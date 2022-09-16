package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.IntListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AutoplayPrefsFragment extends lfh implements SharedPreferences.OnSharedPreferenceChangeListener {
    public aadd ae;
    public SettingsDataAccess af;
    private aypg ag;
    public SharedPreferences c;
    public acth d;
    public akjl e;

    @Override // defpackage.dp
    public final void U() {
        this.c.unregisterOnSharedPreferenceChangeListener(this);
        azof.f((AtomicReference) this.ag);
        super.U();
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        this.ag = this.af.g(new Runnable() { // from class: lex
            @Override // java.lang.Runnable
            public final void run() {
                aurh o;
                arag aragVar;
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference;
                arag aragVar2;
                arag aragVar3;
                AutoplayPrefsFragment autoplayPrefsFragment = AutoplayPrefsFragment.this;
                if (autoplayPrefsFragment.ap() && (o = autoplayPrefsFragment.af.o(10058)) != null) {
                    dt mJ = autoplayPrefsFragment.mJ();
                    if ((o.b & 1) != 0) {
                        aragVar = o.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    mJ.setTitle(ajgl.b(aragVar));
                    PreferenceScreen e = autoplayPrefsFragment.a.e(autoplayPrefsFragment.mJ());
                    for (auri auriVar : o.d) {
                        aoqu b = aaly.b(auriVar);
                        ausi b2 = akjl.b(b);
                        if (b2 == ausi.AUTONAV) {
                            if (!(b instanceof aurg)) {
                                protoDataStoreSwitchPreference = null;
                            } else {
                                aurg aurgVar = (aurg) b;
                                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = new ProtoDataStoreSwitchPreference(autoplayPrefsFragment.mJ());
                                protoDataStoreSwitchPreference2.I(ahfn.AUTONAV);
                                if ((aurgVar.b & 16) != 0) {
                                    aragVar2 = aurgVar.d;
                                    if (aragVar2 == null) {
                                        aragVar2 = arag.a;
                                    }
                                } else {
                                    aragVar2 = null;
                                }
                                protoDataStoreSwitchPreference2.M(ajgl.b(aragVar2));
                                if ((aurgVar.b & 32) != 0) {
                                    aragVar3 = aurgVar.e;
                                    if (aragVar3 == null) {
                                        aragVar3 = arag.a;
                                    }
                                } else {
                                    aragVar3 = null;
                                }
                                protoDataStoreSwitchPreference2.n(ajgl.b(aragVar3));
                                protoDataStoreSwitchPreference = protoDataStoreSwitchPreference2;
                            }
                        } else if (b2 == ausi.INLINE_MUTED) {
                            IntListPreference intListPreference = new IntListPreference(autoplayPrefsFragment.mJ());
                            lfu.a(autoplayPrefsFragment.ae, intListPreference, b);
                            protoDataStoreSwitchPreference = intListPreference;
                        } else {
                            protoDataStoreSwitchPreference = autoplayPrefsFragment.e.a(auriVar, "");
                        }
                        if (protoDataStoreSwitchPreference != null) {
                            protoDataStoreSwitchPreference.Z();
                            e.ae(protoDataStoreSwitchPreference);
                        }
                    }
                    autoplayPrefsFragment.aE(e);
                }
            }
        });
    }

    @Override // defpackage.bjr
    public final void aG() {
        this.a.g("youtube");
        this.c.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("inline_global_play_pause".equals(str)) {
            lfu.d(this.c, this.d);
        }
    }
}
