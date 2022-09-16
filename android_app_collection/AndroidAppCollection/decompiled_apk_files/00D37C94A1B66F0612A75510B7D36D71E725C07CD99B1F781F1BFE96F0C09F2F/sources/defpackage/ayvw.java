package defpackage;
/* compiled from: PG */
/* renamed from: ayvw  reason: default package */
/* loaded from: classes2.dex */
final class ayvw extends aznt {
    final ayqf a;

    public ayvw(ayre ayreVar, ayqf ayqfVar) {
        super(ayreVar);
        this.a = ayqfVar;
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
            return this.d.e(null);
        }
        try {
            return this.a.a(obj) && this.d.e(obj);
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
        ayrk ayrkVar = this.f;
        ayqf ayqfVar = this.a;
        while (true) {
            Object sl = ayrkVar.sl();
            if (sl == null) {
                return null;
            }
            if (ayqfVar.a(sl)) {
                return sl;
            }
            if (this.h == 2) {
                ayrkVar.sp(1L);
            }
        }
    }
}
