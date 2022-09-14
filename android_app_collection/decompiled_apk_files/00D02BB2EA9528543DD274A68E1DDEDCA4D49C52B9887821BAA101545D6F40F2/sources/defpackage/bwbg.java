package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbg  reason: default package */
/* loaded from: classes4.dex */
public final class bwbg implements bvwz {
    public final gga a;

    public bwbg(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: bwbe
            private final bwbg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bwbg bwbgVar = this.a;
                Map map = (Map) obj;
                bwbgVar.a.runOnUiThread(new Runnable(bwbgVar) { // from class: bwbf
                    private final bwbg a;

                    {
                        this.a = bwbgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        gn g = this.a.a.g();
                        if (g == null || g.J()) {
                            return;
                        }
                        g.f();
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
        return "ewv";
    }
}
