package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apmg  reason: default package */
/* loaded from: classes2.dex */
public final class apmg extends ges {
    private static final dcep<String> au = dcep.B("google.com");
    public btbd a;
    public bwdc ad;
    public apll ae;
    public anle af;
    public btvo ag;
    public dzsj<bvvw> ah;
    public gce ai;
    public btrm aj;
    public bvwt ak;
    public Executor al;
    public dehq am;
    public cqkf<apml> an;
    public bvwv ao;
    public apmm ap;
    public boolean aq = false;
    public bvwp ar = null;
    public dehn<?> as;
    public bvtd at;
    private aplr av;
    private ckoy aw;
    public dzsj<efg> b;
    public cqkj c;
    public bvxz d;
    public aplp e;
    public apmn f;
    public ckox g;

    private final TransparentWebViewConfig aS() {
        TransparentWebViewConfig transparentWebViewConfig = (TransparentWebViewConfig) this.o.getParcelable("TransparentWebViewFragment.WebViewConfig");
        dbsk.s(transparentWebViewConfig);
        return transparentWebViewConfig;
    }

    private static final apln aT(View view) {
        apln aplnVar = (apln) cqhu.a(view, apmk.a);
        dbsk.s(aplnVar);
        return aplnVar;
    }

    public static apmg g(TransparentWebViewConfig transparentWebViewConfig) {
        apmg apmgVar = new apmg();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TransparentWebViewFragment.WebViewConfig", transparentWebViewConfig);
        apmgVar.B(bundle);
        return apmgVar;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        this.ao.k().b(obj);
    }

    public final void aJ(ddyq ddyqVar) {
        dbsk.s(this.as);
        this.as.cancel(false);
        w(ddyqVar);
        if (!aS().f()) {
            this.al.execute(new Runnable(this) { // from class: aplw
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    apmm apmmVar = this.a.ap;
                    apmmVar.b = true;
                    cqhn cqhnVar = apmmVar.a;
                    cqkx.p(apmmVar);
                }
            });
        }
    }

    @Override // defpackage.ges, defpackage.ggg
    public final List<gfs> aO() {
        return (List) aS().c().h(aplx.a).c(dcdc.e());
    }

    public final String aR() {
        String a = this.ad.a(aS().a());
        if (this.ai.h()) {
            bvxs bvxsVar = bvxs.d;
            return bwdc.b(a, bvxsVar.b, bvxsVar.c);
        }
        return a;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final byte[] byteArray;
        cqkf<apml> cqkfVar = this.an;
        if (cqkfVar != null) {
            return cqkfVar.c();
        }
        cqkf<apml> c = this.c.c(new apmk(), null);
        this.an = c;
        apln aT = aT(c.c());
        WebSettings settings = aT.getSettings();
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setUserAgentString(String.format("%s [%s/%s]", aT.getSettings().getUserAgentString(), "AndroidMapsWebView", "10.55.4"));
        CookieManager.getInstance().setAcceptCookie(true);
        WebView.setWebContentsDebuggingEnabled(false);
        aplp aplpVar = this.e;
        apmc apmcVar = new apmc(this);
        cxnh a = aplpVar.a.a();
        aplp.a(a, 1);
        aplp.a(apmcVar, 2);
        aT.setWebViewClient(new aplo(a, apmcVar));
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.a();
        }
        bvwt bvwtVar = this.ak;
        ((ftb) bvwtVar).f(aT);
        bvwtVar.d(aS().b());
        bvwtVar.e(dcdc.e());
        bvwtVar.c(dbpy.a);
        bvwv g = bvwtVar.g();
        this.ao = g;
        g.n().a();
        double l = this.ao.l();
        dzsj<dmim> m = this.ao.m();
        aT.a = l;
        aT.b = m;
        apmn apmnVar = this.f;
        dehn<Void> f = this.ao.f();
        apll apllVar = this.ae;
        Runnable runnable = new Runnable(this) { // from class: aplu
            private final apmg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apmg apmgVar = this.a;
                apmm apmmVar = apmgVar.ap;
                apmmVar.b = false;
                cqhn cqhnVar = apmmVar.a;
                cqkx.p(apmmVar);
                apmgVar.aq = false;
                apmgVar.i();
            }
        };
        gga a2 = apllVar.a.a();
        apll.a(a2, 1);
        apll.a(runnable, 2);
        aplk aplkVar = new aplk(a2, runnable);
        aplj a3 = apmnVar.a.a();
        apmn.a(a3, 1);
        cqhn a4 = apmnVar.b.a();
        apmn.a(a4, 2);
        apmn.a(f, 3);
        apmn.a(aplkVar, 4);
        apmm apmmVar = new apmm(a3, a4, f, aplkVar);
        this.ap = apmmVar;
        this.an.e(apmmVar);
        if (this.av != null) {
            z = false;
        }
        dbsk.l(z);
        aplr aplrVar = new aplr(this.ao.d());
        this.av = aplrVar;
        btrm btrmVar = this.aj;
        dceq a5 = dcet.a();
        a5.b(anla.class, new apls(anla.class, aplrVar, bvrj.UI_THREAD));
        btrmVar.g(aplrVar, a5.a());
        if (bundle != null && (byteArray = bundle.getByteArray("TransparentWebViewFragment.WebViewState")) != null) {
            this.ao.f().Pk(new Runnable(this, byteArray) { // from class: apmf
                private final apmg a;
                private final byte[] b;

                {
                    this.a = this;
                    this.b = byteArray;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    apmg apmgVar = this.a;
                    byte[] bArr = this.b;
                    bvws d = apmgVar.ao.d();
                    dmda bZ = dmdb.c.bZ();
                    dspd x = dspd.x(bArr);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmdb dmdbVar = (dmdb) bZ.b;
                    x.getClass();
                    dmdbVar.a |= 1;
                    dmdbVar.b = x;
                    d.b(bZ.bK(), dmdb.d);
                }
            }, this.am);
        }
        return this.an.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        if (!aS().f()) {
            this.ao.n().b();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.ao.n().c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.ao.n().d();
        ckoy ckoyVar = this.aw;
        if (ckoyVar != null) {
            ckoyVar.c(0);
        }
        dbsk.s(this.av);
        this.aj.a(this.av);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        WebView q = q();
        if (q.canGoBack()) {
            q.goBack();
            return true;
        }
        return false;
    }

    public final void i() {
        dehn<Void> e;
        bvrj.UI_THREAD.c();
        this.ar = this.ao.e().c(ckku.b);
        this.as = this.am.d(new Runnable(this) { // from class: aply
            private final apmg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apmg apmgVar = this.a;
                if (apmgVar.ao.f().isDone()) {
                    return;
                }
                apmgVar.al.execute(new Runnable(apmgVar) { // from class: aplv
                    private final apmg a;

                    {
                        this.a = apmgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.q().stopLoading();
                    }
                });
                ddyf bZ = ddyq.K.bZ();
                drtc drtcVar = drtc.DEADLINE_EXCEEDED;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddyq ddyqVar = (ddyq) bZ.b;
                ddyqVar.A = drtcVar.s;
                ddyqVar.b |= 8;
                apmgVar.aJ(bZ.bK());
            }
        }, aS().h(), TimeUnit.MILLISECONDS);
        if (this.ag.getEnableFeatureParameters().br) {
            bvvw a = this.ah.a();
            if (this.aq) {
                e = a.f(au);
            } else {
                e = a.e(au);
            }
            deee.g(deew.h(degp.q(e), new dbrn(this) { // from class: aplz
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    apmg apmgVar = this.a;
                    Void r2 = (Void) obj;
                    apmgVar.q().loadUrl(apmgVar.aR());
                    return null;
                }
            }, this.al), Exception.class, new dbrn(this) { // from class: apma
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    apmg apmgVar = this.a;
                    Exception exc = (Exception) obj;
                    ddyf bZ = ddyq.K.bZ();
                    drtc drtcVar = drtc.UNAUTHENTICATED;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddyq ddyqVar = (ddyq) bZ.b;
                    ddyqVar.A = drtcVar.s;
                    ddyqVar.b |= 8;
                    apmgVar.aJ(bZ.bK());
                    return null;
                }
            }, this.al);
            return;
        }
        this.d.b(aR(), new bvxy(this) { // from class: apmb
            private final apmg a;

            {
                this.a = this;
            }

            @Override // defpackage.bvxy
            public final void a(String str) {
                apmg apmgVar = this.a;
                if (str == null) {
                    ddyf bZ = ddyq.K.bZ();
                    drtc drtcVar = drtc.UNAUTHENTICATED;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddyq ddyqVar = (ddyq) bZ.b;
                    ddyqVar.A = drtcVar.s;
                    ddyqVar.b |= 8;
                    apmgVar.aJ(bZ.bK());
                    return;
                }
                apmgVar.q().loadUrl(str);
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        TransparentWebViewConfig aS = aS();
        if (aS.g().a()) {
            ckoy b = this.g.b(aS.g().b(), aS.b(), ckow.SELF_MANAGED, true, true, false, false);
            this.aw = b;
            b.b(0);
        }
    }

    public final WebView q() {
        View c = this.an.c();
        dbsk.s(c);
        return aT(c);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (q().getUrl() == null) {
            i();
            this.ao.f().Pk(new Runnable(this) { // from class: aplt
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    apmg apmgVar = this.a;
                    dbsk.s(apmgVar.as);
                    if (apmgVar.as.cancel(false)) {
                        dbsk.s(apmgVar.ar);
                        apmgVar.w(ddyq.K);
                    }
                }
            }, this.al);
        }
        if (!aS().f()) {
            efg a = this.b.a();
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(this.an.c());
            egjVar.y(true);
            egf a2 = egf.a();
            TransparentWebViewConfig aS = aS();
            a2.l(aS.d());
            if (!aS.e()) {
                a2.p();
                a2.o();
                a2.p = true;
                a2.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
            }
            egjVar.A(a2);
            egjVar.x(egr.b);
            aljk aljkVar = new aljk();
            aljkVar.a(true);
            egjVar.z(aljkVar);
            egjVar.m(this.ao.i());
            egjVar.o(cjxf.MOD_SMALL);
            egjVar.Y(false);
            egjVar.C(new dbty(this) { // from class: apmd
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return Integer.valueOf(this.a.ao.h().get());
                }
            });
            a.a(egjVar.a());
            this.ao.f().Pk(new Runnable(this) { // from class: apme
                private final apmg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    apml d = this.a.an.d();
                    dbsk.s(d);
                    cqkx.p(d);
                }
            }, this.al);
            this.af.a();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putByteArray("TransparentWebViewFragment.WebViewState", this.ao.g().G());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (!aS().f()) {
            this.af.b();
        }
        super.u();
    }

    public final void w(ddyq ddyqVar) {
        this.ao.e().a(ckku.a, ddyqVar);
        bvwp bvwpVar = this.ar;
        dbsk.s(bvwpVar);
        bvwpVar.a(ddyqVar);
    }
}
