package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bybw  reason: default package */
/* loaded from: classes4.dex */
final class bybw implements dbrn<List<? extends bqyh>, bqyh> {
    final /* synthetic */ byca a;

    public bybw(byca bycaVar) {
        this.a = bycaVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ bqyh a(List<? extends bqyh> list) {
        List<? extends bqyh> list2 = list;
        if (!list2.isEmpty()) {
            return list2.get(this.a.d.nextInt(list2.size()));
        }
        throw new byby();
    }
}
