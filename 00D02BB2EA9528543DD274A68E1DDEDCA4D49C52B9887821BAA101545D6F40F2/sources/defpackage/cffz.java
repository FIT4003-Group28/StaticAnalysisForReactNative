package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cffz  reason: default package */
/* loaded from: classes4.dex */
public final class cffz extends cqiw<cfhj> {
    public static final /* synthetic */ int a = 0;

    @SafeVarargs
    public static <T extends cfhj> cqmj<T> e(cqlc<T, View.OnClickListener> cqlcVar, final cqlc<T, ddho> cqlcVar2, int i, int i2, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.dz(cqrp.d(4.0d), cqrp.d(18.0d), cqrp.d(4.0d), cqrp.d(dcyn.a)), cqgr.gc(iue.c(new cqlc(cqlcVar2) { // from class: cffy
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cfhj cfhjVar = (cfhj) cqkpVar;
                int i3 = cffz.a;
                return cjtd.a((ddho) ((cqlb) cqlcVar3).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.T(cqrt.l(i2)), cqgr.bq(ibn.a()), cqgr.ce(ibn.a()), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eD(Integer.valueOf(i)), cqgr.fm(cezw.c), cqgr.cW(cqlcVar), cqgr.x(irn.O())));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cfhj> a() {
        cqmj gq = cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.dX(cffp.a), cqgr.dM(cqrp.d(56.0d)), cqgr.dO(cqrp.d(56.0d)), cqgr.eM(cffq.a), cqgr.eN(4), ibq.f(), cqgr.eU(cezw.d), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqjv.l(cqjv.x(cffr.a), cqgr.bY(cqjd.c()), cqgr.bY(cqjd.i(), cqjd.s())));
        return cqgr.gj(cqgr.bp(-2), cqgr.cH(cqrp.d(84.0d)), cqgr.cd(-1), cqgr.az(true), cqgr.aW(1), cqgr.z(cezw.b), e(cqgr.q(cffs.a), cqkz.a(dtxy.nO), 2131232147, R.string.BACK_BUTTON, cqgr.aI(cfft.a), cqgr.bY(cqjd.p(gq))), e(cqgr.q(cffu.a), cqkz.a(dtxy.nS), 2131232205, R.string.DISMISS, cqgr.aF(cffv.a), cqgr.bY(cqjd.p(gq))), gq, cqgr.gq(cqgr.aF(cqjv.x(cffw.a)), cqgr.bp(-2), cqgr.cd(-1), cqgr.dz(cqrp.d(56.0d), cqrp.d(6.0d), cqrp.d(56.0d), cqrp.d(16.0d)), cqgr.eM(cffx.a), cqgr.eN(4), ibq.p(), cqgr.eU(ibm.n()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.bY(cqjd.v(gq), cqjd.s())));
    }
}
