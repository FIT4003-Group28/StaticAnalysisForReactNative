package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dra  reason: default package */
/* loaded from: classes6.dex */
public final class dra implements dqr, dpr {
    public final dps a;
    public final dehq b;
    public final dpw c;
    public final dhm d;
    public final dxio<dqw> e;
    @dzsi
    public ahvg f;
    @dzsi
    public String g = null;
    public boolean h = false;
    @dzsi
    public dehu i;

    public dra(dpt dptVar, dxio<dqw> dxioVar, dehq dehqVar, czo czoVar, dpw dpwVar, dhm dhmVar) {
        this.b = dehqVar;
        this.c = dpwVar;
        this.d = dhmVar;
        this.e = dxioVar;
        akfa a = dptVar.a.a();
        dpt.a(a, 1);
        Executor a2 = dptVar.b.a();
        dpt.a(a2, 2);
        ailb<aigo> a3 = dptVar.c.a();
        dpt.a(a3, 3);
        dpt.a(dptVar.d.a(), 4);
        dpt.a(czoVar, 5);
        dpt.a(this, 6);
        this.a = new dps(a, a2, a3, czoVar, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ilo iloVar;
        ahvg ahvgVar = this.f;
        if (this.h || ahvgVar == null) {
            return;
        }
        dqw a = this.e.a();
        if (a.q) {
            return;
        }
        Resources resources = a.a.getResources();
        Profile a2 = ahvgVar.a();
        a.g.setText(a2.b().c(""));
        a.h.setText(ahvgVar.i().c(""));
        dbsg<dhjz> g = ahvgVar.g();
        if (g.a()) {
            ily ilyVar = new ily();
            ilyVar.r(g.b());
            iloVar = ilyVar.d();
        } else {
            iloVar = null;
        }
        a.p.d = iloVar;
        boolean a3 = g.a();
        a.i.setVisibility(true != a3 ? 8 : 0);
        if (a3) {
            dhjz b = g.b();
            bvsl bvslVar = a.c;
            GmmLocation a4 = a.b.a();
            dbsk.s(a4);
            String c = bvslVar.c((int) akqo.e(a4.B(), new akqq(b.c, b.b)), null, true, true);
            a.i.setText(c);
            a.i.setContentDescription(ajsb.a(resources, alp.a(), R.string.DISTANCE_AWAY, c));
        }
        int i = ahvgVar.b().a & 1024;
        a.j.setVisibility(i != 0 ? 0 : 8);
        if (i != 0) {
            dqyd dqydVar = ahvgVar.b().h;
            if (dqydVar == null) {
                dqydVar = dqyd.d;
            }
            boolean z = dqydVar.b;
            dqyd dqydVar2 = ahvgVar.b().h;
            if (dqydVar2 == null) {
                dqydVar2 = dqyd.d;
            }
            int i2 = dqydVar2.c;
            a.k.setImageResource(ajut.a(z, i2));
            NumberFormat percentInstance = NumberFormat.getPercentInstance(a.a.getResources().getConfiguration().locale);
            double d = i2;
            Double.isNaN(d);
            String format = percentInstance.format(d / 100.0d);
            a.l.setText(format);
            if (a2.b().a()) {
                a.j.setContentDescription(ajsb.a(resources, alp.a(), true != z ? R.string.BATTERY_LEVEL_KNOWN_AND_NOT_CHARGING_ACCESSIBILITY_TEXT_V2 : R.string.BATTERY_LEVEL_KNOWN_AND_CHARGING_ACCESSIBILITY_TEXT_V2, a2.b().b(), Integer.valueOf(i2)));
            } else {
                a.j.setContentDescription(format);
            }
        }
        dbsg<eaow> l = ahvgVar.l(new eapd(a.d.b()));
        boolean a5 = l.a();
        a.m.setVisibility(true != a5 ? 8 : 0);
        if (a5) {
            a.m.setText(a.e.a(l.b().b));
        }
        a.n.setVisibility(true != (a3 && (i != 0 || a5)) ? 8 : 0);
        a.o.setVisibility(true != (i != 0 && a5) ? 8 : 0);
    }

    @Override // defpackage.dqr
    public final void b() {
        final dps dpsVar = this.a;
        dpsVar.f = dpsVar.b.C();
        dpsVar.f.a(dpsVar.g, dpsVar.a);
        dpsVar.c.c(dpsVar);
        dpsVar.a.execute(new Runnable(dpsVar) { // from class: dpp
            private final dps a;

            {
                this.a = dpsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dps dpsVar2 = this.a;
                crzm<btlu> crzmVar = dpsVar2.f;
                dbsk.s(crzmVar);
                dpsVar2.a(crzmVar.l());
            }
        });
    }

    @Override // defpackage.dqr
    public final void c() {
        crzp<btlu> crzpVar;
        dps dpsVar = this.a;
        crzm<btlu> crzmVar = dpsVar.f;
        if (crzmVar != null && (crzpVar = dpsVar.g) != null) {
            crzmVar.c(crzpVar);
        }
        dpsVar.c.d(dpsVar);
        dpsVar.e = null;
        dehu dehuVar = this.i;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
    }
}
