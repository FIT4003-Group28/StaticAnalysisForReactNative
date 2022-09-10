package defpackage;

import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aexl  reason: default package */
/* loaded from: classes2.dex */
final class aexl extends cqiw<aexo> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aexo> a() {
        final cqlc cqlcVar = aexg.a;
        final cqlc cqlcVar2 = aexh.a;
        cqmj gj = cqgr.gj(cqgr.P(false), cqgr.L(false), cqgr.fY(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.i()), cqgr.gc(cqgr.ce(cqrp.d(40.0d)), cqgr.bq(cqrp.d(40.0d)), cqgr.y(new cqlc(cqlcVar) { // from class: aewk
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                Interpolator interpolator = aexn.a;
                if (((Boolean) cqlcVar3.a(cqkpVar)).booleanValue()) {
                    return cqtt.g(ibl.b());
                }
                return cqtt.g(ibm.b());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.fn(new cqlc(cqlcVar) { // from class: aewl
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                Interpolator interpolator = aexn.a;
                return ((Boolean) cqlcVar3.a(cqkpVar)).booleanValue() ? aexn.i : aexn.h;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.j(new cqlc(cqlcVar, cqlcVar2) { // from class: aewm
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cqlc cqlcVar4 = this.b;
                float f = 1.0f;
                if (((Boolean) cqlcVar3.a(cqkpVar)).booleanValue() && ((Boolean) cqlcVar4.a(cqkpVar)).booleanValue()) {
                    f = 0.7f;
                }
                return Float.valueOf(f);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eG(aexi.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE))));
        gj.f(new cqmp[0]);
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.cH(cqrp.d(56.0d)), cqgr.y(aewz.a), cqgr.cW(cqgr.q(aexc.a)), cqgr.K(aexd.a), cqgr.aA(aexe.a), cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d)), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.L(false), cqgr.P(false), cqgr.gd(cqgr.bp(-2), cqjv.o(aexn.e(), cqgr.ce(cqrp.d(240.0d)), cqgr.ce(cqrp.d(256.0d))), cqgr.dr(0), cqgr.bw(17), cqgr.bA(cqrp.d(1.0d)), cqgr.L(false), cqgr.P(false), iue.c(aexf.a), gj, cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(40.0d)), cqgr.gd(cqgr.bw(16), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.eM(aexj.a), cqgr.eN(2), ibq.h(), cqgr.eW(aexk.a)), cqgr.gq(cqic.f(aexa.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.SUPERBLUE_MENU_ITEM_NOT_AVAILABLE)), cqgr.eN(2), ibq.q(), cqgr.eW(aexb.a))))));
    }
}
