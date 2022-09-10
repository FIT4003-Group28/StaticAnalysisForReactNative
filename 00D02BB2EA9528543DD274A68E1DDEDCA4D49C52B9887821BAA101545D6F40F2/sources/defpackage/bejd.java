package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bejd  reason: default package */
/* loaded from: classes3.dex */
public final class bejd extends bszv {
    public ff ad;
    public Context ae;
    public bgyb af;
    public bwqv ag;
    public cklf ah;
    public dxio<acwo> ai;
    public beid aj;
    public Executor ak;
    public cjqy al;
    @dzsi
    public bwrs<bvrt<benb>> am;
    public SwitchPreferenceCompat an;
    @dzsi
    private bwrs<ilo> aq;
    private final crzp<apsi<dbsg<dgac>>> ap = new bejc(this);
    public final Map<String, dbsi<cjql, cjtd>> ao = new HashMap();

    public bejd() {
        dbsk.l(true);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void Qe() {
        crzm<apsi<dbsg<dgac>>> a;
        super.Qe();
        bwrs<ilo> bwrsVar = this.aq;
        if (bwrsVar == null || (a = this.aj.a(bwrsVar)) == null) {
            return;
        }
        a.c(this.ap);
    }

    @Override // defpackage.bszv
    protected final jib aJ() {
        jhz a = jhz.a();
        a.a = aQ();
        a.E = 1;
        a.f(new View.OnClickListener(this) { // from class: beiz
            private final bejd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.ad.onBackPressed();
            }
        });
        a.x = false;
        a.l = this.ad.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        bwrs<ilo> bwrsVar = this.aq;
        if (bwrsVar != null) {
            a.c(beno.d(this.ad, this.ah, bwrsVar));
        }
        return a.b();
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return this.ad.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtxv.aR;
    }

    @Override // defpackage.bszv, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        bwrs<ilo> bwrsVar = this.aq;
        if (bwrsVar != null) {
            crzm<apsi<dbsg<dgac>>> a = this.aj.a(bwrsVar);
            if (a != null) {
                a.a(this.ap, this.ak);
            }
            if (bd().a()) {
                bwrs<ilo> bwrsVar2 = this.aq;
                dbsk.s(bwrsVar2);
                ilo c = bwrsVar2.c();
                cjta c2 = cjtd.c(c == null ? null : c.bZ());
                c2.d = dtxv.aS;
                cjtd a2 = c2.a();
                this.ao.put("turn_on_calls_settings", dbsi.a(bd().b().d(a2), a2));
            }
        }
        return ag;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        try {
            bwrs<ilo> e = this.ag.e(ilo.class, this.o, "MerchantCallsSettingsFragment.placemark");
            this.aq = e;
            if (e != null) {
                PreferenceScreen b = this.b.b(this.ad);
                e(b);
                final bwrs<ilo> bwrsVar = this.aq;
                dbsk.s(bwrsVar);
                SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ae);
                switchPreferenceCompat.C("turn_on_calls_settings");
                switchPreferenceCompat.s(this.ad.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS_TURN_ON_TITLE));
                switchPreferenceCompat.k(this.ad.getString(R.string.MERCHANT_PANEL_CALLS_SETTINGS_TURN_ON_SUBTITLE));
                boolean z = false;
                switchPreferenceCompat.t = false;
                dgab a = beno.a(bwrsVar);
                if (a != null && a.equals(dgab.TRACKING)) {
                    z = true;
                }
                switchPreferenceCompat.u = Boolean.valueOf(z);
                switchPreferenceCompat.n = new aub(this, bwrsVar) { // from class: beja
                    private final bejd a;
                    private final bwrs b;

                    {
                        this.a = this;
                        this.b = bwrsVar;
                    }

                    @Override // defpackage.aub
                    public final boolean a(Preference preference, Object obj) {
                        bejd bejdVar = this.a;
                        bwrs<ilo> bwrsVar2 = this.b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (bejdVar.ao.containsKey("turn_on_calls_settings")) {
                            dbsi<cjql, cjtd> dbsiVar = bejdVar.ao.get("turn_on_calls_settings");
                            bejdVar.al.j(dbsiVar.a, cjqg.a(booleanValue, dbsiVar.b));
                        }
                        if (booleanValue) {
                            bejdVar.aj.b(bwrsVar2);
                            return true;
                        }
                        ((beio) bejdVar.aj).c(bwrsVar2, dgab.PAUSED);
                        return true;
                    }
                };
                this.an = switchPreferenceCompat;
                b.aj(switchPreferenceCompat);
            }
        } catch (IOException e2) {
            bvoo.j(e2);
        }
        try {
            this.am = this.ag.e(bvrt.class, this.o, "MerchantCallsSettingsFragment.merchantCallsState");
        } catch (IOException e3) {
            bvoo.j(e3);
        }
    }
}
