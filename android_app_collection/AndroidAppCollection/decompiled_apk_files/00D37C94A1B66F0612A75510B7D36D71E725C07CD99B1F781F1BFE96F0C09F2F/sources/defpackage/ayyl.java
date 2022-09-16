package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ayyl  reason: default package */
/* loaded from: classes2.dex */
final class ayyl extends AtomicBoolean implements ayoa, bamf {
    private static final long serialVersionUID = -7419642935409022375L;
    final bame a;
    final ayym b;
    final ayyk c;
    bamf d;

    public ayyl(bame bameVar, ayym ayymVar, ayyk ayykVar) {
        this.a = bameVar;
        this.b = ayymVar;
        this.c = ayykVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.d, bamfVar)) {
            this.d = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.d.si();
        if (compareAndSet(false, true)) {
            ayym ayymVar = this.b;
            ayyk ayykVar = this.c;
            synchronized (ayymVar) {
                ayyk ayykVar2 = ayymVar.c;
                if (ayykVar2 != null && ayykVar2 == ayykVar) {
                    long j = ayykVar.c - 1;
                    ayykVar.c = j;
                    if (j == 0 && ayykVar.d) {
                        ayymVar.c(ayykVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.d.sp(j);
    }
}
