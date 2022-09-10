package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bvzc  reason: default package */
/* loaded from: classes4.dex */
public final class bvzc implements bvwd {
    private final dcdc<bvwd> a;

    public bvzc(Set<bvwd> set, Map<dszg, dzsj<dcdc<bvwd>>> map, dszg dszgVar) {
        dcdc<bvwd> e;
        dccx F = dcdc.F();
        F.i(set);
        if (map.containsKey(dszgVar)) {
            e = map.get(dszgVar).a();
        } else {
            e = dcdc.e();
        }
        F.i(e);
        this.a = F.f();
    }

    @Override // defpackage.bvwd
    public final void b(Object obj) {
        dcdc<bvwd> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b(obj);
        }
    }
}
