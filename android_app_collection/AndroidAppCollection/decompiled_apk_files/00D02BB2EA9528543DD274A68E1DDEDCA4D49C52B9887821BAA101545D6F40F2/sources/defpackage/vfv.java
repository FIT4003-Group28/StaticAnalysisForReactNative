package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: vfv  reason: default package */
/* loaded from: classes7.dex */
public final class vfv extends cqiw<zby> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();

    public vfv() {
        super(false, false);
    }

    @dzsi
    public static RecyclerView e(View view) {
        View d2 = cqkx.d(view, d);
        if (d2 == null) {
            return null;
        }
        return (RecyclerView) cqkx.d(d2, vjo.a);
    }

    public static int f(View view) {
        View a2;
        if (cqhu.a(view, uqn.a) == null && (a2 = cqhu.a(view, c)) != null) {
            return a2.getHeight();
        }
        return 0;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zby zbyVar, Context context, cqiv cqivVar) {
        zby zbyVar2 = zbyVar;
        boolean z = false;
        dbsk.b(i == 1, "Unexpected list type in the OneDirectionQueryFormLayout");
        if (cqhl.a(context) && cqhl.d(context)) {
            z = true;
        }
        cqivVar.a(zbyVar2.r().booleanValue() ? new vjo(null) : zbyVar2.i().booleanValue() ? new vfs() : z ? new vfg() : new vfs(), zbyVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zby> a() {
        return cqgr.gd(cqgr.aT(d), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.fY(cqgr.J(true), cqgr.aW(2), cqgr.L(false), cqgr.P(false), cqgr.bp(-2), cqgr.cd(-1), cqgr.dU(ird.b()), cqgr.z(ibm.b()), cqgr.ck(D(1))), vlh.i(new cqmp[0]));
    }
}
