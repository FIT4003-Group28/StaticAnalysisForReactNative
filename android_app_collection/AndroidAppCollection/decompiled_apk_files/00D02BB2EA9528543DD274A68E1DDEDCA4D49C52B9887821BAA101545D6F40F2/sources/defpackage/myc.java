package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: myc  reason: default package */
/* loaded from: classes7.dex */
public final class myc extends cqiw<myd> {
    public static final /* synthetic */ int a = 0;

    private static final cqmj<myd> e(final vux vuxVar, int i, boolean z) {
        cqlc a2 = cqkz.a(Integer.valueOf(i));
        final cqlc cqlcVar = new cqlc(vuxVar) { // from class: mxy
            private final vux a;

            {
                this.a = vuxVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                vux vuxVar2 = this.a;
                int i2 = myc.a;
                return ((myd) cqkpVar).b(vuxVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc q = cqgr.q(new cqlc(vuxVar) { // from class: mxz
            private final vux a;

            {
                this.a = vuxVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                vux vuxVar2 = this.a;
                int i2 = myc.a;
                return ((myd) cqkpVar).c(vuxVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqlc cqlcVar2 = new cqlc(vuxVar) { // from class: mya
            private final vux a;

            {
                this.a = vuxVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                vux vuxVar2 = this.a;
                int i2 = myc.a;
                return ((myd) cqkpVar).f(vuxVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmj gc = cqgr.gc(cqgr.ce(nqo.aa), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eG(new cqlc(cqlcVar) { // from class: myb
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = myc.a;
                if (((Boolean) this.a.a((myd) cqkpVar)).booleanValue()) {
                    return nqu.aK(R.raw.car_only_ic_check_box_checked_36dp);
                }
                return nqu.aH(R.raw.car_only_ic_check_box_unchecked_36dp, nql.bq);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqmj gq = cqgr.gq(cqgr.bq(nqo.ao), cqgr.bR(nqo.aa), cqgr.aJ(8388627), cqgr.eM(a2), nre.p(nql.bp), cqgr.cB(1));
        cqmp[] cqmpVarArr = new cqmp[10];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bq(nqo.ao);
        cqmpVarArr[2] = cqgr.bw(17);
        cqmpVarArr[3] = nqu.f(npv.a(), null, true);
        cqmpVarArr[4] = cqgr.az(npv.a());
        cqmpVarArr[5] = itj.h(q);
        cqmpVarArr[6] = iue.c(cqlcVar2);
        cqmpVarArr[7] = gc;
        cqmpVarArr[8] = gq;
        cqmpVarArr[9] = z ? iuh.b(cqgr.bw(80)) : cqmp.e;
        return cqgr.fY(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<myd> a() {
        return nqk.a(cqgr.ce(nqo.al), cqgr.bp(-2), cqgr.bA(nqo.Q), cqgr.gd(cqgr.cd(-1), cqgr.dr(1), nqk.g(cqgr.q(mxv.a), cqkz.a(cjtd.a(dtxm.eg)), cqgr.q(mxw.a), cqkz.a(cjtd.a(dtxm.eh)), mxx.a, new cqmp[0]), e(vux.AVOID_HIGHWAYS, R.string.DIRECTIONS_OPTIONS_AVOID_HIGHWAYS, true), e(vux.AVOID_TOLLS, R.string.DIRECTIONS_OPTIONS_AVOID_TOLLS, true), e(vux.AVOID_FERRIES, R.string.DIRECTIONS_OPTIONS_AVOID_FERRIES, false)));
    }
}
