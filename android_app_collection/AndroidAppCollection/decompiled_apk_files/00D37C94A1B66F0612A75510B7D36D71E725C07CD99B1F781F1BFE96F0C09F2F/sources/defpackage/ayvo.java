package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: ayvo  reason: default package */
/* loaded from: classes2.dex */
final class ayvo extends azob implements ayoa {
    private static final long serialVersionUID = 4066607327284737757L;
    final Object a;
    final boolean b;
    bamf c;
    long d;
    boolean e;

    public ayvo(bame bameVar, Object obj, boolean z) {
        super(bameVar);
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.f.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.si();
        g(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.f.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.azob, defpackage.bamf
    public final void si() {
        super.si();
        this.c.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.e) {
            this.e = true;
            Object obj = this.a;
            if (obj != null) {
                g(obj);
            } else if (this.b) {
                this.f.b(new NoSuchElementException());
            } else {
                this.f.sm();
            }
        }
    }
}
