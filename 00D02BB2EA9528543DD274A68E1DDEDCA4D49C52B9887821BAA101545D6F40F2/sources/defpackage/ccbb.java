package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ccbb  reason: default package */
/* loaded from: classes4.dex */
public final class ccbb implements bvwz {
    public final gga a;
    public final dxio<axwo> b;

    public ccbb(gga ggaVar, dxio<axwo> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: ccaz
            private final ccbb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ccbb ccbbVar = this.a;
                Map map = (Map) obj;
                dbsk.s(map);
                final String str = (String) map.get("listId");
                if (str != null) {
                    ccbbVar.a.runOnUiThread(new Runnable(ccbbVar, str) { // from class: ccba
                        private final ccbb a;
                        private final String b;

                        {
                            this.a = ccbbVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ccbb ccbbVar2 = this.a;
                            ccbbVar2.b.a().f(this.b);
                        }
                    });
                }
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
        return "hstg.ol";
    }
}
