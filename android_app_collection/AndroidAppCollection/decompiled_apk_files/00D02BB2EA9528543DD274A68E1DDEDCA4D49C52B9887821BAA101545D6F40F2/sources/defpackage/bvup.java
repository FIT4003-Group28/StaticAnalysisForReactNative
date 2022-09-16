package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: bvup  reason: default package */
/* loaded from: classes4.dex */
public final class bvup implements bwcf, bwcc {
    public final bvuy a;
    public final dxio<ckcw> b;
    private bwcg c;
    private bvws d;
    private final Executor e;
    private final boolean f;
    private boolean g;
    private final List<String> h = new ArrayList();

    public bvup(bvuy bvuyVar, Executor executor, dxio<ckcw> dxioVar, boolean z) {
        this.a = bvuyVar;
        this.e = executor;
        this.b = dxioVar;
        this.f = z;
    }

    @Override // defpackage.bwcf
    public final void a(bwcg bwcgVar) {
        this.c = bwcgVar;
    }

    @Override // defpackage.bvxi
    public final dehn<Map<String, Object>> b(String str, Map<String, Object> map) {
        dbsk.s(this.d);
        dmcm bZ = dmcn.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmcn dmcnVar = (dmcn) bZ.b;
        str.getClass();
        dmcnVar.a |= 1;
        dmcnVar.b = str;
        String a = bvtu.a(map);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmcn dmcnVar2 = (dmcn) bZ.b;
        a.getClass();
        dmcnVar2.a |= 2;
        dmcnVar2.c = a;
        dmcn bK = bZ.bK();
        final bvux a2 = this.a.a(str, map);
        c(ckku.p, bK.b);
        dbsk.s(this.d);
        return deew.h(this.d.a(bK, dmcn.e, dmcr.d), new dbrn(this, a2) { // from class: bvul
            private final bvup a;
            private final bvux b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bvup bvupVar = this.a;
                bvux bvuxVar = this.b;
                dmcr dmcrVar = (dmcr) obj;
                bvupVar.a.b(bvuxVar.b);
                int a3 = dmcq.a(dmcrVar.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = a3 - 1;
                if (i == 1) {
                    bvupVar.c(ckku.r, bvuxVar.a);
                    throw new bvtm(bvuxVar);
                } else if (i == 2) {
                    bvupVar.c(ckku.s, bvuxVar.a);
                    String str2 = dmcrVar.b;
                    throw new bvtl(bvuxVar);
                } else if (i != 3) {
                    try {
                        Map<String, Object> b = bvtu.b(dmcrVar.b);
                        bvupVar.c(ckku.q, bvuxVar.a);
                        return b;
                    } catch (JSONException e) {
                        bvupVar.c(ckku.t, bvuxVar.a);
                        bvoo.d(e);
                        throw new bvtv(bvuxVar);
                    }
                } else {
                    bvupVar.c(ckku.t, bvuxVar.a);
                    throw new bvtv(bvuxVar);
                }
            }
        }, dege.a);
    }

    public final void c(final ckgz ckgzVar, final String str) {
        String str2 = ckgzVar.b;
        this.e.execute(new Runnable(this, ckgzVar, str) { // from class: bvun
            private final bvup a;
            private final ckgz b;
            private final String c;

            {
                this.a = this;
                this.b = ckgzVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvup bvupVar = this.a;
                bvupVar.b.a().s(this.b, bwda.a(this.c) - 1);
            }
        });
    }

    @Override // defpackage.bwcc
    public final void d() {
        this.g = true;
        for (String str : this.h) {
            g(str);
        }
        this.h.clear();
    }

    @Override // defpackage.bwcf
    public final void e() {
        this.g = false;
    }

    @Override // defpackage.bwcf
    public final void f(bvws bvwsVar) {
        dbsk.s(bvwsVar);
        this.d = bvwsVar;
    }

    @Override // defpackage.bvxi
    public final void i() {
        dbsk.s(this.d);
        b("rmi.wvor", new HashMap());
    }

    @Override // defpackage.bvxi
    public final <T extends dssj> void j(String str, dssj dssjVar, final dssr<T> dssrVar) {
        dbsk.s(this.d);
        deew.h(b(str, dcdn.k("base64data", ddae.e.i(dssjVar.bS()))), new dbrn(dssrVar) { // from class: bvum
            private final dssr a;

            {
                this.a = dssrVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dssr dssrVar2 = this.a;
                Object obj2 = ((Map) obj).get("base64data");
                try {
                    return (dssj) dssrVar2.j(ddae.e.j(obj2 != null ? obj2.toString() : ""));
                } catch (dsrm e) {
                    throw new deiw(e);
                }
            }
        }, dege.a);
    }

    @Override // defpackage.bwcf
    public final void k() {
        g(String.format("window.%1$s ? window.%1$s('%2$s') : 'false';", "google.localpage_ext.WVAPI.markVisibility", true));
    }

    private final void g(String str) {
        bwcg bwcgVar = this.c;
        if (bwcgVar == null) {
            return;
        }
        WebView webView = ((bvut) bwcgVar).a;
        if (this.g || !this.f) {
            webView.evaluateJavascript(str, bvuo.a);
        } else {
            this.h.add(str);
        }
    }
}
