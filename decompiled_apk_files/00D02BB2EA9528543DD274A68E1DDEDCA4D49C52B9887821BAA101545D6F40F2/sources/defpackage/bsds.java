package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bsds  reason: default package */
/* loaded from: classes4.dex */
public class bsds extends cqiw<bsgu> {
    private static final cqkp b = new bscz();
    private final ckln<bsgu> a = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bsgu bsguVar, Context context, cqiv cqivVar) {
        bsgu bsguVar2 = bsguVar;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        int e = ibn.f().e(context);
        int e2 = (i2 - (e + e)) / cqrp.d(109.0d).e(context);
        int size = bsguVar2.b().size() % e2;
        int i3 = size > 0 ? e2 - size : 0;
        cklj b2 = this.a.b(cqivVar, e2, 1);
        b2.b(new bsdr(), bsguVar2.b());
        for (int i4 = 0; i4 < i3; i4++) {
            b2.a(new bsda(), b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bsgu> a() {
        cqrp d = cqrp.d(1.0d);
        return cqgr.gd(cqgr.aJ(1), cqgr.ch(cquz.b), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dB(ibn.f()), cqgr.dr(1), e(), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.x(cqui.c(cquh.f(ibm.i()), cquh.a(0), cquh.g(cqrp.d(6.0d)), cquh.e(cqrp.d(0.5d), ibm.i()))), GmmRecyclerView.aw(C(), cqgr.ch(cquz.b), cqgr.bw(17), cqqx.p(null), ckln.a(this.a))));
    }

    protected cqmj<bsgu> e() {
        return cqgr.gq(ibq.l(), ibq.v(), cqgr.eM(bscy.a), cqgr.aJ(16), cqgr.eN(5), cqgr.bq(ibn.a()));
    }
}
