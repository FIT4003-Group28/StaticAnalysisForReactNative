package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bsuw  reason: default package */
/* loaded from: classes4.dex */
public final class bsuw extends bszv implements SharedPreferences.OnSharedPreferenceChangeListener, achd {
    public static final /* synthetic */ int aR = 0;
    private static final String aZ = bvjk.D.toString();
    public dxio<afwk> aA;
    public dxio<qef> aB;
    public dxio<stc> aC;
    public dxio<apyz> aD;
    public dxio<btbg> aE;
    public Executor aF;
    public dxio<avik> aG;
    public ania aH;
    public btvo aI;
    public PreferenceScreen aJ;
    @dzsi
    public Preference aK;
    @dzsi
    public SwitchPreferenceCompat aL;
    @dzsi
    Preference aM;
    Preference aN;
    public rmm aP;
    public btxc aQ;
    public bvjj ad;
    public bsvn ae;
    public btrm af;
    public eeu ag;
    public cjqy ah;
    public cjqq ai;
    public akfc aj;
    public dxio<akfa> ak;
    public dxio<arag> al;
    public dxio<bsvm> am;
    public dxio<axwy> an;
    public dxio<bbdv> ao;
    public auhi ap;
    public dxio<anhg> aq;
    public dxio<afwr> ar;
    public dxio<ros> as;
    public dxio<sin> at;
    public wgh au;
    public dxio<bvvw> av;
    public brcs aw;
    public gcg ax;
    public dxio<gce> ay;
    public dxio<btyh> az;
    private Preference ba;
    private Preference bb;
    private Preference bc;
    private Preference bd;
    private ListPreference be;
    private ListPreference bf;
    private Preference bg;
    private Preference bh;
    private Preference bi;
    private Preference bj;
    private Preference bk;
    private Preference bl;
    private Preference bm;
    private Preference bn;
    private Preference bo;
    private btlt bp;
    private String bq;
    private CharSequence br;
    @dzsi
    private crzp<qee> bs;
    private final aub bw;
    private final aub bx;
    private final aub by;
    public final Map<String, cjql> aO = new HashMap();
    private final crzp<dbsg<Boolean>> bt = new crzp(this) { // from class: bsui
        private final bsuw a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.a.Ri(bvjk.et.toString());
            if (switchPreferenceCompat == null || !((dbsg) crzmVar.l()).a() || ((TwoStatePreference) switchPreferenceCompat).a == ((Boolean) ((dbsg) crzmVar.l()).b()).booleanValue()) {
                return;
            }
            switchPreferenceCompat.m(((Boolean) ((dbsg) crzmVar.l()).b()).booleanValue());
        }
    };
    private final crzp<btlu> bu = new crzp(this) { // from class: bsul
        private final bsuw a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.aU();
        }
    };
    private final crzp<btvo> bv = new crzp(this) { // from class: bsum
        private final bsuw a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.aS();
        }
    };

    public bsuw() {
        new bsuu(this);
        this.bw = bsun.a;
        this.bx = new aub(this) { // from class: bsuo
            private final bsuw a;

            {
                this.a = this;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                bsuw bsuwVar = this.a;
                boolean equals = Boolean.TRUE.equals(obj);
                bsuwVar.ar.a().k(afwm.SATELLITE, equals);
                ((TwoStatePreference) preference).m(equals);
                bsuwVar.ah.i(cjqg.a(equals, cjtd.a(dtyb.da)));
                return true;
            }
        };
        this.by = new aub(this) { // from class: bsup
            private final bsuw a;

            {
                this.a = this;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                bsuw bsuwVar = this.a;
                boolean equals = Boolean.TRUE.equals(obj);
                if (equals && !((TwoStatePreference) preference).a) {
                    bsuwVar.aA.a().a();
                }
                bsuwVar.az.a().a(equals);
                return true;
            }
        };
    }

    private final btlt aW() {
        return btlu.i(this.ak.a().j());
    }

    private final void aX() {
        if (this.bm == null) {
            return;
        }
        if (this.bp != btlt.GOOGLE || !this.aD.a().J()) {
            this.aJ.ak(this.bm);
            return;
        }
        if (bd().a() && !this.aO.containsKey("messages")) {
            this.aO.put("messages", bd().b().d(cjtd.a(dtyb.cO)));
        }
        this.aJ.aj(this.bm);
    }

    private final void bg() {
        if (in.a(J()).f()) {
            return;
        }
        int a = dkqd.a(this.aI.getNotificationsParameters().t);
        if (a == 0) {
            a = 1;
        }
        cjta b = cjtd.b();
        if (a == 3) {
            this.aN.x(R.string.NOTIFICATION_SETTING_OFF);
            b.d = dtxw.dX;
            b.w(ddhj.VISIBILITY_VISIBLE);
        } else if (a == 4) {
            b.d = dtxw.dX;
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        if (!b.a().l()) {
            return;
        }
        this.ai.g().d(b.a());
    }

    private final boolean bh() {
        return this.au.a() || this.au.b();
    }

    private final void bi() {
        if (this.ax.a()) {
            gcd gcdVar = gcd.FOLLOW_SYSTEM;
            int ordinal = this.ay.a().f().ordinal();
            if (ordinal == 0) {
                this.bg.x(R.string.DARK_MODE_SETTINGS_DIALOG_FOLLOW_SYSTEM_THEME);
            } else if (ordinal == 1) {
                this.bg.x(R.string.DARK_MODE_SETTINGS_DIALOG_DARK_THEME);
            } else {
                this.bg.x(R.string.DARK_MODE_SETTINGS_DIALOG_LIGHT_THEME);
            }
        }
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.SETTINGS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aS() {
        auhi auhiVar = this.ap;
        btvo btvoVar = this.aI;
        dcpd<aujb> it = ((aufl) auhiVar).a().values().iterator();
        while (it.hasNext()) {
            if (aufl.i(it.next(), btvoVar)) {
                if (this.aJ.ah("notifications") != null || this.aN == null) {
                    return;
                }
                bg();
                this.aJ.aj(this.aN);
                return;
            }
        }
        Preference preference = this.aN;
        if (preference != null) {
            this.aJ.ak(preference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aT() {
        if (this.aK == null) {
            return;
        }
        if (this.aw.a()) {
            this.aJ.aj(this.aK);
        } else {
            this.aJ.ak(this.aK);
        }
    }

    public final void aU() {
        Preference preference;
        btlt aW = aW();
        this.bp = aW;
        if (aW == btlt.GOOGLE) {
            if (this.aJ.ah("edit_home_work") == null) {
                this.aJ.aj(this.ba);
            }
            if (this.aJ.ah("maps_history") == null) {
                this.aJ.aj(this.bd);
            }
            if (this.aJ.ah("personal_content") == null) {
                this.aJ.aj(this.aM);
            }
            if (this.aI.getLocalPreferencesParameters().d.isEmpty()) {
                if (this.aJ.ah("explore_preferences") == null) {
                    this.aJ.aj(this.bj);
                }
            } else {
                if (this.aJ.ah("manage_preferences") == null) {
                    this.aJ.aj(this.bk);
                }
                if (this.aJ.ah("personalization_list") == null) {
                    this.aJ.aj(this.bl);
                }
            }
            Preference preference2 = this.bo;
            if (preference2 != null) {
                this.aJ.ak(preference2);
            }
            this.bh.t(R.string.SIGN_OUT_OF_GOOGLE_MAPS);
            this.ae.a();
        } else {
            this.aJ.ak(this.ba);
            Preference preference3 = this.bb;
            if (preference3 != null) {
                this.aJ.ak(preference3);
            }
            Preference preference4 = this.bc;
            if (preference4 != null) {
                this.aJ.ak(preference4);
            }
            this.aJ.ak(this.bd);
            this.aJ.ak(this.aM);
            if (this.aJ.ah("explore_preferences") != null) {
                this.aJ.ak(this.bj);
            }
            if (this.aJ.ah("manage_preferences") != null) {
                this.aJ.ak(this.bk);
            }
            if (this.aJ.ah("personalization_list") != null) {
                this.aJ.ak(this.bl);
            }
            if (this.aJ.ah("follow_management") != null) {
                this.aJ.ak(this.bn);
            }
            if (this.aJ.ah(aZ) == null && (preference = this.bo) != null) {
                this.aJ.aj(preference);
            }
            if (this.bp == btlt.INCOGNITO) {
                this.aJ.ak(this.bh);
            } else {
                this.bh.t(R.string.SIGN_IN);
            }
        }
        aV();
        if (this.bc != null) {
            if (this.bp != btlt.GOOGLE || !bh()) {
                this.aJ.ak(this.bc);
            } else if (this.aJ.ah("pinned_trips") == null) {
                this.aJ.aj(this.bc);
            }
        }
        aS();
        deha.q(this.aP.b.a().w(), new bsuv(this), this.aF);
        aT();
        aX();
        if (this.bp == btlt.GOOGLE) {
            btbg a = this.aE.a();
            if (a.e.getLanguageSettingParameters().d) {
                return;
            }
            btbf btbfVar = new btbf(a);
            dehp dehpVar = a.d;
            final ckmc ckmcVar = a.c;
            ckmcVar.getClass();
            deha.q(dehpVar.c(new Callable(ckmcVar) { // from class: btbe
                private final ckmc a;

                {
                    this.a = ckmcVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d();
                }
            }), btbfVar, a.d);
        }
    }

    public final void aV() {
        if (this.bp == btlt.GOOGLE && !bh()) {
            rmm rmmVar = this.aP;
            if (rmmVar.d.a().a()) {
                dunm commuteSetupParameters = rmmVar.a.getCommuteSetupParameters();
                if (!commuteSetupParameters.a && ((rmmVar.a.getCommuteSetupParameters().g || rmmVar.c.a().m()) && (commuteSetupParameters.b || rmmVar.b.a().d()))) {
                    if (this.aJ.ah("commute") != null) {
                        return;
                    }
                    this.aJ.aj(this.bb);
                    return;
                }
            }
        }
        this.aJ.ak(this.bb);
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        final String z = this.ad.z(bvjk.z, null);
        if (z != null) {
            dcbg c = dcbg.c(this.be.h);
            z.getClass();
            if (c.p(new dbsl(z) { // from class: bsuk
                private final String a;

                {
                    this.a = z;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contentEquals((CharSequence) obj);
                }
            })) {
                this.be.Rj(z);
                ListPreference listPreference = this.be;
                listPreference.k(listPreference.n());
            }
        }
        this.be.Rj("");
        ListPreference listPreference2 = this.be;
        listPreference2.k(listPreference2.n());
    }

    @Override // defpackage.bszv, defpackage.fd
    public final void am() {
        super.am();
        final gga bb = bb();
        if (!dbsd.a(this.bq, this.ak.a().o())) {
            this.aF.execute(new Runnable(this, bb) { // from class: bsut
                private final bsuw a;
                private final gga b;

                {
                    this.a = this;
                    this.b = bb;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bsuw bsuwVar = this.a;
                    gga ggaVar = this.b;
                    if (((efh) bsuwVar.ag).c) {
                        return;
                    }
                    ggaVar.B(null);
                }
            });
        }
    }

    @Override // defpackage.achd
    public final achc bl(@dzsi achc achcVar) {
        return achcVar == null ? achc.SETTINGS_MENU : achcVar;
    }

    @Override // defpackage.achd
    public final boolean bm(boolean z, achc achcVar) {
        return false;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        if (this.aX) {
            String str = preference.q;
            if (bvjk.x.toString().equals(str)) {
                if (!this.ak.a().j().u()) {
                    this.ah.i(cjtd.a(dtyi.cX));
                }
                this.aj.k(null, null);
                return true;
            } else if ("commute".equals(str)) {
                this.ah.i(cjtd.a(dtxl.bX));
                this.as.a().e();
                return true;
            } else if ("edit_home_work".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cQ));
                this.an.a().o();
                return true;
            } else if ("pinned_trips".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cY));
                this.at.a().a.D(new smz());
                return true;
            } else if ("dark_mode".equals(str)) {
                cjqy cjqyVar = this.ah;
                cjqp f = this.ai.f(this.P);
                cjta b = cjtd.b();
                b.d = dtxn.f;
                cjql d = f.d(b.a());
                cjta b2 = cjtd.b();
                b2.d = dtxn.f;
                cjqyVar.j(d, b2.a());
                bb().C(new btae(), gfu.DIALOG_FRAGMENT, new gfs[0]);
                return true;
            } else if ("app_language_picker".equals(str)) {
                ba(bb(), new btbx());
                return true;
            } else if ("location_reporting".equals(str)) {
                this.am.a().i();
                return true;
            } else if ("personal_content".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cX));
                this.aq.a().l();
                return true;
            } else if ("accessibility".equals(str)) {
                cjqp f2 = this.ai.f(this.P);
                cjqy cjqyVar2 = this.ah;
                cjta b3 = cjtd.b();
                b3.d = dtyb.cN;
                cjql d2 = f2.d(b3.a());
                cjte cjteVar = new cjte(deaf.TAP);
                cjta b4 = cjtd.b();
                b4.d = dtyb.cN;
                cjqyVar2.n(d2, cjteVar, b4.a());
                bb().D(new bsvl());
                f2.d(cjtd.a(dtxj.c));
                return true;
            } else if ("improve_location".equals(str)) {
                this.al.a().f(true, new arae(this) { // from class: bsuj
                    private final bsuw a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.arae
                    public final void a(araf arafVar) {
                        ff J = this.a.J();
                        if (arafVar == araf.OPTIMIZED) {
                            Toast.makeText(J, (int) R.string.LOCATION_SETTING_IS_ALREADY_OPTIMIZED, 0).show();
                        }
                    }
                });
                return true;
            } else if ("maps_history".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cT));
                bvxn bZ = bvxu.A.bZ();
                String str2 = this.aI.getClientUrlParameters().f;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar = (bvxu) bZ.b;
                str2.getClass();
                int i = bvxuVar.a | 1;
                bvxuVar.a = i;
                bvxuVar.b = str2;
                int i2 = i | 4;
                bvxuVar.a = i2;
                bvxuVar.d = true;
                bvxuVar.a = i2 | 32;
                bvxuVar.g = true;
                bvxu.b(bvxuVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar2 = (bvxu) bZ.b;
                int i3 = bvxuVar2.a | 8;
                bvxuVar2.a = i3;
                bvxuVar2.e = true;
                bvxuVar2.a = i3 | 64;
                bvxuVar2.h = "aGMM.MyActivity";
                bvxu.d(bvxuVar2);
                bvxp f3 = bvoa.f(ibm.b(), J());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar3 = (bvxu) bZ.b;
                f3.getClass();
                bvxuVar3.x = f3;
                int i4 = bvxuVar3.a | 4194304;
                bvxuVar3.a = i4;
                bvxuVar3.a = i4 | 16;
                bvxuVar3.f = 1;
                dkyw bZ2 = dkyx.f.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkyx.b((dkyx) bZ2.b);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkyx.c((dkyx) bZ2.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar4 = (bvxu) bZ.b;
                dkyx bK = bZ2.bK();
                bK.getClass();
                bvxuVar4.j = bK;
                bvxuVar4.a |= 256;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar5 = (bvxu) bZ.b;
                int i5 = bvxuVar5.a | 512;
                bvxuVar5.a = i5;
                bvxuVar5.k = true;
                bvxuVar5.a = i5 | 2048;
                bvxuVar5.m = true;
                this.av.a().k(bZ.bK(), null, dtxv.dW);
                return true;
            } else if ("ev_profile".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cR));
                bb().D(new brcv());
                return true;
            } else if ("navigation_settings".equals(str)) {
                this.ah.i(cjtd.a(dtyb.cU));
                ba(bb(), new btem());
                return true;
            } else {
                bvjk.A.toString();
                if ("offline_settings".equals(str)) {
                    this.ah.i(cjtd.a(dtyb.cV));
                    this.aG.a().k();
                    return true;
                } else if (bvjk.I.toString().equals(str)) {
                    boolean z = ((TwoStatePreference) preference).a;
                    cjqy cjqyVar3 = this.ah;
                    cjte cjteVar2 = new cjte(deaf.TAP);
                    cjta b5 = cjtd.b();
                    b5.d = dtyb.db;
                    ddzy bZ3 = deab.c.bZ();
                    deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    deab deabVar = (deab) bZ3.b;
                    deabVar.b = deaaVar.d;
                    deabVar.a |= 1;
                    b5.a = bZ3.bK();
                    cjqyVar3.m(cjteVar2, b5.a());
                    return true;
                } else if (bvjk.E.toString().equals(str)) {
                    return true;
                } else {
                    if ("about".equals(str)) {
                        this.ah.i(cjtd.a(dtyb.cM));
                        ba(bb(), new bstl());
                        return true;
                    } else if ("sign_in_out".equals(str)) {
                        if (this.bp == btlt.GOOGLE) {
                            this.aj.c(akez.USER_TRIGERRED_SIDEMENU);
                        } else {
                            this.aj.k(null, null);
                        }
                        return true;
                    } else if ("notifications".equals(str)) {
                        this.ah.i(cjtd.a(dtxw.ee));
                        int a = dkqd.a(this.aI.getNotificationsParameters().t);
                        if (a == 0) {
                            a = 1;
                        }
                        in a2 = in.a(J());
                        if ((a == 3 || a == 4) && !a2.f()) {
                            this.ah.i(cjtd.a(dtxw.dX));
                        }
                        ba(bb(), new btfw());
                        return true;
                    } else if ("messages".equals(str)) {
                        if (bd().a() && this.aO.containsKey("messages")) {
                            cjta b6 = cjtd.b();
                            b6.d = dtyb.cO;
                            this.ah.j(this.aO.get("messages"), b6.a());
                        }
                        this.aD.a().E();
                        return true;
                    } else if ("explore_preferences".equals(str)) {
                        ba(bb(), new bstw());
                        return true;
                    } else if ("manage_preferences".equals(str)) {
                        this.am.a().t();
                        return true;
                    } else if (!"personalization_list".equals(str)) {
                        if (!bvjk.et.toString().equals(str)) {
                            return false;
                        }
                        boolean z2 = ((TwoStatePreference) preference).a;
                        cjqy cjqyVar4 = this.ah;
                        cjqp f4 = this.ai.f(this.P);
                        cjta b7 = cjtd.b();
                        b7.d = dtyb.dk;
                        cjql d3 = f4.d(b7.a());
                        cjte cjteVar3 = new cjte(deaf.TAP);
                        cjta b8 = cjtd.b();
                        b8.d = dtyb.dk;
                        ddzy bZ4 = deab.c.bZ();
                        deaa deaaVar2 = z2 ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        deab deabVar2 = (deab) bZ4.b;
                        deabVar2.b = deaaVar2.d;
                        deabVar2.a |= 1;
                        b8.a = bZ4.bK();
                        cjqyVar4.n(d3, cjteVar3, b8.a());
                        return true;
                    } else {
                        this.ao.a().l();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ListPreference listPreference;
        if (!this.aX) {
            return;
        }
        if (bvjk.z.toString().equals(str) && this.be != null) {
            this.af.b(new btar());
            ListPreference listPreference2 = this.be;
            listPreference2.k(listPreference2.n());
        }
        if (bvjk.H.toString().equals(str) && (listPreference = this.bf) != null) {
            listPreference.k(listPreference.n());
        }
        bi();
    }

    @Override // defpackage.aup
    public final void p(@dzsi Bundle bundle) {
        Preference Ri;
        this.ak.a();
        if (bundle == null) {
            this.bq = this.ak.a().o();
        } else {
            this.bq = bundle.getString("accountNameAtCreation");
        }
        this.b.b = this.ad.h();
        f(R.xml.settings);
        this.aJ = d();
        this.ba = Ri("edit_home_work");
        this.bd = Ri("maps_history");
        this.aK = Ri("ev_profile");
        Preference Ri2 = Ri("commute");
        this.bb = Ri2;
        Ri2.ae();
        Preference Ri3 = Ri("pinned_trips");
        this.bc = Ri3;
        if (Ri3 != null) {
            Ri3.ae();
        }
        Ri(bvjk.I.toString()).J(this.bw);
        Preference Ri4 = Ri(bvjk.E.toString());
        this.bi = Ri4;
        Ri4.J(this.bx);
        Ri(bvjk.et.toString()).J(this.by);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) Ri("two_direction_toggle");
        this.aL = switchPreferenceCompat;
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.o = new auc(this) { // from class: bsur
                private final bsuw a;

                {
                    this.a = this;
                }

                @Override // defpackage.auc
                public final boolean a(Preference preference) {
                    bsuw bsuwVar = this.a;
                    boolean z = ((TwoStatePreference) bsuwVar.aL).a;
                    if (bsuwVar.aO.containsKey("two_direction_toggle")) {
                        cjqy cjqyVar = bsuwVar.ah;
                        cjql cjqlVar = bsuwVar.aO.get("two_direction_toggle");
                        cjta b = cjtd.b();
                        b.d = dtxn.ci;
                        ddzy bZ = deab.c.bZ();
                        deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        deab deabVar = (deab) bZ.b;
                        deabVar.b = deaaVar.d;
                        deabVar.a |= 1;
                        b.a = bZ.bK();
                        cjqyVar.j(cjqlVar, b.a());
                    }
                    if (!bsuwVar.aC.a().b(z)) {
                        bsuwVar.aL.m(!z);
                    }
                    return true;
                }
            };
            this.bs = new crzp(this) { // from class: bsus
                private final bsuw a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    bsuw bsuwVar = this.a;
                    if (bsuwVar.aL == null) {
                        return;
                    }
                    if (crzmVar.l() == qee.DISABLED || !bsuwVar.aC.a().a()) {
                        PreferenceScreen preferenceScreen = bsuwVar.aJ;
                        SwitchPreferenceCompat switchPreferenceCompat2 = bsuwVar.aL;
                        dbsk.s(switchPreferenceCompat2);
                        preferenceScreen.ak(switchPreferenceCompat2);
                        bsuwVar.aL = null;
                        return;
                    }
                    if (bsuwVar.bd().a() && !bsuwVar.aO.containsKey("two_direction_toggle")) {
                        bsuwVar.aO.put("two_direction_toggle", bsuwVar.bd().b().d(cjtd.a(dtxn.ci)));
                    }
                    bsuwVar.aL.m(!(crzmVar.l() == qee.OPTED_OUT || crzmVar.l() == qee.DOGFOOD_OPT_IN_ENABLED));
                }
            };
        }
        Preference Ri5 = Ri("dark_mode");
        this.bg = Ri5;
        if (Ri5 != null) {
            if (this.ax.a()) {
                bi();
            } else {
                this.aJ.ak(this.bg);
            }
        }
        this.aN = Ri("notifications");
        bg();
        this.bm = Ri("messages");
        aX();
        ListPreference listPreference = (ListPreference) Ri(bvjk.z.toString());
        this.be = listPreference;
        if (listPreference != null) {
            listPreference.k(listPreference.n());
        }
        Preference Ri6 = Ri("app_language_picker");
        if (Ri6 != null) {
            dbsg<Locale> b = btbp.b(this.ad.z(bvjk.Q, null));
            if (b.a()) {
                Ri6.k(b.b().getDisplayName());
            }
        }
        Preference Ri7 = Ri(aZ);
        this.bo = Ri7;
        if (Ri7 != null) {
            Ri7.J(new aub(this) { // from class: bsuq
                private final bsuw a;

                {
                    this.a = this;
                }

                @Override // defpackage.aub
                public final boolean a(Preference preference, Object obj) {
                    bsuw bsuwVar = this.a;
                    boolean equals = Boolean.TRUE.equals(obj);
                    bsuwVar.ad.S(bvjk.D, equals);
                    cjqy cjqyVar = bsuwVar.ah;
                    cjqp f = bsuwVar.ai.f(bsuwVar.P);
                    cjta b2 = cjtd.b();
                    b2.d = dtyb.cP;
                    cjql d = f.d(b2.a());
                    cjte cjteVar = new cjte(deaf.TAP);
                    cjta b3 = cjtd.b();
                    b3.d = dtyb.cP;
                    ddzy bZ = deab.c.bZ();
                    deaa deaaVar = equals ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    deab deabVar = (deab) bZ.b;
                    deabVar.b = deaaVar.d;
                    deabVar.a |= 1;
                    b3.a = bZ.bK();
                    cjqyVar.n(d, cjteVar, b3.a());
                    return true;
                }
            });
            if (!this.aH.a() || aW() == btlt.SIGNED_OUT) {
                this.aJ.aj(this.bo);
            } else {
                this.aJ.ak(this.bo);
            }
        }
        ListPreference listPreference2 = (ListPreference) Ri(bvjk.H.toString());
        this.bf = listPreference2;
        if (listPreference2 != null) {
            listPreference2.k(listPreference2.n());
        }
        this.bh = Ri("sign_in_out");
        this.aM = Ri("personal_content");
        this.bk = Ri("manage_preferences");
        this.bl = Ri("personalization_list");
        this.bj = Ri("explore_preferences");
        if (this.aI.getLocalPreferencesParameters().d.isEmpty()) {
            this.aJ.ak(this.bk);
            this.aJ.ak(this.bl);
        } else {
            this.aJ.ak(this.bj);
        }
        Preference Ri8 = Ri("follow_management");
        this.bn = Ri8;
        this.aJ.ak(Ri8);
        aU();
        if (!this.aI.getCategoricalSearchParameters().t()) {
            this.aJ.ak(Ri("accessibility"));
        }
        if (this.aI.getLanguageSettingParameters().a || (Ri = Ri("app_language_picker")) == null) {
            return;
        }
        this.aJ.ak(Ri);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        bc(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_SETTING);
        this.br = J().getTitle();
        J().setTitle(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_SETTING);
        this.aQ.a().d(this.bv, this.aF);
        this.ak.a().C().d(this.bu, this.aF);
        aS();
        this.ad.f(this);
        this.ad.n(bvjk.et).a(this.bt, this.aF);
        if (this.bs != null) {
            this.aB.a().b().d(this.bs, this.aF);
        }
    }

    @Override // defpackage.bszv, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("accountNameAtCreation", this.bq);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void u() {
        J().setTitle(this.br);
        this.aQ.a().c(this.bv);
        this.ak.a().C().c(this.bu);
        this.ad.g(this);
        this.ad.n(bvjk.et).c(this.bt);
        if (this.bs != null) {
            this.aB.a().b().c(this.bs);
        }
        super.u();
    }
}
