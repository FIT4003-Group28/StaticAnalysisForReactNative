package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
/* compiled from: PG */
/* renamed from: ljh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljh implements bjg {
    public final /* synthetic */ DataSavingPrefsFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljh(DataSavingPrefsFragment dataSavingPrefsFragment, int i) {
        this.b = i;
        this.a = dataSavingPrefsFragment;
    }

    @Override // defpackage.bjg
    public final boolean b(Preference preference) {
        int i = this.b;
        if (i == 0) {
            this.a.an.H(3, new acte(actj.DATA_SAVING_REDUCE_DOWNLOAD_QUAITY_TOGGLE), null);
            return true;
        } else if (i == 1) {
            this.a.an.H(3, new acte(actj.DATA_SAVING_REDUCE_VIDEO_QUAITY_TOGGLE), null);
            return true;
        } else if (i == 2) {
            this.a.an.H(3, new acte(actj.DATA_SAVING_DOWNLOAD_OVER_WIFI_ONLY_TOGGLE), null);
            return true;
        } else if (i == 3) {
            this.a.an.H(3, new acte(actj.DATA_SAVING_UPLOAD_OVER_WIFI_ONLY_TOGGLE), null);
            return true;
        } else if (i == 4) {
            this.a.an.H(3, new acte(actj.DATA_SAVING_IMP_OVER_WIFI_ONLY_TOGGLE), null);
            return true;
        } else {
            DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
            boolean z = false;
            if (!preference.s.equals("data_saving_mode_key")) {
                return false;
            }
            dataSavingPrefsFragment.an.H(3, new acte(actj.DATA_SAVING_MODE_TOGGLE), null);
            boolean z2 = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
            ljp ljpVar = (ljp) dataSavingPrefsFragment.al.c();
            if (eog.J(dataSavingPrefsFragment.ai)) {
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z2) {
                    protoDataStoreSwitchPreference.k(z2 || ljpVar.m);
                }
            }
            if (dataSavingPrefsFragment.aj.d()) {
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z2) {
                    protoDataStoreSwitchPreference2.k(z2 || ljpVar.n);
                }
            }
            if (dataSavingPrefsFragment.aj.d()) {
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z2) {
                    protoDataStoreSwitchPreference3.k(z2 || ljpVar.o);
                }
            }
            if (eog.O(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z2) {
                    protoDataStoreSwitchPreference4.k(z2 || ljpVar.p);
                }
            }
            ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
            if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z2) {
                return true;
            }
            if (z2 || ((ljp) dataSavingPrefsFragment.al.c()).q) {
                z = true;
            }
            protoDataStoreSwitchPreference5.k(z);
            return true;
        }
    }
}
