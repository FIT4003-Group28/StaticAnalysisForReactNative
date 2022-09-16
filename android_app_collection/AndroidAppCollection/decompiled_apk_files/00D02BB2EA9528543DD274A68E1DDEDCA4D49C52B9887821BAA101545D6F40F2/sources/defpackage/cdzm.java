package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdzm  reason: default package */
/* loaded from: classes4.dex */
final class cdzm<T> implements aa<List<? extends Uri>> {
    final /* synthetic */ ceae a;

    public cdzm(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(List<? extends Uri> list) {
        List<? extends Uri> list2 = list;
        cduy cduyVar = this.a.ah;
        if (cduyVar == 0) {
            dzvx.a("carouselListAdapter");
        }
        dzvx.b(list2, "it");
        List arrayList = new ArrayList(dzti.d(list2, 10));
        for (Uri uri : list2) {
            arrayList.add(new cduz(uri));
        }
        cduyVar.e = arrayList;
        if (arrayList.isEmpty()) {
            arrayList = cduy.f;
        }
        cduyVar.a(arrayList);
        cdyo aT = ceae.aT(this.a);
        dzvx.c(list2, "value");
        aT.e = dzti.h(list2);
        aT.a(aT.z());
    }
}
