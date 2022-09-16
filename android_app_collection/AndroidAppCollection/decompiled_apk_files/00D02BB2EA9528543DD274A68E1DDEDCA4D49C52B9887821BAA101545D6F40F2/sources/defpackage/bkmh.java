package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bkmh  reason: default package */
/* loaded from: classes3.dex */
public final class bkmh extends cqiw<bklk> {
    public static final /* synthetic */ int a = 0;
    private static final cqjb<bklk, Boolean> b = new bkmd();
    private final ckln<bklk> c = new ckln<>();
    private final boolean d;

    public bkmh(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [bkmv] */
    /* JADX WARN: Type inference failed for: r6v11, types: [bknq] */
    /* JADX WARN: Type inference failed for: r6v12, types: [actl] */
    /* JADX WARN: Type inference failed for: r6v13, types: [bkmg] */
    /* JADX WARN: Type inference failed for: r6v14, types: [bkog] */
    /* JADX WARN: Type inference failed for: r6v8, types: [bklf] */
    /* JADX WARN: Type inference failed for: r6v9, types: [bkoa] */
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bklk bklkVar, Context context, cqiv cqivVar) {
        cqiw bknjVar;
        bknk bknkVar;
        bklk bklkVar2 = bklkVar;
        if (i == 0) {
            if (bklkVar2.e().size() < 2) {
                return;
            }
            cqivVar.f(iaq.g().b().h(), bklkVar2.e());
        } else if (i == 1) {
            ckln<bklk> cklnVar = this.c;
            boolean z = this.d;
            cklj b2 = cklnVar.b(cqivVar, 2, 0);
            for (cqkp cqkpVar : bklkVar2.f()) {
                if (cqkpVar instanceof bhry) {
                    b2.a(z ? new bhrp() : new bhoh(true, dtxx.Z), (bhry) cqkpVar);
                } else {
                    if (cqkpVar instanceof bknk) {
                        bknjVar = new bknj();
                        bknkVar = (bknk) cqkpVar;
                    } else if (cqkpVar instanceof bklf) {
                        bknjVar = new bkla();
                        bknkVar = (bklf) cqkpVar;
                    } else if (cqkpVar instanceof bkoa) {
                        bknjVar = new bknz();
                        bknkVar = (bkoa) cqkpVar;
                    } else if (cqkpVar instanceof bkmv) {
                        ?? r6 = (bkmv) cqkpVar;
                        if (r6.e().booleanValue()) {
                            bknjVar = new bkne();
                            bknkVar = r6;
                        } else {
                            bknjVar = new bkmu();
                            bknkVar = r6;
                        }
                    } else if (cqkpVar instanceof bknq) {
                        bknjVar = new bknp();
                        bknkVar = (bknq) cqkpVar;
                    } else if (cqkpVar instanceof actl) {
                        bknjVar = new bhjw();
                        bknkVar = (actl) cqkpVar;
                    } else if (cqkpVar instanceof bkmg) {
                        bknjVar = new bkmf();
                        bknkVar = (bkmg) cqkpVar;
                    } else if (cqkpVar instanceof bkog) {
                        bknjVar = new bkof();
                        bknkVar = (bkog) cqkpVar;
                    }
                    b2.d(bknjVar, bknkVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bklk> a() {
        cqmp[] cqmpVarArr = {cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.L(false), cqgr.P(false), cqgr.aE(b), hzr.e(bkly.a, hzh.h(0), hzh.g(1), cqgr.ck(D(0)), cqgr.dx(2))};
        cqjb<bklk, cqiv> D = D(1);
        final cqrp d = cqrp.d(4.0d);
        final cqrp d2 = cqrp.d(8.0d);
        final cqrp d3 = cqrp.d(16.0d);
        final cqrp d4 = cqrp.d(1.0d);
        final cqrp d5 = cqrp.d(8.0d);
        final cqrp d6 = cqrp.d(16.0d);
        final cqss j = ibm.j();
        final cqss j2 = ibm.j();
        final cqrp d7 = cqrp.d(1.0d);
        final cqss h = ibm.h();
        final cqrp d8 = cqrp.d(20.0d);
        final cqrp d9 = cqrp.d(20.0d);
        final cqrp d10 = cqrp.d(12.0d);
        final cqrp d11 = cqrp.d(28.0d);
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-1), cqgr.cd(-1), cqgr.x(ibm.b()), cqgr.fY(cqmpVarArr), cqgr.fY(GmmRecyclerView.aw(D, ckln.a(this.c), cqqx.K(new cqjb(d4, d5, d, d3, d6, d7, j2, j, h, d8, d9, d10, d11, d2) { // from class: bkmc
            private final cqtv a;
            private final cqtv b;
            private final cqtv c;
            private final cqtv d;
            private final cqtv e;
            private final cqtv f;
            private final cqss g;
            private final cqss h;
            private final cqss i;
            private final cqtv j;
            private final cqtv k;
            private final cqtv l;
            private final cqtv m;
            private final cqtv n;

            {
                this.a = d4;
                this.b = d5;
                this.c = d;
                this.d = d3;
                this.e = d6;
                this.f = d7;
                this.g = j2;
                this.h = j;
                this.i = h;
                this.j = d8;
                this.k = d9;
                this.l = d10;
                this.m = d11;
                this.n = d2;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqtv cqtvVar = this.a;
                cqtv cqtvVar2 = this.b;
                cqtv cqtvVar3 = this.c;
                cqtv cqtvVar4 = this.d;
                cqtv cqtvVar5 = this.e;
                cqtv cqtvVar6 = this.f;
                cqss cqssVar = this.g;
                cqss cqssVar2 = this.h;
                cqss cqssVar3 = this.i;
                cqtv cqtvVar7 = this.j;
                cqtv cqtvVar8 = this.k;
                cqtv cqtvVar9 = this.l;
                cqtv cqtvVar10 = this.m;
                cqtv cqtvVar11 = this.n;
                int i = bkmh.a;
                int e = cqtvVar.e(context);
                int NR = cqtvVar2.NR(context);
                int e2 = cqtvVar3.e(context);
                int e3 = cqtvVar4.e(context);
                int e4 = cqtvVar5.e(context);
                int e5 = cqtvVar6.e(context);
                int b2 = cqssVar.b(context);
                int b3 = cqssVar2.b(context);
                int b4 = cqssVar3.b(context);
                int e6 = cqtvVar7.e(context);
                int e7 = cqtvVar8.e(context);
                int e8 = cqtvVar9.e(context);
                return new bkme(cqkpVar, cqtvVar11.e(context), e2, e3, e6, e7, cqtvVar10.e(context), e8, context, NR, e5, b2, b4, e, b3, e4);
            }
        }), cqgr.cd(-1), cqgr.bp(-1), cqgr.aF(cqjv.x(bklz.a)), cqgr.eq(33554432), cqqx.v(bkma.a), cqqx.w(bkmb.a, cqkz.a(40))), ise.d()));
    }
}
