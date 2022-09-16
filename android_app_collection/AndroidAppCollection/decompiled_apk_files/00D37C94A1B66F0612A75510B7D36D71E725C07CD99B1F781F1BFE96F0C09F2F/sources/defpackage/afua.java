package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afua  reason: default package */
/* loaded from: classes.dex */
public final class afua implements afuj {
    final afum a;
    final afun b;
    public final boolean c;
    public boolean d;

    public afua(afum afumVar, afun afunVar, ywk ywkVar) {
        this.c = ywkVar.c(ywk.S) == 1;
        this.a = afumVar;
        this.b = afunVar;
    }

    @Override // defpackage.afuj
    public final synchronized yms a() {
        return new aftz(this);
    }

    @Override // defpackage.afuj
    public final void b() {
        if (this.c) {
            this.b.b();
        } else {
            this.a.b();
        }
    }

    @Override // defpackage.afuj
    public final void c(Set set) {
        this.a.c(set);
        this.b.c(set);
    }

    @Override // defpackage.afuj
    public final void d() {
        this.a.d();
        this.b.d();
    }

    @Override // defpackage.afuj
    public final void e(List list) {
        if (this.c) {
            this.b.e(list);
        } else {
            this.a.e(list);
        }
    }

    @Override // defpackage.afuj
    public final void f(aopa aopaVar) {
        if (this.c) {
            this.b.f(aopaVar);
        } else {
            this.a.f(aopaVar);
        }
    }

    @Override // defpackage.afuj
    public final void g(aopa aopaVar) {
        if (this.c) {
            this.b.g(aopaVar);
        } else {
            this.a.g(aopaVar);
        }
    }
}
