package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: oed  reason: default package */
/* loaded from: classes7.dex */
public final class oed extends cqiw<oxi> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<oxi> e(cqlc<oxi, CharSequence> cqlcVar, final boolean z) {
        return cqgr.gq(cqgr.cB(2), cqgr.aZ(false), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.aZ(false), cqgr.bX(new cqlc(z) { // from class: oeb
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                oxi oxiVar = (oxi) cqkpVar;
                return cqrp.d(this.a ? 2.0d : dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), irn.m(), cqjv.l(new cqlc(z) { // from class: oec
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                oxi oxiVar = (oxi) cqkpVar;
                return Boolean.valueOf(this.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.eU(cqrt.c(R.color.qu_black_alpha_40)), irn.u()), cqgr.J(false), cqgr.z(cqrt.c(17170445)), cqgr.eM(cqlcVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxi> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.bw(16), cqgr.cJ(ody.a), cqgr.cd(-1), cqgr.bR(irh.b()), cqgr.bG(irh.b()), cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d)), e(odz.a, false), e(oea.a, true));
    }
}
