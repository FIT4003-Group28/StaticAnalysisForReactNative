package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import com.google.android.libraries.youtube.ads.ui.webview.PlayableAdWebView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ndi  reason: default package */
/* loaded from: classes3.dex */
public final class ndi implements ajru {
    public final Context a;
    public final aafo b;
    public final snc c;
    public final PlayableAdWebView d;
    public ajrs e;
    public atya f;
    public acte g;
    public long h;
    public int i;
    public int j;
    public boolean k = false;
    public boolean l = false;
    private final Executor m;
    private final View n;
    private acte o;
    private float p;

    public ndi(Context context, aafo aafoVar, snc sncVar, Executor executor, ViewGroup viewGroup) {
        this.a = context;
        this.b = aafoVar;
        this.c = sncVar;
        this.m = executor;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playable_ad, viewGroup, false);
        this.n = inflate;
        PlayableAdWebView playableAdWebView = (PlayableAdWebView) inflate.findViewById(R.id.playable_ad_web_view);
        this.d = playableAdWebView;
        playableAdWebView.getSettings().setJavaScriptEnabled(true);
        playableAdWebView.setScrollBarStyle(0);
        playableAdWebView.setSoundEffectsEnabled(false);
        playableAdWebView.getSettings().setLoadWithOverviewMode(false);
        playableAdWebView.getSettings().setUseWideViewPort(false);
        playableAdWebView.addJavascriptInterface(this, "PlayableAdJavascriptInterface");
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ndf
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ndi ndiVar = ndi.this;
                ndiVar.k = true;
                if (ndiVar.l || ndiVar.f == null) {
                    return;
                }
                ndiVar.d();
            }
        });
        playableAdWebView.setWebViewClient(new ndh(this));
        playableAdWebView.a = new View.OnTouchListener() { // from class: nde
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ndi ndiVar = ndi.this;
                if (motionEvent.getActionMasked() != 0 || ndiVar.i <= 0) {
                    return false;
                }
                int i = ndiVar.j + 1;
                ndiVar.j = i;
                if (i <= 10) {
                    ndiVar.e.a.H(3, ndiVar.g, null);
                }
                if (ndiVar.j != 1) {
                    return false;
                }
                atya atyaVar = ndiVar.f;
                if ((atyaVar.b & 128) == 0) {
                    return false;
                }
                aafo aafoVar2 = ndiVar.b;
                apzg apzgVar = atyaVar.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, null);
                return false;
            }
        };
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.n;
    }

    public final void d() {
        atya atyaVar;
        atya atyaVar2;
        atya atyaVar3;
        atya atyaVar4;
        if (this.f.c == 4) {
            float width = this.n.getWidth() / (this.f.c == 4 ? (atxz) atyaVar.d : atxz.a).b;
            float height = this.n.getHeight();
            int floor = (int) Math.floor(Math.min(width, height / (this.f.c == 4 ? (atxz) atyaVar2.d : atxz.a).c) * 100.0f);
            this.p = floor / 100.0f;
            this.d.setInitialScale(floor);
            int width2 = this.n.getWidth() - Math.round((this.f.c == 4 ? (atxz) atyaVar3.d : atxz.a).b * this.p);
            int height2 = this.n.getHeight() - Math.round((this.f.c == 4 ? (atxz) atyaVar4.d : atxz.a).c * this.p);
            int i = width2 / 2;
            int i2 = height2 / 2;
            this.n.setPadding(i, i2, width2 - i, height2 - i2);
        } else {
            this.d.setInitialScale(0);
            this.n.setPadding(0, 0, 0, 0);
        }
        this.d.loadUrl(this.f.f);
        this.e.a.u(this.g, null);
        this.e.a.u(this.o, null);
        this.l = true;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atya atyaVar = (atya) obj;
        this.e = ajrsVar;
        this.f = atyaVar;
        this.g = new acte(atyaVar.e);
        this.o = new acte(actj.PLAYABLE_AD_WEBSITE_CTA_BUTTON);
        ajrsVar.a.D(this.o);
        this.i = 0;
        this.j = 0;
        this.l = false;
        this.d.clearHistory();
        if (this.l || !this.k) {
            return;
        }
        d();
    }

    @JavascriptInterface
    public void onExit() {
        this.e.a.H(3, this.o, null);
        if ((this.f.b & 512) != 0) {
            this.m.execute(new Runnable() { // from class: ndg
                @Override // java.lang.Runnable
                public final void run() {
                    ndi ndiVar = ndi.this;
                    aafo aafoVar = ndiVar.b;
                    apzg apzgVar = ndiVar.f.k;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                }
            });
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.loadUrl("about:blank");
    }
}
