package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdq  reason: default package */
/* loaded from: classes2.dex */
public final class azdq extends AtomicReference implements ayom {
    private static final long serialVersionUID = -1185974347409665484L;
    final azdp a;
    final int b;
    final ayom c;
    boolean d;

    public azdq(azdp azdpVar, int i, ayom ayomVar) {
        this.a = azdpVar;
        this.b = i;
        this.c = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.d) {
            this.c.b(th);
        } else if (this.a.a(this.b)) {
            this.d = true;
            this.c.b(th);
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            this.c.c(obj);
        } else if (this.a.a(this.b)) {
            this.d = true;
            this.c.c(obj);
        } else {
            ((aypg) get()).qr();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d) {
            this.c.sm();
        } else if (!this.a.a(this.b)) {
        } else {
            this.d = true;
            this.c.sm();
        }
    }
}
