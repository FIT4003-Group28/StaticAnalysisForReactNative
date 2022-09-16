package defpackage;
/* compiled from: PG */
/* renamed from: azfj  reason: default package */
/* loaded from: classes2.dex */
final class azfj extends ayro {
    final ayqf f;

    public azfj(ayom ayomVar, ayqf ayqfVar) {
        super(ayomVar);
        this.f = ayqfVar;
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.e == 0) {
            try {
                if (!this.f.a(obj)) {
                    return;
                }
                this.a.c(obj);
                return;
            } catch (Throwable th) {
                g(th);
                return;
            }
        }
        this.a.c(null);
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return f(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl;
        do {
            sl = this.c.sl();
            if (sl == null) {
                break;
            }
        } while (!this.f.a(sl));
        return sl;
    }
}
