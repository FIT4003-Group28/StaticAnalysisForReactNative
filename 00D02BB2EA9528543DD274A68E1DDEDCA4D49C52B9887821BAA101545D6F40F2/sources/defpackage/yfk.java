package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yfk  reason: default package */
/* loaded from: classes7.dex */
public final class yfk extends cqiw<yfq> {
    public static final int a = cqir.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, yfq yfqVar, Context context, cqiv cqivVar) {
        yfq yfqVar2 = yfqVar;
        jam h = yfqVar2.h();
        if (h != null) {
            cqivVar.c(new yfa());
            cqivVar.a(new ico(), h);
        } else if (yfqVar2.g().booleanValue()) {
            cqivVar.c(new yfb());
        } else {
            cqivVar.a(new yfj(), yfqVar2);
            cqivVar.a(new yez(), yfqVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<yfq> a() {
        return zuv.f(cqgr.aR(Integer.valueOf((int) R.id.transit_line_page_bottom_sheet)), cqgr.bp(-1), cqgr.cd(-1), aefx.b(Float.valueOf(0.5f)), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.dU(cqrp.d(20.0d)), cqgr.x(ibk.b()), cqgr.gd(cqgr.aR(Integer.valueOf(ztb.a)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.cZ(yev.a), cqgr.ck(C()))));
    }
}
