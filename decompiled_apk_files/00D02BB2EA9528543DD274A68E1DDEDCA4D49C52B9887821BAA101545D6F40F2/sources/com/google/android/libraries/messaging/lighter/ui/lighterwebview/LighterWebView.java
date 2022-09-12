package com.google.android.libraries.messaging.lighter.ui.lighterwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LighterWebView extends LinearLayout implements cuvv {
    public final WebView a;
    public final LighterWebViewHeader b;
    public dbsg<cufz> c;
    public dbsg<cugq> d;
    private final Toolbar e;

    public LighterWebView(Context context) {
        this(context, null);
    }

    public final void a(dbsg<OverlayView> dbsgVar, View view) {
        view.setVisibility(0);
        if (dbsgVar.a()) {
            dbsgVar.b().setVisibility(0);
        }
        setVisibility(8);
        this.c = dbpy.a;
        this.d = dbpy.a;
    }

    public final void b(String str, final dbsg<OverlayView> dbsgVar, final View view) {
        this.a.setWebViewClient(new cvcf(this, dbpy.a));
        this.a.loadUrl(str);
        if (dbsgVar.a()) {
            dbsgVar.b().setVisibility(8);
        }
        view.setVisibility(8);
        this.e.setNavigationOnClickListener(new View.OnClickListener(this, dbsgVar, view) { // from class: cvcb
            private final LighterWebView a;
            private final dbsg b;
            private final View c;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = view;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.a(this.b, this.c);
            }
        });
        setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.b.setVisibility(8);
        this.e.setVisibility(0);
        this.c = dbpy.a;
        this.d = dbpy.a;
    }

    public final void c(cufz cufzVar, final View view, final dbsg<cugq> dbsgVar, final cuuc cuucVar, final OverlayView overlayView, final boolean z, final cuvx cuvxVar) {
        this.a.setWebViewClient(new cvcg(this, dbsg.j(cuvxVar)));
        this.a.loadUrl(cufzVar.b());
        view.setVisibility(8);
        setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.addJavascriptInterface(new cvca(this, new Runnable(this, cuucVar, view, dbsgVar, z, overlayView, cuvxVar) { // from class: cvcc
            private final LighterWebView a;
            private final cuuc b;
            private final View c;
            private final dbsg d;
            private final boolean e;
            private final OverlayView f;
            private final cuvx g;

            {
                this.a = this;
                this.b = cuucVar;
                this.c = view;
                this.d = dbsgVar;
                this.e = z;
                this.f = overlayView;
                this.g = cuvxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LighterWebView lighterWebView = this.a;
                cuuc cuucVar2 = this.b;
                View view2 = this.c;
                dbsg<cugq> dbsgVar2 = this.d;
                boolean z2 = this.e;
                OverlayView overlayView2 = this.f;
                cuvx cuvxVar2 = this.g;
                lighterWebView.d(cuucVar2, view2, dbsgVar2, z2, overlayView2);
                if (cuvxVar2 != null) {
                    cuvxVar2.d(false, true);
                }
            }
        }), "LighterEmbeddedWebBridge");
        this.e.setVisibility(8);
        LighterWebViewHeader lighterWebViewHeader = this.b;
        cugq a = cufzVar.a();
        if (a.c().a()) {
            cugd b = a.c().b();
            lighterWebViewHeader.a.setImageBitmap(BitmapFactory.decodeByteArray(b.a(), 0, b.a().length));
            lighterWebViewHeader.a.setContentDescription(b.e());
        }
        if (a.d().a()) {
            lighterWebViewHeader.b.setText(a.d().b());
        }
        lighterWebViewHeader.setVisibility(0);
        LighterWebViewHeader.a(lighterWebViewHeader.a, a.c().a());
        LighterWebViewHeader.a(lighterWebViewHeader.b, a.d().a());
        LighterWebViewHeader.a(lighterWebViewHeader.c, a.a().a());
        this.c = dbsg.i(cufzVar);
        this.d = dbsgVar;
    }

    public final void d(final cuuc cuucVar, View view, final dbsg<cugq> dbsgVar, boolean z, final OverlayView overlayView) {
        a(dbpy.a, view);
        if (dbsgVar.a()) {
            overlayView.a(dbsgVar.b(), z);
            overlayView.setDismissOnClickListener(dbsgVar.b(), new View.OnClickListener(dbsgVar, cuucVar, overlayView) { // from class: cvcd
                private final dbsg a;
                private final cuuc b;
                private final OverlayView c;

                {
                    this.a = dbsgVar;
                    this.b = cuucVar;
                    this.c = overlayView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbsg dbsgVar2 = this.a;
                    cuuc cuucVar2 = this.b;
                    OverlayView overlayView2 = this.c;
                    if (((cugq) dbsgVar2.b()).a().a()) {
                        cuucVar2.a(((cugq) dbsgVar2.b()).a().b());
                    }
                    overlayView2.setVisibility(8);
                }
            });
            overlayView.b(dbsgVar.b());
            overlayView.postDelayed(new Runnable(overlayView) { // from class: cvce
                private final OverlayView a;

                {
                    this.a = overlayView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.setVisibility(8);
                }
            }, TimeUnit.SECONDS.toMillis(dbsgVar.b().e()));
        }
    }

    public final Boolean e(WebView webView, String str) {
        if (str.startsWith("tel:")) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse(str));
            getContext().startActivity(intent);
            return true;
        }
        webView.loadUrl(str);
        return false;
    }

    @Override // defpackage.cuvv
    public void setPresenter(cvcj cvcjVar) {
    }

    public void setWebViewClient(cvch cvchVar) {
        this.a.setWebViewClient(cvchVar);
    }

    public LighterWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LighterWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = dbpy.a;
        this.d = dbpy.a;
        inflate(getContext(), R.layout.web_view_layout, this);
        this.a = (WebView) findViewById(R.id.web_view);
        this.e = (Toolbar) findViewById(R.id.toolbar_web);
        this.b = (LighterWebViewHeader) findViewById(R.id.custom_header);
    }
}
