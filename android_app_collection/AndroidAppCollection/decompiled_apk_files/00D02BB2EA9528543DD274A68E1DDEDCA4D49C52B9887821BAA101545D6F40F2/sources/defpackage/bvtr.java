package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: bvtr  reason: default package */
/* loaded from: classes4.dex */
public final class bvtr {
    private static final dcqe d = dcqe.c("bvtr");
    @dzsi
    public bwce a;
    public boolean b;
    @dzsi
    public View c;
    private final gga e;
    private final bwde f;
    private final bvuw g;
    @dzsi
    private WebView h;
    @dzsi
    private WebViewCallbacks i;
    @dzsi
    private ddho j;
    @dzsi
    private final bwce k;
    private boolean l;
    private boolean m;
    private bvwd n;

    public bvtr(bvuw bvuwVar, gga ggaVar, bwde bwdeVar, @dzsi bwce bwceVar) {
        this.g = bvuwVar;
        this.k = bwceVar;
        this.e = ggaVar;
        this.f = bwdeVar;
    }

    @Deprecated
    public static void a(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, ddho ddhoVar, ges gesVar) {
        bvvr e = bvvs.e();
        e.b(bvxuVar);
        ((bvvn) e).b = webViewCallbacks;
        c(e.a(), ddhoVar, gesVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(bvxh bvxhVar, ddho ddhoVar, ges gesVar) {
        bvvr e = bvvs.e();
        e.b(bvxhVar.b());
        ((bvvn) e).b = bvxhVar.c();
        c(e.a(), ddhoVar, gesVar);
    }

    public static void c(bvvs bvvsVar, ddho ddhoVar, ges gesVar) {
        Bundle d2 = bvrs.d(bvvsVar.a());
        d2.putParcelable("InteractiveWebViewFragment.WebViewCustomizerKey", bvvsVar.c());
        d2.putSerializable("InteractiveWebViewFragment.PageVeTypeKey", ddhoVar);
        Class<? extends cqiw<bvxg>> b = bvvsVar.b();
        if (b != null) {
            d2.putString("InteractiveWebViewFragment.LoadingCardLayoutClassKey", b.getCanonicalName());
        }
        if (bvvsVar.d().a()) {
            d2.putParcelable("InteractiveWebViewFragment.CustomParameterKey", bvvsVar.d().b());
        }
        gesVar.B(d2);
    }

    @dzsi
    public static final bvvl m(@dzsi View view) {
        cqjz<?> g;
        if (view == null || (g = cqjz.g(view)) == null) {
            return null;
        }
        V v = g.j;
        if (!(v instanceof bvvl)) {
            return null;
        }
        return (bvvl) v;
    }

    public final void d(bvvv bvvvVar, Bundle bundle, @dzsi Bundle bundle2) {
        e(bvvvVar, bundle, bundle2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(bvvv bvvvVar, Bundle bundle, @dzsi Bundle bundle2, boolean z) {
        Parcelable parcelable;
        WebView webView;
        if (this.k == null && (webView = this.h) != null) {
            webView.destroy();
        }
        bvxu bvxuVar = (bvxu) bvrs.e(bundle, bvxu.class, (dssr) bvxu.A.cu(7));
        dbsk.s(bvxuVar);
        this.m = bvxuVar.r;
        this.l = bvxuVar.e;
        boolean z2 = !bvxuVar.g || bundle2 == null;
        this.i = (WebViewCallbacks) bundle.getParcelable("InteractiveWebViewFragment.WebViewCustomizerKey");
        this.j = (ddho) bundle.getSerializable("InteractiveWebViewFragment.PageVeTypeKey");
        this.b = bvxuVar.v;
        if (this.m && bundle2 != null) {
            String string = bundle2.getString("InteractiveWebViewFragment.WebViewLastUrlKey", "");
            if (!string.isEmpty()) {
                dsqp dsqpVar = (dsqp) bvxuVar.cu(5);
                dsqpVar.bC(bvxuVar);
                bvxn bvxnVar = (bvxn) dsqpVar;
                if (bvxnVar.c) {
                    bvxnVar.bF();
                    bvxnVar.c = false;
                }
                bvxu bvxuVar2 = (bvxu) bvxnVar.b;
                string.getClass();
                bvxuVar2.a |= 1;
                bvxuVar2.b = string;
                bvxuVar = bvxnVar.bK();
            }
        }
        String string2 = bundle.getString("InteractiveWebViewFragment.LoadingCardLayoutClassKey");
        Class cls = null;
        cls = null;
        if (!dbsj.d(string2)) {
            try {
                cls = Class.forName(string2);
            } catch (ClassNotFoundException unused) {
                bvoo.h("Unable to use loading page layout class: %s", string2);
            }
        }
        bwce bwceVar = this.k;
        if (bwceVar == null) {
            bvuw bvuwVar = this.g;
            bvvr e = bvvs.e();
            e.b(bvxuVar);
            bvvn bvvnVar = (bvvn) e;
            bvvnVar.b = this.i;
            bvvnVar.a = cls;
            if (bundle2 != null) {
                parcelable = bundle2.getParcelable("InteractiveWebViewFragment.CustomParameterKey");
            } else {
                parcelable = bundle.getParcelable("InteractiveWebViewFragment.CustomParameterKey");
            }
            bvvnVar.c = dbsg.j(parcelable);
            bwceVar = bvuwVar.a(e.a(), z2, bvvvVar.Rl(), bundle2);
        }
        this.a = bwceVar;
        if (bwceVar == null) {
            if (!z) {
                return;
            }
            this.e.g().f();
            return;
        }
        this.h = bwceVar.e();
        this.c = this.a.d();
        bvwv a = this.a.a();
        a.n().a();
        this.n = a.k();
    }

    public final boolean f() {
        WebViewCallbacks webViewCallbacks = this.i;
        if (webViewCallbacks == null || !webViewCallbacks.e(this.h)) {
            WebView webView = this.h;
            if (webView == null || !webView.canGoBack() || this.b) {
                return false;
            }
            this.h.goBack();
            return true;
        }
        return true;
    }

    public final void g() {
        bwce bwceVar = this.a;
        if (bwceVar != null) {
            WebViewCallbacks webViewCallbacks = this.i;
            if (webViewCallbacks != null) {
                webViewCallbacks.f(bwceVar);
            }
            this.a.a().n().b();
        }
        WebView webView = this.h;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void h() {
        bwce bwceVar;
        if (this.a != null) {
            WebViewCallbacks webViewCallbacks = this.i;
            if (webViewCallbacks != null) {
                webViewCallbacks.i(this.e);
            }
            this.a.a().n().d();
        }
        WebView webView = this.h;
        if (webView != null && this.l) {
            webView.destroy();
            this.h = null;
        }
        if (!this.l && (bwceVar = this.a) != null) {
            bwceVar.j();
        }
        bwce bwceVar2 = this.a;
        if (bwceVar2 != null) {
            bvxu b = bwceVar2.b();
            if ((b.a & 64) == 0 || this.e.isFinishing()) {
                return;
            }
            this.f.a(b.h, bwdd.LOADED_AND_DESTROYED);
        }
    }

    public final void i(Bundle bundle) {
        String l;
        bwce bwceVar = this.a;
        if (bwceVar != null) {
            bwceVar.g(bundle);
            if (this.m && (l = this.a.l()) != null) {
                bundle.putString("InteractiveWebViewFragment.WebViewLastUrlKey", l);
            }
            bwce bwceVar2 = this.a;
            dbsk.s(bwceVar2);
            if (bwceVar2.a().o().a()) {
                bwce bwceVar3 = this.a;
                dbsk.s(bwceVar3);
                bundle.putParcelable("InteractiveWebViewFragment.CustomParameterKey", bwceVar3.a().o().b());
            }
        }
        bvvl m = m(this.c);
        if (m != null) {
            m.u(bundle);
        }
    }

    public final void j(@dzsi Bundle bundle) {
        bwce bwceVar = this.a;
        if (bwceVar != null) {
            bwceVar.h(bundle);
        }
    }

    public final ddho k() {
        ddho ddhoVar = this.j;
        dbsk.s(ddhoVar);
        return ddhoVar;
    }

    public final void l(@dzsi Object obj) {
        bwce bwceVar = this.a;
        if (bwceVar != null) {
            bwceVar.f(obj);
        }
        this.n.b(obj);
    }

    public final void n() {
        WebViewCallbacks webViewCallbacks = this.i;
        if (webViewCallbacks != null) {
            webViewCallbacks.j();
        }
        bwce bwceVar = this.a;
        if (bwceVar != null) {
            bwceVar.a().n().c();
        }
        WebView webView = this.h;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void o(@dzsi View view) {
        bvvl m = m(view);
        if (m != null) {
            m.c();
        }
    }
}
