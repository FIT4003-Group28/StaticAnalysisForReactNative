package defpackage;

import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acii  reason: default package */
/* loaded from: classes2.dex */
public final class acii extends cqiw<acip> {
    public static final /* synthetic */ int a = 0;

    private static cqmp<acip> e(int i, int i2, final acij acijVar, int i3) {
        cqmp[] cqmpVarArr = new cqmp[2];
        cqmpVarArr[0] = cqgr.fY(cqgr.gh(iue.c(new cqlc(acijVar) { // from class: achz
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                int i4 = acii.a;
                return ((acip) cqkpVar).f(acijVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bR(ibn.g()), cqgr.bV(ibn.d()), cqgr.aS(cqkz.a(Integer.valueOf(i2))), cqgr.cH(ibn.a()), cqgr.cd(-1), ibq.o(), ibq.H(), cqgr.eM(cqkz.a(cqrt.l(i))), cqgr.I(new cqlc(acijVar) { // from class: achw
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                int i4 = acii.a;
                return ((acip) cqkpVar).n(acijVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cX(new cqlc(acijVar) { // from class: achy
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                int i4 = acii.a;
                return ((acip) cqkpVar).k(acijVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })));
        cqmpVarArr[1] = i3 != 0 ? cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(ibn.i(8)), cqgr.bG(ibn.g()), cqgr.dQ(cqrp.d(18.0d)), cqgr.dF(cqrp.d(18.0d)), cqgr.dU(cqrp.d(18.0d)), cqgr.dB(cqrp.d(18.0d)), cqgr.z(ibm.h()), cqgr.aI(new cqlc(acijVar) { // from class: acia
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                acip acipVar = (acip) cqkpVar;
                int i4 = acii.a;
                boolean z = false;
                if (acipVar.n(acijVar2).booleanValue() && acipVar.l(acijVar2).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eJ(cqrt.l(i3))), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388613), cqgr.dU(cqrp.d(18.0d)), cqgr.eJ(cqrt.l(R.string.LOCATION_FEEDBACK_FIX_IT_NOW)), cqgr.T(new acih()), ibq.r(), cqgr.eU(ibm.y()), cqgr.cH(ibn.a()), cqgr.cW(cqgr.q(new cqlc(acijVar) { // from class: acib
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                int i4 = acii.a;
                return ((acip) cqkpVar).m(acijVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), iue.c(new cqlc(acijVar) { // from class: acic
            private final acij a;

            {
                this.a = acijVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                acij acijVar2 = this.a;
                int i4 = acii.a;
                return ((acip) cqkpVar).g(acijVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }))) : cqmp.e;
        return cqmn.a(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<acip> a() {
        cqmp[] cqmpVarArr = {e(R.string.LOCATION_FEEDBACK_MORE_500, R.id.location_feedback_1, acij.MORE_500, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_LESS_500, R.id.location_feedback_0, acij.LESS_500, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_WRONG_SIDE_OF_STREET, R.id.location_feedback_7, acij.WRONG_SIDE_OF_STREET, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_JUMPS_AROUND, R.id.location_feedback_4, acij.JUMP_AROUND, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_WRONG_DIRECTION, R.id.location_feedback_2, acij.WRONG_DIRECTION, R.string.LOCATION_FEEDBACK_CALIBRATE_YOUR_COMPASS), e(R.string.LOCATION_FEEDBACK_DISABLED, R.id.location_feedback_3, acij.DISABLED, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_TOO_LONG_TO_UPDATE, R.id.location_feedback_5, acij.TOO_LONG_TO_UPDATE, R.string.LOCATION_FEEDBACK_UPDATE_YOUR_LOCATION_SETTINGS), e(R.string.LOCATION_FEEDBACK_OTHER, R.id.location_feedback_6, acij.OTHER, 0)};
        cqlc cqlcVar = acid.a;
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), cqgr.gk(cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gi(cqmpVarArr), cqgr.fY(cqgr.aI(acig.a), cqgr.cW(cqgr.q(acie.a)), cqgr.bq(cqrp.d(112.0d)), cqgr.cd(-1), cqgr.bR(ibn.g()), cqgr.bG(ibn.g()), MapViewContainer.a(MapViewContainer.f(false), MapViewContainer.b(cqlcVar)), cqgr.gq(cqgr.aI(acif.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.aJ(17), ibq.o(), cqgr.z(ibm.q()), cqgr.eM(cqkz.a(cqrt.l(R.string.LOCATION_FEEDBACK_CORRECT))))), cqgr.gq(cqgr.bR(ibn.g()), cqgr.bV(ibn.d()), ibq.x(), cqgr.eL(Integer.valueOf((int) R.string.LOCATION_FEEDBACK_BLUE_DOT_IN_REPORT))))), itj.t(new cqmp[0]), cqgr.fP(new hav(), achx.a, new cqmp[0]));
    }
}
