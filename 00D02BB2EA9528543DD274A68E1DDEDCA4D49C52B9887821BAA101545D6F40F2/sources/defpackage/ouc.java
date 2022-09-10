package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ouc  reason: default package */
/* loaded from: classes7.dex */
public final class ouc extends cqiw<wjk> {
    private static final cqjb<wjk, Boolean> a = new oub();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wjk wjkVar, Context context, cqiv cqivVar) {
        wjk wjkVar2 = wjkVar;
        int min = Math.min(wjkVar2.e().size(), 4);
        for (int i2 = 0; i2 < min; i2++) {
            cqivVar.a(new oua(), wjkVar2.e().get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wjk> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dB(irh.c()), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())), cqgr.gq(cqgr.aH(a), cqgr.dU(irh.c()), cqgr.dQ(irh.b()), cqgr.dF(irh.b()), irn.p(), cqgr.eU(ibl.H()), cqgr.az(true), cqgr.eJ(cqrt.l(R.string.TRANSIT_MORE_DEPARTURES))));
    }
}
