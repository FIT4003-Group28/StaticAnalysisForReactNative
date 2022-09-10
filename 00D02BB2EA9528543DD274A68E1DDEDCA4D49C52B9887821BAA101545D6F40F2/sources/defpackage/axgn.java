package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: axgn  reason: default package */
/* loaded from: classes3.dex */
final class axgn<T> implements dzaz<List<axgr>> {
    final /* synthetic */ axhi a;

    public axgn(axhi axhiVar) {
        this.a = axhiVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(List<axgr> list) {
        List<axgr> list2 = list;
        axhi axhiVar = this.a;
        dzvx.b(list2, "entryList");
        ArrayList arrayList = new ArrayList(dzti.d(list2, 10));
        for (axgr axgrVar : list2) {
            arrayList.add(axgrVar.a);
        }
        ArrayList arrayList2 = new ArrayList(dzti.d(list2, 10));
        for (axgr axgrVar2 : list2) {
            arrayList2.add(axgrVar2.b);
        }
        axhiVar.h(arrayList, arrayList2.contains(ckij.MISSING_ENTRY_CACHE_FULL) ? ckij.MISSING_ENTRY_CACHE_FULL : ckij.MISSING_ENTRY_CACHE_NOT_FULL);
    }
}
