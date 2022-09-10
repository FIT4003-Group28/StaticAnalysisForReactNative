package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yfo  reason: default package */
/* loaded from: classes7.dex */
public final class yfo extends cqiw<yfs> {
    static {
        cqrp.d(8.0d);
    }

    private static cqiw<cqkp> e(cqtv cqtvVar) {
        return new yfn(new Object[]{cqtvVar}, cqtvVar);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, yfs yfsVar, Context context, cqiv cqivVar) {
        yfs yfsVar2 = yfsVar;
        cqivVar.c(e(cqrp.d(dcyn.a)));
        cqivVar.f(new yep(), yfsVar2.c());
        cqivVar.d(e(ibn.o()), !yfsVar2.l().isEmpty());
        cqivVar.f(new xhu(), yfsVar2.l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<yfs> a() {
        return zvk.a(zuv.e(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), zuv.a(yfm.a), cqgr.aR(Integer.valueOf((int) R.id.transit_line_departures_list))), cqgr.x(ibm.b()), iue.c(yfl.a));
    }
}
