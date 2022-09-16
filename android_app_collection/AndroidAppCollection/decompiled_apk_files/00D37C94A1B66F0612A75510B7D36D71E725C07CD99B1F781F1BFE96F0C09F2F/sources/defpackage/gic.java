package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: gic  reason: default package */
/* loaded from: classes3.dex */
public final class gic extends ghw {
    CoordinatorLayout ae;
    WebView af;
    gig ag;
    public gfu ah;
    public airr ai;
    public acti aj;
    public acrr ak;
    public aafo al;
    public final aljg am = new ghz(this);
    private apzg an;

    @Override // defpackage.dp
    public final void U() {
        this.aj.q(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW), null);
        this.al.b(((avvk) this.an.qm(UrlEndpointOuterClass.urlEndpoint)).e);
        super.U();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.an = (apzg) ((ParcelableMessageLite) this.m.getParcelable("navigation_endpoint")).a(apzg.a);
        mN(0, this.ah.a() == gfs.LIGHT ? 2132084107 : 2132084106);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai.a();
        View inflate = layoutInflater.inflate(R.layout.web_view_bottom_sheet, viewGroup, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.bottom_sheet_coordinator_layout);
        this.ae = coordinatorLayout;
        this.af = (WebView) coordinatorLayout.findViewById(R.id.webview);
        gig gigVar = new gig((ViewStub) inflate.findViewById(R.id.webview_header), this.ah, this.aj);
        this.ag = gigVar;
        gigVar.d.c(new Runnable() { // from class: ghy
            @Override // java.lang.Runnable
            public final void run() {
                gic.this.d.dismiss();
            }
        });
        this.d.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ghx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gic gicVar = gic.this;
                Bundle bundle2 = gicVar.m;
                if (bundle2 != null) {
                    CoordinatorLayout coordinatorLayout2 = gicVar.ae;
                    if (coordinatorLayout2 == null || coordinatorLayout2.getParent() == null || !((View) gicVar.ae.getParent()).isAttachedToWindow()) {
                        gicVar.onDismiss(dialogInterface);
                        return;
                    }
                    BottomSheetBehavior v = BottomSheetBehavior.v((View) gicVar.ae.getParent());
                    int round = Math.round(gicVar.ae.getRootView().getMeasuredHeight() * 0.8f);
                    v.D(round);
                    v.w(gicVar.am);
                    FrameLayout frameLayout = (FrameLayout) gicVar.ae.findViewById(R.id.progress_loader_layout);
                    zgd.t(frameLayout, zgd.h(round - gicVar.ag.a.getHeight()), ViewGroup.LayoutParams.class);
                    String string = bundle2.getString("URL_KEY");
                    WebView webView = gicVar.af;
                    webView.setWebViewClient(new gib(gicVar.ag, frameLayout, webView));
                    gicVar.af.getSettings().setJavaScriptEnabled(true);
                    gicVar.af.loadUrl(string);
                    gicVar.ag.c(gicVar.af, string);
                    gicVar.af.setOnTouchListener(new gia());
                    gicVar.ae.getParent().requestLayout();
                }
            }
        });
        this.aj.n(new acte(actj.SEARCH_BOTTOM_SHEET_WEB_VIEW));
        return inflate;
    }

    @Override // defpackage.aljp, defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Window window;
        Dialog oy = super.oy(bundle);
        if (Build.VERSION.SDK_INT >= 27 && (window = oy.getWindow()) != null) {
            window.getDecorView().setSystemUiVisibility(-2147475440);
            window.clearFlags(2);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setColor(window.getDecorView().getResources().getColor(R.color.yt_black_pure_opacity60));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, new ColorDrawable()});
            layerDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
            window.setBackgroundDrawable(layerDrawable);
        }
        return oy;
    }
}
