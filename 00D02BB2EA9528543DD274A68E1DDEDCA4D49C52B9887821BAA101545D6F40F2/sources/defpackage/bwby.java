package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bwby  reason: default package */
/* loaded from: classes4.dex */
public final class bwby implements bvxc {
    public static final dcqe a = dcqe.c("bwby");
    public final gga b;
    public final dxio<bvvw> c;
    @dzsi
    public bwce d;

    public bwby(gga ggaVar, dxio<bvvw> dxioVar) {
        this.b = ggaVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: bwbw
            private final bwby a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bwby bwbyVar = this.a;
                Map map = (Map) obj;
                bwbyVar.b.runOnUiThread(new Runnable(bwbyVar) { // from class: bwbx
                    private final bwby a;

                    {
                        this.a = bwbyVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bwby bwbyVar2 = this.a;
                        bwce bwceVar = bwbyVar2.d;
                        if (bwceVar == null) {
                            bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                            return;
                        }
                        bwceVar.j();
                        fd K = gga.L(bwbyVar2.b).K();
                        if (!(K instanceof gen)) {
                            return;
                        }
                        ddho p = ((gen) K).p();
                        bwbyVar2.b.g().f();
                        bwce bwceVar2 = bwbyVar2.d;
                        dbsk.s(bwceVar2);
                        dbsk.s(p);
                        bwbyVar2.c.a().q(bwceVar2, p);
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
        return "tnf";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.d = bvxhVar;
    }
}
