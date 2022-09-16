package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vjj  reason: default package */
/* loaded from: classes7.dex */
public final class vjj extends cqiw<zdx> {
    private static final cqkn<zdx> a;
    @dzsi
    private static final cjtd b;

    static {
        vjd vjdVar = new vjd();
        cqny.e(vjdVar, new vjf());
        a = vjdVar;
        cjtd cjtdVar = new cjtd();
        cqny.e(cjtdVar, new vjg());
        b = cjtdVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zdx zdxVar, Context context, cqiv cqivVar) {
        for (zdw zdwVar : zdxVar.h()) {
            cqivVar.a(new vji(), zdwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zdx> a() {
        return jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(irg.a()), cqgr.dB(cqrp.d(12.0d)), zvp.av(cqgr.cd(-1), cqgr.P(false), cqqx.F(), cqgr.ck(C())), cqgr.fV(cqgr.bR(cqrp.d(24.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.fl(R.style.ColoredButtonTheme), cqgr.cd(-1), cqgr.bp(-1), cqgr.aJ(17), cqgr.cV(a), iue.b(b), cqgr.al(irh.m()), cqgr.ah(cqrt.f(2131232660)), cqgr.eL(Integer.valueOf((int) R.string.DIRECTIONS_TAXI_LAUNCH_EXTERNAL_APP)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END)));
    }
}
