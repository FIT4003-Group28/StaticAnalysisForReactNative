package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: acww  reason: default package */
/* loaded from: classes.dex */
public final class acww implements awwl {
    private static final dcdn<dktk, dcdn<acwv, ckha>> d;
    private static final dcdn<dktk, dcdn<acwv, ckha>> e;
    private final boolean a;
    private final dktk b;
    private final ckcw c;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(acwv.END_TO_END, ckfh.x);
        dcdgVar.f(acwv.FAILED_ATTEMPTS, ckfh.y);
        dcdgVar.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.z);
        dcdgVar.f(acwv.DISPATCH, ckfh.A);
        dcdgVar.f(acwv.REQUIREMENTS, ckfh.B);
        dcdgVar.f(acwv.ESTABLISH_CONNECTION, ckfh.C);
        dcdgVar.f(acwv.TRANSMISSION, ckfh.E);
        dcdgVar.f(acwv.SERVER_FULFILLMENT, ckfh.F);
        dcdgVar.f(acwv.READ_RESPONSE, ckfh.D);
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(acwv.END_TO_END, ckfh.P);
        dcdgVar2.f(acwv.FAILED_ATTEMPTS, ckfh.Q);
        dcdgVar2.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.R);
        dcdgVar2.f(acwv.DISPATCH, ckfh.S);
        dcdgVar2.f(acwv.REQUIREMENTS, ckfh.T);
        dcdgVar2.f(acwv.ESTABLISH_CONNECTION, ckfh.U);
        dcdgVar2.f(acwv.TRANSMISSION, ckfh.W);
        dcdgVar2.f(acwv.SERVER_FULFILLMENT, ckfh.X);
        dcdgVar2.f(acwv.READ_RESPONSE, ckfh.V);
        dcdg dcdgVar3 = new dcdg();
        dcdgVar3.f(acwv.END_TO_END, ckfh.ah);
        dcdgVar3.f(acwv.FAILED_ATTEMPTS, ckfh.ai);
        dcdgVar3.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.aj);
        dcdgVar3.f(acwv.DISPATCH, ckfh.ak);
        dcdgVar3.f(acwv.REQUIREMENTS, ckfh.al);
        dcdgVar3.f(acwv.ESTABLISH_CONNECTION, ckfh.am);
        dcdgVar3.f(acwv.TRANSMISSION, ckfh.ao);
        dcdgVar3.f(acwv.SERVER_FULFILLMENT, ckfh.ap);
        dcdgVar3.f(acwv.READ_RESPONSE, ckfh.an);
        dcdg dcdgVar4 = new dcdg();
        dcdgVar4.f(acwv.END_TO_END, ckfh.az);
        dcdgVar4.f(acwv.FAILED_ATTEMPTS, ckfh.aA);
        dcdgVar4.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.aB);
        dcdgVar4.f(acwv.DISPATCH, ckfh.aC);
        dcdgVar4.f(acwv.REQUIREMENTS, ckfh.aD);
        dcdgVar4.f(acwv.ESTABLISH_CONNECTION, ckfh.aE);
        dcdgVar4.f(acwv.TRANSMISSION, ckfh.aG);
        dcdgVar4.f(acwv.SERVER_FULFILLMENT, ckfh.aH);
        dcdgVar4.f(acwv.READ_RESPONSE, ckfh.aF);
        dcdg dcdgVar5 = new dcdg();
        dcdgVar5.f(dktk.EXPLORE, dcdgVar.b());
        dcdgVar5.f(dktk.INFORMAL_TRANSIT, dcdgVar4.b());
        d = dcdgVar5.b();
        dcdg dcdgVar6 = new dcdg();
        dcdgVar6.f(acwv.END_TO_END, ckfh.o);
        dcdgVar6.f(acwv.FAILED_ATTEMPTS, ckfh.p);
        dcdgVar6.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.q);
        dcdgVar6.f(acwv.DISPATCH, ckfh.r);
        dcdgVar6.f(acwv.REQUIREMENTS, ckfh.s);
        dcdgVar6.f(acwv.ESTABLISH_CONNECTION, ckfh.t);
        dcdgVar6.f(acwv.TRANSMISSION, ckfh.v);
        dcdgVar6.f(acwv.SERVER_FULFILLMENT, ckfh.w);
        dcdgVar6.f(acwv.READ_RESPONSE, ckfh.u);
        dcdg dcdgVar7 = new dcdg();
        dcdgVar7.f(acwv.END_TO_END, ckfh.G);
        dcdgVar7.f(acwv.FAILED_ATTEMPTS, ckfh.H);
        dcdgVar7.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.I);
        dcdgVar7.f(acwv.DISPATCH, ckfh.J);
        dcdgVar7.f(acwv.REQUIREMENTS, ckfh.K);
        dcdgVar7.f(acwv.ESTABLISH_CONNECTION, ckfh.L);
        dcdgVar7.f(acwv.TRANSMISSION, ckfh.N);
        dcdgVar7.f(acwv.SERVER_FULFILLMENT, ckfh.O);
        dcdgVar7.f(acwv.READ_RESPONSE, ckfh.M);
        dcdg dcdgVar8 = new dcdg();
        dcdgVar8.f(acwv.END_TO_END, ckfh.Y);
        dcdgVar8.f(acwv.FAILED_ATTEMPTS, ckfh.Z);
        dcdgVar8.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.aa);
        dcdgVar8.f(acwv.DISPATCH, ckfh.ab);
        dcdgVar8.f(acwv.REQUIREMENTS, ckfh.ac);
        dcdgVar8.f(acwv.ESTABLISH_CONNECTION, ckfh.ad);
        dcdgVar8.f(acwv.TRANSMISSION, ckfh.af);
        dcdgVar8.f(acwv.SERVER_FULFILLMENT, ckfh.ag);
        dcdgVar8.f(acwv.READ_RESPONSE, ckfh.ae);
        dcdg dcdgVar9 = new dcdg();
        dcdgVar9.f(acwv.END_TO_END, ckfh.aq);
        dcdgVar9.f(acwv.FAILED_ATTEMPTS, ckfh.ar);
        dcdgVar9.f(acwv.FINAL_ATTEMPT_END_TO_END, ckfh.as);
        dcdgVar9.f(acwv.DISPATCH, ckfh.at);
        dcdgVar9.f(acwv.REQUIREMENTS, ckfh.au);
        dcdgVar9.f(acwv.ESTABLISH_CONNECTION, ckfh.av);
        dcdgVar9.f(acwv.TRANSMISSION, ckfh.ax);
        dcdgVar9.f(acwv.SERVER_FULFILLMENT, ckfh.ay);
        dcdgVar9.f(acwv.READ_RESPONSE, ckfh.aw);
        dcdg dcdgVar10 = new dcdg();
        dcdgVar10.f(dktk.EXPLORE, dcdgVar6.b());
        dcdgVar10.f(dktk.INFORMAL_TRANSIT, dcdgVar9.b());
        e = dcdgVar10.b();
    }

    public acww(boolean z, dktk dktkVar, ckcw ckcwVar) {
        this.a = z;
        this.b = dktkVar;
        this.c = ckcwVar;
    }

    private final void b(boolean z, acwv acwvVar, long j) {
        dcdn<acwv, ckha> dcdnVar;
        dcdn<acwv, ckha> dcdnVar2 = e.get(this.b);
        if (dcdnVar2 != null && dcdnVar2.containsKey(acwvVar)) {
            ((ckcp) this.c.a(dcdnVar2.get(acwvVar))).a(j);
        }
        if (!z || (dcdnVar = d.get(this.b)) == null || !dcdnVar.containsKey(acwvVar)) {
            return;
        }
        ((ckcp) this.c.a(dcdnVar.get(acwvVar))).a(j);
    }

    @Override // defpackage.awwl
    public final void a(long j, btzw btzwVar, long j2, boolean z) {
        long j3;
        long longValue;
        long j4;
        boolean z2;
        List list = (List) deha.s(btzwVar.a());
        btzv btzvVar = (btzv) list.get(list.size() - 1);
        Long a = btzvVar.a();
        Long b = btzvVar.b();
        Long s = btzvVar.s();
        Long u = btzvVar.u();
        Long v = btzvVar.v();
        if (a == null || b == null || s == null || u == null || v == null) {
            return;
        }
        long j5 = btzwVar.c - j;
        if (list.size() == 1) {
            longValue = 0;
            j3 = j5;
        } else {
            j3 = j5;
            longValue = a.longValue() - btzwVar.b;
        }
        long longValue2 = btzwVar.c - a.longValue();
        long j6 = longValue;
        long j7 = btzwVar.b - j;
        long longValue3 = b.longValue() - a.longValue();
        long longValue4 = s.longValue() - b.longValue();
        long j8 = j3;
        long longValue5 = v.longValue() - u.longValue();
        long longValue6 = (u.longValue() - s.longValue()) - j2;
        if (!this.a || z) {
            j4 = longValue6;
            z2 = false;
        } else {
            j4 = longValue6;
            z2 = true;
        }
        b(z2, acwv.END_TO_END, j8);
        b(z2, acwv.FAILED_ATTEMPTS, j6);
        b(z2, acwv.FINAL_ATTEMPT_END_TO_END, longValue2);
        b(z2, acwv.DISPATCH, j7);
        b(z2, acwv.REQUIREMENTS, longValue3);
        b(z2, acwv.ESTABLISH_CONNECTION, longValue4);
        b(z2, acwv.READ_RESPONSE, longValue5);
        b(z2, acwv.SERVER_FULFILLMENT, j2);
        b(z2, acwv.TRANSMISSION, j4);
    }
}
