package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayzm  reason: default package */
/* loaded from: classes2.dex */
public final class ayzm extends AtomicReference implements ayoa {
    private static final long serialVersionUID = 3837284832786408377L;
    final ayzn a;
    final long b;
    final int c;
    volatile ayrn d;
    volatile boolean e;
    int f;

    public ayzm(ayzn ayznVar, long j, int i) {
        this.a = ayznVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        ayzn ayznVar = this.a;
        if (this.b != ayznVar.l || !azom.e(ayznVar.g, th)) {
            azqc.d(th);
            return;
        }
        boolean z = ayznVar.e;
        ayznVar.i.si();
        ayznVar.f = true;
        this.e = true;
        ayznVar.g();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        ayzn ayznVar = this.a;
        if (this.b == ayznVar.l) {
            if (this.f != 0 || this.d.k(obj)) {
                ayznVar.g();
            } else {
                b(new aypp("Queue full?!"));
            }
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this, bamfVar)) {
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.f = 1;
                    this.d = ayrkVar;
                    this.e = true;
                    this.a.g();
                    return;
                } else if (sk == 2) {
                    this.f = 2;
                    this.d = ayrkVar;
                    bamfVar.sp(this.c);
                    return;
                }
            }
            this.d = new azmk(this.c);
            bamfVar.sp(this.c);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        ayzn ayznVar = this.a;
        if (this.b == ayznVar.l) {
            this.e = true;
            ayznVar.g();
        }
    }
}
