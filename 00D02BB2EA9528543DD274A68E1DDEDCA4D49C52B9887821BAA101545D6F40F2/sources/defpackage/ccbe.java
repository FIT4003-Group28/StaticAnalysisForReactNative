package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ccbe  reason: default package */
/* loaded from: classes4.dex */
public final class ccbe implements bvwz {
    public final gga a;
    public final dxio<cbzd> b;
    public final byui c;

    public ccbe(gga ggaVar, dxio<cbzd> dxioVar, byui byuiVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = byuiVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: ccbc
            private final ccbe a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ccbe ccbeVar = this.a;
                Map map = (Map) obj;
                dbsk.s(map);
                Object obj2 = map.get("placeId");
                dbsk.s(obj2);
                final akqi a = ccbeVar.c.a((String) obj2);
                ccbeVar.a.runOnUiThread(new Runnable(ccbeVar, a) { // from class: ccbd
                    private final ccbe a;
                    private final akqi b;

                    {
                        this.a = ccbeVar;
                        this.b = a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ccbe ccbeVar2 = this.a;
                        akqi akqiVar = this.b;
                        dbsk.s(akqiVar);
                        ccbeVar2.b.a().b(akqiVar);
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
        return "hstg.ops";
    }
}
