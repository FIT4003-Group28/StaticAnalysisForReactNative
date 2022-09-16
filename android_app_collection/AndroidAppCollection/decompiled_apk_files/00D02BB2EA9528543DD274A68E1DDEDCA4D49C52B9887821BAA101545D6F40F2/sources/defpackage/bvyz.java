package defpackage;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvyz  reason: default package */
/* loaded from: classes4.dex */
public final class bvyz {
    public final Executor a;
    public final bvwq b;
    public final dsqa c = dsqa.a();
    public final dcdc<bvwh> d;
    private final Executor e;
    private final WebView f;
    private final cqat g;

    public bvyz(Executor executor, Executor executor2, Map<dszg, dzsj<dcdc<bvwh>>> map, Set<bvwh> set, bvwq bvwqVar, cqat cqatVar, WebView webView, dszg dszgVar) {
        dcdc<bvwh> e;
        this.e = executor;
        this.a = executor2;
        this.f = webView;
        this.b = bvwqVar;
        this.g = cqatVar;
        dccx F = dcdc.F();
        if (map.containsKey(dszgVar)) {
            e = map.get(dszgVar).a();
        } else {
            e = dcdc.e();
        }
        F.i(e);
        F.i(set);
        dcdc<bvwh> f = F.f();
        this.d = f;
        int size = f.size();
        for (int i = 0; i < size; i++) {
            bvwh bvwhVar = f.get(i);
            bvwhVar.f(this.c);
            dbsk.m(bvwhVar.a == null, "The webview should be set in the handler only once.");
            bvrj.UI_THREAD.c();
            bvwhVar.a = webView;
        }
        webView.removeJavascriptInterface("hostRequest");
        webView.addJavascriptInterface(this, "hostRequest");
    }

    public final void a(dmfu dmfuVar) {
        bvrj.UI_THREAD.c();
        if (this.f == null) {
            return;
        }
        this.f.evaluateJavascript(String.format("window.%1$s('%2$s');", "__hostResponse", new String(Base64.encode(dmfuVar.bS(), 2))), null);
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        final long b = this.g.b();
        this.e.execute(new Runnable(this, str, b) { // from class: bvyt
            private final bvyz a;
            private final String b;
            private final long c;

            {
                this.a = this;
                this.b = str;
                this.c = b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
                r2 = r0;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    bvyz r7 = r10.a
                    java.lang.String r0 = r10.b
                    long r5 = r10.c
                    dmfs r1 = defpackage.dmfs.c     // Catch: java.lang.Throwable -> L6d
                    r2 = 7
                    java.lang.Object r1 = r1.cu(r2)     // Catch: java.lang.Throwable -> L6d
                    dssr r1 = (defpackage.dssr) r1     // Catch: java.lang.Throwable -> L6d
                    r2 = 2
                    byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.Throwable -> L6d
                    dsqa r2 = r7.c     // Catch: java.lang.Throwable -> L6d
                    java.lang.Object r0 = r1.i(r0, r2)     // Catch: java.lang.Throwable -> L6d
                    r4 = r0
                    dmfs r4 = (defpackage.dmfs) r4     // Catch: java.lang.Throwable -> L6d
                    dcdc<bvwh> r0 = r7.d
                    int r1 = r0.size()
                    r2 = 0
                    r3 = 0
                L25:
                    if (r2 >= r1) goto L3f
                    java.lang.Object r8 = r0.get(r2)
                    bvwh r8 = (defpackage.bvwh) r8
                    boolean r9 = r8.e(r4)
                    if (r9 == 0) goto L3c
                    if (r3 == 0) goto L3b
                    bvyx r0 = new bvyx
                    r0.<init>()
                    goto L46
                L3b:
                    r3 = r8
                L3c:
                    int r2 = r2 + 1
                    goto L25
                L3f:
                    if (r3 != 0) goto L48
                    bvyy r0 = new bvyy
                    r0.<init>()
                L46:
                    r2 = r0
                    goto L49
                L48:
                    r2 = r3
                L49:
                    bvwq r0 = r7.b
                    ckhg r1 = defpackage.ckku.d
                    bvwp r3 = r0.c(r1)
                    bvyv r0 = new bvyv
                    r0.<init>(r2, r4)
                    java.util.concurrent.Executor r1 = r7.a
                    dehn r8 = defpackage.deha.f(r0, r1)
                    bvyw r9 = new bvyw
                    r0 = r9
                    r1 = r7
                    r0.<init>(r1, r2, r3, r4, r5)
                    degu r0 = defpackage.bvqj.a(r9)
                    java.util.concurrent.Executor r1 = r7.a
                    defpackage.deha.q(r8, r0, r1)
                    return
                L6d:
                    java.util.concurrent.Executor r0 = r7.a
                    bvyu r1 = new bvyu
                    r1.<init>(r7)
                    r0.execute(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bvyt.run():void");
            }
        });
    }
}
