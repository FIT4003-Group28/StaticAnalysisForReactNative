package defpackage;

import android.content.res.Resources;
import android.os.Build;
/* compiled from: PG */
/* renamed from: aeok  reason: default package */
/* loaded from: classes2.dex */
public class aeok implements aeni {
    public static final boolean a;
    public final aenr b;
    public final aenr c;
    public final cqat d;
    public int e;
    public aehu f;
    private final Resources g;
    private final aenw h;
    private final aeoj i;
    private final aenv j;
    private final aenq k;
    private final aenq l;
    private boolean m;

    static {
        a = Build.VERSION.SDK_INT < 22;
    }

    public aeok(cqhn cqhnVar, aens aensVar, aenx aenxVar, cqat cqatVar, Resources resources, aeoj aeojVar, eapg eapgVar, eapg eapgVar2, int i) {
        aenw a2;
        aeog aeogVar = new aeog(this);
        this.j = aeogVar;
        aeoh aeohVar = new aeoh(this);
        this.k = aeohVar;
        aeoi aeoiVar = new aeoi(this);
        this.l = aeoiVar;
        this.g = resources;
        this.d = cqatVar;
        this.i = aeojVar;
        this.e = i;
        this.f = new aehu(eapgVar, eapgVar2);
        boolean z = true;
        this.b = aensVar.a(dtxr.ck, eapgVar, 1 == (this.e ^ 1), aeohVar);
        this.c = aensVar.a(dtxr.cl, eapgVar2, 1 != this.e ? false : z, aeoiVar);
        if (this.e == 0) {
            a2 = aenx.a(aeogVar, aehu.d(cqatVar), aehu.e(cqatVar), eapgVar);
        } else {
            a2 = aenx.a(aeogVar, aehu.g(eapgVar), aehu.f(eapgVar), eapgVar2);
        }
        this.h = a2;
    }

    @Override // defpackage.aeni
    public aenh a() {
        return this.h;
    }

    @Override // defpackage.aeni
    public cqkl b() {
        this.i.a(this.f);
        return cqkl.a;
    }

    @Override // defpackage.aeni
    public cqkl c() {
        this.i.b();
        return cqkl.a;
    }

    @Override // defpackage.aeni
    public Boolean d() {
        boolean z = true;
        if (1 != (this.e ^ 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeni
    public Boolean e() {
        return Boolean.valueOf(this.g.getConfiguration().orientation == 2);
    }

    @Override // defpackage.aeni
    public Boolean f() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.aenl
    public aeng g() {
        return this.b;
    }

    @Override // defpackage.aenl
    public aeng h() {
        return this.c;
    }

    @Override // defpackage.aenl
    public cqfc i() {
        return aenk.a;
    }

    @Override // defpackage.aenl
    @dzsi
    public cqfd j() {
        return null;
    }

    @Override // defpackage.aenl
    public Boolean k() {
        return false;
    }

    @Override // defpackage.aenl
    public Float l() {
        return aenj.a();
    }

    public final void m(int i, eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        boolean z = false;
        this.b.j(1 == (i ^ 1));
        aenr aenrVar = this.c;
        if (1 == i) {
            z = true;
        }
        aenrVar.j(z);
        this.h.g(eapgVar.o(eapgVar.b.M().g(eapgVar.a, 1)), eapgVar2, eapgVar3.q(1));
        cqkx.p(this);
        this.h.g(eapgVar, eapgVar2, eapgVar3);
        cqkx.p(this);
    }
}
