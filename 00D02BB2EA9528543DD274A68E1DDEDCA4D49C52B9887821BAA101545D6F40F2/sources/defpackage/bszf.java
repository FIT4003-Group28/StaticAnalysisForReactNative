package defpackage;

import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.geo.ar.arlo.api.jni.NativeCrashDebugJniImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bszf  reason: default package */
/* loaded from: classes4.dex */
final class bszf implements degu<dtm> {
    final /* synthetic */ PreferenceScreen a;
    final /* synthetic */ arla b;
    final /* synthetic */ bszs c;

    public bszf(bszs bszsVar, PreferenceScreen preferenceScreen, arla arlaVar) {
        this.c = bszsVar;
        this.a = preferenceScreen;
        this.b = arlaVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dtm dtmVar) {
        PreferenceCategory preferenceCategory;
        arla arlaVar;
        czw czwVar;
        PreferenceScreen preferenceScreen;
        dtm dtmVar2 = dtmVar;
        final bszs bszsVar = this.c;
        PreferenceScreen preferenceScreen2 = this.a;
        final czw czwVar2 = (czw) ((dbsu) bszsVar.ah).a;
        arla arlaVar2 = this.b;
        arkz a = arlaVar2.a();
        if (!bszsVar.aX) {
            return;
        }
        Preference preference = new Preference(bszsVar.ad);
        preference.s("Clear ALL settings");
        preference.o = new auc(bszsVar, czwVar2) { // from class: bswa
            private final bszs a;
            private final czw b;

            {
                this.a = bszsVar;
                this.b = czwVar2;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference2) {
                bszs bszsVar2 = this.a;
                bszs.aX(this.b.d());
                bszsVar2.ae.P(bvjk.iu);
                bszsVar2.J().g().e();
                return true;
            }
        };
        preferenceScreen2.aj(preference);
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(bszsVar.ad);
        ((PreferenceGroup) preferenceCategory2).c = true;
        preferenceCategory2.s("Optional features");
        preferenceScreen2.aj(preferenceCategory2);
        preferenceCategory2.aj(bszsVar.aU("Force TRAMs Location", dtmVar2, bswk.a, bswu.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Landmarks", dtmVar2, bsxf.a, bsxq.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Orientation Cues", dtmVar2, bsyb.a, bsym.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Shared Locations", dtmVar2, bsyx.a, bszd.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Minimap", dtmVar2, bsze.a, bswb.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Directions", dtmVar2, bswc.a, bswd.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aU("Enable Indoor Warning", dtmVar2, bswe.a, bswf.a, czwVar2));
        preferenceCategory2.aj(bszsVar.aS("Enable tilt gesture", a, bswg.a, bswh.a, arlaVar2));
        preferenceCategory2.aj(bszsVar.aS("Show Hula map cardinal directions", a, bswi.a, bswj.a, arlaVar2));
        PreferenceCategory preferenceCategory3 = new PreferenceCategory(bszsVar.ad);
        ((PreferenceGroup) preferenceCategory3).c = true;
        preferenceCategory3.s("Debug Settings");
        preferenceScreen2.aj(preferenceCategory3);
        preferenceCategory3.aj(bszsVar.aU("Fake Localization (Requires restart)", dtmVar2, bswl.a, bswm.a, czwVar2));
        if (bszsVar.ag.a()) {
            preferenceCategory = preferenceCategory3;
            arlaVar = arlaVar2;
            czwVar = czwVar2;
            preferenceScreen = preferenceScreen2;
            preferenceCategory.aj(bszsVar.aT("Force Legacy ARWN (will restart app on toggle)", a, bswn.a, bswo.a, arlaVar, true));
        } else {
            preferenceCategory = preferenceCategory3;
            arlaVar = arlaVar2;
            czwVar = czwVar2;
            preferenceScreen = preferenceScreen2;
        }
        PreferenceScreen preferenceScreen3 = preferenceScreen;
        final czw czwVar3 = czwVar;
        PreferenceCategory preferenceCategory4 = preferenceCategory;
        preferenceCategory4.aj(bszsVar.aU("Enable available area check", dtmVar2, bswp.a, bswq.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Always enable AR tracking", dtmVar2, bswr.a, bsws.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aS("Combine nearby turn barriers", a, bswt.a, bswv.a, arlaVar));
        preferenceCategory4.aj(bszsVar.aV("Debug Shared Session Id", dtmVar2, bsww.a, bswx.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Is Project 3x3 Collection", dtmVar2, bswy.a, bswz.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Is Warm Start", dtmVar2, bsxa.a, bsxb.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Render Feature Points", dtmVar2, bsxc.a, bsxd.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Render Steps", dtmVar2, bsxe.a, bsxg.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Render Hula Map", dtmVar2, bsxh.a, bsxi.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aU("Animate Localization Onboarding", dtmVar2, bsxj.a, bsxk.a, czwVar3));
        if (bszsVar.ag.a()) {
            Preference preference2 = new Preference(bszsVar.ad);
            preference2.s("Force Arlo native crash");
            preference2.o = new auc(bszsVar) { // from class: bsxl
                private final bszs a;

                {
                    this.a = bszsVar;
                }

                @Override // defpackage.auc
                public final boolean a(Preference preference3) {
                    this.a.ag.b();
                    NativeCrashDebugJniImpl.nativeTriggerNativeCrash();
                    return true;
                }
            };
            preferenceCategory4.aj(preference2);
        }
        preferenceCategory4.aj(bszsVar.aS("Force enable ARWN", a, bsxm.a, bsxn.a, arlaVar));
        preferenceCategory4.aj(bszsVar.aU("Show debug vehicle activity", dtmVar2, bsxo.a, bsxp.a, czwVar3));
        bszsVar.aW(preferenceCategory4, "Override placement geometry enablement", "Enable placement geometry", new bszm(bszsVar, czwVar3, bsxr.a, bsxs.a, bsxt.a, bsxu.a));
        bszsVar.aW(preferenceCategory4, "Override ARCore terrain anchors usage", "Use ARCore terrain anchors", new bszm(bszsVar, czwVar3, bsxv.a, bsxw.a, bsxx.a, bsxy.a));
        bszsVar.aW(preferenceCategory4, "Override placement-based terrain adjustment", "Enable placement-based terrain adjustment", new bszm(bszsVar, czwVar3, bsxz.a, bsya.a, bsyc.a, bsyd.a)).a.k("Warning: if both this option and the above override flag are on, terrain adjustment uses lerp params as entered below (as opposed to client parameters). Make sure you have reasonable values.");
        bszq bszqVar = bsye.a;
        final bszo bszoVar = bsyf.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("None");
        arrayList2.add("");
        File[] listFiles = new File(bszsVar.ad.getExternalFilesDir(null), "ar_recordings").listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, bsyu.a);
            for (File file : listFiles) {
                arrayList.add(file.getName());
                arrayList2.add(file.getAbsolutePath());
            }
        }
        final ListPreference listPreference = new ListPreference(bszsVar.ad);
        listPreference.s("Select ARCore recording");
        listPreference.C("Select ARCore recording");
        listPreference.Rj((String) bszqVar.a(dtmVar2));
        listPreference.g = (CharSequence[]) arrayList.toArray(new String[0]);
        listPreference.h = (CharSequence[]) arrayList2.toArray(new String[0]);
        ((DialogPreference) listPreference).a = "Select ARCore recording";
        listPreference.t = true;
        listPreference.n = new aub(bszsVar, czwVar3, listPreference, bszoVar) { // from class: bsyv
            private final bszs a;
            private final czw b;
            private final ListPreference c;
            private final bszo d;

            {
                this.a = bszsVar;
                this.b = czwVar3;
                this.c = listPreference;
                this.d = bszoVar;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference3, final Object obj) {
                bszs bszsVar2 = this.a;
                czw czwVar4 = this.b;
                final ListPreference listPreference2 = this.c;
                final bszo bszoVar2 = this.d;
                bszs.aX(czwVar4.c(new dbrn(listPreference2, obj, bszoVar2) { // from class: bsyz
                    private final ListPreference a;
                    private final Object b;
                    private final bszo c;

                    {
                        this.a = listPreference2;
                        this.b = obj;
                        this.c = bszoVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        ListPreference listPreference3 = this.a;
                        Object obj3 = this.b;
                        bszo bszoVar3 = this.c;
                        dtm dtmVar3 = (dtm) obj2;
                        String str = (String) obj3;
                        listPreference3.Rj(str);
                        dsqp dsqpVar = (dsqp) dtmVar3.cu(5);
                        dsqpVar.bC(dtmVar3);
                        dtl dtlVar = (dtl) dsqpVar;
                        bszoVar3.a(dtlVar, str);
                        return dtlVar.bK();
                    }
                }, bszsVar2.ai));
                return true;
            }
        };
        preferenceCategory4.aj(listPreference);
        preferenceCategory4.aj(bszsVar.aV("near_lerp_window_min for terrain adjustment", dtmVar2, bsyg.a, bsyh.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aV("near_lerp_window_max for terrain adjustment", dtmVar2, bsyi.a, bsyj.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aV("far_lerp_window_min for terrain adjustment", dtmVar2, bsyk.a, bsyl.a, czwVar3));
        preferenceCategory4.aj(bszsVar.aV("far_lerp_window_max for terrain adjustment", dtmVar2, bsyn.a, bsyo.a, czwVar3));
        PreferenceCategory preferenceCategory5 = new PreferenceCategory(bszsVar.ad);
        ((PreferenceGroup) preferenceCategory5).c = true;
        preferenceCategory5.s("Localization Settings");
        preferenceScreen3.aj(preferenceCategory5);
        preferenceCategory5.aj(bszsVar.aU("Disable GMM's ARCore-based LatLng anchoring", dtmVar2, bsyp.a, bsyq.a, czwVar3));
    }
}
