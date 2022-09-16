package defpackage;
/* compiled from: PG */
/* renamed from: aywp  reason: default package */
/* loaded from: classes2.dex */
abstract class aywp extends azoa {
    private static final long serialVersionUID = -2252972430506210021L;
    final Object[] b;
    int c;
    volatile boolean d;

    public aywp(Object[] objArr) {
        this.b = objArr;
    }

    public abstract void b();

    @Override // defpackage.ayrn
    public final void d() {
        this.c = this.b.length;
    }

    public abstract void f(long j);

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.c == this.b.length;
    }

    @Override // defpackage.bamf
    public final void si() {
        this.d = true;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 1;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        ayrd.b(obj, "array element is null");
        return obj;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (!azof.h(j) || ayno.a(this, j) != 0) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            b();
        } else {
            f(j);
        }
    }
}
