package defpackage;
/* compiled from: PG */
/* renamed from: azeu  reason: default package */
/* loaded from: classes2.dex */
final class azeu extends ayro {
    final aypy f;
    Object g;
    boolean h;

    public azeu(ayom ayomVar, aypy aypyVar) {
        super(ayomVar);
        this.f = aypyVar;
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e == 0) {
            try {
                if (this.h) {
                    boolean a = this.f.a(this.g, obj);
                    this.g = obj;
                    if (a) {
                        return;
                    }
                } else {
                    this.h = true;
                    this.g = obj;
                }
                this.a.c(obj);
                return;
            } catch (Throwable th) {
                g(th);
                return;
            }
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return f(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl;
        boolean a;
        do {
            sl = this.c.sl();
            if (sl == null) {
                return null;
            }
            if (!this.h) {
                this.h = true;
                this.g = sl;
                return sl;
            }
            a = this.f.a(this.g, sl);
            this.g = sl;
        } while (a);
        return sl;
    }
}
