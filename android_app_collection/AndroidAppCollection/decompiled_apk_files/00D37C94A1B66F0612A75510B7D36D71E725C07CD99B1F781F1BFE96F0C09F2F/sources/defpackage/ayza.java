package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: ayza  reason: default package */
/* loaded from: classes2.dex */
final class ayza extends azob implements ayoa {
    private static final long serialVersionUID = -5526049321428043809L;
    final boolean a;
    bamf b;
    boolean c;

    public ayza(bame bameVar) {
        super(bameVar);
        this.a = true;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.c) {
            azqc.d(th);
            return;
        }
        this.c = true;
        this.f.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        if (this.g == null) {
            this.g = obj;
            return;
        }
        this.c = true;
        this.b.si();
        this.f.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.f.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.azob, defpackage.bamf
    public final void si() {
        super.si();
        this.b.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.c) {
            return;
        }
        this.c = true;
        Object obj = this.g;
        this.g = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            g(obj);
        } else if (this.a) {
            this.f.b(new NoSuchElementException());
        } else {
            this.f.sm();
        }
    }
}
