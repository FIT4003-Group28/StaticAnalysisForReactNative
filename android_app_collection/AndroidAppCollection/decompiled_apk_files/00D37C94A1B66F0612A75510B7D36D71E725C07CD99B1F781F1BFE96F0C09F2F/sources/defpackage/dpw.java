package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dpw  reason: default package */
/* loaded from: classes3.dex */
public final class dpw extends dqs {
    private final dql a;

    public dpw(dql dqlVar) {
        super("internal.eventLogger");
        this.a = dqlVar;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        Map hashMap;
        dqt.l(this.d, 3, list);
        String i = dpuVar.b((dqz) list.get(0)).i();
        long e = (long) dqt.e(dpuVar.b((dqz) list.get(1)).h().doubleValue());
        dqz b = dpuVar.b((dqz) list.get(2));
        if (b instanceof dqw) {
            hashMap = dqt.j((dqw) b);
        } else {
            hashMap = new HashMap();
        }
        this.a.c.add(new dqk(i, e, hashMap));
        return dqz.f;
    }
}
