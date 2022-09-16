package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@Deprecated
/* renamed from: bvtz  reason: default package */
/* loaded from: classes4.dex */
public final class bvtz implements bwcf, bwcc {
    public final dxio<ckcw> a;
    @dzsi
    private bwcg b;
    private final bvuy c;
    private final Executor d;
    private final boolean e;
    private boolean f;
    private final List<String> g = new ArrayList();

    public bvtz(bvuy bvuyVar, Executor executor, dxio<ckcw> dxioVar, boolean z) {
        this.c = bvuyVar;
        this.d = executor;
        this.a = dxioVar;
        this.e = z;
    }

    @Override // defpackage.bwcf
    public final void a(bwcg bwcgVar) {
        this.b = bwcgVar;
    }

    @Override // defpackage.bvxi
    public final dehn<Map<String, Object>> b(String str, Map<String, Object> map) {
        bvux a = this.c.a(str, map);
        final ckgz ckgzVar = ckku.o;
        final String str2 = a.a;
        String str3 = ckgzVar.b;
        this.d.execute(new Runnable(this, ckgzVar, str2) { // from class: bvtw
            private final bvtz a;
            private final ckgz b;
            private final String c;

            {
                this.a = this;
                this.b = ckgzVar;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvtz bvtzVar = this.a;
                bvtzVar.a.a().s(this.b, bwda.a(this.c) - 1);
            }
        });
        c("google.localpage_ext.WVAPI.callFunction", dcdc.h(a.a, a.b, bvtu.a(a.c)));
        return a.d;
    }

    public final void c(String str, dcdc<String> dcdcVar) {
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(String.format("\"%s\"", dcpw.b.a(dcdcVar.get(i))));
        }
        l(String.format("window.%1$s(%2$s);", str, dbrz.e(", ").g(arrayList)));
    }

    @Override // defpackage.bwcc
    public final void d() {
        this.f = true;
        for (String str : this.g) {
            l(str);
        }
        this.g.clear();
    }

    @Override // defpackage.bwcf
    public final void e() {
        this.f = false;
    }

    @Override // defpackage.bwcf
    public final void f(bvws bvwsVar) {
    }

    public final void g(String str, String str2, int i) {
        try {
            bvux b = this.c.b(str);
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                b.a(new bvtm(b));
            } else if (i2 == 2) {
                b.a(new bvtl(b));
            } else if (i2 == 3) {
                b.a(new bvtv(b));
            } else {
                b.d.j(bvtu.b(str2));
            }
        } catch (NoSuchElementException unused) {
        }
    }

    public final void h(String str, int i, Map<String, Object> map) {
        c("google.localpage_ext.WVAPI.returnValue", dcdc.h(str, bvtu.a(map), String.valueOf(i - 1)));
    }

    @Override // defpackage.bvxi
    public final void i() {
        b("rmi.wvor", new HashMap());
    }

    @Override // defpackage.bvxi
    public final synchronized <T extends dssj> void j(String str, dssj dssjVar, dssr<T> dssrVar) {
        deew.h(b(str, dcdn.k("base64data", ddae.e.i(dssjVar.bS()))), new bvty(dssrVar), dege.a);
    }

    @Override // defpackage.bwcf
    public final void k() {
        l(String.format("window.%1$s ? window.%1$s('%2$s') : 'false';", "google.localpage_ext.WVAPI.markVisibility", true));
    }

    private final void l(String str) {
        bwcg bwcgVar = this.b;
        if (bwcgVar == null) {
            return;
        }
        WebView webView = ((bvut) bwcgVar).a;
        if (this.f || !this.e) {
            webView.evaluateJavascript(str, bvtx.a);
        } else {
            this.g.add(str);
        }
    }
}
