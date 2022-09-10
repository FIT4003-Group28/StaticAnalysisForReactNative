package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atyy  reason: default package */
/* loaded from: classes2.dex */
public final class atyy implements atzb {
    final /* synthetic */ atyz a;

    public atyy(atyz atyzVar) {
        this.a = atyzVar;
    }

    @Override // defpackage.atzb
    public final void a(brlu brluVar, boolean z) {
        this.a.s = true;
        boolean z2 = brluVar.e;
        if (!this.a.f.bb()) {
            return;
        }
        if (z2) {
            c(brluVar);
            return;
        }
        atyz atyzVar = this.a;
        if (atyzVar.k == 3) {
            c(brluVar);
        } else {
            atyzVar.d.b(new crhj(brluVar));
        }
    }

    @Override // defpackage.atzb
    public final void b(bttq bttqVar) {
        this.a.s = true;
        if (!this.a.f.bb()) {
            return;
        }
        atyz atyzVar = this.a;
        if (atyzVar.k == 3) {
            atyzVar.h();
            return;
        }
        atyzVar.e.i(null, false, bttqVar == bttq.NO_CONNECTIVITY, atyz.i(this.a.j), this.a.k);
        this.a.j = null;
        this.a.g.j();
        this.a.g.k(astb.NO_SEARCH);
    }

    public final void c(brlu brluVar) {
        boolean z = brluVar.e;
        if (brluVar.E() == 0) {
            atyz atyzVar = this.a;
            if (atyzVar.k == 3) {
                atyzVar.h();
                return;
            } else if (!z) {
                return;
            } else {
                atyzVar.e.i(null, false, brluVar.d, atyz.i(atyzVar.j), this.a.k);
                this.a.j = null;
                this.a.g.j();
                this.a.g.k(astb.NO_SEARCH);
                return;
            }
        }
        if (brluVar.f) {
            this.a.g.k(astb.SEARCH_AUTOREFRESHING);
        } else {
            this.a.g.k(astb.SEARCH_NOT_AUTOREFRESHING);
        }
        this.a.h();
        atyz atyzVar2 = this.a;
        if (atyzVar2.k == 3 && brluVar.d && atyzVar2.c.e() < this.a.b) {
            return;
        }
        atyz atyzVar3 = this.a;
        atyzVar3.b = atyzVar3.c.e() + atyz.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= brluVar.E()) {
                break;
            }
            broh D = brluVar.D(i);
            if (D.c()) {
                ilo d = D.d();
                akqi ai = d.ai();
                if (this.a.j == null || !ai.o().equals(this.a.j.f())) {
                    arrayList.add(d);
                    d.F();
                } else {
                    arrayList.clear();
                    arrayList.add(d);
                    break;
                }
            }
            i++;
        }
        atyz atyzVar4 = this.a;
        atyzVar4.e.i(arrayList, brluVar.g, brluVar.d, atyz.i(atyzVar4.j), this.a.k);
    }
}
