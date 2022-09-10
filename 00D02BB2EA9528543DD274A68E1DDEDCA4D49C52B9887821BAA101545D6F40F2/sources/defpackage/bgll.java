package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bgll  reason: default package */
/* loaded from: classes3.dex */
public final class bgll extends cqiw<bgoa> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bgoa bgoaVar, Context context, cqiv cqivVar) {
        bgoa bgoaVar2 = bgoaVar;
        bgny d = bgoaVar2.d();
        if (d != null && bgoaVar2.e().booleanValue()) {
            cqivVar.a(new bglx(), d);
        }
        jby e = hsd.e(cqrp.d(8.0d));
        cqivVar.a(new hsd(), e);
        bgns c = bgoaVar2.c();
        if (c != null) {
            cqivVar.a(new bgjj(), c);
        }
        cqivVar.f(new bgjj(), bgoaVar2.f());
        bgnz b = bgoaVar2.b();
        if (b != null) {
            cqivVar.a(new bgkd(), b);
        }
        cqivVar.a(new hsd(), e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgoa> a() {
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), GmmRecyclerView.aw(C(), cqgr.aT(a), cqgr.bp(-1), cqgr.bw(1), cqgr.aJ(1), cqqx.F(), iue.c(bglk.a), cqgr.ep(false)));
    }
}
