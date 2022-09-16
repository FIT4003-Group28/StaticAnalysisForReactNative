package defpackage;
/* compiled from: PG */
/* renamed from: bcr  reason: default package */
/* loaded from: classes2.dex */
abstract class bcr {
    public bab c;
    public azh d;
    public bcn e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long l;
    public boolean m;
    public boolean n;
    public final bcl b = new bcl();
    public bcp k = new bcp();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long a(pwu pwuVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        int i;
        if (z) {
            this.k = new bcp();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(pwu pwuVar, long j, bcp bcpVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d(long j) {
        return (j * 1000000) / this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long e(long j) {
        return (this.j * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(long j) {
        this.h = j;
    }
}
