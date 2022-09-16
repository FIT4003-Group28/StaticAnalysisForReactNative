package defpackage;
/* compiled from: PG */
/* renamed from: amqq  reason: default package */
/* loaded from: classes2.dex */
public final class amqq {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    protected final long g;
    public long h;
    public int i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    public amqq(long j, int i) {
        this.g = j;
        i = i == 0 ? 30 : i;
        this.a = i;
        this.b = Math.round(1000.0f / i);
        this.c = Math.round(1000.0f / (i / 2));
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return (int) (this.h - this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return Math.min(Math.round((this.d * 1000.0f) / a()), this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return (b() * 100) / this.a;
    }

    public final int d() {
        if (this.m || this.n) {
            return 4;
        }
        if (this.l) {
            return 3;
        }
        return this.k ? 2 : 1;
    }
}
