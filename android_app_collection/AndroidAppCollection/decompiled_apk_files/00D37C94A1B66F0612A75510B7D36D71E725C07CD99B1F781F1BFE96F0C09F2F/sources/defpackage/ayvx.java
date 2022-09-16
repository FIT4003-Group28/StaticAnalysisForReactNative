package defpackage;
/* compiled from: PG */
/* renamed from: ayvx  reason: default package */
/* loaded from: classes2.dex */
final class ayvx extends aznu implements ayre {
    final ayqf a;

    public ayvx(bame bameVar, ayqf ayqfVar) {
        super(bameVar);
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
            this.d.c(null);
            return true;
        }
        try {
            boolean a = this.a.a(obj);
            if (a) {
                this.d.c(obj);
            }
            return a;
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
