package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bosr  reason: default package */
/* loaded from: classes3.dex */
public class bosr implements bosw {
    public final dxio<boxa> a;
    public final ges b;
    public bosj c;
    @dzsi
    public final bond d;
    private final bonr e;
    private final View.AccessibilityDelegate f = new bosq(this);

    public bosr(dxio<boxa> dxioVar, jmx jmxVar, ges gesVar, bosj bosjVar, bonr bonrVar, @dzsi bond bondVar) {
        this.a = dxioVar;
        this.b = gesVar;
        this.c = bosjVar;
        this.e = bonrVar;
        this.d = bondVar;
    }

    @Override // defpackage.bosw
    public boqa a() {
        return this.e;
    }

    @Override // defpackage.bosw
    @dzsi
    public bopv b() {
        return this.d;
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
        boolean z = false;
        if ((this.e.f().booleanValue() || !e().booleanValue()) && this.e.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bosw
    public Boolean e() {
        bond bondVar = this.d;
        boolean z = false;
        if (bondVar != null && bondVar.n().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bosw
    public cqkl f() {
        jmw.d(this.b.J(), new bosp(this));
        return cqkl.a;
    }

    public void g(List<bbtm> list) {
        this.c.d().a(list);
        h(this.c);
    }

    public void h(bosj bosjVar) {
        this.c = bosjVar;
        if (bosjVar.b() != null) {
            this.e.a(this.c.b());
            this.e.b(this.c.h());
        }
        bond bondVar = this.d;
        if (bondVar != null) {
            bondVar.q(this.c.d().b());
        }
        cqkx.p(this);
    }

    @Override // defpackage.bosw
    public View.AccessibilityDelegate i() {
        return this.f;
    }
}
