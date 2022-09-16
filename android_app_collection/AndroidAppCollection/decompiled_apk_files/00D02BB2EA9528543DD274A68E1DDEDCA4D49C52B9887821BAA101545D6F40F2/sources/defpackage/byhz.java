package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byhz  reason: default package */
/* loaded from: classes4.dex */
public final class byhz extends cqiw<byim> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, byim byimVar, Context context, cqiv cqivVar) {
        cqiw byhgVar;
        byif byifVar;
        byim byimVar2 = byimVar;
        if (byimVar2.b().booleanValue()) {
            byhgVar = new byhi();
            byifVar = byimVar2;
        } else if (byimVar2.c().booleanValue()) {
            byhgVar = new byhg(R.string.MAPS_OFFLINE_TITLE, R.raw.img_error_offline, cjtd.a(dtyc.bg));
            byifVar = byimVar2;
        } else if (byimVar2.e().booleanValue()) {
            byhgVar = new byhk();
            byifVar = byimVar2;
        } else if (byimVar2.d().booleanValue() || byimVar2.h() == null) {
            byhgVar = new byhg(R.string.HUB_GENERIC_ERROR_TITLE, R.raw.img_error_unknown, cjtd.a(dtyc.bb));
            byifVar = byimVar2;
        } else if (byimVar2.i().isEmpty()) {
            byhgVar = new byhe();
            byifVar = byimVar2.h();
        } else {
            cqivVar.a(new byhy(), byimVar2.h());
            gva.b(cqivVar, byimVar2.i(), new byhw(), new byhn());
            cqivVar.a(new gvb(), byimVar2);
            if (byimVar2.j() == null) {
                return;
            }
            byhgVar = new byhm();
            byifVar = byimVar2.j();
        }
        cqivVar.a(byhgVar, byifVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<byim> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(ibm.b()), cqgr.ck(C()));
    }
}
