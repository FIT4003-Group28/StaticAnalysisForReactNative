package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjcr  reason: default package */
/* loaded from: classes4.dex */
public final class cjcr extends cqiw<cjcu> {
    public static final /* synthetic */ int b = 0;
    public final ddho a;

    public cjcr(ddho ddhoVar) {
        super(ddhoVar);
        this.a = ddhoVar;
    }

    private static cqmp<cjcu> e() {
        return cqmn.a(cqgr.dU(cqrp.d(16.0d)), cqgr.bq(cqrp.d(48.0d)), ibq.q(), ibq.y());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjcu> a() {
        return cqgr.fY(cqgr.az(false), cqgr.cW(cqgr.q(cjcl.a)), iue.c(new cqlc(this) { // from class: cjcm
            private final cjcr a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cjcr cjcrVar = this.a;
                cjcu cjcuVar = (cjcu) cqkpVar;
                if (cjcuVar.a().booleanValue()) {
                    return cjcuVar.e(cjcrVar.a, deaa.TOGGLE_ON);
                }
                return cjcuVar.e(cjcrVar.a, deaa.TOGGLE_OFF);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.V(cjcn.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.gq(cqgr.aF(cjco.a), cqgr.cd(-2), e(), cqgr.eM(cjcp.a)), cqgr.gq(cqgr.aF(cjcq.a), e(), cqgr.cd(-2), cqgr.fj(1), cqgr.eL(Integer.valueOf((int) R.string.REVIEW_SEE_TRANSLATION))));
    }
}
