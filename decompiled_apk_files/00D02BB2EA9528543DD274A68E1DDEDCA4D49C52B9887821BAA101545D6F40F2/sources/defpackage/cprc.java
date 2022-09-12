package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cprc  reason: default package */
/* loaded from: classes5.dex */
public final class cprc<D> extends cpqm<D> {
    public Map<D, Integer> e;

    public cprc(int i) {
        super(i);
        this.e = cpwj.b(i);
    }

    @Override // defpackage.cpqm
    public final void c(D d, int i) {
        this.e.put(d, Integer.valueOf(i));
    }

    @Override // defpackage.cpqm
    public final void e() {
        List<D> list = this.a;
        Map<D, Integer> map = this.e;
        if (map == null) {
            this.e = cpwj.b(list.size());
        } else {
            map.clear();
        }
        for (int i = 0; i < this.d; i++) {
            this.e.put(list.get(i), Integer.valueOf(i));
        }
    }

    public cprc(cprd<D> cprdVar) {
        super(cprdVar);
    }
}
