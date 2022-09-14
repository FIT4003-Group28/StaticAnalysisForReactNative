package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bhfd  reason: default package */
/* loaded from: classes3.dex */
public final class bhfd extends cqiw<bhio> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<bhio> e() {
        return cqgr.gc(cqgr.cd(-2), cqgr.bw(16), irn.A(), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131232379, ibm.n())));
    }

    @SafeVarargs
    private static cqmj<bhio> f(cqlc<bhio, String> cqlcVar, cqmp<bhio>... cqmpVarArr) {
        cqmj<bhio> gq = cqgr.gq(cqgr.cB(2), cqgr.cz(cqsg.f(cqsz.c(), Float.valueOf(0.7f))), cqgr.bR(ibn.d()), irn.m(), cqgr.dB(cqrp.d(2.0d)), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    private static cqmj<bhio> h(final int i, final cqlc<bhio, cqss> cqlcVar, cqmp<bhio>... cqmpVarArr) {
        cqmj<bhio> gc = cqgr.gc(cqgr.cd(-2), cqgr.bw(16), irn.A(), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eG(new cqlc(i, cqlcVar) { // from class: bhet
            private final int a;
            private final cqlc b;

            {
                this.a = i;
                this.b = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = this.a;
                cqlc cqlcVar2 = this.b;
                bhio bhioVar = (bhio) cqkpVar;
                int i3 = bhfd.a;
                return cqrt.g(i2, (cqss) ((cqlb) cqlcVar2).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        gc.f(cqmpVarArr);
        return gc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhio> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dX(bheq.a), cqgr.gs(cqgr.aI(bheu.a), cqgr.ce(cqrp.d(260.0d)), cqgr.bq(cqrp.d(24.0d)), cqgr.x(cqtt.l(ibm.i(), cqrp.d(16.0d)))), cqgr.gd(cqgr.aI(bhev.a), iue.c(bhew.a), cqgr.aJ(16), e(), f(bhex.a, irn.v()), h(2131232456, cqkz.a(ibm.M()), cqgr.aI(bhey.a), cqgr.bR(ibn.d())), h(2131232454, cqkz.a(ibm.E()), cqgr.aI(bhez.a), cqgr.bR(ibn.d()))), cqgr.gd(cqgr.aI(bhfa.a), iue.c(bhfb.a), cqgr.aJ(16), e(), f(bhfc.a, irn.v()), h(2131232508, cqkz.a(ibm.M()), cqgr.aI(bher.a)), h(2131232505, cqkz.a(ibm.E()), cqgr.aI(bhes.a))));
    }
}
