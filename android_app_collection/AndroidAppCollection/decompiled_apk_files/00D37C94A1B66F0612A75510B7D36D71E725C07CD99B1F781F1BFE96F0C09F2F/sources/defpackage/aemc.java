package defpackage;
/* compiled from: PG */
/* renamed from: aemc  reason: default package */
/* loaded from: classes.dex */
final class aemc implements aemu {
    zer a;
    final long b;
    private boolean c;

    aemc() {
        this(0L);
    }

    @Override // defpackage.aemu
    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        if (j > 2147483647L) {
            afus.b(2, 8, "position_greater_than_int_max_value");
            return 0;
        } else if (j > ((aemb) this.a.get()).size()) {
            afus.b(2, 8, "position_greater_than_size");
            return 0;
        } else {
            int min = Math.min((int) (((aemb) this.a.get()).size() - j), i);
            ((aemb) this.a.get()).a((int) j, min, bArr, i2);
            return min;
        }
    }

    @Override // defpackage.aemu
    public final long b() {
        return this.b;
    }

    @Override // defpackage.aemu
    public final synchronized void c() {
        this.c = true;
    }

    @Override // defpackage.aemu
    public final synchronized void d(byte[] bArr, int i, int i2, aens aensVar) {
        ((aemb) this.a.get()).write(bArr, i, i2);
    }

    @Override // defpackage.aemu
    public final synchronized boolean e(long j) {
        return ((long) ((aemb) this.a.get()).size()) > j;
    }

    @Override // defpackage.aemu
    public final synchronized boolean f() {
        return this.c;
    }

    public aemc(long j) {
        this.a = new aema();
        this.c = false;
        this.b = j;
    }
}
