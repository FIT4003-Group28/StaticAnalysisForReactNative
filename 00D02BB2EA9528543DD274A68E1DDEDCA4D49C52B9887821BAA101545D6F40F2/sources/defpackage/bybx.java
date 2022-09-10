package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bybx  reason: default package */
/* loaded from: classes4.dex */
final class bybx implements dbrn<List<? extends bqyh>, List<? extends bqyh>> {
    final /* synthetic */ byca a;

    public bybx(byca bycaVar) {
        this.a = bycaVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ List<? extends bqyh> a(List<? extends bqyh> list) {
        List<? extends bqyh> list2 = list;
        Iterator<? extends bqyh> it = list2.iterator();
        while (it.hasNext()) {
            if (!this.a.f.l(it.next())) {
                it.remove();
            }
        }
        return list2;
    }
}
