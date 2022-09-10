package defpackage;

import android.util.LongSparseArray;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aift  reason: default package */
/* loaded from: classes2.dex */
public final class aift implements vsy {
    final /* synthetic */ aifu a;

    public aift(aifu aifuVar) {
        this.a = aifuVar;
    }

    @Override // defpackage.vsy
    public final void a(vuv vuvVar, albl alblVar, vtw vtwVar, @dzsi vue vueVar) {
        bvrj.UI_THREAD.c();
        vuvVar.a().k();
        aifu aifuVar = this.a;
        aifuVar.b.S(vtwVar, aifuVar.e);
        aifu aifuVar2 = this.a;
        aifuVar2.e = vtwVar;
        vtw vtwVar2 = aifuVar2.e;
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        synchronized (aifuVar2.a) {
            aifw aifwVar = aifuVar2.g;
            if (aifwVar != null && aifwVar.b()) {
                longSparseArray.put(aifwVar.a().W, Double.valueOf(Math.max((aifwVar.c() >= 0 ? aifwVar.c() : TimeUnit.MILLISECONDS.toSeconds(aifwVar.a().f) + aifwVar.a().E()) - TimeUnit.MILLISECONDS.toSeconds(aifuVar2.d.b()), 0L)));
            }
        }
        vtwVar2.c(amui.a(longSparseArray, longSparseArray2));
        aifu aifuVar3 = this.a;
        aifuVar3.b.S(vueVar, aifuVar3.f);
        this.a.f = vueVar;
    }
}
