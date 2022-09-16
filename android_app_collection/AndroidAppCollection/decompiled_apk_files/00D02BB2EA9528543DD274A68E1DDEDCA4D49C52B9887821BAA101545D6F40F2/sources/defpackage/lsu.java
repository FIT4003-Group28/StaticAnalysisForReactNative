package defpackage;

import java.io.PrintWriter;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: lsu  reason: default package */
/* loaded from: classes7.dex */
public final class lsu implements nce {
    public amuh a;
    private final btrm b;
    private final atcw c;
    private final Collection<ncd> d = dcnm.c();
    private cray[] e;
    private int f;
    private boolean g;

    public lsu(btrm btrmVar, atcw atcwVar, amuh amuhVar, cray[] crayVarArr, int i) {
        dbsk.a(amuhVar.m() == 0);
        this.b = btrmVar;
        this.c = atcwVar;
        this.a = amuhVar;
        this.e = crayVarArr;
        this.f = i;
    }

    private final void v(boolean z) {
        for (ncd ncdVar : this.d) {
            ncdVar.a(z);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nce
    public final int a() {
        return this.a.m();
    }

    @Override // defpackage.nce
    public final int b(int i) {
        return this.e[i].b();
    }

    @Override // defpackage.nce
    public final int d(int i) {
        return this.e[i].h;
    }

    @Override // defpackage.nce
    @dzsi
    public final dowa e(int i) {
        return this.a.l(i).I;
    }

    @Override // defpackage.nce
    @dzsi
    public final String f(int i) {
        return vyb.g(t(i));
    }

    @Override // defpackage.nce
    public final boolean g(int i) {
        return vyb.q(t(i));
    }

    @Override // defpackage.nce
    public final boolean h(int i) {
        return vyb.s(t(i));
    }

    @Override // defpackage.nce
    public final boolean i(int i) {
        return this.a.l(i).K == amtz.OFFLINE;
    }

    @Override // defpackage.nce
    public final boolean j() {
        return this.g;
    }

    public final void k(boolean z) {
        this.g = z;
        v(false);
    }

    @Override // defpackage.nce
    public final dpej l(int i) {
        return this.e[i].f();
    }

    @Override // defpackage.nce
    public final int m() {
        return this.a.b();
    }

    @Override // defpackage.nce
    public final void n(int i) {
        boolean z = true;
        dbsk.a(i >= 0);
        if (i >= a()) {
            z = false;
        }
        dbsk.a(z);
        this.b.b(new crif(this.a.l(i)));
    }

    @Override // defpackage.nce
    public final int o() {
        return this.f;
    }

    @Override // defpackage.nce
    public final void p(int i) {
        atdd atddVar = (atdd) this.c;
        atlo atloVar = (atlo) atddVar.a;
        crqf crqfVar = atloVar.l;
        if (crqfVar != null) {
            atloVar.s = true;
            atloVar.t = Math.min(crqfVar.f().m() - 1, i);
        }
        atddVar.u();
    }

    @Override // defpackage.nce
    public final void q(ncd ncdVar) {
        Collection<ncd> collection = this.d;
        dbsk.s(ncdVar);
        collection.add(ncdVar);
    }

    @Override // defpackage.nce
    public final void r(ncd ncdVar) {
        dbsk.a(this.d.remove(ncdVar));
    }

    public final void s(amuh amuhVar, cray[] crayVarArr, int i) {
        dbsk.a(amuhVar.m() == crayVarArr.length);
        boolean h = this.a.h(amuhVar);
        this.a = amuhVar;
        this.e = crayVarArr;
        this.f = i;
        v(!h);
    }

    @Override // defpackage.nce
    public final amve t(int i) {
        return this.a.l(i).d;
    }

    @Override // defpackage.nce
    public final /* bridge */ /* synthetic */ CharSequence u(int i) {
        dbsg<doxk> i2 = this.a.l(i).i();
        return (!i2.a() || i2.b().a.size() <= 0) ? "" : i2.b().a.get(0);
    }
}
