package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: boxj  reason: default package */
/* loaded from: classes3.dex */
public final class boxj extends bowr {
    public int d;
    private final dcdc<bvrt<dodb>> e;

    public boxj(List<dodb> list, @dzsi dodb dodbVar) {
        super(Boolean.valueOf(!list.isEmpty()), Boolean.valueOf(dodbVar == null ? false : true));
        ArrayList arrayList = new ArrayList();
        bvrt.h(list, arrayList);
        this.e = dcdc.r(arrayList);
        this.d = dodbVar != null ? list.indexOf(dodbVar) : -1;
    }

    public final List<dodb> b() {
        dcdc<bvrt<dodb>> dcdcVar = this.e;
        ArrayList arrayList = new ArrayList();
        bvrt.g(dcdcVar, arrayList, (dssr) dodb.d.cu(7), dodb.d);
        return arrayList;
    }

    @dzsi
    public final dodb c() {
        int i;
        if (!this.a.booleanValue() || !this.c.booleanValue() || (i = this.d) < 0) {
            return null;
        }
        return (dodb) bvrt.f(this.e.get(i), (dssr) dodb.d.cu(7), dodb.d);
    }
}
