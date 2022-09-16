package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chle  reason: default package */
/* loaded from: classes4.dex */
public final class chle implements chmu {
    public final chik a;
    final /* synthetic */ chlg b;
    private final cayf c;
    private final caxn d;

    public chle(chlg chlgVar, chik chikVar, cayf cayfVar, caxn caxnVar) {
        this.b = chlgVar;
        this.a = chikVar;
        this.c = cayfVar;
        this.d = caxnVar;
    }

    @Override // defpackage.chmu
    public final chik a() {
        return this.a;
    }

    @Override // defpackage.chmu
    public final void b() {
        chis chisVar = this.b.h;
        int i = ((chit) chisVar.b).d + 1;
        if (chisVar.c) {
            chisVar.bF();
            chisVar.c = false;
        }
        chit chitVar = (chit) chisVar.b;
        chitVar.a |= 2;
        chitVar.d = i;
        if (this.b.e.size() > i) {
            this.b.e.get(i).g();
        }
    }

    @Override // defpackage.chmu
    public final void c() {
        this.b.d.q();
    }

    @Override // defpackage.chmu
    @dzsi
    public final String d() {
        chit chitVar = (chit) this.b.h.b;
        if ((chitVar.a & 4) != 0) {
            return chitVar.e;
        }
        return null;
    }

    @Override // defpackage.chmu
    public final chby e() {
        return this.b.c;
    }

    @Override // defpackage.chmu
    public final cayf f() {
        return this.c;
    }

    @Override // defpackage.chmu
    public final boolean g() {
        return this.d.a;
    }

    @Override // defpackage.chmu
    public final void h(djgl djglVar, int i) {
        chix.a(this.b.h, djglVar);
        this.b.o();
        this.b.b();
        this.b.n();
        chis chisVar = this.b.h;
        if (chisVar.c) {
            chisVar.bF();
            chisVar.c = false;
        }
        chit chitVar = (chit) chisVar.b;
        chit chitVar2 = chit.i;
        chitVar.a &= -3;
        chitVar.d = 0;
        chis chisVar2 = this.b.h;
        if (chisVar2.c) {
            chisVar2.bF();
            chisVar2.c = false;
        }
        chit chitVar3 = (chit) chisVar2.b;
        chitVar3.h = i - 1;
        chitVar3.a |= 32;
        this.b.f.clear();
        cqkx.p(this.b);
    }

    @Override // defpackage.chmu
    public final void i(int i, @dzsi Runnable runnable) {
        long j = 0;
        for (View view : cqkx.n(this.b)) {
            j = Math.max(j, chgz.a(view, i));
        }
        if (runnable != null) {
            this.b.a.postDelayed(runnable, j);
        }
    }
}
