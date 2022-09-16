package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aazk  reason: default package */
/* loaded from: classes2.dex */
public final class aazk implements bvwz {
    public final gga a;
    public final dxio<afha> b;

    public aazk(gga ggaVar, dxio<afha> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: aazi
            private final aazk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final aazk aazkVar = this.a;
                Map map = (Map) obj;
                if (map != null && map.containsKey("url")) {
                    final String str = (String) map.get("url");
                    aazkVar.a.runOnUiThread(new Runnable(aazkVar, str) { // from class: aazj
                        private final aazk a;
                        private final String b;

                        {
                            this.a = aazkVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aazk aazkVar2 = this.a;
                            aazkVar2.b.a().r(this.b, 1);
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
        return "ewr.owr";
    }
}
