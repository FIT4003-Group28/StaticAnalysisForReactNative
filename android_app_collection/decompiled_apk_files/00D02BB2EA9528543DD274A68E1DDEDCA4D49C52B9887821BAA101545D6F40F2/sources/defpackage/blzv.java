package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: blzv  reason: default package */
/* loaded from: classes3.dex */
public final class blzv implements bvxc {
    public static final dcqe a = dcqe.c("blzv");
    public final gga b;
    public final cjqq c;
    public final cjqy d;
    @dzsi
    public bwce e;

    public blzv(gga ggaVar, cjqq cjqqVar, cjqy cjqyVar) {
        this.b = ggaVar;
        this.c = cjqqVar;
        this.d = cjqyVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: blzt
            private final blzv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final blzv blzvVar = this.a;
                Map map = (Map) obj;
                blzvVar.b.runOnUiThread(new Runnable(blzvVar) { // from class: blzu
                    private final blzv a;

                    {
                        this.a = blzvVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        blzv blzvVar2 = this.a;
                        if (blzvVar2.e == null) {
                            bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                            return;
                        }
                        cjta b = cjtd.b();
                        b.d = dtya.ef;
                        cjtd a2 = b.a();
                        cjqq cjqqVar = blzvVar2.c;
                        bwce bwceVar = blzvVar2.e;
                        dbsk.s(bwceVar);
                        blzvVar2.d.j(cjqqVar.f(((bvuz) bwceVar).c).d(a2), a2);
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
        return "lce";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.e = bvxhVar;
    }
}
