package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqna  reason: default package */
/* loaded from: classes4.dex */
public final class bqna extends cqiw<bqst> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<bqst> e(final boolean z) {
        final int i = z ? R.raw.ic_chevron_right_black : R.raw.ic_chevron_left_black;
        cqlc a2 = cqkz.a(null);
        cqlc q = cqgr.q(new cqlc(z) { // from class: bqmr
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z2 = this.a;
                bqst bqstVar = (bqst) cqkpVar;
                int i2 = bqna.a;
                return z2 ? bqstVar.a() : bqstVar.b();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqlc a3 = cqkz.a(null);
        cqlc a4 = cqkz.a(null);
        cqlc a5 = cqkz.a(null);
        cqlc a6 = cqkz.a(false);
        cqlc a7 = cqkz.a(false);
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = hyw.r();
        cqmpVarArr[1] = hyw.aa(new cqlc(z, i) { // from class: bqms
            private final boolean a;
            private final int b;

            {
                this.a = z;
                this.b = i;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z2 = this.a;
                int i2 = this.b;
                bqst bqstVar = (bqst) cqkpVar;
                int i3 = bqna.a;
                if (!z2 || bqstVar.c().booleanValue()) {
                    return cqrt.i(iup.e(i2), ibm.p());
                }
                return cqrt.i(iup.e(i2), ibm.j());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[2] = cqgr.S(Integer.valueOf(true != z ? R.string.ACCESSIBILITY_DATE_PICKER_BACKWARD_ONE_YEAR : R.string.ACCESSIBILITY_DATE_PICKER_FORWARD_ONE_YEAR));
        cqmpVarArr[3] = itj.q();
        cqmpVarArr[4] = cqgr.au(new cqlc(z) { // from class: bqmt
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z2 = this.a;
                bqst bqstVar = (bqst) cqkpVar;
                int i2 = bqna.a;
                boolean z3 = true;
                if (z2 && !bqstVar.c().booleanValue()) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        return hyw.w(a2, q, a3, a4, a5, a6, a7, cqmpVarArr);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bqst bqstVar, Context context, cqiv cqivVar) {
        cqivVar.f(new bqmz(), bqstVar.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bqst> a() {
        cqrp d = cqrp.d(12.0d);
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.dz(d, d, d, d), cqgr.gq(cqgr.eK(cqiq.c("%d", cqiq.h(bqmo.a))), cqgr.aW(2)), cqgr.gq(cqgr.eM(bqmp.a), ibq.h(), cqgr.fh(cqrp.f(24.0d)))};
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.aJ(16), e(false), cqgr.gq(cqgr.ca(Float.valueOf(2.0f)), cqgr.eK(cqiq.c("%d", cqiq.h(bqmq.a))), cqgr.eN(4), ibq.l()), e(true)};
        cqrp d2 = cqrp.d(12.0d);
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.gd(cqmpVarArr), ict.n(false, new cqmp[0]), cqgr.gd(cqmpVarArr2), cqgr.fZ(cqgr.cd(-1), cqgr.Q(3), cqgr.dz(d2, d2, d2, d2), cqgr.ck(C())));
    }
}
