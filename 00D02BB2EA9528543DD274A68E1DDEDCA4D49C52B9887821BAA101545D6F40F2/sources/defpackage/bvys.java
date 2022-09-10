package defpackage;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvys  reason: default package */
/* loaded from: classes4.dex */
public final class bvys implements bvws {
    public final dehq a;
    public final WebView b;
    public final bvwq c;
    private final Executor e;
    private final dehn<Void> h;
    private final cqat i;
    private final dsqa f = dsqa.a();
    public final Map<String, bvyr> d = new HashMap();
    private int g = 1;

    public bvys(dehq dehqVar, Executor executor, dehn<Void> dehnVar, cqat cqatVar, WebView webView, bvwq bvwqVar) {
        this.a = dehqVar;
        this.e = executor;
        this.h = dehnVar;
        this.i = cqatVar;
        this.b = webView;
        this.c = bvwqVar;
        webView.removeJavascriptInterface("clientResponse");
        webView.addJavascriptInterface(this, "clientResponse");
    }

    private final <RequestT extends dssj> dehn<dmcj> d(RequestT requestt, dspy<dmch, RequestT> dspyVar) {
        final String valueOf;
        bvwq bvwqVar = this.c;
        deig d = deig.d();
        bvwp c = bvwqVar.c(ckku.g);
        ddyf bZ = ddyq.K.bZ();
        int a = dspyVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyq ddyqVar = (ddyq) bZ.b;
        ddyqVar.b |= 32;
        ddyqVar.C = a;
        final bvyd bvydVar = new bvyd(d, c, bZ.bK());
        synchronized (this) {
            int i = this.g;
            this.g = i + 1;
            valueOf = String.valueOf(i);
            this.d.put(valueOf, bvydVar);
        }
        dmcg dmcgVar = (dmcg) dmch.d.bZ();
        dmcgVar.k(dspyVar, requestt);
        if (dmcgVar.c) {
            dmcgVar.bF();
            dmcgVar.c = false;
        }
        dmch dmchVar = (dmch) dmcgVar.b;
        valueOf.getClass();
        dmchVar.a |= 1;
        dmchVar.b = valueOf;
        long b = this.i.b();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(b);
        dqjs bZ2 = dqjt.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjt dqjtVar = (dqjt) bZ2.b;
        dqjtVar.a |= 1;
        dqjtVar.b = seconds;
        int nanos = (int) TimeUnit.MILLISECONDS.toNanos(b - TimeUnit.SECONDS.toMillis(seconds));
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjt dqjtVar2 = (dqjt) bZ2.b;
        dqjtVar2.a |= 2;
        dqjtVar2.c = nanos;
        dqjt bK = bZ2.bK();
        if (dmcgVar.c) {
            dmcgVar.bF();
            dmcgVar.c = false;
        }
        dmch dmchVar2 = (dmch) dmcgVar.b;
        bK.getClass();
        dmchVar2.c = bK;
        dmchVar2.a |= 2;
        final String format = String.format("window.%1$s('%2$s');", "__clientRequest", new String(Base64.encode(((dmch) dmcgVar.bK()).bS(), 2), StandardCharsets.UTF_8));
        return deew.g(this.h, new defg(this, format, bvydVar, valueOf) { // from class: bvyo
            private final bvys a;
            private final String b;
            private final bvyr c;
            private final String d;

            {
                this.a = this;
                this.b = format;
                this.c = bvydVar;
                this.d = valueOf;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                bvys bvysVar = this.a;
                String str = this.b;
                bvyr bvyrVar = this.c;
                String str2 = this.d;
                Void r7 = (Void) obj;
                bvysVar.b.evaluateJavascript(str, null);
                dehn h = deha.h(((bvyd) bvyrVar).a, 10L, TimeUnit.SECONDS, bvysVar.a);
                deha.q(h, new bvyq(bvysVar, str2), bvysVar.a);
                return deew.g(h, bvyp.a, bvysVar.a);
            }
        }, this.e);
    }

    @Override // defpackage.bvws
    public final <RequestT extends dssj, ResponseT extends dssj> dehn<ResponseT> a(RequestT requestt, dspy<dmch, RequestT> dspyVar, final dspy<dmcj, ResponseT> dspyVar2) {
        synchronized (this) {
            this.f.f(dspyVar2);
        }
        return deew.h(d(requestt, dspyVar), new dbrn(dspyVar2) { // from class: bvym
            private final dspy a;

            {
                this.a = dspyVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Object b;
                dmcj dmcjVar = (dmcj) obj;
                dsqv dsqvVar = (dsqv) this.a;
                dmcjVar.f(dsqvVar);
                Object l = dmcjVar.V.l(dsqvVar.d);
                if (l == null) {
                    b = dsqvVar.b;
                } else {
                    b = dsqvVar.b(l);
                }
                return (dssj) b;
            }
        }, this.a);
    }

    @Override // defpackage.bvws
    public final <RequestT extends dssj> void b(RequestT requestt, dspy<dmch, RequestT> dspyVar) {
        deew.h(d(requestt, dspyVar), bvyn.a, this.a);
    }

    public final synchronized dsqa c() {
        return this.f;
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        final long b = this.i.b();
        this.a.execute(new Runnable(this, str, b) { // from class: bvyl
            private final bvys a;
            private final String b;
            private final long c;

            {
                this.a = this;
                this.b = str;
                this.c = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvys bvysVar = this.a;
                String str2 = this.b;
                long j = this.c;
                try {
                    dmcj dmcjVar = (dmcj) ((dssr) dmcj.d.cu(7)).i(Base64.decode(str2, 2), bvysVar.c());
                    synchronized (bvysVar) {
                        if (!bvysVar.d.containsKey(dmcjVar.a)) {
                            return;
                        }
                        bvyr remove = bvysVar.d.remove(dmcjVar.a);
                        dbsk.s(remove);
                        remove.a().j(dmcjVar);
                        ddyq c = remove.c();
                        dsqp dsqpVar = (dsqp) c.cu(5);
                        dsqpVar.bC(c);
                        ddyf ddyfVar = (ddyf) dsqpVar;
                        drtc b2 = drtc.b(dmcjVar.b);
                        if (ddyfVar.c) {
                            ddyfVar.bF();
                            ddyfVar.c = false;
                        }
                        ddyq ddyqVar = (ddyq) ddyfVar.b;
                        ddyq ddyqVar2 = ddyq.K;
                        ddyqVar.A = b2.s;
                        ddyqVar.b |= 8;
                        ddyq bK = ddyfVar.bK();
                        remove.b().a(bK);
                        bvysVar.c.a(ckku.f, bK);
                        bvwq bvwqVar = bvysVar.c;
                        ckha ckhaVar = ckku.h;
                        dqjt dqjtVar = dmcjVar.c;
                        if (dqjtVar == null) {
                            dqjtVar = dqjt.d;
                        }
                        bvwqVar.b(ckhaVar, dqjtVar, j, bK);
                    }
                } catch (dsrm | IllegalArgumentException unused) {
                }
            }
        });
    }
}
