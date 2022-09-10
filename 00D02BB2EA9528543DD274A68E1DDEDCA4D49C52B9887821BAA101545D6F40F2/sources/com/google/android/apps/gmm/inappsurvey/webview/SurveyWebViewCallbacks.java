package com.google.android.apps.gmm.inappsurvey.webview;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<SurveyWebViewCallbacks> CREATOR = new afae();
    public afad a;
    public aezz b;
    public dxio<aezk> c;
    public cqat d;
    public ckcw e;
    @dzsi
    private List<bvwz> f = null;
    private final SurveyData g;

    public SurveyWebViewCallbacks(SurveyData surveyData) {
        this.g = surveyData;
    }

    private final void k() {
        this.c.a().f();
        this.c.a().k(aezl.GENERIC_ERROR, this.g);
    }

    private final void l(Context context) {
        ((afaf) btsq.c(afaf.class, context)).wJ(this);
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        k();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        List<bvwz> list = this.f;
        if (list != null) {
            return list;
        }
        l(ggaVar);
        afad afadVar = this.a;
        SurveyData surveyData = this.g;
        afad.a(surveyData, 1);
        dxio a = ((dxjh) afadVar.a).a();
        afad.a(a, 2);
        gga a2 = afadVar.b.a();
        afad.a(a2, 3);
        afac afacVar = new afac(surveyData, a, a2);
        SurveyData surveyData2 = this.g;
        if (surveyData2 != null) {
            aezv aezvVar = new aezv(surveyData2);
            aezz aezzVar = this.b;
            SurveyData surveyData3 = this.g;
            aezz.a(surveyData3, 1);
            dxio a3 = ((dxjh) aezzVar.a).a();
            aezz.a(a3, 2);
            gga a4 = aezzVar.b.a();
            aezz.a(a4, 3);
            dcdc h = dcdc.h(afacVar, aezvVar, new aezy(surveyData3, a3, a4));
            this.f = h;
            return h;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean e(@dzsi WebView webView) {
        if (webView == null) {
            return false;
        }
        l(webView.getContext());
        return this.c.a().l();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void f(bvxh bvxhVar) {
        if (this.d == null || this.c == null) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.d.b());
        Long d = this.g.d();
        if (d == null || seconds < d.longValue()) {
            return;
        }
        this.c.a().f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webView == null) {
            return false;
        }
        l(webView.getContext());
        if (Build.VERSION.SDK_INT >= 23) {
            webResourceError.getErrorCode();
            webResourceError.getDescription();
            webResourceRequest.getUrl();
        }
        String path = webResourceRequest.getUrl().getPath();
        if (path != null) {
            if (path.contains("/answer")) {
                ((ckcn) this.e.a(ckfl.a)).a();
                return true;
            } else if (path.endsWith("/favicon.ico")) {
                return true;
            } else {
                if (path.startsWith("/insights/consumersurveys")) {
                    k();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void h() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void i(gga ggaVar) {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void j() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.g, i);
    }
}
