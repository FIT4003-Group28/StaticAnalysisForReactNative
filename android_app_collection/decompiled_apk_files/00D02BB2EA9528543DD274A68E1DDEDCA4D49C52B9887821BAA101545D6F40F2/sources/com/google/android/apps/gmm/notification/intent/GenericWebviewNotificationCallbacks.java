package com.google.android.apps.gmm.notification.intent;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GenericWebviewNotificationCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<GenericWebviewNotificationCallbacks> CREATOR = new aurw();
    public aurv a;
    public ckcw b = ((ckcu) btsr.a(ckcu.class)).rU();
    @dzsi
    public final int c;

    public GenericWebviewNotificationCallbacks(@dzsi int i) {
        this.c = i;
    }

    public static int k(@dzsi String str) {
        char c;
        if (dbsj.d(str)) {
            return 1;
        }
        String b = dbqa.b(str);
        int hashCode = b.hashCode();
        if (hashCode != 96717694) {
            if (hashCode == 2078055881 && b.equals("NOTIFICATION_COHORT")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (b.equals("EMAIL_AND_NOTIFICATION_COHORT")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return 2;
        }
        return c != 1 ? 1 : 3;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        ((aurx) btsq.b(aurx.class, ggaVar)).xe(this);
        Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((aurx) btsq.b(aurx.class, ggaVar)).xe(this);
        aurv aurvVar = this.a;
        gga a = aurvVar.a.a();
        aurv.a(a, 1);
        dxio a2 = ((dxjh) aurvVar.b).a();
        aurv.a(a2, 2);
        aurv.a(this, 3);
        return dcdc.f(new auru(a, a2, this));
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ((ckhe) this.b.a(ckht.aU)).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean e(WebView webView) {
        return false;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void f(bvxh bvxhVar) {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final boolean g(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
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
        int i2 = this.c;
        parcel.writeString(i2 != 1 ? i2 != 2 ? "EMAIL_AND_NOTIFICATION_COHORT" : "NOTIFICATION_COHORT" : "OTHER");
    }
}
