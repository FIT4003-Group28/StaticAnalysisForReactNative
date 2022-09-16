package defpackage;
/* compiled from: PG */
/* renamed from: ayze  reason: default package */
/* loaded from: classes2.dex */
final class ayze implements ayoa, bamf {
    final bame a;
    long b = 1;
    bamf c;

    public ayze(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.c(obj);
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            long j = this.b;
            this.c = bamfVar;
            this.a.f(this);
            bamfVar.sp(j);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.c.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.c.sp(j);
    }
}
