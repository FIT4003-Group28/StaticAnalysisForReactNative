package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnuf  reason: default package */
/* loaded from: classes.dex */
public final class bnuf implements bnun {
    private static final dcqe c = dcqe.c("bnuf");
    @dzsi
    public final Comparator<bnsa> a;
    public final bnux[] b;
    private final bnue d;

    public bnuf(int i, bnue bnueVar, @dzsi Comparator<bnsa> comparator) {
        this.d = bnueVar;
        this.a = comparator;
        if (i <= 0) {
            bvoo.h("Invalid numBins: %d", Integer.valueOf(i));
            this.b = new bnux[0];
            return;
        }
        this.b = new bnux[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new bnux(comparator);
        }
    }

    private final bnux h(bnsa bnsaVar) {
        bnux[] bnuxVarArr = this.b;
        if (bnuxVarArr.length == 1) {
            return bnuxVarArr[0];
        }
        int a = this.d.a(bnsaVar);
        bnux[] bnuxVarArr2 = this.b;
        if (a >= bnuxVarArr2.length || a < 0) {
            bvoo.h("layerIndex is: %d , while numBins is: %d", Integer.valueOf(a), Integer.valueOf(this.b.length));
            return this.b[0];
        }
        return bnuxVarArr2[a];
    }

    @Override // defpackage.bnun
    public final void a(long j) {
        for (bnux bnuxVar : this.b) {
            bnuxVar.a(j);
        }
    }

    @Override // defpackage.bnun
    public final void b(bnsa bnsaVar) {
        if (this.a != null) {
            h(bnsaVar).c();
        }
    }

    public final void c(bnrr bnrrVar) {
        for (bnux bnuxVar : this.b) {
            bnuxVar.h(bnrrVar);
        }
    }

    @Override // defpackage.bnun
    public final void d(bnsa bnsaVar) {
        h(bnsaVar).d(bnsaVar);
    }

    @Override // defpackage.bnun
    public final boolean e(bnsa bnsaVar) {
        return h(bnsaVar).e(bnsaVar);
    }

    @Override // defpackage.bnun
    public final void f() {
        for (bnux bnuxVar : this.b) {
            bnuxVar.f();
        }
    }

    @Override // defpackage.bnun
    public final List<bnsa> g(bntb bntbVar) {
        ArrayList a = dchl.a();
        for (bnux bnuxVar : this.b) {
            a.addAll(bnuxVar.g(bntbVar));
        }
        return a;
    }
}
