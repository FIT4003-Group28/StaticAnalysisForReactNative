package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jny  reason: default package */
/* loaded from: classes7.dex */
public final class jny implements bvwz {
    public final bvvq a;

    public jny(bvvq bvvqVar) {
        this.a = bvvqVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: jnx
            private final jny a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = (Map) obj;
                this.a.a.d();
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
        return "ewr.rnr";
    }
}
