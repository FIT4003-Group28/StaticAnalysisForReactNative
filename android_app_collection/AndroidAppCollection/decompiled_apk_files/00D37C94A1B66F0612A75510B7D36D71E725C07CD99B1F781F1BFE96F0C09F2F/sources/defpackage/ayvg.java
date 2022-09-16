package defpackage;
/* compiled from: PG */
/* renamed from: ayvg  reason: default package */
/* loaded from: classes2.dex */
final class ayvg extends aznt {
    final ayqe a;
    Object b;
    boolean c;

    public ayvg(ayre ayreVar, ayqe ayqeVar) {
        super(ayreVar);
        this.a = ayqeVar;
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!e(obj)) {
            this.e.sp(1L);
        }
    }

    @Override // defpackage.ayre
    public final boolean e(Object obj) {
        if (this.g) {
            return false;
        }
        if (this.h != 0) {
            return this.d.e(obj);
        }
        try {
            Object a = this.a.a(obj);
            if (this.c) {
                boolean a2 = ayrd.a(this.b, a);
                this.b = a;
                if (a2) {
                    return false;
                }
            } else {
                this.c = true;
                this.b = a;
            }
            this.d.c(obj);
            return true;
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
        while (true) {
            Object sl = this.f.sl();
            if (sl == null) {
                return null;
            }
            Object a = this.a.a(sl);
            if (!this.c) {
                this.c = true;
                this.b = a;
                return sl;
            }
            boolean a2 = ayrd.a(this.b, a);
            this.b = a;
            if (!a2) {
                return sl;
            }
            if (this.h != 1) {
                this.e.sp(1L);
            }
        }
    }
}
