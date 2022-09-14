package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gmm.base.views.core.GmmProgressBar;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: gfk  reason: default package */
/* loaded from: classes6.dex */
public final class gfk extends ges implements egq {
    private static final dcqe ai = dcqe.c("gfk");
    public cqkj a;
    WebView ad;
    public GmmProgressBar ae;
    public ff af;
    public dbsg<List<Pattern>> ag = dbpy.a;
    Runnable ah;
    private String aj;
    private boolean ak;
    private boolean al;
    private String am;
    public amfi b;
    public akfa c;
    public dxio<afha> d;
    public efg e;
    public Executor f;
    public boolean g;

    public static ClickableSpan aS(gga ggaVar, cjqy cjqyVar, @dzsi cjtd cjtdVar, String str) {
        return new gfg(cjtdVar, cjqyVar, str, ggaVar);
    }

    public static gfk aT(String str, List<String> list) {
        gfk gfkVar = new gfk();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("loadAsResource", true);
        bundle.putBoolean("dismissable", true);
        gfkVar.B(bundle);
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            try {
                arrayList.add(Pattern.compile(str2));
            } catch (PatternSyntaxException e) {
                bvoo.h("Invalid deep link url allowlist regex %s", e);
            }
        }
        gfkVar.ag = dbsg.i(arrayList);
        return gfkVar;
    }

    private final void aU(final String str) {
        this.aK.execute(new Runnable(this, str) { // from class: gfb
            private final gfk a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gfk gfkVar = this.a;
                gfkVar.ad.loadUrl(this.b);
            }
        });
    }

    public static gfk g(String str, boolean z) {
        gfk gfkVar = new gfk();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("loadAsResource", z);
        bundle.putBoolean("dismissable", true);
        gfkVar.B(bundle);
        return gfkVar;
    }

    public static gfk i(String str, String str2) {
        gfk gfkVar = new gfk();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("authenticate", true);
        bundle.putString("gaiaService", str2);
        bundle.putBoolean("dismissable", true);
        gfkVar.B(bundle);
        return gfkVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.ae.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void aJ(amfu amfuVar) {
        String str;
        String str2;
        byte[] bArr = amfuVar.d;
        if (bArr != null) {
            try {
                str = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = "";
            }
            String str3 = str;
            try {
                str2 = new URI(this.aj).resolve(".").toString();
            } catch (URISyntaxException unused2) {
                bvoo.h("Cannot get relative base url from %s", this.aj);
                str2 = "http://www.google.com/";
            }
            this.ad.loadDataWithBaseURL(str2, str3, "text/html", "charset=utf-8", "about:blank");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void aR(AccountManagerFuture accountManagerFuture, String str) {
        try {
            aU(((Bundle) accountManagerFuture.getResult()).getString("authtoken"));
        } catch (AuthenticatorException | OperationCanceledException | IOException unused) {
            aU(str);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = this.af.getLayoutInflater().inflate(R.layout.generic_webview_page, (ViewGroup) null);
        this.a.c(new gfj(), (ViewGroup) inflate.findViewById(R.id.statusbar_container)).e(new gfh());
        WebView webView = (WebView) inflate.findViewById(R.id.webview_container);
        this.ad = webView;
        webView.setVisibility(8);
        this.ad.setWebViewClient(new gfi(this));
        this.ad.getSettings().setJavaScriptEnabled(true);
        GmmProgressBar gmmProgressBar = (GmmProgressBar) inflate.findViewById(R.id.progress_content);
        this.ae = gmmProgressBar;
        gmmProgressBar.setDependentViews(this.ad);
        if (this.g) {
            q();
        } else if (this.ak) {
            final String str = this.aj;
            Account m = this.c.m();
            if (m == null) {
                this.ad.loadUrl(str);
            } else {
                String str2 = this.am;
                String encode = Uri.encode(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(encode).length());
                sb.append("weblogin:service=");
                sb.append(str2);
                sb.append("&continue=");
                sb.append(encode);
                final AccountManagerFuture<Bundle> authToken = AccountManager.get(this.af).getAuthToken(m, sb.toString(), (Bundle) null, this.af, (AccountManagerCallback<Bundle>) null, (Handler) null);
                this.f.execute(new Runnable(this, authToken, str) { // from class: gfa
                    private final gfk a;
                    private final AccountManagerFuture b;
                    private final String c;

                    {
                        this.a = this;
                        this.b = authToken;
                        this.c = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.aR(this.b, this.c);
                    }
                });
            }
        } else {
            this.ad.loadUrl(this.aj);
        }
        return inflate;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.ad.canGoBack() || (this.g && (this.ad.getOriginalUrl().equals("about:blank") || this.ad.getUrl().equals("about:blank")))) {
            return !this.al;
        }
        this.ah = new Runnable(this) { // from class: gff
            private final gfk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gfk gfkVar = this.a;
                if (!gfkVar.g || gfkVar.ad.canGoBack()) {
                    return;
                }
                gfkVar.q();
            }
        };
        this.ad.goBack();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        this.aj = bundle2.getString("url");
        this.g = bundle2.getBoolean("loadAsResource");
        this.ak = bundle2.getBoolean("authenticate");
        this.am = bundle2.getString("gaiaService");
        this.al = bundle2.getBoolean("dismissable");
        this.af = J();
    }

    public final void q() {
        amfu a = this.b.a(this.aj, String.valueOf(getClass().getName()).concat("#onCreateView()"), new amfq(this) { // from class: gez
            private final gfk a;

            {
                this.a = this;
            }

            @Override // defpackage.amfq
            public final void a(amfu amfuVar) {
                this.a.w(amfuVar);
            }
        });
        if (a.a()) {
            w(a);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.f(!this.o.getBoolean("fullScreen", false));
        egjVar.ag(null);
        egjVar.J(this);
        this.e.a(egjVar.a());
    }

    public final void w(final amfu amfuVar) {
        if (amfuVar.b() == 2) {
            bvrj.UI_THREAD.c();
            if (this.af.isFinishing()) {
                return;
            }
            new AlertDialog.Builder(this.af).setTitle(R.string.NETWORK_UNAVAILABLE).setMessage(R.string.PROBLEM_CONNECTING_TO_THE_NETWORK_TEXT).setPositiveButton(R.string.OK_BUTTON, new DialogInterface.OnClickListener(this) { // from class: gfd
                private final gfk a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.af.g().f();
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: gfe
                private final gfk a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.af.g().f();
                }
            }).create().show();
        } else if (amfuVar.b() != 5) {
        } else {
            this.aK.execute(new Runnable(this, amfuVar) { // from class: gfc
                private final gfk a;
                private final amfu b;

                {
                    this.a = this;
                    this.b = amfuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aJ(this.b);
                }
            });
        }
    }
}
