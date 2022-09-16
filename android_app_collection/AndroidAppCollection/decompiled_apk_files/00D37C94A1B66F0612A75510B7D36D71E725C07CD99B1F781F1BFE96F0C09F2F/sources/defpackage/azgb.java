package defpackage;
/* compiled from: PG */
/* renamed from: azgb  reason: default package */
/* loaded from: classes2.dex */
final class azgb extends ayrq {
    final ayom a;
    final Object[] b;
    int c;
    boolean d;
    volatile boolean e;

    public azgb(ayom ayomVar, Object[] objArr) {
        this.a = ayomVar;
        this.b = objArr;
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.c = this.b.length;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.c == this.b.length;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.e = true;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 1) != 0) {
            this.d = true;
            return 1;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i != objArr.length) {
            this.c = i + 1;
            Object obj = objArr[i];
            ayrd.b(obj, "The array element is null");
            return obj;
        }
        return null;
    }
}
