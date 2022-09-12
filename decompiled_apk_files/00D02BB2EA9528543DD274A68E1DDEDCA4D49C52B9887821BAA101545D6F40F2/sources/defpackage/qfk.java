package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qfk  reason: default package */
/* loaded from: classes7.dex */
public class qfk implements bxoe {
    public final bxeq a;
    public final qff b;
    private final bxny e;
    private final bxnx f = new qfi();
    private final bxoc g = new qfj();
    private dcdc<qfh> c = dcdc.e();
    private boolean d = false;

    public qfk(cqhn cqhnVar, dxio<bxpa> dxioVar, bxeq bxeqVar, bxny bxnyVar, qff qffVar) {
        this.a = bxeqVar;
        this.e = bxnyVar;
        this.b = qffVar;
    }

    @Override // defpackage.bxoe
    public List<? extends bxoi> a() {
        return this.c;
    }

    @Override // defpackage.bxoe
    public cqiw<bxoi> b() {
        return new bxjh();
    }

    @Override // defpackage.bxoe
    public bxnx c() {
        return this.f;
    }

    @Override // defpackage.bxoe
    public bxod d() {
        return bxod.ONLINE;
    }

    @Override // defpackage.bxoe
    public cqkp e() {
        return new qfg();
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxoi f() {
        return null;
    }

    @Override // defpackage.bxoe
    public Boolean g() {
        return false;
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxnz h() {
        return null;
    }

    @Override // defpackage.bxoe
    public bxny i() {
        return this.e;
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxnw j() {
        return null;
    }

    @Override // defpackage.bxoe
    public Boolean k() {
        return false;
    }

    @Override // defpackage.bxoe
    @dzsi
    public jbf l() {
        return null;
    }

    @Override // defpackage.bxoe
    public Boolean m() {
        boolean z = false;
        if (this.e.a().booleanValue() && this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoe
    public Boolean n() {
        return false;
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxoi o() {
        return null;
    }

    public void p(List<bxmh> list, boolean z) {
        dccx F = dcdc.F();
        for (bxmh bxmhVar : list) {
            F.g(new qfh(this, bxmhVar));
        }
        this.c = F.f();
        this.d = z;
    }

    @Override // defpackage.bxoe
    @dzsi
    public bxoi q() {
        return null;
    }

    @Override // defpackage.bxoe
    public dksg r() {
        return dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
    }

    @Override // defpackage.bxoe
    public bxoc s() {
        return this.g;
    }

    @Override // defpackage.bxoe
    public Boolean t() {
        return false;
    }

    @Override // defpackage.bxoe
    public CharSequence u() {
        return "";
    }
}
