package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zwb  reason: default package */
/* loaded from: classes7.dex */
final class zwb extends cpqo<zwg, zwh> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpqs
    protected final /* bridge */ /* synthetic */ boolean E(int i, Object obj, int i2, cpvi cpviVar, Object obj2, Double d, Double d2, int i3, cpso cpsoVar, cpso cpsoVar2, cpqr cpqrVar) {
        Integer num;
        zwg zwgVar = (zwg) obj;
        zwh zwhVar = (zwh) obj2;
        List list = (List) cpviVar.d(zwn.b).a(zwgVar, i2, cpviVar);
        Double d3 = null;
        if (!list.isEmpty()) {
            cpvi<zwg, ?> cpviVar2 = (zwn) list.get(0);
            d3 = (Double) cpviVar2.d(cpvf.a).a((zwg) cpviVar2.e.get(i2), i2, cpviVar2);
            num = (Integer) cpviVar2.d(cpvf.e).a((zwg) cpviVar2.e.get(i2), i2, cpviVar2);
        } else {
            num = null;
        }
        cpqrVar.a.b(zwgVar, 0.0f, 0.0f, 2);
        cpqrVar.b.b(zwhVar, l(i), cpsoVar.s(zwhVar), 2);
        cpqrVar.c.b(d, d3 != null ? cpsoVar2.r(d3, d2) : n(i), cpsoVar2.r(d, d2), 2);
        cpqrVar.d.b(d2, p(i), cpsoVar2.s(d2), 2);
        cpqrVar.e.b(num != null ? num.intValue() : q(i), i3, 2);
        return true;
    }
}
