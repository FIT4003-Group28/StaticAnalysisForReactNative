package defpackage;
/* compiled from: PG */
/* renamed from: bqrd  reason: default package */
/* loaded from: classes4.dex */
public final class bqrd extends cqiw<bqtb> {
    private final boolean a;

    public bqrd(boolean z) {
        super(Boolean.valueOf(z));
        this.a = z;
    }

    @Override // defpackage.cqiw
    public final cqmj<bqtb> a() {
        boolean z = this.a;
        Float valueOf = Float.valueOf(1.0f);
        if (z) {
            cqml e = cayj.e(bqqw.a);
            ((cqmm) e).a(cqgr.ca(valueOf));
            return cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bR(bqre.a), cqgr.bG(cqrp.d(16.0d)), e, cqgr.fP(new bqpw(), bqqx.a, new cqmp[0]));
        }
        cqmj d = hfp.d(bqqy.a, ibq.l(), bqqz.a, bqra.a, bqrb.a);
        d.f(cqgr.cH(cqrp.d(dcyn.a)), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.cd(-2), cqgr.bw(80), cqgr.x(ibm.b()));
        return cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cH(irh.a()), cqgr.cd(-1), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bR(bqre.a), cqgr.bG(cqrp.d(16.0d)), d, cqgr.fP(new bqpw(), bqrc.a, new cqmp[0]));
    }
}
