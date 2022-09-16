package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bmaf  reason: default package */
/* loaded from: classes3.dex */
final class bmaf implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bmag a;

    public bmaf(bmag bmagVar) {
        this.a = bmagVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        this.a.b.runOnUiThread(new Runnable(this, map2) { // from class: bmae
            private final bmaf a;
            private final Map b;

            {
                this.a = this;
                this.b = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dbsg dbsgVar;
                bmaf bmafVar = this.a;
                Map map3 = this.b;
                bmag bmagVar = bmafVar.a;
                dbsk.s(map3);
                if (map3.containsKey("rrcfpk")) {
                    String str = (String) map3.get("rrcfpk");
                    if (dbsj.d(str)) {
                        return;
                    }
                    try {
                        dbsgVar = dbsg.i((drfy) dsqw.cq(drfy.b, ddae.e.j(str)));
                    } catch (dsrm unused) {
                        bvoo.h("Could not parse the argument into a proto.", new Object[0]);
                        dbsgVar = dbpy.a;
                    }
                    if (!dbsgVar.a() || ((drfy) dbsgVar.b()).a.isEmpty()) {
                        return;
                    }
                    bmagVar.c.b(new blph(((drfy) dbsgVar.b()).a));
                }
            }
        });
        return bvwy.a;
    }
}
