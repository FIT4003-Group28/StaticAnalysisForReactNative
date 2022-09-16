package com.google.android.apps.youtube.app.settings.datasaving;

import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceCategory;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataSavingPrefsFragment extends ljq {
    public ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreSwitchPreference af;
    public ProtoDataStoreSwitchPreference ag;
    public yrj ah;
    public aadd ai;
    public lgm aj;
    public SettingsDataAccess ak;
    public yve al;
    public ayor am;
    public acti an;
    public axxg ao;
    private PreferenceCategory ap;
    private aypg aq;
    private aypg ar;
    public ProtoDataStoreSwitchPreference c;
    public ProtoDataStoreSwitchPreference d;
    public ProtoDataStoreSwitchPreference e;

    private final ProtoDataStoreSwitchPreference aL(CharSequence charSequence) {
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ov(charSequence);
        protoDataStoreSwitchPreference.getClass();
        return protoDataStoreSwitchPreference;
    }

    @Override // defpackage.dp
    public final void U() {
        aypg aypgVar = this.aq;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
        aypg aypgVar2 = this.ar;
        if (aypgVar2 != null) {
            azof.f((AtomicReference) aypgVar2);
        }
        this.an.t();
        super.U();
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        this.aq = this.ak.g(new Runnable() { // from class: ljj
            @Override // java.lang.Runnable
            public final void run() {
                DataSavingPrefsFragment dataSavingPrefsFragment = DataSavingPrefsFragment.this;
                if (!dataSavingPrefsFragment.ap()) {
                    return;
                }
                dataSavingPrefsFragment.aI();
            }
        });
        this.an.d(acuo.a(133798), null, null);
    }

    @Override // defpackage.bjr
    public final void aG() {
        p(R.xml.data_saving_prefs);
        dt mJ = mJ();
        if (mJ == null) {
            return;
        }
        mJ.setTitle(N(R.string.data_saving_persistent_title));
        this.c = aL("data_saving_mode_key");
        this.d = aL("data_saving_pref_video_quality_key");
        this.e = aL("data_saving_pref_download_quality_key");
        this.ae = aL("data_saving_pref_download_wifi_only_key");
        this.af = aL("data_saving_pref_upload_wifi_only_key");
        this.ag = aL("data_saving_imp_wifi_only_key");
        PreferenceCategory preferenceCategory = (PreferenceCategory) ov("data_saving_monitoring_and_control_category");
        preferenceCategory.getClass();
        this.ap = preferenceCategory;
        aI();
        this.c.o = new ljh(this, 5);
        this.ar = this.al.d().n().G(this.am).C(new ayqe() { // from class: lji
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                DataSavingPrefsFragment dataSavingPrefsFragment = DataSavingPrefsFragment.this;
                ljp ljpVar = (ljp) obj;
                if (!ljpVar.g && !ljpVar.h && !ljpVar.i && !ljpVar.j && !ljpVar.k) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.c;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a) {
                        protoDataStoreSwitchPreference.k(false);
                    }
                }
                return ljpVar;
            }
        }).Y();
        this.d.o = new ljh(this, 1);
        this.e.o = new ljh(this);
        this.ae.o = new ljh(this, 2);
        this.af.o = new ljh(this, 3);
        this.ag.o = new ljh(this, 4);
    }

    public final void aI() {
        this.an.n(new acte(actj.DATA_SAVING_MODE_TOGGLE));
        this.an.n(new acte(actj.DATA_SAVING_IMP_OVER_WIFI_ONLY_TOGGLE));
        if (eog.J(this.ai)) {
            this.an.n(new acte(actj.DATA_SAVING_REDUCE_VIDEO_QUAITY_TOGGLE));
        } else {
            this.d.N(false);
        }
        if (eog.O(this.ah, this.ai)) {
            this.an.n(new acte(actj.DATA_SAVING_UPLOAD_OVER_WIFI_ONLY_TOGGLE));
        } else {
            this.af.N(false);
        }
        if (this.aj.d()) {
            this.e.N(true);
            this.ae.N(true);
            this.an.n(new acte(actj.DATA_SAVING_REDUCE_DOWNLOAD_QUAITY_TOGGLE));
            this.an.n(new acte(actj.DATA_SAVING_DOWNLOAD_OVER_WIFI_ONLY_TOGGLE));
        } else {
            this.e.N(false);
            this.ae.N(false);
        }
        this.ap.N(((Boolean) this.ao.a.a.V(axxd.d).B().aw()).booleanValue());
    }
}
