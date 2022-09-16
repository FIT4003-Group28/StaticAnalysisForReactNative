package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abex  reason: default package */
/* loaded from: classes2.dex */
public final class abex implements abfi {
    private final abse a;
    private final abvu b;

    public abex(abvu abvuVar, abse abseVar) {
        this.a = abseVar;
        this.b = abvuVar;
    }

    private final List<abqn> c(dhym dhymVar) {
        ArrayList arrayList = new ArrayList();
        for (dqfq dqfqVar : dhymVar.a) {
            abvu abvuVar = this.b;
            ddho ddhoVar = dtxo.cN;
            abse abseVar = this.a;
            abvr a = abvuVar.a.a();
            abvu.a(a, 1);
            abvu.a(dqfqVar, 2);
            abvu.a(ddhoVar, 3);
            abvu.a(abseVar, 4);
            arrayList.add(new abvt(a, dqfqVar, ddhoVar, abseVar));
        }
        return arrayList;
    }

    @Override // defpackage.abfi
    public final List<absp> a(dhym dhymVar) {
        ArrayList arrayList = new ArrayList();
        List<abqn> c = c(dhymVar);
        if (!c.isEmpty()) {
            arrayList.add(new abtf(new abqm(), new iwe(c), false));
        }
        return dcdc.r(arrayList);
    }

    @Override // defpackage.abfi
    public final List<absp> b(dhym dhymVar) {
        ArrayList arrayList = new ArrayList();
        for (abqn abqnVar : c(dhymVar)) {
            arrayList.add(new abtf(new abqj(), abqnVar, true));
        }
        return dcdc.r(arrayList);
    }
}
