package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aydc  reason: default package */
/* loaded from: classes3.dex */
public final class aydc extends cqiw<aydh> {
    private final int a;

    public aydc(int i) {
        super(Integer.valueOf(i));
        this.a = i;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aydh aydhVar, Context context, cqiv cqivVar) {
        for (aydf aydfVar : aydhVar.h()) {
            cqivVar.a(new aydb(aydfVar.a()), aydfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aydh> a() {
        return cqgr.gd(cqgr.z(ibm.b()), cqgr.dr(1), cqgr.cd(-1), cqgr.dU(cqrp.d(16.0d)), cqgr.dQ(cqrp.d(this.a)), cqgr.gq(cqgr.eJ(cqrt.l(R.string.NEW_LIST_LIST_TYPE)), cqgr.l(true), cqgr.cd(-2), cqgr.cB(1), ibq.q(), cqgr.eN(5), ibq.v()), cqgr.gi(cqgr.ck(C()), cqgr.dU(cqrp.d(12.0d)), cqgr.de(aycw.a)));
    }
}
