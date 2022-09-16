package defpackage;

import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: bazz  reason: default package */
/* loaded from: classes3.dex */
public class bazz implements bayf {
    private final Context a;
    private final begg b;
    private final bfcc c;
    private final baal d;
    private final bnhs e;
    private String f;
    private ilo g;
    @dzsi
    private bnju h;
    @dzsi
    private final Integer i;
    @dzsi
    private cqtd j;

    public bazz(gga ggaVar, begg beggVar, bfcd bfcdVar, bnhs bnhsVar, baal baalVar, bexz bexzVar) {
        this.a = ggaVar;
        this.b = beggVar;
        this.e = bnhsVar;
        this.d = baalVar;
        this.f = baalVar.y(ggaVar);
        Activity activity = (Activity) ((dxjd) bfcdVar.a).a;
        bfcd.a(activity, 1);
        bfcd.a(bfcdVar.b.a(), 2);
        cpv a = bfcdVar.c.a();
        bfcd.a(a, 3);
        bfcd.a(baalVar, 4);
        bfcd.a(bexzVar, 5);
        this.c = new bfcc(activity, a, baalVar, bexzVar);
        this.g = batz.b(baalVar);
        Integer valueOf = Integer.valueOf(irh.p().e(ggaVar));
        this.i = valueOf;
        this.j = bnhsVar.a(this.f, valueOf);
    }

    @Override // defpackage.bayf
    public String a() {
        return this.f;
    }

    @Override // defpackage.bayf
    public String b() {
        bnju bnjuVar = this.h;
        if (bnjuVar == null) {
            baak z = this.d.z();
            dbsk.s(z);
            return z.d();
        }
        return bnjuVar.aH().B();
    }

    @Override // defpackage.bayf
    public String c() {
        bnju bnjuVar = this.h;
        return bnjuVar == null ? "" : bnjuVar.s();
    }

    @Override // defpackage.bayf
    public bfca d() {
        return this.c;
    }

    @Override // defpackage.bayf
    public jic e() {
        bnju bnjuVar = this.h;
        return new jic(bnjuVar != null ? bnjuVar.aJ() : null, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, this.j, 0);
    }

    @Override // defpackage.bayf
    public cqkl f() {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c(false);
        begjVar.c = jjn.COLLAPSED;
        begjVar.b(this.g);
        this.b.o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.bayf
    public cjtd g() {
        cjta c = cjtd.c(this.g.bZ());
        c.d = dtyg.z;
        return c.a();
    }

    public void h(bexz bexzVar) {
        this.c.n(bexzVar);
    }

    public void i(bnju bnjuVar) {
        this.h = bnjuVar;
        ilo aH = bnjuVar.aH();
        this.g = aH;
        this.c.m(aH);
        String n = this.g.n();
        if (!this.f.equals(n)) {
            this.f = n;
            this.j = this.e.a(n, this.i);
        }
    }
}
