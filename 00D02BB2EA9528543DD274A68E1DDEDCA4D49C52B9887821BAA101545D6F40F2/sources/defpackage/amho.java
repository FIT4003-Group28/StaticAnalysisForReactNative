package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amho  reason: default package */
/* loaded from: classes.dex */
public final class amho {
    public final dcdc<bnvf> a;
    public final dcdc<dmlu> b;
    @dzsi
    public final bnvf c;
    public final dcdc<akse> d;
    public final akse e;
    public double f;
    public float g;
    public final float h;
    public final float i;
    public amhn j;

    public amho() {
        this.e = new akse();
        this.a = dcdc.e();
        this.d = dcdc.e();
        this.b = dcdc.e();
        this.c = null;
        this.h = 0.0f;
        this.i = 0.0f;
    }

    public final boolean a() {
        return !this.d.isEmpty() && this.d.size() == this.a.size();
    }

    public final void b() {
        amhp.i(this.a);
        bnvf bnvfVar = this.c;
        if (bnvfVar != null) {
            bnvfVar.c();
        }
    }

    public amho(amhp amhpVar, List<bnvf> list, List<dmlu> list2, List<akse> list3) {
        this.e = new akse();
        this.a = dcdc.r(list);
        this.d = dcdc.r(list3);
        this.b = dcdc.r(list2);
        amhm amhmVar = amhpVar.d;
        this.c = amhmVar == null ? null : new amlk(amhmVar.a, amhmVar.b, amhmVar.c).a();
        this.h = amhpVar.d();
        this.i = amhpVar.e();
    }
}
