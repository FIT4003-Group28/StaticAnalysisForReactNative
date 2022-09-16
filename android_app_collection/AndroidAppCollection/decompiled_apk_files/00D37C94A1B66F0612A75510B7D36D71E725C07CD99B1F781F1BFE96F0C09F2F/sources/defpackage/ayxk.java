package defpackage;
/* compiled from: PG */
/* renamed from: ayxk  reason: default package */
/* loaded from: classes2.dex */
final class ayxk extends aznt {
    final ayqe a;

    public ayxk(ayre ayreVar, ayqe ayqeVar) {
        super(ayreVar);
        this.a = ayqeVar;
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.h != 0) {
            this.d.c(null);
            return;
        }
        try {
            Object a = this.a.a(obj);
            ayrd.b(a, "The mapper function returned a null value.");
            this.d.c(a);
        } catch (Throwable th) {
            h(th);
        }
    }

    @Override // defpackage.ayre
    public final boolean e(Object obj) {
        if (this.g) {
            return false;
        }
        try {
            Object a = this.a.a(obj);
            ayrd.b(a, "The mapper function returned a null value.");
            return this.d.e(a);
        } catch (Throwable th) {
            h(th);
            return true;
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return g(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.f.sl();
        if (sl != null) {
            Object a = this.a.a(sl);
            ayrd.b(a, "The mapper function returned a null value.");
            return a;
        }
        return null;
    }
}
