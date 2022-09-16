package defpackage;
/* compiled from: PG */
/* renamed from: azgx  reason: default package */
/* loaded from: classes2.dex */
final class azgx extends ayro {
    final ayqe f;

    public azgx(ayom ayomVar, ayqe ayqeVar) {
        super(ayomVar);
        this.f = ayqeVar;
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e != 0) {
            this.a.c(null);
            return;
        }
        try {
            Object a = this.f.a(obj);
            ayrd.b(a, "The mapper function returned a null value.");
            this.a.c(a);
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return f(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.c.sl();
        if (sl != null) {
            Object a = this.f.a(sl);
            ayrd.b(a, "The mapper function returned a null value.");
            return a;
        }
        return null;
    }
}
