package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgid  reason: default package */
/* loaded from: classes4.dex */
public final class cgid extends cqiw<cgvp> {
    public static final cqrp a = cqrp.d(100.0d);
    private final ckln<cgvp> b = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cgvp cgvpVar, Context context, cqiv cqivVar) {
        cgvp cgvpVar2 = cgvpVar;
        cklj b = this.b.b(cqivVar, 3, cqrp.d(6.0d).NR(context));
        if (!cgvpVar2.v().booleanValue()) {
            b.a(new cghx(), cgvpVar2);
        }
        for (cgvo cgvoVar : cgvpVar2.c()) {
            b.a(new cgic(), cgvoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgvp> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.bp(-2), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bA(cgjw.a), cqgr.bF(cghr.a), cqgr.dr(1), cgjw.a(cqkz.a(cqrt.f(2131231598)), cqle.a(R.string.PHOTOS_TITLE), new cqmp[0]), cgjw.b(cqle.a(R.string.UGC_TASKS_ADD_PHOTO_DESCRIPTION), cqgr.bV(cgjw.a)), cqqx.D(cqgr.aF(cghs.a), cqgr.ck(C()), ckln.a(this.b), cqgr.bV(cgjw.a), cqgr.bp(-2), cqgr.cd(-1))), cqgr.fY(cqgr.bp(-1), cqgr.aI(cght.a), cqgr.fP(new cghx(), cghu.a, new cqmp[0])));
    }
}
