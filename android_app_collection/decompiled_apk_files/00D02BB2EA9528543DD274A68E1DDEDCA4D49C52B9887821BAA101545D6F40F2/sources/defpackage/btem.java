package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gmm.settings.navigation.InlineButtonPreference;
import com.google.android.apps.gmm.settings.navigation.ManilaLicensePlatePreference;
import com.google.android.apps.gmm.settings.navigation.NavigationPlayTestSoundPreference;
import com.google.android.apps.gmm.settings.navigation.RodizioLicensePlatePreference;
import com.google.android.apps.gmm.settings.navigation.VoiceOptionListPreference;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btem  reason: default package */
/* loaded from: classes4.dex */
public final class btem extends bszv implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final /* synthetic */ int aA = 0;
    private static final boolean aB = true;
    private static final dcdn<String, Integer> aG;
    private static final dcdn<String, Integer> aH;
    private CharSequence aC;
    private Preference aD;
    private Preference aE;
    private Context aF;
    private final btel aI = new btel(this);
    public boolean ad;
    public boolean ae;
    public boolean af;
    public bvjj ag;
    public Application ah;
    public btrm ai;
    public btvo aj;
    public akfa ak;
    public brlz al;
    public asik am;
    public dxio<cref> an;
    public cjqy ao;
    public cjqq ap;
    public vpd aq;
    public arrf ar;
    public aufc as;
    public dbsg<arkb> at;
    public auhi au;
    public vxo av;
    public cjyh aw;
    public dxio<afha> ax;
    public gcg ay;
    public Executor az;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(bvjk.eF.toString(), Integer.valueOf(bk(true)));
        dcdgVar.f(bvjk.eH.toString(), Integer.valueOf(bl(true)));
        aG = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(bvjk.eF.toString(), Integer.valueOf(bk(false)));
        dcdgVar2.f(bvjk.eH.toString(), Integer.valueOf(bl(false)));
        aH = dcdgVar2.b();
    }

    private final void aT() {
        PreferenceScreen d = d();
        for (int i = 0; i < d.n(); i++) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) d.o(i);
            for (int i2 = 0; i2 < preferenceCategory.n(); i2++) {
                preferenceCategory.o(i2).G(false);
            }
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) Ri("sound_voice_settings");
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) Ri("route_options");
        PreferenceCategory preferenceCategory4 = (PreferenceCategory) Ri("driving_options");
        if (!ehm.a()) {
            preferenceCategory2.ak(Ri(bvjk.eL.toString()));
        } else {
            ((InlineButtonPreference) Ri(bvjk.eL.toString())).e = new btec(this);
        }
        if (!anac.c || !anac.b) {
            preferenceCategory2.ak(Ri(bvjk.eO.toString()));
        }
        if (!this.ag.m(bvjk.eT, false)) {
            preferenceCategory4.ak(Ri(bvjk.eS.toString()));
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) Ri("good_to_go");
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) Ri("avoid_highways");
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) Ri("avoid_tolls");
        TwoStatePreference twoStatePreference4 = (TwoStatePreference) Ri("avoid_ferries");
        if (twoStatePreference != null) {
            preferenceCategory3.ak(twoStatePreference);
        }
        if (twoStatePreference2 != null && twoStatePreference3 != null && twoStatePreference4 != null) {
            EnumSet<vux> a = this.av.a();
            if (twoStatePreference != null) {
                twoStatePreference.m(a.contains(vux.GOOD_TO_GO));
                twoStatePreference.s(H().getString(cpi.SETTINGS_DIRECTIONS_OPTIONS_TOLL_PASS, Rp(cpi.SETTINGS_DIRECTIONS_OPTIONS_GOOD_TO_GO_PASS_NAME)));
            }
            twoStatePreference2.m(a.contains(vux.AVOID_HIGHWAYS));
            twoStatePreference4.m(a.contains(vux.AVOID_FERRIES));
            twoStatePreference3.m(a.contains(vux.AVOID_TOLLS));
        }
        ((InlineButtonPreference) Ri(bvjk.eE.toString())).e = new bted(this);
        ((InlineButtonPreference) Ri(bvjk.z.toString())).e = new btee(this);
        this.aD = Ri("assistant_promo_highways");
        this.aE = Ri("assistant_promo_tolls");
        Preference preference = this.aD;
        if (preference != null) {
            preferenceCategory3.ak(preference);
        }
        Preference preference2 = this.aE;
        if (preference2 != null) {
            preferenceCategory3.ak(preference2);
        }
        Preference Ri = Ri("odd_even_license_plate");
        if (Ri != null && !this.aq.e(vpc.JAKARTA)) {
            preferenceCategory3.ak(Ri);
        }
        Preference Ri2 = Ri("rodizio_license_plate_settings");
        if (Ri2 != null) {
            if (!this.aq.e(vpc.SAO_PAULO)) {
                preferenceCategory3.ak(Ri2);
            } else {
                bg();
            }
        }
        Preference Ri3 = Ri("manila_number_coding_license_plate_settings");
        if (Ri3 != null) {
            if (!this.aq.e(vpc.MANILA)) {
                preferenceCategory3.ak(Ri3);
            } else {
                bh();
            }
        }
        Preference Ri4 = Ri("santiago_license_plate_settings");
        if (Ri4 != null) {
            preferenceCategory3.ak(Ri4);
        }
        int a2 = dkuc.a(this.aj.getPassiveAssistParameters().a().j);
        if (a2 == 0) {
            a2 = 1;
        }
        if (this.ak.d() || (a2 != 3 && a2 != 4)) {
            preferenceCategory4.ak(Ri("remember_monthly_nav_stats"));
        }
        Preference Ri5 = Ri("google_assistant_settings");
        boolean z = ashb.a(this.al.g, this.am, this.ak) && !this.aw.b();
        if (Ri5 != null && !z) {
            preferenceCategory2.ak(Ri5);
        }
        if (!ckri.e(this.ah) || !aB || this.ak.d() || this.aw.b()) {
            preferenceCategory2.ak(Ri(bvjk.eR.toString()));
        }
        Preference Ri6 = Ri("google_assistant_driving_mode_settings");
        boolean z2 = ashb.a(this.al.g, this.am, this.ak) && this.aw.b();
        if (Ri6 == null || z2) {
            this.ap.g().d(cjtd.a(dtxw.ch));
        } else {
            preferenceCategory2.ak(Ri6);
        }
        if (!this.aj.getNavigationParameters().A()) {
            preferenceCategory4.ak(Ri(bvjk.bc.toString()));
        } else {
            ((TwoStatePreference) Ri(bvjk.bc.toString())).m(this.au.t(dpyv.NAVIGATION_START_DRIVING_MODE.dm) == aufs.ENABLED);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String Rq = Rq(R.string.DEFAULT_VOICE_OPTION_ENTRY, Locale.getDefault().getDisplayLanguage());
        String Rp = this.aj.getTextToSpeechParameters().b ? Rp(R.string.VOICE_OPTION_SUBTITLE_SUPPORTS_ROAD_NAMES) : "";
        dwkh bZ = dwki.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwki dwkiVar = (dwki) bZ.b;
        Rq.getClass();
        int i3 = dwkiVar.a | 1;
        dwkiVar.a = i3;
        dwkiVar.b = Rq;
        dwkiVar.a = i3 | 2;
        dwkiVar.c = "";
        dwki dwkiVar2 = (dwki) bZ.b;
        Rp.getClass();
        int i4 = 4 | dwkiVar2.a;
        dwkiVar2.a = i4;
        dwkiVar2.d = Rp;
        dwkiVar2.a = i4 | 8;
        dwkiVar2.e = true;
        for (dwki dwkiVar3 : dcbg.d(dcdc.f(bZ.bK()), this.aj.getTextToSpeechParameters().h)) {
            dbsk.s(dwkiVar3);
            arrayList.add(dwkiVar3.b);
            arrayList2.add(dwkiVar3.c);
            arrayList3.add(dwkiVar3.d);
            arrayList4.add(Boolean.valueOf(dwkiVar3.e));
        }
        VoiceOptionListPreference voiceOptionListPreference = (VoiceOptionListPreference) Ri(bvjk.eK.toString());
        if (voiceOptionListPreference != null) {
            ((ListPreference) voiceOptionListPreference).g = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            ((ListPreference) voiceOptionListPreference).h = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]);
            voiceOptionListPreference.D = (CharSequence[]) arrayList3.toArray(new CharSequence[arrayList3.size()]);
            Object[] array = arrayList4.toArray();
            int length = array.length;
            boolean[] zArr = new boolean[length];
            for (int i5 = 0; i5 < length; i5++) {
                Object obj = array[i5];
                dbsk.s(obj);
                zArr[i5] = ((Boolean) obj).booleanValue();
            }
            voiceOptionListPreference.E = zArr;
            aW();
        }
        Preference Ri7 = Ri("remember_monthly_nav_stats");
        if (Ri7 != null) {
            Ri7.J(new bteg(this));
        }
        PreferenceCategory preferenceCategory5 = (PreferenceCategory) Ri("walking_options");
        if (preferenceCategory5 != null) {
            preferenceCategory5.B(false);
            final TwoStatePreference twoStatePreference5 = (TwoStatePreference) Ri("eyes_free_walking_guidance_enabled");
            if (twoStatePreference5 != null) {
                if (!this.aj.getNavigationParameters().P()) {
                    preferenceCategory5.ak(twoStatePreference5);
                } else {
                    final cjql d2 = this.ap.g().d(cjtd.a(dtxw.cv));
                    twoStatePreference5.m(this.ag.m(bvjk.jP, false));
                    twoStatePreference5.J(new aub(this, d2, twoStatePreference5) { // from class: btdz
                        private final btem a;
                        private final cjql b;
                        private final TwoStatePreference c;

                        {
                            this.a = this;
                            this.b = d2;
                            this.c = twoStatePreference5;
                        }

                        @Override // defpackage.aub
                        public final boolean a(Preference preference3, Object obj2) {
                            btem btemVar = this.a;
                            cjql cjqlVar = this.b;
                            TwoStatePreference twoStatePreference6 = this.c;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            cjqy cjqyVar = btemVar.ao;
                            cjte cjteVar = new cjte(deaf.TAP);
                            cjta b = cjtd.b();
                            b.d = dtxw.cv;
                            ddzy bZ2 = deab.c.bZ();
                            deaa deaaVar = booleanValue ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            deab deabVar = (deab) bZ2.b;
                            deabVar.b = deaaVar.d;
                            deabVar.a |= 1;
                            b.a = bZ2.bK();
                            cjqyVar.n(cjqlVar, cjteVar, b.a());
                            twoStatePreference6.m(booleanValue);
                            btemVar.ag.S(bvjk.jP, booleanValue);
                            return true;
                        }
                    });
                    preferenceCategory5.B(true);
                }
            }
            TwoStatePreference twoStatePreference6 = (TwoStatePreference) Ri("arwn_tilt_setting");
            if (twoStatePreference6 == null) {
                if (preferenceCategory5.n() == 0) {
                    d().ak(preferenceCategory5);
                }
            } else {
                twoStatePreference6.B(false);
                if (!this.at.a()) {
                    preferenceCategory5.ak(twoStatePreference6);
                    if (preferenceCategory5.n() == 0) {
                        d().ak(preferenceCategory5);
                    }
                } else {
                    deha.q(this.at.b().a(), new bteb(this, twoStatePreference6, preferenceCategory5), this.az);
                }
            }
        }
        TwoStatePreference twoStatePreference7 = (TwoStatePreference) Ri("show_media_controls");
        if (twoStatePreference7 != null) {
            if (!this.ar.a()) {
                preferenceCategory2.ak(twoStatePreference7);
            } else {
                bi(twoStatePreference7);
            }
            Preference Ri8 = Ri("default_media_app");
            if (Ri8 != null) {
                if (!this.ar.a()) {
                    preferenceCategory2.ak(Ri8);
                } else {
                    bj(Ri8);
                }
            }
        }
        Preference Ri9 = Ri("google_assistant_music_settings");
        if (Ri9 != null) {
            if (!this.aw.b() || this.ak.d()) {
                preferenceCategory2.ak(Ri9);
            } else {
                this.ap.g().d(cjtd.a(dtxw.ci));
            }
        }
    }

    private final void aU(String str, boolean z) {
        String Rp;
        String string;
        PreferenceCategory preferenceCategory = (PreferenceCategory) Ri("route_options");
        Preference preference = bvjk.eF.toString().equals(str) ? this.aD : this.aE;
        if (preferenceCategory == null || preference == null || !aV()) {
            return;
        }
        aS(true);
        preference.G(true);
        preference.w(2131232059);
        if (z) {
            Rp = Rp(aH.get(str).intValue());
        } else {
            Rp = Rp(aG.get(str).intValue());
        }
        if (z) {
            string = H().getString(R.string.NAVIGATION_SETTING_ROUTE_OPTIONS_ASSISTANT_PROMO_ALLOW, Rp);
        } else {
            string = H().getString(R.string.NAVIGATION_SETTING_ROUTE_OPTIONS_ASSISTANT_PROMO_AVOID, Rp);
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(ibm.c().b(H())), 0, spannableString.length(), 0);
        preference.s(spannableString);
        preferenceCategory.aj(preference);
        this.ap.g().d(cjtd.a(bvjk.eF.toString().equals(str) ? dtxw.al : dtxw.am));
    }

    private final boolean aV() {
        return this.aj.getAssistantParameters().a && this.af && this.ae;
    }

    private final void aW() {
        VoiceOptionListPreference voiceOptionListPreference = (VoiceOptionListPreference) Ri(bvjk.eK.toString());
        if (voiceOptionListPreference != null) {
            if (voiceOptionListPreference.n() == null) {
                voiceOptionListPreference.Rj("");
                this.ag.ac(bvjk.eK, "");
            }
            voiceOptionListPreference.k(voiceOptionListPreference.n());
        }
    }

    private final void aX(vux vuxVar, String str) {
        EnumMap enumMap = new EnumMap(vux.class);
        enumMap.put((EnumMap) vuxVar, (vux) Integer.valueOf(((TwoStatePreference) Ri(str)).a ? 1 : 0));
        this.ai.b(sri.a(enumMap));
        this.av.f(enumMap);
    }

    private final void bg() {
        String string;
        RodizioLicensePlatePreference rodizioLicensePlatePreference = (RodizioLicensePlatePreference) Ri("rodizio_license_plate_settings");
        if (rodizioLicensePlatePreference == null) {
            return;
        }
        dowl f = this.aq.f(vpc.SAO_PAULO);
        dowa dowaVar = dowa.KILOMETERS;
        aufa aufaVar = aufa.AUTO;
        cres cresVar = cres.LOUDER;
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        btdw btdwVar = btdw.START;
        boolean z = true;
        switch (f.ordinal()) {
            case 4:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 1, 2);
                break;
            case 5:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 3, 4);
                break;
            case 6:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 5, 6);
                break;
            case 7:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 7, 8);
                break;
            case 8:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 9, 0);
                break;
            default:
                string = H().getString(R.string.RODIZIO_LICENSE_PLATE_SETTINGS_SUMMARY_PROMPT);
                z = false;
                break;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        if (z) {
            SpannableString spannableString = new SpannableString(Rn().getString(R.string.ROTATION_LICENSE_PLATE_SETTINGS_SUMMARY_CHANGE_LINK));
            spannableString.setSpan(new ForegroundColorSpan(Rn().getColor(R.color.qu_google_blue_700)), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) spannableString);
        }
        rodizioLicensePlatePreference.k(spannableStringBuilder);
    }

    private final void bh() {
        String string;
        ManilaLicensePlatePreference manilaLicensePlatePreference = (ManilaLicensePlatePreference) Ri("manila_number_coding_license_plate_settings");
        if (manilaLicensePlatePreference == null) {
            return;
        }
        dowl b = dowl.b(this.ag.s(bvjk.iT, dowl.UNSET.t));
        dowa dowaVar = dowa.KILOMETERS;
        aufa aufaVar = aufa.AUTO;
        cres cresVar = cres.LOUDER;
        btdw btdwVar = btdw.START;
        boolean z = true;
        switch (b.ordinal()) {
            case 9:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 1, 2);
                break;
            case 10:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 3, 4);
                break;
            case 11:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 5, 6);
                break;
            case 12:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 7, 8);
                break;
            case 13:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY_PLATE_SET, 9, 0);
                break;
            default:
                string = H().getString(R.string.MANILA_LICENSE_PLATE_SETTINGS_SUMMARY);
                z = false;
                break;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        if (z) {
            SpannableString spannableString = new SpannableString(Rn().getString(R.string.ROTATION_LICENSE_PLATE_SETTINGS_SUMMARY_CHANGE_LINK));
            spannableString.setSpan(new ForegroundColorSpan(Rn().getColor(R.color.qu_google_blue_700)), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) spannableString);
        }
        manilaLicensePlatePreference.k(spannableStringBuilder);
    }

    private final void bi(TwoStatePreference twoStatePreference) {
        if (twoStatePreference == null) {
            return;
        }
        twoStatePreference.m(this.ar.b());
        twoStatePreference.J(new btek(this));
        bj(Ri("default_media_app"));
    }

    private final void bj(Preference preference) {
        if (preference == null) {
            return;
        }
        if (this.ar.b()) {
            CharSequence d = this.ar.d();
            if (d == null) {
                return;
            }
            preference.k(d);
            return;
        }
        preference.k("");
    }

    private static int bk(boolean z) {
        return z ? R.string.ASSISTANT_QUERY_AVOID_HIGHWAYS : R.string.ASSISTANT_QUERY_ALLOW_HIGHWAYS;
    }

    private static int bl(boolean z) {
        return z ? R.string.ASSISTANT_QUERY_AVOID_TOLLS : R.string.ASSISTANT_QUERY_ALLOW_TOLLS;
    }

    @Override // defpackage.fd
    public final Context H() {
        if (!this.ay.a()) {
            return super.H();
        }
        if (this.aF == null) {
            Context H = super.H();
            iva.a().booleanValue();
            this.aF = H;
        }
        return this.aF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bszv
    public final jib aJ() {
        jib aJ = super.aJ();
        if (!this.ad || this.ay.a()) {
            return aJ;
        }
        jhz e = aJ.e();
        e.u = ibl.w();
        e.i = cqrt.f(2131231588);
        e.d = irn.S();
        e.q = ibl.b();
        e.v = ibl.q();
        e.g = ibl.s();
        return e.b();
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.NAVIGATION_SETTINGS);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtxw.cn;
    }

    public final void aS(boolean z) {
        PreferenceCategory preferenceCategory = (PreferenceCategory) Ri("route_options");
        if (preferenceCategory == null) {
            return;
        }
        if (aV() && !z) {
            return;
        }
        Preference preference = this.aD;
        if (preference != null) {
            preferenceCategory.ak(preference);
        }
        Preference preference2 = this.aE;
        if (preference2 == null) {
            return;
        }
        preferenceCategory.ak(preference2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bszv
    public final egj aZ() {
        cjmu cjmuVar;
        egj aZ = super.aZ();
        if (this.ad && this.ay.a()) {
            if (iva.a().booleanValue()) {
                cjmuVar = cjmu.TRANSPARENT_BG_WHITE_ICONS;
            } else {
                cjmuVar = cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE;
            }
            aZ.aq(cjmuVar);
        }
        return aZ;
    }

    @Override // defpackage.bszv, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater.cloneInContext(H()), viewGroup, bundle);
        InlineButtonPreference inlineButtonPreference = (InlineButtonPreference) Ri(bvjk.eL.toString());
        if (inlineButtonPreference != null) {
            dowa dowaVar = dowa.KILOMETERS;
            aufa aufaVar = aufa.AUTO;
            cres cresVar = cres.LOUDER;
            dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
            btdw btdwVar = btdw.START;
            int ordinal = ((cres) this.ag.H(bvjk.eL, cres.class, cres.NORMAL)).ordinal();
            if (ordinal == 0) {
                inlineButtonPreference.n(btdw.END);
            } else if (ordinal == 1) {
                inlineButtonPreference.n(btdw.MIDDLE);
            } else if (ordinal == 2) {
                inlineButtonPreference.n(btdw.START);
            }
        }
        InlineButtonPreference inlineButtonPreference2 = (InlineButtonPreference) Ri(bvjk.z.toString());
        if (inlineButtonPreference2 != null) {
            dowa dowaVar2 = dowa.KILOMETERS;
            aufa aufaVar2 = aufa.AUTO;
            cres cresVar2 = cres.LOUDER;
            dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
            btdw btdwVar2 = btdw.START;
            int ordinal2 = ((dowa) this.ag.H(bvjk.z, dowa.class, dowa.REGIONAL)).ordinal();
            if (ordinal2 == 0) {
                inlineButtonPreference2.n(btdw.MIDDLE);
            } else if (ordinal2 == 1) {
                inlineButtonPreference2.n(btdw.END);
            } else {
                inlineButtonPreference2.n(btdw.START);
            }
        }
        InlineButtonPreference inlineButtonPreference3 = (InlineButtonPreference) Ri(bvjk.eE.toString());
        if (inlineButtonPreference3 != null) {
            dowa dowaVar3 = dowa.KILOMETERS;
            aufa aufaVar3 = aufa.AUTO;
            cres cresVar3 = cres.LOUDER;
            dowl dowlVar3 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
            btdw btdwVar3 = btdw.START;
            int ordinal3 = ((aufa) this.ag.H(bvjk.aS, aufa.class, aufa.AUTO)).ordinal();
            if (ordinal3 == 0) {
                inlineButtonPreference3.n(btdw.START);
            } else if (ordinal3 == 1) {
                inlineButtonPreference3.n(btdw.MIDDLE);
            } else if (ordinal3 == 2) {
                inlineButtonPreference3.n(btdw.END);
            }
        }
        return ag;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        Intent f;
        super.g(preference);
        if (!this.aX) {
            return false;
        }
        if (bvjk.eZ.toString().equals(preference.q)) {
            this.an.a().b(crfj.c(crfi.TEST_NAVIGATION_VOICE, this.an.a().q().a.getString(R.string.NAVIGATION_SETTING_TEST_NAVIGATION_VOICE_MESSAGE), new amsu(8)), crej.TEST_AUDIO, new btef((NavigationPlayTestSoundPreference) preference));
            this.ao.i(cjtd.a(dtxw.cz));
            return true;
        }
        if ("google_assistant_settings".equals(preference.q)) {
            Intent b = cqap.e().b();
            if (afhl.a(H().getPackageManager(), b)) {
                this.ax.a().j(b, 0, 4);
            }
            this.ao.i(cjtd.a(dtxw.cj));
        }
        if (bvjk.eR.toString().equals(preference.q) && ckri.e(this.ah) && (f = ckri.f(this.ah)) != null) {
            this.ax.a().f(J(), f, 4);
        }
        if ("google_assistant_driving_mode_settings".equals(preference.q)) {
            cqao e = cqap.e();
            ((cqaq) e).a = "driving";
            Intent b2 = e.b();
            if (afhl.a(H().getPackageManager(), b2)) {
                this.ax.a().j(b2, 0, 4);
            }
            this.ao.i(cjtd.a(dtxw.ch));
        }
        if ("google_assistant_music_settings".equals(preference.q)) {
            cqao e2 = cqap.e();
            ((cqaq) e2).a = "music";
            Intent b3 = e2.b();
            if (afhl.a(H().getPackageManager(), b3)) {
                this.ax.a().j(b3, 0, 4);
            }
            this.ao.i(cjtd.a(dtxw.ci));
        }
        if (!"odd_even_license_plate".equals(preference.q) && !"manila_number_coding_license_plate_settings".equals(preference.q) && !"santiago_license_plate_settings".equals(preference.q) && !"rodizio_license_plate_settings".equals(preference.q)) {
            return false;
        }
        cjtd a = cjtd.a(dtxw.cl);
        this.ao.j(this.ap.g().d(a), a);
        return true;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("isNavigating", false)) {
            z = true;
        }
        this.ad = z;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!this.aX) {
            return;
        }
        if (bvjk.eL.toString().equals(str)) {
            this.an.a().l();
        } else if (bvjk.eP.toString().equals(str)) {
            this.ao.i(cjqg.a(sharedPreferences.getBoolean(str, true), cjtd.a(dtxw.cy)));
        } else if (bvjk.eO.toString().equals(str)) {
            this.ao.i(cjqg.a(sharedPreferences.getBoolean(str, true), cjtd.a(dtxw.cA)));
        } else if (bvjk.eS.toString().equals(str)) {
            this.ao.i(cjqg.a(sharedPreferences.getBoolean(str, false), cjtd.a(dtxw.cE)));
        } else if (bvjk.eU.toString().equals(str)) {
            this.ao.i(cjqg.a(sharedPreferences.getBoolean(str, false), cjtd.a(dtxw.cF)));
        } else if (bvjk.cb.toString().equals(str)) {
            this.ao.i(cjqg.a(sharedPreferences.getBoolean(str, false), cjtd.a(dtxw.cw)));
        } else if (bvjk.bc.toString().equals(str)) {
            boolean z = sharedPreferences.getBoolean(str, true);
            if (z) {
                this.ag.P(bvjk.bd);
            }
            this.au.d(dpyv.NAVIGATION_START_DRIVING_MODE.dm, z ? aufs.ENABLED : aufs.DISABLED);
        } else {
            bvjk.z.toString();
            if (bvjk.eK.toString().equals(str)) {
                aW();
                this.ag.ac(bvjk.eK, ((ListPreference) ((VoiceOptionListPreference) Ri(bvjk.eK.toString()))).i);
                this.an.a().x();
            } else if (bvjk.eF.toString().equals(str)) {
                aX(vux.AVOID_HIGHWAYS, str);
                boolean z2 = sharedPreferences.getBoolean(str, false);
                aU(str, z2);
                this.ao.i(cjqg.a(z2, cjtd.a(dtxw.cp)));
            } else if (bvjk.eG.toString().equals(str)) {
                aX(vux.AVOID_FERRIES, str);
                boolean z3 = sharedPreferences.getBoolean(str, false);
                aS(true);
                this.ao.i(cjqg.a(z3, cjtd.a(dtxw.co)));
            } else if (bvjk.eH.toString().equals(str)) {
                aX(vux.AVOID_TOLLS, str);
                boolean z4 = sharedPreferences.getBoolean(str, false);
                aU(str, z4);
                this.ao.i(cjqg.a(z4, cjtd.a(dtxw.cq)));
            } else if (bvjk.iR.toString().equals(str)) {
                bg();
            } else if (bvjk.iT.toString().equals(str)) {
                bh();
            } else if (!bvjk.je.toString().equals(str)) {
                if (!bvjk.jf.toString().equals(str)) {
                    return;
                }
                bj(Ri("default_media_app"));
            } else {
                bi((TwoStatePreference) Ri("show_media_controls"));
            }
        }
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        this.b.b = this.ag.h();
        f(R.xml.settings_navigation_prefs);
        aT();
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        this.aC = J().getTitle();
        J().setTitle(R.string.NAVIGATION_SETTINGS);
        this.ag.d.registerOnSharedPreferenceChangeListener(this);
        btrm btrmVar = this.ai;
        btel btelVar = this.aI;
        dceq a = dcet.a();
        a.b(crhp.class, new bten(0, crhp.class, btelVar, bvrj.UI_THREAD));
        a.b(brcp.class, new bten(1, brcp.class, btelVar, bvrj.UI_THREAD));
        btrmVar.g(btelVar, a.a());
    }

    @Override // defpackage.bszv, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("isNavigating", this.ad);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void u() {
        J().setTitle(this.aC);
        this.ai.a(this.aI);
        this.ag.d.unregisterOnSharedPreferenceChangeListener(this);
        super.u();
    }
}
