package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdzr  reason: default package */
/* loaded from: classes4.dex */
final class cdzr implements bdoe {
    final /* synthetic */ ceae a;

    public cdzr(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.bdoe
    public final void a(List<bbtj> list) {
        ceae ceaeVar = this.a;
        if (!ceaeVar.al) {
            cdyo aT = ceae.aT(ceaeVar);
            List<? extends Uri> list2 = aT.f;
            ceae ceaeVar2 = this.a;
            dzvx.b(list, "photos");
            ArrayList arrayList = new ArrayList(dzti.d(list, 10));
            for (bbtj bbtjVar : list) {
                arrayList.add(bbtjVar.a());
            }
            aT.y(dzti.i(list2, ceaeVar2.i(arrayList)));
            this.a.al = true;
        }
    }
}
