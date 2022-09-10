package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ccay  reason: default package */
/* loaded from: classes4.dex */
public final class ccay implements bvxc {
    public static final dcqe a = dcqe.c("ccay");
    public final gga b;
    public final dxio<ache> c;
    @dzsi
    public bvxh d;

    public ccay(gga ggaVar, dxio<ache> dxioVar) {
        this.b = ggaVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: ccaw
            private final ccay a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ccay ccayVar = this.a;
                Map map = (Map) obj;
                ccayVar.b.runOnUiThread(new Runnable(ccayVar) { // from class: ccax
                    private final ccay a;

                    {
                        this.a = ccayVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ccay ccayVar2 = this.a;
                        ache a2 = ccayVar2.c.a();
                        achc achcVar = achc.HASHTAG_SEARCH_PAGE;
                        acgz b = achb.b();
                        bvxh bvxhVar = ccayVar2.d;
                        if (bvxhVar != null) {
                            b.c("ReportHashtagUrl", ((bvuz) bvxhVar).a.b);
                        } else {
                            bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                        }
                        a2.k(false, false, achcVar, b.b());
                    }
                });
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "hstg.fbk";
    }

    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.d = bvxhVar;
    }
}
