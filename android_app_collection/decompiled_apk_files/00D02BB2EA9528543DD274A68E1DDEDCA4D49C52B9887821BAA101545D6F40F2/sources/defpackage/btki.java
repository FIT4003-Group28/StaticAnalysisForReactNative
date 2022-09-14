package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btki  reason: default package */
/* loaded from: classes4.dex */
public final class btki extends bszv {
    public dzsj<btin> aA;
    public dzsj<btjo> aB;
    public dzsj<btjl> aC;
    public beya aD;
    public dxio<bvjj> aE;
    btjq aF;
    public boolean aG;
    public boolean aH;
    @dzsi
    public int aI;
    private btjq aJ;
    @dzsi
    private btjq aK;
    @dzsi
    private btjq aL;
    @dzsi
    private btjq aM;
    private int aN;
    private int aO;
    private final Map<String, cjql> aP = new HashMap();
    private btkh aQ;
    public Context ad;
    public btvo ae;
    public btjr af;
    public ania ag;
    public btrm ah;
    public akfa ai;
    public axjh aj;
    public cjqy ak;
    public btic al;
    public btii am;
    public btjf an;
    public btix ao;
    public btja ap;
    public dxio<btjc> aq;
    public btip ar;
    public btjj as;
    public dxio<btke> at;
    public dxio<btkl> au;
    public dxio<btiu> av;
    public dxio<btjy> aw;
    public dxio<btkc> ax;
    public dxio<cafi> ay;
    public btkx az;

    public static btki aU(int i) {
        btki btkiVar = new btki();
        btkiVar.aI = i;
        return btkiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bszv
    public final jib aJ() {
        jhz e = super.aJ().e();
        e.f(new jmn(getClass()));
        return e.b();
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return J().getString(R.string.PERSONAL_CONTENT_PAGE_TITLE);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtyi.bQ;
    }

    public final void aS() {
        btjq btjqVar;
        btjq btjqVar2 = this.aL;
        if (btjqVar2 != null && btjqVar2.b) {
            btjqVar2.c();
        }
        dccx F = dcdc.F();
        btlu q = btlu.q(this.ai.j());
        if (q.l() && !q.h && this.aG) {
            F.g(this.aA.a());
        }
        if (!this.ae.getDirectionsExperimentsParameters().g) {
            F.g(this.aB.a());
        }
        if (q.l() && ((dbsj.e(q.t()).endsWith("@google.com") || !q.h) && this.aG)) {
            F.g(this.aC.a());
        }
        btjq a = this.af.a(R.string.SETTINGS_HEADER_YOUR_MAP, F.f());
        this.aL = a;
        a.d(0);
        if (!this.aX || (btjqVar = this.aL) == null) {
            return;
        }
        btjqVar.b();
    }

    public final void aT() {
        btjq btjqVar;
        PreferenceScreen preferenceScreen = this.b.d;
        preferenceScreen.ag();
        btjq btjqVar2 = this.aL;
        if (btjqVar2 != null) {
            btjqVar2.a(preferenceScreen);
        }
        btjq btjqVar3 = this.aM;
        if (btjqVar3 != null) {
            btjqVar3.a(preferenceScreen);
        }
        btjq btjqVar4 = this.aK;
        if (btjqVar4 != null) {
            btjqVar4.a(preferenceScreen);
        }
        btjq btjqVar5 = this.aJ;
        if (btjqVar5 != null) {
            btjqVar5.a(preferenceScreen);
        }
        btjq btjqVar6 = this.aF;
        if (btjqVar6 != null) {
            btjqVar6.a(preferenceScreen);
        }
        int i = this.aI;
        PreferenceCategory preferenceCategory = null;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                btjqVar = i2 != 1 ? this.aK : this.aM;
            } else {
                btjqVar = this.aL;
            }
            if (btjqVar != null) {
                preferenceCategory = btjqVar.a;
            }
        }
        if (preferenceCategory != null) {
            auj aujVar = new auj(this, preferenceCategory);
            if (this.c == null) {
                this.e = aujVar;
            } else {
                aujVar.run();
            }
        }
    }

    @Override // defpackage.bszv, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        if (bd().a()) {
            this.aP.put("profile_privacy", bd().b().d(cjtd.a(dtxy.W)));
        }
        return ag;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        if (this.aX && "profile_privacy".equals(preference.q) && this.aP.containsKey("profile_privacy")) {
            this.ak.j(this.aP.get("profile_privacy"), cjtd.a(dtxy.W));
            return true;
        }
        return false;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        int i;
        btjq btjqVar;
        this.b.b = this.aE.a().h();
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        if (bundle != null) {
            this.aH = bundle.getBoolean("obfuscatedGaiaId");
        }
        this.aQ = new btkh(this);
        ((PreferenceGroup) b).c = false;
        this.aG = this.ag.a();
        aS();
        if (this.ae.getEnableFeatureParameters().aa) {
            this.aN = 1;
            btjq btjqVar2 = this.aM;
            if (btjqVar2 != null && btjqVar2.b) {
                btjqVar2.c();
            }
            dccx dccxVar = new dccx();
            dccxVar.g(this.au.a());
            dccxVar.g(this.ar);
            dccxVar.g(this.as);
            btjq a = this.af.a(R.string.YOUR_TIMELINE, dccxVar.f());
            this.aM = a;
            a.d(this.aN);
            if (this.aX && (btjqVar = this.aM) != null) {
                btjqVar.b();
            }
            i = 2;
        } else {
            i = 1;
        }
        btjq a2 = this.af.a(R.string.SETTINGS_HEADER_APP_HISTORY, dcdc.f(this.az));
        this.aJ = a2;
        int i2 = i + 1;
        a2.d(i);
        dccx dccxVar2 = new dccx();
        dccxVar2.h(this.an, this.ao, this.ap, this.al, this.am);
        if (!this.ae.getMapsActivitiesParameters().e.isEmpty()) {
            dccxVar2.g(this.aq.a());
        }
        btjq a3 = this.af.a(R.string.SETTINGS_HEADER_LOCATION_SETTINGS, dccxVar2.f());
        this.aF = a3;
        a3.d(i2);
        this.aO = i2 + 1;
        dccx dccxVar3 = new dccx();
        btlu j = this.ai.j();
        boolean z = this.aj.e() && this.aE.a().j(bvjk.hM, j) && this.aE.a().t(bvjk.hM, j, 0) != 0;
        if (z) {
            btjy a4 = this.aw.a();
            a4.c.C("profile_privacy");
            if (this.aH) {
                a4.f = dbsg.i(new mw(this) { // from class: btkg
                    private final btki a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        btki btkiVar = this.a;
                        dqfc dqfcVar = (dqfc) obj;
                        fd G = btkiVar.G();
                        gfw gfwVar = null;
                        if (G != null) {
                            if (G instanceof gfw) {
                                gfwVar = (gfw) G;
                            } else {
                                bvoo.h("dispatchResult: Expected GmmActivityFragmentResultListener but instead found %s", G.getClass());
                            }
                        }
                        if (gfwVar != null) {
                            gfwVar.Qn(dqfcVar);
                        }
                        gga bb = btkiVar.bb();
                        if (!btkiVar.aX || bb == null) {
                            return;
                        }
                        bb.g().f();
                    }
                });
            }
            dccxVar3.h(a4, this.ax.a());
        } else if (this.ay.a().q()) {
            dccxVar3.g(this.at.a());
        }
        bexz a5 = this.aD.a(null);
        btlu j2 = this.ai.j();
        if (a5.a() && j2.l() && this.aG) {
            dccxVar3.g(this.av.a());
        }
        dcdc<btjs> f = dccxVar3.f();
        if (!f.isEmpty()) {
            btjq a6 = this.af.a(true != z ? R.string.SETTINGS_HEADER_PROFILE_SETTINGS : R.string.SETTINGS_HEADER_PRIVACY_SETTINGS, f);
            this.aK = a6;
            a6.d(this.aO);
        }
        aT();
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.ah;
        btkh btkhVar = this.aQ;
        dceq a = dcet.a();
        a.b(anlb.class, new btkj(anlb.class, btkhVar, bvrj.UI_THREAD));
        btrmVar.g(btkhVar, a.a());
        btjq btjqVar = this.aJ;
        if (btjqVar != null) {
            btjqVar.b();
        }
        btjq btjqVar2 = this.aL;
        if (btjqVar2 != null && !btjqVar2.b) {
            btjqVar2.b();
        }
        btjq btjqVar3 = this.aM;
        if (btjqVar3 != null && !btjqVar3.b) {
            btjqVar3.b();
        }
        btjq btjqVar4 = this.aK;
        if (btjqVar4 != null) {
            btjqVar4.b();
        }
        btjq btjqVar5 = this.aF;
        if (btjqVar5 != null) {
            btjqVar5.b();
        }
    }

    @Override // defpackage.bszv, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("obfuscatedGaiaId", this.aH);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void u() {
        this.ah.a(this.aQ);
        btjq btjqVar = this.aJ;
        if (btjqVar != null) {
            btjqVar.c();
        }
        btjq btjqVar2 = this.aL;
        if (btjqVar2 != null && btjqVar2.b) {
            btjqVar2.c();
        }
        btjq btjqVar3 = this.aM;
        if (btjqVar3 != null && btjqVar3.b) {
            btjqVar3.c();
        }
        btjq btjqVar4 = this.aK;
        if (btjqVar4 != null) {
            btjqVar4.c();
        }
        btjq btjqVar5 = this.aF;
        if (btjqVar5 != null) {
            btjqVar5.c();
        }
        super.u();
    }
}
