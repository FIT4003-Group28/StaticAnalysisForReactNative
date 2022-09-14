package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aofn  reason: default package */
/* loaded from: classes2.dex */
public class aofn implements Serializable {
    private final dcdc<bvrt<duzg>> a;
    private transient dcdc<duzg> b;
    private transient dcdn<dqjl, duze> c;

    public aofn(List<duzg> list) {
        dcdc<duzg> r = dcdc.r(list);
        this.b = r;
        dcdn<dqjl, duze> e = e(r);
        this.c = e;
        dbsk.s(e.get(dqjl.UNKNOWN_ACTIVITY_TYPE));
        ArrayList arrayList = new ArrayList();
        bvrt.h(list, arrayList);
        this.a = dcdc.r(arrayList);
    }

    private final duze d(dqjl dqjlVar) {
        if (this.c == null) {
            this.c = e(a());
        }
        dcdn<dqjl, duze> dcdnVar = this.c;
        duze duzeVar = dcdnVar.get(dqjlVar);
        return duzeVar != null ? duzeVar : dcdnVar.get(dqjl.UNKNOWN_ACTIVITY_TYPE);
    }

    private static dcdn<dqjl, duze> e(dcdc<duzg> dcdcVar) {
        int i;
        HashMap d = dcjz.d();
        int size = dcdcVar.size();
        int i2 = 0;
        while (i2 < size) {
            Iterator<duze> it = dcdcVar.get(i2).a.iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    duze next = it.next();
                    dqjl b = dqjl.b(next.a);
                    if (b == null) {
                        b = dqjl.UNKNOWN_ACTIVITY_TYPE;
                    }
                    d.put(b, next);
                }
            }
            i2 = i;
        }
        return dcdn.r(d);
    }

    public final dcdc<duzg> a() {
        dcdc<duzg> dcdcVar = this.b;
        if (dcdcVar == null) {
            dcdc<duzg> dcdcVar2 = (dcdc) bvrt.d(this.a, dcdc.F(), (dssr) duzg.b.cu(7), duzg.b);
            this.b = dcdcVar2;
            return dcdcVar2;
        }
        return dcdcVar;
    }

    public final cqta b(dqjl dqjlVar) {
        String str = d(dqjlVar).c;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        return cqta.e(Integer.parseInt(str, 16));
    }

    public final String c(dqjl dqjlVar) {
        return d(dqjlVar).b;
    }
}
