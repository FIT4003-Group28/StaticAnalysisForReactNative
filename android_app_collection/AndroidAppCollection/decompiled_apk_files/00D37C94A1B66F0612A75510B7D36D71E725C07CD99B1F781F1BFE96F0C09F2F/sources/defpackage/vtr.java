package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: vtr  reason: default package */
/* loaded from: classes4.dex */
public final class vtr implements otb {
    public final otb a;
    public boolean b;
    public int c;
    public final CopyOnWriteArraySet d;

    public vtr() {
        otb a = osz.a(5, 0, 0);
        this.d = new CopyOnWriteArraySet();
        this.a = a;
        this.c = 5;
    }

    private final void q(boolean z) {
        this.a.l(z);
        this.b = false;
    }

    private final boolean r() {
        for (int i = 0; i < this.c; i++) {
            if (this.a.b(i) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.otb
    public final int a() {
        return ((otd) this.a).e;
    }

    @Override // defpackage.otb
    public final int b(int i) {
        throw null;
    }

    @Override // defpackage.otb
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.otb
    public final long d() {
        throw null;
    }

    @Override // defpackage.otb
    public final void e(ota otaVar) {
        this.a.e(otaVar);
    }

    @Override // defpackage.otb
    public final void f(osy osyVar, int i, Object obj) {
        throw null;
    }

    @Override // defpackage.otb
    public final void g(ouo... ouoVarArr) {
        throw null;
    }

    @Override // defpackage.otb
    public final void h() {
        throw null;
    }

    @Override // defpackage.otb
    public final void i(ota otaVar) {
        this.a.i(otaVar);
    }

    @Override // defpackage.otb
    public final void j(long j) {
        this.a.j(j);
    }

    @Override // defpackage.otb
    public final void k(osy osyVar, int i, Object obj) {
        this.a.k(osyVar, i, obj);
    }

    @Override // defpackage.otb
    public final void l(boolean z) {
        this.b = z;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((vty) it.next()).a.a();
        }
        if (!z || r()) {
            q(z);
        }
    }

    @Override // defpackage.otb
    public final void m(int i, int i2) {
        this.a.m(i, i2);
        if (!this.b || !r()) {
            return;
        }
        q(true);
    }

    @Override // defpackage.otb
    public final void n() {
        throw null;
    }

    @Override // defpackage.otb
    public final boolean o() {
        return this.b || ((otd) this.a).d;
    }

    @Deprecated
    public final void p(boolean z) {
        m(4, true != z ? -1 : 0);
    }
}
