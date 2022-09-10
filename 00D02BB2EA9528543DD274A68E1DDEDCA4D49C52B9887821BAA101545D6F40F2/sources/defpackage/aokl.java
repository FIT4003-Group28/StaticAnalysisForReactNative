package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aokl  reason: default package */
/* loaded from: classes2.dex */
public final class aokl extends cqiw<aoiu> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aoiu aoiuVar, Context context, cqiv cqivVar) {
        aoiu aoiuVar2 = aoiuVar;
        dcdc<aojr> a = aoiuVar2.a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            cqivVar.a(new aojn(), a.get(i2));
        }
        dcdc<aoix> b = aoiuVar2.b();
        int size2 = b.size();
        for (int i3 = 0; i3 < size2; i3++) {
            cqivVar.a(new aojm(), b.get(i3));
        }
        if (aoiuVar2.a().size() > 1) {
            cqivVar.a(new aokk(), aoiuVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aoiu> a() {
        cqrp d = cqrp.d(5.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dz(d, d, d, d), cqgr.gq(cqgr.dM(cqrp.d(10.0d)), cqgr.eN(5), ibq.l(), cqgr.eL(Integer.valueOf((int) R.string.YOUR_PURCHASES))), cqgr.gd(cqgr.dU(cqrp.d(10.0d)), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())));
    }
}
