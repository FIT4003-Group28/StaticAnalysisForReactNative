package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: azes  reason: default package */
/* loaded from: classes2.dex */
final class azes extends ayro {
    final Collection f;
    final ayqe g;

    public azes(ayom ayomVar, ayqe ayqeVar, Collection collection) {
        super(ayomVar);
        this.g = ayqeVar;
        this.f = collection;
    }

    @Override // defpackage.ayro, defpackage.ayom
    public final void b(Throwable th) {
        if (this.d) {
            azqc.d(th);
            return;
        }
        this.d = true;
        this.f.clear();
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e == 0) {
            try {
                Object a = this.g.a(obj);
                ayrd.b(a, "The keySelector returned a null key");
                if (!this.f.add(a)) {
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

    @Override // defpackage.ayro, defpackage.ayrn
    public final void d() {
        this.f.clear();
        super.d();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return f(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl;
        Collection collection;
        Object a;
        do {
            sl = this.c.sl();
            if (sl == null) {
                break;
            }
            collection = this.f;
            a = this.g.a(sl);
            ayrd.b(a, "The keySelector returned a null key");
        } while (!collection.add(a));
        return sl;
    }

    @Override // defpackage.ayro, defpackage.ayom
    public final void sm() {
        if (!this.d) {
            this.d = true;
            this.f.clear();
            this.a.sm();
        }
    }
}
