package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atle  reason: default package */
/* loaded from: classes2.dex */
public final class atle extends cqiw<atna> {
    public static final int a = cqir.a();
    public static final int b = cqir.a();

    public static cqmj<atna> e(cqmp<atna> cqmpVar, cqmp<atna> cqmpVar2, cqlc<atna, View.OnClickListener> cqlcVar, cqmp<atna> cqmpVar3, cqlc<atna, Boolean> cqlcVar2, final cqlc<atna, Boolean> cqlcVar3, final cqlc<atna, Boolean> cqlcVar4, cqlc<atna, Boolean> cqlcVar5) {
        cqmp[] cqmpVarArr = {cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.ce(cqrp.d(36.0d)), cqgr.bq(cqrp.d(36.0d)), cqgr.bw(16), cqmpVar2};
        cqmp[] cqmpVarArr2 = {cqgr.bG(cqrp.d(16.0d)), cqgr.bV(cqrp.d(24.0d)), cqgr.bD(cqrp.d(23.0d)), cqgr.ca(Float.valueOf(1.0f)), cqgr.fh(cqrp.f(18.0d)), cqgr.bw(16), ibq.y(), cqgr.fe(irn.b), cqmpVar};
        cqmp[] cqmpVarArr3 = {cqgr.aI(cqlcVar3), cqgr.bV(cqrp.d(3.0d)), cqgr.bG(cqrp.d(18.0d))};
        cqmj E = cqqx.E(cqqx.d(ibm.x()), cqqx.g(cqrp.d(2.0d)), cqqx.i(cqrp.d(dcyn.a)), cqgr.bR(cqrp.d(6.0d)), cqgr.bw(16), cqgr.gq(cqgr.aJ(16), cqgr.bq(cqrp.d(18.0d)), cqgr.bL(cqrp.d(6.0d)), cqgr.bO(cqrp.d(6.0d)), cqgr.fe(irn.b), cqgr.fh(cqrp.f(11.0d)), cqgr.eU(ibm.b()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eJ(cqrt.l(R.string.NEW_BADGE_LABEL))));
        E.f(cqmpVarArr3);
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.cW(cqlcVar), cqgr.J(true), iuy.e(), cqmpVar3, cqgr.gc(cqmpVarArr), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.gd(cqgr.cg(new cqlc(cqlcVar4, cqlcVar3) { // from class: atkb
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar4;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                cqlc cqlcVar7 = this.b;
                atna atnaVar = (atna) cqkpVar;
                int i = -1;
                if (!((Boolean) ((cqlb) cqlcVar6).a).booleanValue() && !((Boolean) cqlcVar7.a(atnaVar)).booleanValue()) {
                    i = -2;
                }
                return Integer.valueOf(i);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gq(cqmpVarArr2), E, cjmv.a(cqic.f(cqlcVar4, new cqmp[0]), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.bw(16), iuy.o(), iuy.p(), cqgr.I(cqlcVar5), cqgr.J(false), cqgr.az(false))), cqgr.gs(cqgr.aI(cqlcVar2), cqgr.bq(cqrp.d(1.0d)), cqgr.cd(-1), cqgr.x(ibm.i()))));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atna atnaVar, Context context, cqiv cqivVar) {
        atna atnaVar2 = atnaVar;
        if (atnaVar2.J().booleanValue()) {
            cqivVar.a(new atki(), atnaVar2);
        }
        if (atnaVar2.L().booleanValue()) {
            cqivVar.a(new atkx(), atnaVar2);
        }
        if (atnaVar2.T().booleanValue()) {
            cqivVar.a(new atko(), atnaVar2);
        }
        if (atnaVar2.s().booleanValue()) {
            cqivVar.a(new atkf(), atnaVar2);
        }
        cqivVar.a(new atkz(), atnaVar2);
        if (atnaVar2.X().booleanValue()) {
            cqivVar.a(new atld(), atnaVar2);
        }
        if (atnaVar2.Y().booleanValue()) {
            cqivVar.a(new atkm(), atnaVar2);
        }
        cqivVar.a(new atkr(), atnaVar2);
        if (atnaVar2.I().booleanValue()) {
            cqivVar.a(new atkd(), atnaVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atna> a() {
        return new cqmh(NestedScrollView.class, athe.e(), cqgr.gd(cqgr.aR(Integer.valueOf(a)), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.eh(false), cqgr.ep(false), cqgr.af(null), cqgr.x(iva.b(ibl.b(), ibl.d())), cqgr.fP(new arua(), atjz.a, new cqmp[0]), cqqx.D(cqgr.aR(Integer.valueOf(b)), cqgr.bp(-2), cqgr.cd(-1), cqjv.l(atka.a, cqqx.H(1), cqjv.o(cqhg.a, cqqx.H(1), cqqx.H(2))), cqgr.ck(C()))));
    }
}
