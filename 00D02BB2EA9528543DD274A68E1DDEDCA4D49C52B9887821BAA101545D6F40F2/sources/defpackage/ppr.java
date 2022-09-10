package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ppr  reason: default package */
/* loaded from: classes7.dex */
final class ppr implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ ppt a;

    public ppr(ppt pptVar) {
        this.a = pptVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        if (map2 != null) {
            this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: ppq
                private final ppr a;
                private final Map b;

                {
                    this.a = this;
                    this.b = map2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            });
        }
        return bvwy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(Map map) {
        ppt pptVar = this.a;
        if (map.containsKey("params")) {
            String str = (String) map.get("params");
            pnx pnxVar = new pnx(str);
            if (pnxVar.b.a() && pnxVar.a.a()) {
                pptVar.d.W(bvjk.jm, pnxVar.b.b().intValue());
                pptVar.d.ac(bvjk.jn, pnxVar.a.b());
                pptVar.e.s();
                deha.q(pptVar.c.e(str, pptVar.g), new pps(pptVar, pnxVar), pptVar.b);
                pptVar.d();
                pptVar.h.run();
            }
        }
        pptVar.d();
    }
}
