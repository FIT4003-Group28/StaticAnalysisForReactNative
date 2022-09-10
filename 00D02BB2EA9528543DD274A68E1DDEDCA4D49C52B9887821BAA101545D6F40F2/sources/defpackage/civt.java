package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: civt  reason: default package */
/* loaded from: classes4.dex */
public final class civt extends cqiw<civv> {
    public static final cqtv a = cqrp.d(48.0d);
    public static final cqtv b = cqrp.d(20.0d);
    public static final cqtv c = cqrp.d(20.0d);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> d = hyb.d(cqgr.cd(-1), cqgr.bq(a), ibn.s(), cqgr.al(b), ibq.p(), cqgr.eN(5), cqgr.eU(ibm.p()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END));
        d.f(cqmpVarArr);
        return d;
    }

    public static <T extends cqkp> cqmp<T> f(cqtd cqtdVar) {
        cqtv cqtvVar = c;
        return cqgr.ai(cqtt.i(cqtdVar, cqtvVar, cqtvVar));
    }

    private static cqmp<civv> h(cqtd cqtdVar) {
        return f(cqrt.i(cqtdVar, ibm.p()));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, civv civvVar, Context context, cqiv cqivVar) {
        for (civu civuVar : civvVar.j()) {
            cqivVar.a(new civs(civuVar.a() == null), civuVar);
        }
    }

    @Override // defpackage.cqiw
    public final cqmj<civv> a() {
        final cqlc cqlcVar = ciuy.a;
        final cqlc cqlcVar2 = civf.a;
        cqlc cqlcVar3 = civg.a;
        final cqlc cqlcVar4 = civh.a;
        final cqlc cqlcVar5 = new cqlc(cqlcVar4) { // from class: civi
            private final cqlc a;

            {
                this.a = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                civv civvVar = (civv) cqkpVar;
                cqtv cqtvVar = civt.a;
                boolean z = false;
                if (((Boolean) cqlcVar6.a(civvVar)).booleanValue() && !cqjv.v(civvVar.j()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        final cqlc cqlcVar6 = new cqlc(cqlcVar, cqlcVar2) { // from class: civj
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar7 = this.a;
                cqlc cqlcVar8 = this.b;
                civv civvVar = (civv) cqkpVar;
                cqtv cqtvVar = civt.a;
                boolean z = true;
                if (!((Boolean) cqlcVar7.a(civvVar)).booleanValue() && !((Boolean) cqlcVar8.a(civvVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.dL(cqrp.d(8.0d)), cqgr.ay(true), cqgr.z(ibm.b()), iue.c(civk.a), cqgr.aW(1), cqgr.az(false), cqjv.j(cqfe.ACCESSIBILITY_DELEGATE, new civo()), e(cqgr.aI(cqlcVar), h(cqrt.f(2131232290)), cqgr.eL(Integer.valueOf((int) R.string.PLACE_MENU_DISMISS_PLACE)), iue.c(civl.a), cqgr.cW(cqgr.q(civm.a))), e(cqgr.aI(cqlcVar2), h(iup.e(R.raw.ic_did_not_go)), cqgr.eL(Integer.valueOf((int) R.string.PLACE_MENU_DID_NOT_GO_HERE)), iue.c(civn.a), cqgr.cW(cqgr.q(ciuz.a))), e(cqgr.aI(cqlcVar3), h(cqrt.f(2131232707)), cqgr.eL(Integer.valueOf((int) R.string.PLACE_MENU_LEARN_MORE)), iue.c(civa.a), cqgr.cW(cqgr.q(civb.a))), ict.n(false, cqgr.aI(new cqlc(cqlcVar6, cqlcVar5) { // from class: civc
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar6;
                this.b = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar7 = this.a;
                cqlc cqlcVar8 = this.b;
                civv civvVar = (civv) cqkpVar;
                cqtv cqtvVar = civt.a;
                boolean z = false;
                if (((Boolean) cqlcVar7.a(civvVar)).booleanValue() && ((Boolean) cqlcVar8.a(civvVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bJ(cqrp.d(20.0d))), cqgr.gq(cqgr.aI(cqlcVar5), ibn.s(), cqgr.dL(cqrp.d(16.0d)), ibq.s(), cqgr.fh(cqrp.f(12.0d)), cqgr.eL(Integer.valueOf((int) R.string.PLACE_MENU_SECTION_SOMEWHERE_ELSE))), cqgr.gd(cqgr.aI(cqlcVar5), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.ck(C())), e(cqgr.aI(cqlcVar4), h(cqrt.f(2131232414)), cqgr.eL(Integer.valueOf((int) R.string.PLACE_MENU_CHOOSE_DIFFERENT_PLACE)), iue.c(civd.a), cqgr.cW(cqgr.q(cive.a))));
    }
}
