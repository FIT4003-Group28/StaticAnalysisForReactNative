package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ndd  reason: default package */
/* loaded from: classes3.dex */
public final class ndd implements ajru, xjt, emx {
    public final LoadingFrameLayout a;
    public final wkl b;
    public final snc c;
    public acti d;
    public apds e;
    public long f;
    public boolean g;
    public boolean h;
    private final Context i;
    private final emy j;
    private final AdsWebViewCacheController k;
    private final aafo l;
    private AdsWebView m;

    public ndd(Context context, wkl wklVar, snc sncVar, emy emyVar, aafo aafoVar, AdsWebViewCacheController adsWebViewCacheController) {
        this.i = context;
        wklVar.getClass();
        this.b = wklVar;
        sncVar.getClass();
        this.c = sncVar;
        emyVar.getClass();
        this.j = emyVar;
        adsWebViewCacheController.getClass();
        this.k = adsWebViewCacheController;
        aafoVar.getClass();
        this.l = aafoVar;
        this.g = true;
        this.h = false;
        this.a = (LoadingFrameLayout) LayoutInflater.from(context).inflate(R.layout.loading_ads_web_view, (ViewGroup) null, false).findViewById(R.id.loading_layout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.emx
    public final void d() {
        aopc aopcVar;
        apds apdsVar = this.e;
        if (apdsVar == null) {
            return;
        }
        AdsWebView adsWebView = this.m;
        if (adsWebView == null) {
            String valueOf = String.valueOf(apdsVar.c);
            afus.b(1, 1, valueOf.length() != 0 ? "No AdsWebView found for renderer: ".concat(valueOf) : new String("No AdsWebView found for renderer: "));
            return;
        }
        String url = adsWebView.getUrl();
        if (TextUtils.isEmpty(url)) {
            String valueOf2 = String.valueOf(this.e.c);
            afus.b(1, 1, valueOf2.length() != 0 ? "No url found for AdsWebView: ".concat(valueOf2) : new String("No url found for AdsWebView: "));
            return;
        }
        apds apdsVar2 = this.e;
        if ((apdsVar2.b & 8) != 0) {
            apzg apzgVar = apdsVar2.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                apzg apzgVar2 = this.e.f;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aopcVar = (aopc) apzgVar2.mo52toBuilder();
                aopa mo52toBuilder = ((avvk) aopcVar.qm(UrlEndpointOuterClass.urlEndpoint)).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                avvk avvkVar = (avvk) mo52toBuilder.instance;
                url.getClass();
                avvkVar.b = 1 | avvkVar.b;
                avvkVar.c = url;
                aopcVar.e(UrlEndpointOuterClass.urlEndpoint, (avvk) mo52toBuilder.mo39build());
                aopa mo52toBuilder2 = this.e.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                apds apdsVar3 = (apds) mo52toBuilder2.instance;
                apzg apzgVar3 = (apzg) aopcVar.mo39build();
                apzgVar3.getClass();
                apdsVar3.f = apzgVar3;
                apdsVar3.b |= 8;
                apds apdsVar4 = (apds) mo52toBuilder2.mo39build();
                this.e = apdsVar4;
                this.l.c((apzg) aopcVar.mo39build(), amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apdsVar4));
            }
        }
        afus.b(1, 1, "AdsWebViewPresenter base command not correctly specified.");
        aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(UrlEndpointOuterClass.urlEndpoint, avvk.a);
        aopa mo52toBuilder3 = ((avvk) aopcVar.qm(UrlEndpointOuterClass.urlEndpoint)).mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        avvk avvkVar2 = (avvk) mo52toBuilder3.instance;
        url.getClass();
        avvkVar2.b = 1 | avvkVar2.b;
        avvkVar2.c = url;
        aopcVar.e(UrlEndpointOuterClass.urlEndpoint, (avvk) mo52toBuilder3.mo39build());
        aopa mo52toBuilder22 = this.e.mo52toBuilder();
        mo52toBuilder22.copyOnWrite();
        apds apdsVar32 = (apds) mo52toBuilder22.instance;
        apzg apzgVar32 = (apzg) aopcVar.mo39build();
        apzgVar32.getClass();
        apdsVar32.f = apzgVar32;
        apdsVar32.b |= 8;
        apds apdsVar42 = (apds) mo52toBuilder22.mo39build();
        this.e = apdsVar42;
        this.l.c((apzg) aopcVar.mo39build(), amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apdsVar42));
    }

    public final void e() {
        AdsWebView adsWebView = this.m;
        if (adsWebView == null || adsWebView.getParent() != null) {
            return;
        }
        this.a.addView(this.m);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        acti actiVar;
        AdsWebView adsWebView;
        apds apdsVar = (apds) obj;
        if (apdsVar == null) {
            zag.o(this.a, false);
            return;
        }
        this.e = apdsVar;
        if (this.m == null) {
            AdsWebViewCacheController adsWebViewCacheController = this.k;
            Context context = this.i;
            String str = apdsVar.c;
            String str2 = apdsVar.d;
            if (adsWebViewCacheController.a.get(new ncz(str, str2)) == null || (adsWebView = (AdsWebView) adsWebViewCacheController.a.get(new ncz(str, str2))) == null || adsWebView.getParent() != null) {
                adsWebView = new AdsWebView(context);
                ncz nczVar = new ncz(str, str2);
                adsWebViewCacheController.h(nczVar);
                adsWebViewCacheController.a.put(nczVar, adsWebView);
            }
            this.m = adsWebView;
        }
        this.m.onResume();
        this.m.a = this;
        if (this.b.j()) {
            this.k.i((Activity) this.i, this.m, this.e.d, false);
        } else {
            apds apdsVar2 = this.e;
            if (!apdsVar2.e) {
                this.k.i((Activity) this.i, this.m, apdsVar2.d, apdsVar2.g);
            }
        }
        if (this.e.e) {
            e();
        }
        this.a.e();
        this.a.a();
        if (this.m.getProgress() != 100) {
            this.a.c();
        }
        emy emyVar = this.j;
        String str3 = apdsVar.c;
        if (str3 != null) {
            emyVar.a.put(str3, this);
        }
        zag.o(this.a, true);
        acti actiVar2 = ajrsVar.a;
        if (actiVar2 != null) {
            this.d = actiVar2;
        }
        if (this.b.j() || (actiVar = this.d) == null) {
            return;
        }
        actiVar.u(new acte(apdsVar.h), null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        apds apdsVar = this.e;
        if (apdsVar != null) {
            emy emyVar = this.j;
            emyVar.a.remove(apdsVar.c);
        }
        this.a.removeAllViews();
        AdsWebView adsWebView = this.m;
        if (adsWebView != null) {
            adsWebView.destroy();
            this.m = null;
        }
    }
}
