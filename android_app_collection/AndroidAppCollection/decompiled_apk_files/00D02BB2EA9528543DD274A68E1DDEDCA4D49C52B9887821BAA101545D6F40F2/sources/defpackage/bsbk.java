package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsbk  reason: default package */
/* loaded from: classes4.dex */
public final class bsbk extends cqiw<bsgr> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<bsgr> e(int i, cqlc<bsgr, View.OnClickListener> cqlcVar, final cqlc<bsgr, Boolean> cqlcVar2, final cqlc<bsgr, ddho> cqlcVar3, cqlc<bsgr, String> cqlcVar4) {
        return cqgr.fY(cqgr.cH(ibn.a()), cqgr.cL(ibn.a()), cqgr.ca(Float.valueOf(1.0f)), cqgr.cd(0), cqgr.bq(ibn.a()), cqgr.cW(cqlcVar), iue.c(new cqlc(cqlcVar3) { // from class: bsbh
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                bsgr bsgrVar = (bsgr) cqkpVar;
                int i2 = bsbk.a;
                return cjtd.a((ddho) ((cqlb) cqlcVar5).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), jfw.a(cqgr.aJ(17), cqgr.I(cqlcVar2), cqgr.gd(cqgr.dr(0), cqgr.aJ(17), cqgr.ch(cquz.a), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.gq(cqgr.eL(Integer.valueOf(i)), cqgr.V(cqlcVar4), cqgr.ch(cquz.a), ibq.n(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aJ(17), cqjv.l(new cqlc(cqlcVar2) { // from class: bsbi
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = bsbk.a;
                return (Boolean) this.a.a((bsgr) cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.eU(ibm.y()), ibq.x()))), cqgr.y(new cqlc(cqlcVar2) { // from class: bsbj
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = bsbk.a;
                return ((Boolean) this.a.a((bsgr) cqkpVar)).booleanValue() ? cqui.c(cquh.f(ibm.u()), cquh.a(0), cquh.g(cqrp.d(6.0d)), cquh.e(cqrp.d(1.0d), ibm.v())) : cqui.c(cquh.a(0));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.J(false)));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bsgr bsgrVar, Context context, cqiv cqivVar) {
        cqivVar.f(new bref(), bsgrVar.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bsgr> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.gq(cqgr.cd(-1), cqgr.bq(ibn.a()), cqgr.ca(Float.valueOf(1.0f)), ibq.m(), ibq.v(), cqgr.eL(Integer.valueOf((int) R.string.RESTRICTION_EV_PROFILE_V2)), cqgr.aJ(16), cqgr.eN(5)), cqgr.fY(cqgr.cd(-2), cqgr.cL(ibn.a()), cqmp.e, cqgr.gq(cqgr.cL(ibn.a()), cqgr.cH(ibn.a()), ibq.m(), cqgr.eU(ibm.x()), cqgr.eL(Integer.valueOf((int) R.string.GENERAL_LIST_ACTIONS_REFINEMENT_BANNER_EDIT_LABEL)), cqgr.eN(4), iue.b(cjtd.a(dtya.I)), cqgr.aJ(16), cqgr.x(irn.G()), itj.h(cqgr.q(bsba.a))))};
        cqrp d = cqrp.d(1.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ch(cquz.b), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dB(ibn.f()), cqgr.aJ(1), iue.b(cjtd.a(dtya.G)), cqgr.gd(cqmpVarArr), cqgr.gd(cqgr.cH(ibn.a()), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(17), cqgr.dz(d, d, d, d), cqgr.x(cqui.c(cquh.f(ibm.b()), cquh.a(0), cquh.g(cqrp.d(6.0d)), cquh.e(cqrp.d(1.0d), ibm.j()))), e(R.string.RESTRICTION_EV_PROFILE_YOUR_PLUGS, acly.a(bsbb.a), bsbc.a, cqkz.a(dtya.H), bsbd.a), e(R.string.RESTRICTION_EV_PROFILE_ANY_PLUGS, acly.a(bsbe.a), bsbf.a, cqkz.a(dtya.J), bsbg.a)));
    }
}
