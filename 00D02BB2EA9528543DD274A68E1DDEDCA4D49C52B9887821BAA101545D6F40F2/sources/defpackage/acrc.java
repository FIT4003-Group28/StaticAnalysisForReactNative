package defpackage;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acrc  reason: default package */
/* loaded from: classes2.dex */
public final class acrc extends cpst<cpvm, Double> {
    final /* synthetic */ acrg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acrc(acrg acrgVar) {
        super(false);
        this.a = acrgVar;
    }

    @Override // defpackage.cpst, defpackage.cptb
    public final boolean a(cpoj<cpvm, Double> cpojVar, List<cpvg<cpvm, Double>> list) {
        dvvs i;
        Iterator<cpvg<cpvm, Double>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            cpvg<cpvm, Double> next = it.next();
            acrg acrgVar = this.a;
            if (next.a.f.equals("BarChartRenderer") && (i = acrgVar.i(next.b.intValue())) != null && !i.d.isEmpty()) {
                break;
            }
        }
        return super.a(cpojVar, list);
    }
}
