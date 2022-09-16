package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: drg  reason: default package */
/* loaded from: classes3.dex */
public final class drg {
    final Map a = new HashMap();
    final drp b = new drp();

    public drg() {
        b(new dre());
        b(new drh());
        b(new dri());
        b(new drk());
        b(new drn());
        b(new dro());
        b(new drq());
    }

    public final dqz a(dpu dpuVar, dqz dqzVar) {
        drf drfVar;
        dqt.r(dpuVar);
        if (dqzVar instanceof dra) {
            dra draVar = (dra) dqzVar;
            ArrayList arrayList = draVar.b;
            String str = draVar.a;
            if (this.a.containsKey(str)) {
                drfVar = (drf) this.a.get(str);
            } else {
                drfVar = this.b;
            }
            return drfVar.a(str, dpuVar, arrayList);
        }
        return dqzVar;
    }

    final void b(drf drfVar) {
        for (drr drrVar : drfVar.a) {
            this.a.put(drrVar.toString(), drfVar);
        }
    }
}
