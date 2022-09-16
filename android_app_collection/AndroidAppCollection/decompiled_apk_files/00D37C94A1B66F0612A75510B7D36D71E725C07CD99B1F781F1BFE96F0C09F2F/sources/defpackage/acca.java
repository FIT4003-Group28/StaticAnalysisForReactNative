package defpackage;
/* compiled from: PG */
/* renamed from: acca  reason: default package */
/* loaded from: classes.dex */
public final class acca {
    public double a;
    private final double b;
    private long c;
    private long d;
    private int e;

    public acca() {
        this(10);
    }

    public final long a() {
        return (this.d - this.c) / 1000;
    }

    public final void b(double d) {
        this.d = System.nanoTime();
        int i = this.e;
        if (i == 0) {
            this.a = d;
        } else {
            double d2 = this.a;
            this.a = d2 + ((d - d2) / this.b);
        }
        this.e = i + 1;
    }

    public final void c() {
        this.a = 0.0d;
        this.e = 0;
        long nanoTime = System.nanoTime();
        this.c = nanoTime;
        this.d = nanoTime;
    }

    public acca(int i) {
        aqxo.p(i > 0);
        this.b = i;
        c();
    }
}
