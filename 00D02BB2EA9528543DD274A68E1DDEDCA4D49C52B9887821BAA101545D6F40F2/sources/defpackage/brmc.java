package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: brmc  reason: default package */
/* loaded from: classes4.dex */
public final class brmc {
    @dzsi
    public cqkf<bssu> c;
    @dzsi
    public bsoi d;
    public int a = 0;
    public int b = 0;
    public boolean e = false;

    public brmc(cqkf<bssu> cqkfVar, bsoi bsoiVar) {
        this.c = cqkfVar;
        this.d = bsoiVar;
    }

    public final void a() {
        bsoi bsoiVar = this.d;
        if (bsoiVar == null) {
            f();
        } else if (bsoiVar.G) {
            e();
        } else {
            f();
        }
    }

    public final void b() {
        boolean z = false;
        if (this.d == null) {
            f();
            this.e = false;
            return;
        }
        c();
        f();
        bsoi bsoiVar = this.d;
        dbsk.s(bsoiVar);
        if (bsoiVar.G) {
            bsoi bsoiVar2 = this.d;
            dbsk.s(bsoiVar2);
            if (!bsoiVar2.J()) {
                z = true;
            }
        }
        this.e = z;
    }

    public final void c() {
        bsoi bsoiVar = this.d;
        dbsk.t(bsoiVar, "Can't retrieve TraversalScrollPosition since TraversalModeController is null");
        this.a = bsoiVar.C.b(1, bsoiVar.A());
    }

    public final void d() {
        this.b = 0;
    }

    public final void e() {
        bsoi bsoiVar = this.d;
        if (bsoiVar != null) {
            bsoiVar.d(false, false);
        }
    }

    public final void f() {
        g(this.a, this.b);
    }

    public final void g(int i, int i2) {
        RecyclerView recyclerView;
        aag aagVar;
        cqkf<bssu> cqkfVar = this.c;
        if (cqkfVar == null || (recyclerView = (RecyclerView) cqkfVar.c()) == null || (aagVar = (aag) recyclerView.l) == null) {
            return;
        }
        aagVar.P(i, i2);
    }

    public final int h() {
        aag aagVar;
        cqkf<bssu> cqkfVar = this.c;
        if (cqkfVar == null || (aagVar = (aag) ((RecyclerView) cqkfVar.c()).l) == null) {
            return -1;
        }
        int i = 0;
        View aK = aagVar.aK(0);
        if (aK != null) {
            i = aK.getTop() - aagVar.getPaddingTop();
        }
        this.b = i;
        return aagVar.ac();
    }
}
