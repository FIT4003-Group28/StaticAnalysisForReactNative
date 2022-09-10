package com.google.android.apps.gmm.addaplace.webview;

import android.app.Activity;
import android.os.Bundle;
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
public class AddAPlaceWebViewCallbacks implements WebViewCallbacks {
    public static final Parcelable.Creator<AddAPlaceWebViewCallbacks> CREATOR = new ctq();
    public boug a;
    public boui b;
    public bouv c;
    public bouz d;
    public boum e;
    public bovc f;
    public bovf g;
    public bovr h;
    private final cqf i;
    @dzsi
    private List<bvwz> j;

    public AddAPlaceWebViewCallbacks(Bundle bundle) {
        this.i = (cqf) bundle.getSerializable("AAP_MODEL_KEY");
        this.j = null;
    }

    public AddAPlaceWebViewCallbacks(cqf cqfVar) {
        this.i = cqfVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.RAP_OFFLINE_SNACKBAR_TEXT), 0).show();
        if (ggaVar.g() != null) {
            gn g = ggaVar.g();
            dbsk.s(g);
            if (g.J()) {
                return;
            }
            ggaVar.g().f();
        }
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        List<bvwz> list = this.j;
        if (list != null) {
            return list;
        }
        ((ctr) btsq.b(ctr.class, ggaVar)).b(this);
        bouf a = this.a.a(this.g, dbpy.a);
        boui bouiVar = this.b;
        bouu a2 = this.c.a(this.i.h, dwyd.ADD_A_PLACE);
        Activity activity = (Activity) ((dxjd) this.d.a).a;
        bouz.a(activity, 1);
        bouy bouyVar = new bouy(activity);
        boul a3 = this.e.a();
        bovc bovcVar = this.f;
        bovn a4 = this.h.a(this.g);
        a4.i = this.i.h;
        dcdc l = dcdc.l(a, bouiVar, a2, bouyVar, a3, bovcVar, a4.a());
        this.j = l;
        return l;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
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
        Bundle bundle = new Bundle();
        bundle.putSerializable("AAP_MODEL_KEY", this.i);
        parcel.writeBundle(bundle);
    }
}
