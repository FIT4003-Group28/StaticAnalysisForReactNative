package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqxy  reason: default package */
/* loaded from: classes2.dex */
public class aqxy extends gen {
    public static final eaow a = eaow.d(3);
    public cqkj ad;
    public bvrb ae;
    public btpa af;
    public ahjq ag;
    public ckcw ah;
    public cqhn ai;
    public eapd aj;
    public int ak;
    areb al;
    protected cqkf<areb> am;
    public gdf b;
    public cjxo c;
    public btrm d;
    public aqyb e;
    public dxio<ache> g;

    static {
        eaow.d(10L);
    }

    public static aqxy g(int i) {
        aqxy aqxyVar = new aqxy();
        Bundle bundle = new Bundle();
        bundle.putInt("orientationAccuracy", i);
        aqxyVar.B(bundle);
        return aqxyVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        boms.a(this.ae, this.g.a());
        super.am();
    }

    public final void bn() {
        this.af.f(null, this.ag.h().d());
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        if (q()) {
            this.am = this.ad.c(new ardw(), null);
        } else {
            this.am = this.ad.c(new ardv(), null);
        }
        this.am.e(this.al);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().requestFeature(1);
        gdfVar.setContentView(this.am.c());
        gdfVar.setCanceledOnTouchOutside(true);
        this.b = gdfVar;
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bn();
        if (bundle == null) {
            bundle = this.o;
        }
        this.ak = bundle.getInt("orientationAccuracy", 0);
        this.aj = new eapd(bundle.getLong("changedToFinishedTimeMsec", 0L));
        aqyc aqycVar = new aqyc(this);
        this.al = aqycVar;
        aqycVar.a(this.ak);
        this.e.b(aqya.FIGURE_EIGHT);
        this.g.a().t(true);
        ckcw ckcwVar = this.ah;
        if (ckcwVar != null) {
            ((ckco) ckcwVar.a(ckec.a)).a(ckeb.a(3));
        }
    }

    public final boolean q() {
        return this.aj.I(0L);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (q()) {
            w(a.k(new eaow(this.aj, eapd.a())));
        }
        btrm btrmVar = this.d;
        dceq a2 = dcet.a();
        a2.b(ahlc.class, new aqxz(ahlc.class, this));
        btrmVar.g(this, a2.a());
        this.c.a(1);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("orientationAccuracy", this.ak);
        bundle.putLong("changedToFinishedTimeMsec", this.aj.a);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.c.b();
        this.d.a(this);
        super.u();
    }

    public final void w(eaow eaowVar) {
        this.ae.a(new Runnable(this) { // from class: aqxx
            private final aqxy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqxy aqxyVar = this.a;
                if (!aqxyVar.aD) {
                    return;
                }
                aqxyVar.aT();
                aqxyVar.bn();
            }
        }, bvrj.UI_THREAD, Math.max(0L, eaowVar.b));
    }
}
