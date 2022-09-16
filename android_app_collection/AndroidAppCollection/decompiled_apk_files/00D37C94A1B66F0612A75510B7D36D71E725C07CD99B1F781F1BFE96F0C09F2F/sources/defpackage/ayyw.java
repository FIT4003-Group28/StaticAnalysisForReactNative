package defpackage;
/* compiled from: PG */
/* renamed from: ayyw  reason: default package */
/* loaded from: classes2.dex */
final class ayyw implements ayoa, bamf {
    final bame a;
    final aypx b;
    bamf c;
    Object d;
    boolean e;

    public ayyw(bame bameVar, aypx aypxVar) {
        this.a = bameVar;
        this.b = aypxVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        bame bameVar = this.a;
        Object obj2 = this.d;
        if (obj2 == null) {
            this.d = obj;
            bameVar.c(obj);
            return;
        }
        try {
            Object a = this.b.a(obj2, obj);
            ayrd.b(a, "The value returned by the accumulator is null");
            this.d = a;
            bameVar.c(a);
        } catch (Throwable th) {
            bapv.j(th);
            this.c.si();
            b(th);
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.c.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.c.sp(j);
    }
}
