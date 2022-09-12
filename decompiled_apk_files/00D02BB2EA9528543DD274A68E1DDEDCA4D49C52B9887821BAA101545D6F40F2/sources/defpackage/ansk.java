package defpackage;

import android.util.Base64;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ansk  reason: default package */
/* loaded from: classes2.dex */
public final class ansk implements bvwz {
    public final anhk a;

    public ansk(anhk anhkVar) {
        this.a = anhkVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: ansj
            private final ansk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = (Map) obj;
                return dcdn.k("gpk_pk", Base64.encodeToString(this.a.a.a().bS(), 3));
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
        return "gpk";
    }
}
