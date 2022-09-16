package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.apps.youtube.app.bedtime.BedtimeReminderPreference;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GeneralPrefsFragment extends lfj implements SharedPreferences.OnSharedPreferenceChangeListener, bjf, bjg {
    public aadd ae;
    public ces af;
    public lgm ag;
    public gdh ah;
    public acth ai;
    public gfu aj;
    public lht ak;
    public yve al;
    public akjl am;
    public SettingsDataAccess an;
    public ehh ao;
    public azqb ap;
    public Handler aq;
    public aacz ar;
    public acgf as;
    private aypg at;
    public yrj c;
    public SharedPreferences d;
    public agcp e;

    private final void aL(CharSequence charSequence) {
        Preference ov = ov(charSequence);
        if (ov != null) {
            o().af(ov);
        }
    }

    @Override // defpackage.dp
    public final void U() {
        this.d.unregisterOnSharedPreferenceChangeListener(this);
        aypg aypgVar = this.at;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.at = null;
        }
        super.U();
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        this.at = this.an.g(new Runnable() { // from class: lfe
            @Override // java.lang.Runnable
            public final void run() {
                GeneralPrefsFragment.this.aI();
            }
        });
    }

    @Override // defpackage.bjf
    public final boolean a(Preference preference, Object obj) {
        if (preference.s.equals("voice_language")) {
            this.ai.oi().H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SELECTION), null);
            return true;
        }
        return true;
    }

    @Override // defpackage.bjr
    public final void aG() {
        this.a.g("youtube");
        p(R.xml.general_prefs);
        this.d.registerOnSharedPreferenceChangeListener(this);
        if (!eog.bb(this.ar)) {
            aL("watch_break_frequency_picker_preference");
        }
        if (!this.ao.i()) {
            aL("bedtime_reminder_toggle");
        }
        if (this.aj.e()) {
            aL("app_theme_dark");
            ProtoDataStoreListPreference protoDataStoreListPreference = (ProtoDataStoreListPreference) ov("app_theme_appearance");
            if (protoDataStoreListPreference != null) {
                protoDataStoreListPreference.G = new lfa(this, 3);
            }
        } else {
            aL("app_theme_appearance");
            ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ov("app_theme_dark");
            if (protoDataStoreSwitchPreference != null) {
                protoDataStoreSwitchPreference.c = new lfa(this);
            }
        }
        if (!this.c.n() || eog.J(this.ae)) {
            aL(aeas.LIMIT_MOBILE_DATA_USAGE);
        }
        if (!eog.O(this.c, this.ae)) {
            aL(ymf.UPLOAD_NETWORK_POLICY);
        }
        mJ().setTitle(N(R.string.pref_general_category));
        this.a.d = this;
        if (this.an.n()) {
            aI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
        if ((java.lang.Math.max(r9, r6) / java.lang.Math.min(r9, r6)) >= r8.a) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aI() {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.GeneralPrefsFragment.aI():void");
    }

    @Override // defpackage.bjg
    public final boolean b(Preference preference) {
        if (preference.s.equals("voice_language")) {
            this.ai.oi().H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SETTING_ENTRY_POINT), null);
            this.ai.oi().n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SELECTION));
            return true;
        }
        return true;
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mS() {
        arag aragVar;
        aurg aurgVar;
        super.mS();
        SettingsDataAccess settingsDataAccess = this.an;
        ausi ausiVar = ausi.SAFETY_MODE;
        Iterator it = settingsDataAccess.i().iterator();
        loop0: while (true) {
            aragVar = null;
            if (!it.hasNext()) {
                aurgVar = null;
                break;
            }
            Object next = it.next();
            if (next instanceof aurh) {
                for (auri auriVar : ((aurh) next).d) {
                    aurgVar = auriVar.e;
                    if (aurgVar == null) {
                        aurgVar = aurg.a;
                    }
                    if (akjl.b(aurgVar) == ausiVar) {
                        break loop0;
                    }
                }
                continue;
            }
        }
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ov("innertube_safety_mode_enabled");
        boolean z = true;
        if (protoDataStoreSwitchPreference != null) {
            if (aurgVar != null) {
                if ((aurgVar.b & 16) != 0) {
                    arag aragVar2 = aurgVar.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    protoDataStoreSwitchPreference.M(ajgl.b(aragVar2));
                }
                if ((aurgVar.b & 32) != 0) {
                    arag aragVar3 = aurgVar.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    protoDataStoreSwitchPreference.n(ajgl.b(aragVar3));
                }
                protoDataStoreSwitchPreference.c = new lfa(this, 1);
            } else {
                aL("innertube_safety_mode_enabled");
            }
        }
        if (aurgVar == null || !aurgVar.g) {
            aL("innertube_managed_restricted_mode");
        } else {
            SwitchPreference switchPreference = (SwitchPreference) ov("innertube_managed_restricted_mode");
            if (switchPreference != null) {
                if ((aurgVar.b & 4096) != 0 && (aragVar = aurgVar.k) == null) {
                    aragVar = arag.a;
                }
                switchPreference.n(ajgl.b(aragVar));
                if ((aurgVar.b & 64) != 0) {
                    z = aurgVar.f;
                }
                switchPreference.k(z);
                aL("innertube_safety_mode_enabled");
            }
        }
        boolean c = this.ag.c();
        int b = this.ah.b();
        if (b != 2 ? b == 3 : c) {
            ylx.n(this, this.ah.a(), lcz.k, new zdt() { // from class: lfb
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2;
                    GeneralPrefsFragment generalPrefsFragment = GeneralPrefsFragment.this;
                    if (((gdg) obj) != gdg.SYSTEM_DISABLED || (protoDataStoreSwitchPreference2 = (ProtoDataStoreSwitchPreference) generalPrefsFragment.ov(etk.PIP_POLICY)) == null) {
                        return;
                    }
                    protoDataStoreSwitchPreference2.w = false;
                    protoDataStoreSwitchPreference2.G(false);
                    protoDataStoreSwitchPreference2.k(false);
                }
            });
        } else {
            aL(etk.PIP_POLICY);
        }
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("video_notifications_enabled".equals(str)) {
            agel.b(this.e);
        }
    }

    @Override // defpackage.bjr, defpackage.bjy
    public final void r(Preference preference) {
        if (preference instanceof BedtimeReminderPreference) {
            return;
        }
        if (preference instanceof WatchBreakFrequencyPickerPreference) {
            String str = preference.s;
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            onq onqVar = new onq();
            onqVar.ae(bundle);
            onqVar.aD(this);
            onqVar.qv(F(), onq.class.getName());
            return;
        }
        super.r(preference);
    }
}
