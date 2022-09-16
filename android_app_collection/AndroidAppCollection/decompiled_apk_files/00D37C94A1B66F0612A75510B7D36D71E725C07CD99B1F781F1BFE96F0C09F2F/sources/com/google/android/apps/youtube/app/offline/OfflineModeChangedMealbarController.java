package com.google.android.apps.youtube.app.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineModeChangedMealbarController implements f, ete {
    public final gnn a;
    public final yrj b;
    public final ezh c;
    public final oez d;
    public int f;
    public boolean g;
    private final Context h;
    private final airr i;
    private final gbq j;
    private final akfd k;
    private final acth l;
    private final fcl m;
    private final oet n;
    private final yni o;
    private final airw p;
    private final jsc s;
    private aypg t;
    private akff u;
    private awbs v;
    private int w;
    private final aacz x;
    private final jaj q = new jaj(this);
    private final jah r = new jah(this);
    public final Handler e = new Handler(Looper.getMainLooper());

    public OfflineModeChangedMealbarController(Context context, airr airrVar, gbq gbqVar, gnn gnnVar, sdb sdbVar, akfd akfdVar, acth acthVar, yrj yrjVar, ezh ezhVar, fcl fclVar, oet oetVar, oez oezVar, yni yniVar, airw airwVar, aacz aaczVar, jsc jscVar, byte[] bArr) {
        this.h = context;
        this.i = airrVar;
        this.j = gbqVar;
        this.a = gnnVar;
        this.k = akfdVar;
        this.l = acthVar;
        this.b = yrjVar;
        this.c = ezhVar;
        this.m = fclVar;
        this.n = oetVar;
        this.d = oezVar;
        this.o = yniVar;
        this.p = airwVar;
        this.x = aaczVar;
        this.s = jscVar;
        sdbVar.a(this);
    }

    private final akfe l() {
        akfe d = this.k.l().d(2131231722);
        d.c = this.h.getString(R.string.offline_no_content_title_offline_eligible_and_no_content);
        d.l = actj.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR;
        d.h(false);
        return d;
    }

    private final awbs m(actj actjVar) {
        this.w++;
        return this.l.oi().i(Integer.valueOf(this.w), actjVar, this.w);
    }

    @Override // defpackage.ete
    public final void g(boolean z) {
        if (z) {
            if (this.c.g().h() && this.i.d()) {
                return;
            }
            k(h());
            return;
        }
        i();
    }

    public final akff h() {
        apzg e;
        PaneDescriptor c = this.j.c();
        if (!this.m.h() || c == null || this.g) {
            return null;
        }
        if (this.c.g().h()) {
            oeu oeuVar = this.n.a;
            if (oeuVar != null) {
                if (oeuVar.k() == 3) {
                    return null;
                }
                oan l = oeuVar.l();
                if (l != null) {
                    String c2 = l.h.c();
                    if (!amps.e(c2) && this.m.l(c2)) {
                        return null;
                    }
                }
            }
        } else {
            gbd e2 = this.j.e();
            if (((e2 instanceof esr) && ((esr) e2).a()) || this.s.d(c) || (e = c.e()) == null || ((apnv) e.qm(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FElibrary")) {
                return null;
            }
        }
        if (!this.m.e()) {
            akfe l2 = l();
            l2.d = this.h.getString(R.string.offline_navigate_to_downloads_detail_text);
            return l2.a(this.h.getString(R.string.offline_navigate_to_downloads_action_text), new jaf(this, 2)).c(this.h.getString(R.string.offline_navigate_to_downloads_dismiss_text), new jaf(this, 3)).e();
        }
        boolean n = this.m.n();
        int i = true != n ? R.string.offline_no_content_body_text_has_both_downloads_and_recommendations : R.string.offline_no_content_body_text_has_download_recommendations;
        int i2 = true != n ? R.string.offline_no_content_title_offline_eligible_and_has_content : R.string.offline_no_content_title_has_download_recommendations;
        akfe d = l().d(2131231396);
        d.c = this.h.getString(i2);
        d.d = this.h.getString(i);
        akfe c3 = d.a(this.h.getString(R.string.offline_no_content_button_text_has_download_recommendations), new jaf(this, 1)).c(this.h.getString(R.string.offline_navigate_to_downloads_dismiss_text), new jaf(this));
        c3.l = actj.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR;
        return c3.e();
    }

    public final void i() {
        akff akffVar = this.u;
        if (akffVar != null) {
            this.k.m(akffVar);
            this.u = null;
        }
    }

    public final void j(actj actjVar) {
        if (this.v == null) {
            zep.l("Missing offline mealbar visual element");
        }
        if (actjVar != null) {
            this.l.oi().H(3, new acte(actjVar), null);
        }
    }

    public final void k(akff akffVar) {
        if (akffVar != null) {
            this.k.n(akffVar);
            this.g = true;
            this.u = akffVar;
            actj actjVar = akffVar.l;
            if (actjVar == null) {
                return;
            }
            this.v = m(actjVar);
            this.l.oi().n(acun.a(this.v));
            awbs awbsVar = this.v;
            if (awbsVar == null) {
                zep.l("Missing offline mealbar visual element");
                return;
            }
            awbs m = m(this.m.e() ? actj.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_GOTO_BUTTON : actj.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_GOTO_BUTTON);
            awbs m2 = m(this.m.e() ? actj.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_CANCEL_BUTTON : actj.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_CANCEL_BUTTON);
            acti oi = this.l.oi();
            oi.o(acun.a(m), acun.a(awbsVar));
            oi.o(acun.a(m2), acun.a(awbsVar));
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.x)) {
            aypg aypgVar = this.t;
            if (aypgVar != null) {
                azof.f((AtomicReference) aypgVar);
                this.t = null;
            }
        } else {
            this.o.m(this.q);
        }
        this.o.m(this.r);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.x)) {
            aynx aynxVar = this.p.G().i;
            final jaj jajVar = this.q;
            jajVar.getClass();
            this.t = aynxVar.aa(new ayqb() { // from class: jag
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    jaj.this.a((ahia) obj);
                }
            }, ick.f);
        } else {
            this.o.g(this.q);
        }
        this.o.g(this.r);
    }
}
