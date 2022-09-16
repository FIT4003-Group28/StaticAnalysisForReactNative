package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aazm  reason: default package */
/* loaded from: classes2.dex */
public final class aazm implements bvwz {
    public final aagb a;

    public aazm(aagb aagbVar) {
        this.a = aagbVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: aazl
            private final aazm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = (Map) obj;
                this.a.a.a();
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
