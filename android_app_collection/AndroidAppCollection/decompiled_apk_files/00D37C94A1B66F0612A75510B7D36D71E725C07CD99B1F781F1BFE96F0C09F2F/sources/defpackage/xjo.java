package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xjo  reason: default package */
/* loaded from: classes4.dex */
public final class xjo extends xjp {
    public Executor ae;
    public Executor af;
    public afvn ag;
    public vzc ah;
    public eot ai;
    private WebView aj;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, 2132082688);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        try {
            anea aneaVar = (anea) aopi.parseFrom(anea.a, this.m.getByteArray("about_this_ad_endpoint"), aoos.b());
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.about_this_ad_webview_layout, viewGroup, false);
            WebView webView = (WebView) viewGroup2.findViewById(R.id.webview);
            this.aj = webView;
            webView.setWebViewClient(new xjl());
            this.aj.setScrollBarStyle(33554432);
            this.aj.setScrollbarFadingEnabled(false);
            this.aj.getSettings().setJavaScriptEnabled(true);
            this.aj.addJavascriptInterface(this, "aboutthisad");
            String str = new andz(aneaVar.b).a;
            this.aj.loadUrl((String) ayos.A(new Callable() { // from class: xjn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    xjo xjoVar = xjo.this;
                    return ampq.i(xjoVar.ah.a(xjoVar.ag.c()));
                }
            }).J(amon.a).h(noc.p).w(ona.r).w(new fcr(str, 13)).s(new ayqe() { // from class: xjm
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    xjo xjoVar = xjo.this;
                    ampr amprVar = (ampr) obj;
                    return afvj.a(xjoVar.mJ(), (Account) amprVar.b, (String) amprVar.a).F(azpj.b(xjoVar.ae)).y(azpj.b(xjoVar.af)).E((String) amprVar.a);
                }
            }).R(str).U());
            return viewGroup2;
        } catch (aopx e) {
            zep.f("AboutThisAdWebviewDialogFragment", "Failed to deserialize the ATA TrustedResourceUrlProto.", e);
            return null;
        }
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        if (str == null) {
            zep.m("AboutThisAdWebviewDialogFragment", "Received no postMessage data from the ATA page.");
            return;
        }
        try {
            aovg aovgVar = (aovg) aopi.parseFrom(aovg.b, Base64.decode(str, 2), aoos.b());
            final eot eotVar = this.ai;
            Iterator<E> it = new aops(aovgVar.c, aovg.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aovh aovhVar = (aovh) it.next();
                aovh aovhVar2 = aovh.ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED;
                int ordinal = aovhVar.ordinal();
                if (ordinal == 0) {
                    zep.m("AboutThisAdWebViewListenerImpl", String.format("Unknown callback value received from ATA %s", aovhVar.name()));
                } else if (ordinal == 1) {
                    if (eotVar.a) {
                        int f = aphq.f(eotVar.b.c);
                        if (f != 0 && f == 3 && eotVar.f.isPresent()) {
                            eotVar.c.d(eotVar.f.get());
                        }
                        int f2 = aphq.f(eotVar.b.c);
                        if (f2 != 0 && f2 == 2 && eotVar.h != null) {
                            eotVar.d.execute(new Runnable() { // from class: eos
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eot.this.h.e();
                                }
                            });
                        }
                    }
                    if (!eotVar.g) {
                        eotVar.d.execute(new gdb(eotVar.e, 1));
                    }
                } else if (ordinal == 2 || ordinal == 3) {
                    eotVar.a = true;
                }
            }
            if (!new aops(aovgVar.c, aovg.a).contains(aovh.CLOSE)) {
                return;
            }
            dismiss();
        } catch (aopx e) {
            zep.c("AboutThisAdWebviewDialogFragment", String.format("Unable to parse protocol buffer: %s\nMessage: %s", e, str));
        }
    }
}
