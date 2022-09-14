package defpackage;
/* compiled from: PG */
/* renamed from: hhu  reason: default package */
/* loaded from: classes6.dex */
public class hhu extends cqiw<izm> {
    public static final /* synthetic */ int a = 0;

    private static cqlc<izm, Boolean> e(final dkyd dkydVar) {
        return new cqlc(dkydVar) { // from class: hhk
            private final dkyd a;

            {
                this.a = dkydVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dkyd dkydVar2 = this.a;
                izm izmVar = (izm) cqkpVar;
                int i = hhu.a;
                boolean z = false;
                if (izmVar.i() == dkydVar2 && !izmVar.f().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izm> a() {
        return cqgr.fY(cqgr.aI(hha.a), cqgr.gd(cqgr.aI(hhl.a), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fR(new hgz(), hhm.a, new cqmp[0]), cqgr.gs(cqgr.aI(hhn.a), cqgr.ce(cqrp.d(8.0d))), cqgr.fR(new bhfy(), hho.a, new cqmp[0])), cqgr.gd(cqgr.aI(e(dkyd.UNKNOWN_REVIEW_VOTE_MODE)), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fR(new hgz(), hhp.a, new cqmp[0]), cqgr.gs(cqgr.aI(hhq.a), cqgr.ce(cqrp.d(24.0d))), cqgr.fP(new hig(), hhr.a, new cqmp[0]), cqgr.fP(new hhz(), hhs.a, new cqmp[0])), cqgr.gd(cqic.f(e(dkyd.THUMBS_UP_HELPFUL), new cqmp[0]), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fP(new hkl(), hht.a, new cqmp[0]), cqgr.fR(new hgz(), hhb.a, new cqmp[0])), cqgr.gd(cqic.f(e(dkyd.YES_OR_NO_PROMPT), new cqmp[0]), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fP(new hkx(), hhc.a, new cqmp[0]), cqgr.fR(new hgz(), hhd.a, new cqmp[0])), cqgr.gd(cqic.f(e(dkyd.THUMBS_UP_HELPFUL_COUNT_INSIDE_BUTTON), new cqmp[0]), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fP(new hkc(), hhe.a, new cqmp[0]), cqgr.fR(new hgz(), hhf.a, new cqmp[0])), cqgr.gd(cqic.f(e(dkyd.YES_OR_NO_COUNT_INSIDE_BUTTON), new cqmp[0]), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.fP(new hlj(), hhg.a, new cqmp[0]), cqgr.fR(new hgz(), hhh.a, new cqmp[0])), cqgr.gd(cqic.f(e(dkyd.YES_OR_NO_PROMPT_ONE_LINE), new cqmp[0]), cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new hlv(), hhi.a, new cqmp[0]), cqgr.fR(new hgz(), hhj.a, new cqmp[0])), d());
    }

    protected cqmn<izm> d() {
        return cqmn.a(cqgr.bR(ibn.g()), cqgr.bD(cqrp.d(8.0d)));
    }
}
