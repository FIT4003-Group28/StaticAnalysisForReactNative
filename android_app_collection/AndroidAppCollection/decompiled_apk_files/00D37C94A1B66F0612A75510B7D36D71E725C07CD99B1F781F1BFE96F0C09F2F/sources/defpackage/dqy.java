package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dqy  reason: default package */
/* loaded from: classes3.dex */
public final class dqy extends dqs implements dqv {
    protected final List a;
    protected final List b;
    protected dpu c;

    private dqy(dqy dqyVar) {
        super(dqyVar.d);
        ArrayList arrayList = new ArrayList(dqyVar.a.size());
        this.a = arrayList;
        arrayList.addAll(dqyVar.a);
        ArrayList arrayList2 = new ArrayList(dqyVar.b.size());
        this.b = arrayList2;
        arrayList2.addAll(dqyVar.b);
        this.c = dqyVar.c;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        dpu a = this.c.a();
        for (int i = 0; i < this.a.size(); i++) {
            if (i < list.size()) {
                a.e((String) this.a.get(i), dpuVar.b((dqz) list.get(i)));
            } else {
                a.e((String) this.a.get(i), f);
            }
        }
        for (dqz dqzVar : this.b) {
            dqz b = a.b(dqzVar);
            if (b instanceof dra) {
                b = a.b(dqzVar);
            }
            if (b instanceof dqq) {
                return ((dqq) b).a;
            }
        }
        return dqz.f;
    }

    @Override // defpackage.dqs, defpackage.dqz
    public final dqz d() {
        return new dqy(this);
    }

    public dqy(String str, List list, List list2, dpu dpuVar) {
        super(str);
        this.a = new ArrayList();
        this.c = dpuVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.add(((dqz) it.next()).i());
            }
        }
        this.b = new ArrayList(list2);
    }
}
