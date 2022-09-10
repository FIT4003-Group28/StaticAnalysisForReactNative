package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgyu  reason: default package */
/* loaded from: classes4.dex */
public class cgyu implements cgvz {
    @dzsi
    public final bond a;
    private final dxio<boxa> b;
    private final ges c;
    private final bwrs<ilo> d;
    private final bonr e;
    private final String f;
    private boolean g;
    private byee h;
    private final View.AccessibilityDelegate i = new cgyt(this);

    public cgyu(dxio<boxa> dxioVar, ges gesVar, bwrs<ilo> bwrsVar, bonr bonrVar, @dzsi bond bondVar, String str) {
        this.b = dxioVar;
        this.c = gesVar;
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.h = c.al();
        this.e = bonrVar;
        this.a = bondVar;
        this.f = str;
        this.g = false;
    }

    @Override // defpackage.bosw
    public boqa a() {
        return this.e;
    }

    @Override // defpackage.bosw
    @dzsi
    public bopv b() {
        return this.a;
    }

    @Override // defpackage.bosw
    public Boolean c() {
        boolean z = false;
        if (!d().booleanValue() && !e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bosw
    public Boolean d() {
        return this.e.l();
    }

    @Override // defpackage.bosw
    public Boolean e() {
        bond bondVar = this.a;
        boolean z = false;
        if (bondVar != null && bondVar.n().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bosw
    public cqkl f() {
        ilo c = this.d.c();
        dbsk.s(c);
        bosi j = bosj.j();
        j.d(c.n());
        bond bondVar = this.a;
        j.b(bondVar != null ? bondVar.o() : new bokf());
        j.f(c.aT());
        ((bosg) j).a = this.h;
        this.b.a().U(j.a(), this.c, dwyd.UGC_TASK_SETS);
        return cqkl.a;
    }

    @Override // defpackage.cgvz
    public CharSequence g() {
        return this.f;
    }

    @Override // defpackage.cgvz
    public Boolean h() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bosw
    public View.AccessibilityDelegate i() {
        return this.i;
    }

    @Override // defpackage.cgvz
    public Boolean j() {
        boolean z = false;
        if ((d().booleanValue() || e().booleanValue()) && !h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void k(boolean z) {
        this.g = z;
        bond bondVar = this.a;
        if (bondVar != null) {
            bondVar.l(!z);
        }
        cqkx.p(this);
    }

    public void l(@dzsi byee byeeVar) {
        if (byeeVar != null) {
            this.e.a(byeeVar);
            this.h = byeeVar;
        }
    }

    public void m(bokf bokfVar) {
        bond bondVar = this.a;
        if (bondVar != null) {
            bondVar.q(bokfVar.b());
        }
    }

    public void n(List<bbtm> list) {
        bond bondVar = this.a;
        if (bondVar != null) {
            bondVar.q(list);
        }
    }

    @dzsi
    public List<bbtm> o() {
        bond bondVar = this.a;
        if (bondVar != null) {
            return bondVar.o().b();
        }
        return null;
    }
}
