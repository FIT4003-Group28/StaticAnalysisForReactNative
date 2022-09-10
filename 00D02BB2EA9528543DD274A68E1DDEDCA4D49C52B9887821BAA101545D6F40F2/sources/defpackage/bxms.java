package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bxms  reason: default package */
/* loaded from: classes4.dex */
public final class bxms extends cqiw<bxnx> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bxnx bxnxVar, Context context, cqiv cqivVar) {
        bxnx bxnxVar2 = bxnxVar;
        ArrayList arrayList = new ArrayList();
        bxoa b = bxnxVar2.b();
        if (b != null && b.F().booleanValue()) {
            arrayList.add(b);
        }
        arrayList.addAll(bxnxVar2.c());
        gva.b(cqivVar, arrayList, new bxmz(), ict.p(true, new cqmp[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bxnx> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), bxra.l(cqkz.a(cqrt.l(R.string.SEARCH_DID_YOU_MEAN)), new cqmp[0]), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())));
    }
}
