package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: bstq  reason: default package */
/* loaded from: classes4.dex */
public final class bstq extends bszv implements aub, wtm {
    public static final /* synthetic */ int ak = 0;
    private static final cqtd al = cqtt.c();
    private static final Comparator<bxzt> am = bsto.a;
    public Context ad;
    public Activity ae;
    public wto af;
    public vtn ag;
    public zgc ah;
    public int aj = 1;
    private dcdn<String, bxzt> an = dcmn.a;
    public final Map<String, cqtd> ai = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String aS(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "ATE_SETTINGS_PROVIDER:".concat(valueOf) : new String("ATE_SETTINGS_PROVIDER:");
    }

    private final void aU(int i, @dzsi Integer num, boolean z) {
        Preference ah = d().ah("ATE_SETTINGS_TEXT:MAIN");
        if (ah == null) {
            d().ag();
            ah = new bstp(this.ad);
            ah.C("ATE_SETTINGS_TEXT:MAIN");
            d().aj(ah);
        }
        ah.t(i);
        ah.t = false;
        ah.A(z);
        ah.x(num.intValue());
    }

    private final void aV(SwitchPreferenceCompat switchPreferenceCompat, final bxzt bxztVar) {
        String aS = aS(bxztVar.a());
        switchPreferenceCompat.s(bxztVar.c());
        switchPreferenceCompat.C(aS);
        boolean z = false;
        switchPreferenceCompat.t = false;
        switchPreferenceCompat.k(this.ad.getString(bsud.ATE_SETTINGS_PROVIDER_DESC, bxztVar.c()));
        switchPreferenceCompat.G(true);
        if (bxztVar.b() == bxzs.CONSENT_STATUS_ACCEPTED) {
            z = true;
        }
        switchPreferenceCompat.m(z);
        switchPreferenceCompat.J(this);
        switchPreferenceCompat.y(true);
        cqtd cqtdVar = this.ai.get(aS);
        if (cqtdVar == null) {
            String a = byaf.a(bxztVar.e());
            cqtd f = a != null ? this.ag.f(a, bvlw.a, new vtk(this, bxztVar) { // from class: bstn
                private final bstq a;
                private final bxzt b;

                {
                    this.a = this;
                    this.b = bxztVar;
                }

                @Override // defpackage.vtk
                public final void a(cqtd cqtdVar2) {
                    bstq bstqVar = this.a;
                    bstqVar.ai.put(bstq.aS(this.b.a()), cqtdVar2);
                    bstqVar.aT();
                }
            }) : null;
            if (f == null) {
                f = al;
            }
            cqtdVar = f;
            this.ai.put(aS, cqtdVar);
        }
        switchPreferenceCompat.v(cqtdVar.a(this.ad));
    }

    private final void aW(int i) {
        if (i != this.aj) {
            int i2 = i - 1;
            wtl wtlVar = wtl.LOADING_STARTED;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                aY(true);
                d().ag();
            } else if (i2 == 2) {
                aY(false);
                aU(bsud.ATE_SETTINGS_DESC_TITLE, Integer.valueOf(bsud.ATE_SETTINGS_DESC_MSG), false);
                aT();
            } else if (i2 == 3) {
                aY(false);
                d().ag();
                aU(bsud.ATE_SETTINGS_LOADING_FAILED_TITLE, Integer.valueOf(bsud.ATE_SETTINGS_LOADING_FAILED_MSG), true);
            }
            this.aj = i;
        }
    }

    @Override // defpackage.wtm
    public final void Rh(wtl wtlVar) {
        if (!this.aX) {
            return;
        }
        int i = this.aj;
        View findViewById = this.ae.findViewById(16908290);
        wtl wtlVar2 = wtl.LOADING_STARTED;
        int ordinal = wtlVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ckos.b(findViewById, bsud.ATE_SETTINGS_CONSENT_LOAD_FAILED, -1).c();
                    i = 4;
                } else if (ordinal == 3) {
                    i = 5;
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        ckos.b(findViewById, bsud.ATE_SETTINGS_CONSENT_UPDATE_FAILED, -1).c();
                    }
                }
            }
            i = 3;
        } else {
            i = 2;
        }
        aW(i);
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        if (!this.aX || !(obj instanceof Boolean)) {
            return false;
        }
        String str = preference.q;
        if (!"ATE_SETTINGS_TEXT:MAIN".equals(str) || this.aj != 4) {
            bxzt bxztVar = this.an.get(str);
            if (bxztVar != null) {
                PreferenceScreen d = d();
                int n = d.n();
                for (int i = 0; i < n; i++) {
                    Preference o = d.o(i);
                    if (o instanceof SwitchPreferenceCompat) {
                        o.y(false);
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    zgc zgcVar = this.ah;
                    zga zgaVar = new zga(this) { // from class: bstm
                        private final bstq a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.zga
                        public final void a(bxzt bxztVar2, boolean z) {
                            bstq bstqVar = this.a;
                            if (z) {
                                bstqVar.af.h(bxztVar2.a(), true);
                            } else if (bstqVar.aj != 3) {
                            } else {
                                bstqVar.aT();
                            }
                        }
                    };
                    ff ffVar = (ff) ((dxjd) zgcVar.a).a;
                    zgc.a(ffVar, 1);
                    afha a = zgcVar.b.a();
                    zgc.a(a, 2);
                    wto a2 = zgcVar.c.a();
                    zgc.a(a2, 3);
                    cqkj a3 = zgcVar.d.a();
                    zgc.a(a3, 4);
                    bsvm a4 = zgcVar.e.a();
                    zgc.a(a4, 5);
                    vtn a5 = zgcVar.f.a();
                    zgc.a(a5, 6);
                    zgc.a(bxztVar, 7);
                    new zgb(ffVar, a, a2, a3, a4, a5, bxztVar, false, zgaVar).h();
                } else {
                    this.af.h(bxztVar.a(), false);
                }
            }
        } else {
            aW(2);
            this.af.a();
            this.af.d();
        }
        return true;
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return this.ad.getString(bsud.ATE_SETTINGS_TITLE);
    }

    public final void aT() {
        SwitchPreferenceCompat switchPreferenceCompat;
        PreferenceScreen d = d();
        dcdg p = dcdn.p();
        dbsg<Collection<bxzt>> d2 = this.af.d();
        int i = 1;
        if (d2.a()) {
            TreeSet<bxzt> treeSet = new TreeSet(am);
            treeSet.addAll(d2.b());
            for (bxzt bxztVar : treeSet) {
                if (i < d.n()) {
                    switchPreferenceCompat = (SwitchPreferenceCompat) d.o(i);
                } else {
                    switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
                    d.aj(switchPreferenceCompat);
                }
                aV(switchPreferenceCompat, bxztVar);
                p.f(switchPreferenceCompat.q, bxztVar);
                i++;
            }
        }
        while (i < d.n()) {
            d.ak(d.o(i));
        }
        this.an = p.b();
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        e(this.b.b(J()));
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        this.af.e(this);
        this.af.d();
    }

    @Override // defpackage.bszv
    public final void w() {
        ((bstr) btsx.b(bstr.class, this)).di(this);
    }
}
