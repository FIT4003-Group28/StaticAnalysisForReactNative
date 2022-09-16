package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpit  reason: default package */
/* loaded from: classes3.dex */
public final class bpit extends cqiw<bpvq> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bpvq bpvqVar, Context context, cqiv cqivVar) {
        cqiw bpjdVar;
        for (bpvp bpvpVar : bpvqVar.d()) {
            bpvo bpvoVar = bpvo.DEFAULT_RADIO_BUTTON;
            int ordinal = bpvpVar.a().ordinal();
            if (ordinal == 0) {
                bpjdVar = new bpjd();
            } else if (ordinal == 1) {
                bpjdVar = new bpjo();
                bpvpVar = (bpvs) bpvpVar;
            }
            cqivVar.a(bpjdVar, bpvpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bpvq> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.bG(ibn.g()), cqgr.bV(ibn.f()), cqgr.bD(ibn.d()), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bR(ibn.g()), cqgr.eB(true), ibq.o(), cqgr.eU(ibm.n()), cqgr.eL(Integer.valueOf((int) R.string.RAP_SELECT_AN_OPTION))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.bV(ibn.f()), cqgr.bD(ibn.f()), cqgr.ck(C())));
    }
}
