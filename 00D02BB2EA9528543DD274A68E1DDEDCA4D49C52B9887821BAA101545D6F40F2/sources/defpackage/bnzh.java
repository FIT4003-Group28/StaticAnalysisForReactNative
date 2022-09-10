package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnzh  reason: default package */
/* loaded from: classes3.dex */
public final class bnzh extends cqiw<boqa> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, boqa boqaVar, Context context, cqiv cqivVar) {
        cqiw bnzcVar;
        List<bopy> g;
        boqa boqaVar2 = boqaVar;
        if (boqaVar2.u().booleanValue()) {
            bnzcVar = new bobo();
            g = boqaVar2.h();
        } else {
            bnzcVar = new bnzc();
            g = boqaVar2.g();
        }
        cqivVar.f(bnzcVar, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<boqa> a() {
        final cqlc cqlcVar = bnzd.a;
        cqlc cqlcVar2 = bnze.a;
        final cqlc cqlcVar3 = bnzf.a;
        cqlc q = cqgr.q(bnzg.a);
        cqjb<boqa, cqiv> C = C();
        cqmp[] cqmpVarArr = {cqgr.aI(cqlcVar2), cqgr.bR(cqsv.f(72.0d, 72.0d, 136.0d, 80.0d)), cqgr.bG(ibn.f()), cqgr.bV(ibn.d()), cqgr.dB(ibn.d()), cqgr.aJ(16), irn.m(), cqgr.fg(new cqlc(cqlcVar3) { // from class: bnzx
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                if (((Boolean) this.a.a(cqkpVar)).booleanValue()) {
                    return cqvh.a(cqgm.a);
                }
                return cqvh.a(cqgm.e);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eU(ibm.n()), cqgr.eN(5), cqgr.eM(new cqlc(cqlcVar3, cqlcVar) { // from class: bnzy
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar3;
                this.b = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i;
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                if (((Boolean) cqlcVar4.a(cqkpVar)).booleanValue()) {
                    i = ((Boolean) cqlcVar5.a(cqkpVar)).booleanValue() ? R.string.BUSINESS_HOURS_SELECT_DAYS_INSTRUCTION : R.string.BUSINESS_HOURS_TAP_DAYS_INSTRUCTION;
                } else {
                    i = R.string.BUSINESS_HOURS_SET_HOURS;
                }
                return Integer.valueOf(i);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })};
        cqmp[] cqmpVarArr2 = {cqgr.aI(cqlcVar3), cqgr.bq(cqrp.d(7.0d))};
        cqmp[] cqmpVarArr3 = {cqgr.aI(cqlcVar3)};
        cqmj b = bnyy.b(cqkz.a(cqrt.l(R.string.BUSINESS_HOURS_HINT)), q, cqkz.a(null), cqkz.a(null), -1, cqgr.eU(ibm.n()), iue.b(cjtd.a(dtxj.b)));
        b.f(cqgr.aF(new cqlc(cqlcVar, cqlcVar3) { // from class: bnzz
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                boolean z = true;
                if (!((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() && !((Boolean) cqlcVar5.a(cqkpVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bR(cqsv.f(72.0d, 72.0d, 136.0d, 80.0d)), cqgr.cW(q));
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C));
        gd.g(cqgr.aI(new cqlc(cqlcVar, cqlcVar3) { // from class: boaa
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                boolean z = true;
                if (!((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() && !((Boolean) cqlcVar5.a(cqkpVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        return cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.dI(new cqlc(cqlcVar3) { // from class: bnzv
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((Boolean) this.a.a(cqkpVar)).booleanValue() ? cqrp.d(dcyn.a) : ibn.f();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bI(new cqlc(cqlcVar3) { // from class: bnzw
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                if (((Boolean) this.a.a(cqkpVar)).booleanValue()) {
                    return cqrp.d(dcyn.a);
                }
                return cqsv.f(4.0d, 4.0d, 8.0d, 8.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gq(cqmpVarArr), cqgr.gm(cqmpVarArr2), iuh.b(cqmpVarArr3), b, gd, cqgr.gq(cqgr.dQ(cqsv.f(72.0d, 72.0d, 136.0d, 80.0d)), cqgr.dF(ibn.g()), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(16.0d)), cqgr.aJ(16), cqgr.eN(5), irn.p(), cqgr.eU(ibm.w()), cqgr.eL(Integer.valueOf((int) R.string.BUSINESS_HOURS_ADD_A_SET)), cqgr.cW(q), cqgr.aF(new cqlc(cqlcVar, cqlcVar3) { // from class: boab
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                boolean z = true;
                if (((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() && !((Boolean) cqlcVar5.a(cqkpVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.b(cjtd.a(dtya.k))));
    }
}
