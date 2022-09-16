package defpackage;
/* compiled from: PG */
/* renamed from: absx  reason: default package */
/* loaded from: classes.dex */
public final class absx extends abrl {
    private boolean c = false;

    @Override // defpackage.abrl, defpackage.absb
    public final synchronized void b() {
        super.b();
        this.c = false;
    }

    @Override // defpackage.abrl, defpackage.absu
    public final synchronized boolean e(boolean z, absw abswVar, abry abryVar) {
        if (!this.c) {
            return false;
        }
        return super.e(z, abswVar, abryVar);
    }

    public final synchronized void f(int i, int i2, abrk abrkVar) {
        this.a.b(i, i2);
        d(abrkVar);
        this.c = true;
    }
}
