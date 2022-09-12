package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bbmg  reason: default package */
/* loaded from: classes3.dex */
public final class bbmg implements bvwz {
    public final dxio<ache> a;

    public bbmg(dxio<ache> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: bbmf
            private final bbmg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bbmg bbmgVar = this.a;
                Map map = (Map) obj;
                if (map != null && map.containsKey("id")) {
                    bbmgVar.a.a().q((String) map.get("id"));
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
        return "ep.ohc";
    }
}
