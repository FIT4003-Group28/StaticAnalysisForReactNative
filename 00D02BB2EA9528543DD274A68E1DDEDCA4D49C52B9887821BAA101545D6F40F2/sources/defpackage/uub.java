package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.swiperefresh.SwipeRefreshableRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uub  reason: default package */
/* loaded from: classes7.dex */
public final class uub extends cqiw<zbz> {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ cqiw a;
    final /* synthetic */ cqiw b;
    final /* synthetic */ cqiw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uub(Object[] objArr, cqiw cqiwVar, cqiw cqiwVar2, cqiw cqiwVar3) {
        super(objArr);
        this.a = cqiwVar;
        this.b = cqiwVar2;
        this.c = cqiwVar3;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zbz zbzVar, Context context, cqiv cqivVar) {
        cqiw<cqkp> cqiwVar;
        dqvj N;
        zbz zbzVar2 = zbzVar;
        List<zca> a = zbzVar2.a();
        zbr f = zbzVar2.f();
        if (f != null) {
            cqivVar.a(new usa(), f);
        }
        jam g = zbzVar2.g();
        if (g != null) {
            cqivVar.a(zbzVar2.m().booleanValue() ? new urw() : new urd(), g);
        }
        xgv l = zbzVar2.l();
        if (l != null && l.b().booleanValue()) {
            cqivVar.a(new xgr(), l);
            cqivVar.c(uxl.b);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < a.size(); i2++) {
            zca zcaVar = a.get(i2);
            if (zcaVar instanceof zdh) {
                cqivVar.a(new vgg(), (zdh) zcaVar);
            } else {
                boolean z4 = zcaVar instanceof zfj;
                if (!z4 || !zbzVar2.n().booleanValue()) {
                    if (z && !z3) {
                        cqivVar.c(z4 ? uxl.b : uxl.a);
                    }
                    if (!z2 && i2 > 0 && z4 && i2 < a.size() - 1) {
                        int i3 = i2 + 1;
                        if ((a.get(i3) instanceof zfp) && (N = ((zfp) a.get(i3)).N()) != dqvj.TRANSIT && N != dqvj.MIXED) {
                            uuh.b(cqivVar, zbzVar2);
                            z2 = true;
                        }
                    }
                    cqiw cqiwVar2 = this.a;
                    cqiw cqiwVar3 = this.b;
                    cqiw cqiwVar4 = this.c;
                    if (!z4) {
                        if (zcaVar instanceof zfp) {
                            cqiwVar2 = cqiwVar3;
                        } else if (!(zcaVar instanceof ydk)) {
                            String valueOf = String.valueOf(zcaVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                            sb.append("No layout for: ");
                            sb.append(valueOf);
                            throw new RuntimeException(sb.toString());
                        } else {
                            cqiwVar2 = cqiwVar4;
                        }
                    }
                    cqivVar.a(cqiwVar2, zcaVar);
                    z3 = z4;
                    z = true;
                }
            }
        }
        if (z) {
            if (!zbzVar2.h().booleanValue()) {
                cqiwVar = uxl.a;
            } else if (!z3) {
                cqiwVar = uxl.b;
            }
            cqivVar.c(cqiwVar);
        }
        if (!z2) {
            uuh.b(cqivVar, zbzVar2);
        }
        if (zbzVar2.e().booleanValue()) {
            cqivVar.a(new urv(), zbzVar2.j());
        }
        if (zbzVar2.i() != null) {
            cqivVar.a(uuh.c(true), zbzVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbz> a() {
        cqlc cqlcVar = utu.a;
        cqlc cqlcVar2 = utv.a;
        cqlc a = cqkz.a(false);
        cqmp[] cqmpVarArr = {cqgr.aI(utw.a)};
        Integer valueOf = Integer.valueOf((int) R.id.directions_trip_cardlist);
        return jgi.d(cqgr.dr(1), cqgr.y(utt.a), vlh.e(cqlcVar, cqlcVar2, a, cqmpVarArr), cqgr.fY(cqgr.ca(Float.valueOf(1.0f)), new uug(uuh.b, jkn.n), SwipeRefreshableRecyclerView.av(cqgr.ck(C()), cqgr.er(true), cqqx.t(new uua()), cqqx.p(null), cqgr.aR(valueOf), itj.i(dtxn.cy)), jdx.b(cqgr.aI(utx.a), jdx.c(valueOf)), cqgr.fY(cqgr.aT(uuh.b), cqgr.bp(-2), cqgr.aF(cqjv.x(utz.a)), cqgr.bw(80), cqgr.fP(uuh.c(false), uty.a, new cqmp[0]))));
    }
}
