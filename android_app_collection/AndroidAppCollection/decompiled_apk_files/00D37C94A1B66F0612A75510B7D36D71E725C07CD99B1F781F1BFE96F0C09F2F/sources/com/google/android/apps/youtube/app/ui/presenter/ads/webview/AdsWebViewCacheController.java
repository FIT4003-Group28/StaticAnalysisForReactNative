package com.google.android.apps.youtube.app.ui.presenter.ads.webview;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdsWebViewCacheController implements f, ynl {
    public final Map a = new HashMap();
    private final yni b;
    private final ndc c;

    public AdsWebViewCacheController(yni yniVar, ndc ndcVar) {
        yniVar.getClass();
        this.b = yniVar;
        ndcVar.getClass();
        this.c = ndcVar;
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h((ncz) arrayList.get(i));
        }
    }

    public final void h(ncz nczVar) {
        if (!this.a.containsKey(nczVar)) {
            return;
        }
        AdsWebView adsWebView = (AdsWebView) this.a.get(nczVar);
        if (adsWebView != null) {
            if (adsWebView.getParent() != null) {
                ((ViewGroup) adsWebView.getParent()).removeView(adsWebView);
            }
            adsWebView.destroy();
        }
        this.a.remove(nczVar);
    }

    public final void i(Activity activity, final AdsWebView adsWebView, final String str, boolean z) {
        if (z) {
            ndc ndcVar = this.c;
            try {
                aynr.w(new afvj(activity, ndcVar.b.a(ndcVar.a.c()), str, ndc.a(adsWebView))).E(azpj.c()).Q();
                return;
            } catch (Exception e) {
                zep.d("Failed to execute GoogleSsoAuthTokenTask.", e);
                return;
            }
        }
        activity.runOnUiThread(new Runnable() { // from class: ndb
            @Override // java.lang.Runnable
            public final void run() {
                AdsWebView adsWebView2 = AdsWebView.this;
                ndc.a(adsWebView2).a(str);
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.b.g(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wgh wghVar = (wgh) obj;
                if (wghVar.a() != wgg.FINISHED || !wghVar.c()) {
                    return null;
                }
                g();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wgh.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.b.m(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
