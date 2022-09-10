package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cays  reason: default package */
/* loaded from: classes4.dex */
public final class cays {
    public final Map<dprz, drlr> a;

    public cays(List<drlr> list) {
        dcdg p = dcdn.p();
        for (drlr drlrVar : list) {
            dprz b = dprz.b(drlrVar.a);
            if (b == null) {
                b = dprz.EXPERIENCE_CATEGORY_UNKNOWN;
            }
            p.f(b, drlrVar);
        }
        this.a = p.b();
    }

    @dzsi
    public final drlr a(@dzsi dprz dprzVar) {
        if (dprzVar != null) {
            return this.a.get(dprzVar);
        }
        return null;
    }
}
