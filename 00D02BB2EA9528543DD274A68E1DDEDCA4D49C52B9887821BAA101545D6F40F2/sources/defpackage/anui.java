package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anui  reason: default package */
/* loaded from: classes2.dex */
public final class anui extends cqiw<anzq> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, anzq anzqVar, Context context, cqiv cqivVar) {
        anzq anzqVar2 = anzqVar;
        anyq i2 = anzqVar2.i();
        if (anzqVar2.e().booleanValue()) {
            cqivVar.a(new acnn(), anzqVar2);
        } else if (anzqVar2.d().booleanValue() && anzqVar2.h().isEmpty()) {
            cqivVar.a(new anue(), anzqVar2);
        } else if (i2 == null) {
        } else {
            cqivVar.a(new anyp(), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anzq> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gj(cqgr.aR(Integer.valueOf((int) R.id.header)), cqgr.cd(-1), cqgr.bq(anuj.a), cqgr.aJ(16), cqgr.ck(C()), cqgr.y(anuf.a), cqgr.K(anug.a), cqgr.cW(cqgr.q(anuh.a))), iuh.b(new cqmp[0]));
    }
}
