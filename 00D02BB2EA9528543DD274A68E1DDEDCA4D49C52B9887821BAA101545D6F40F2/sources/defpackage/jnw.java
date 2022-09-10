package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jnw  reason: default package */
/* loaded from: classes7.dex */
public final class jnw implements bvwz {
    public final gga a;
    public final dxio<afha> b;

    public jnw(gga ggaVar, dxio<afha> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: jnu
            private final jnw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final jnw jnwVar = this.a;
                Map map = (Map) obj;
                if (map != null && map.containsKey("url")) {
                    final String str = (String) map.get("url");
                    jnwVar.a.runOnUiThread(new Runnable(jnwVar, str) { // from class: jnv
                        private final jnw a;
                        private final String b;

                        {
                            this.a = jnwVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            jnw jnwVar2 = this.a;
                            jnwVar2.b.a().r(this.b, 1);
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
