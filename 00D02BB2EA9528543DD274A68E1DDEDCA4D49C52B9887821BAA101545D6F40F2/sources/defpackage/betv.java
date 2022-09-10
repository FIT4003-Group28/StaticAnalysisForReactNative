package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: betv  reason: default package */
/* loaded from: classes3.dex */
public final class betv implements bvwz {
    public final dxio<bwft> a;

    public betv(dxio<bwft> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: betu
            private final betv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                betv betvVar = this.a;
                Map map = (Map) obj;
                String str = (String) map.get("url");
                String str2 = (String) map.get("sb");
                String str3 = (String) map.get("msg");
                if (dbsj.d(str) || dbsj.d(str2) || dbsj.d(str3)) {
                    return bvwy.a;
                }
                betvVar.a.a().k(str2, str3, str);
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
        return "ld.shr";
    }
}
