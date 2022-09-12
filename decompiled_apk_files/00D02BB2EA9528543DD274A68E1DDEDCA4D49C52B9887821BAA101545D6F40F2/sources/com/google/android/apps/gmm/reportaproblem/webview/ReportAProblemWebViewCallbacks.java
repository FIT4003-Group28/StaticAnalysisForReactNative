package com.google.android.apps.gmm.reportaproblem.webview;

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
import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReportAProblemWebViewCallbacks implements WebViewCallbacks {
    public bouz a;
    public boum b;
    public bouv c;
    public bovr d;
    public bovu e;
    public boug f;
    public bovc g;
    public bovf h;
    public boui i;
    public bouq j;
    @dzsi
    private bwrs<ilo> l;
    private final bowv m;
    @dzsi
    private List<bvwz> n;
    private static final dcqe k = dcqe.c("com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks");
    public static final Parcelable.Creator<ReportAProblemWebViewCallbacks> CREATOR = new bovi();

    public ReportAProblemWebViewCallbacks(Bundle bundle) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        this.m = (bowv) bundle.getSerializable("RAP_MODEL_KEY");
        try {
            bwrs<ilo> e = rD.e(ilo.class, bundle, "PLACEMARK_KEY");
            dbsk.s(e);
            this.l = e;
        } catch (IOException e2) {
            Object[] objArr = new Object[1];
            objArr[0] = e2.getCause() != null ? e2.getCause() : e2;
            bvoo.h("Unable to fetch placemark storage reference %s", objArr);
        }
        this.n = null;
    }

    public ReportAProblemWebViewCallbacks(bwrs<ilo> bwrsVar, bowv bowvVar) {
        this.l = bwrsVar;
        this.m = bowvVar;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void a() {
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void b(gga ggaVar) {
        Toast.makeText(ggaVar, ggaVar.getString(R.string.RAP_OFFLINE_SNACKBAR_TEXT), 0).show();
        gn g = ggaVar.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        List<bvwz> list = this.n;
        if (list != null) {
            return list;
        }
        ((bovj) btsq.b(bovj.class, ggaVar)).xs(this);
        bwrs<ilo> bwrsVar = this.l;
        if (bwrsVar == null) {
            bvoo.h("Unable to register report a problem webview callbacks without placemarkRef.", new Object[0]);
            return Collections.emptyList();
        }
        Activity activity = (Activity) ((dxjd) this.a.a).a;
        bouz.a(activity, 1);
        bouz.a(bwrsVar, 2);
        bouy bouyVar = new bouy(activity, bwrsVar);
        bouu a = this.c.a(this.m.u, dwyd.REPORT_A_PROBLEM);
        bovn a2 = this.d.a(this.h);
        bwrs<ilo> bwrsVar2 = this.l;
        dbsk.s(bwrsVar2);
        a2.h = bwrsVar2;
        a2.i = this.m.u;
        bovq a3 = a2.a();
        bovu bovuVar = this.e;
        bovf bovfVar = this.h;
        bvrb a4 = bovuVar.a.a();
        bovu.a(a4, 1);
        acwo a5 = bovuVar.b.a();
        bovu.a(a5, 2);
        Activity activity2 = (Activity) ((dxjd) bovuVar.c).a;
        bovu.a(activity2, 3);
        bbul a6 = bovuVar.d.a();
        bovu.a(a6, 4);
        akfa a7 = bovuVar.e.a();
        bovu.a(a7, 5);
        bbtk a8 = bovuVar.f.a();
        bovu.a(a8, 6);
        bovu.a(bovfVar, 7);
        bovs bovsVar = new bovs(a4, a5, activity2, a6, a7, a8, bovfVar);
        bwrs<ilo> bwrsVar3 = this.l;
        dbsk.s(bwrsVar3);
        bovsVar.h = bwrsVar3;
        bovsVar.i = this.m.u;
        bovt bovtVar = new bovt(bovsVar);
        boul a9 = this.b.a();
        boug bougVar = this.f;
        bovf bovfVar2 = this.h;
        bwrs<ilo> bwrsVar4 = this.l;
        dbsk.s(bwrsVar4);
        bouf a10 = bougVar.a(bovfVar2, dbsg.i(bwrsVar4));
        bovc bovcVar = this.g;
        boui bouiVar = this.i;
        bouq bouqVar = this.j;
        bwrs<ilo> bwrsVar5 = this.l;
        dbsk.s(bwrsVar5);
        Activity activity3 = (Activity) ((dxjd) bouqVar.a).a;
        bouq.a(activity3, 1);
        dxio a11 = ((dxjh) bouqVar.b).a();
        bouq.a(a11, 2);
        bouq.a(bwrsVar5, 3);
        dcdc n = dcdc.n(bouyVar, a, a3, bovtVar, a9, a10, bovcVar, bouiVar, new boup(activity3, a11, bwrsVar5));
        this.n = n;
        return n;
    }

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final void d() {
        ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
        ((ckhe) rU.a(ckjw.F)).c();
        ((ckhe) rU.a(ckjw.G)).c();
        ((ckhe) rU.a(ckjw.H)).c();
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
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        Bundle bundle = new Bundle();
        bundle.putSerializable("RAP_MODEL_KEY", this.m);
        rD.c(bundle, "PLACEMARK_KEY", this.l);
        parcel.writeBundle(bundle);
    }
}
