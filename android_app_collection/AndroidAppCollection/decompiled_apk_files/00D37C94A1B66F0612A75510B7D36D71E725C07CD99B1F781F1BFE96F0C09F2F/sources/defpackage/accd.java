package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: accd  reason: default package */
/* loaded from: classes.dex */
public final class accd {
    public int a;
    public double b;
    public int c;
    public final double[] d;

    public accd() {
        this(null);
    }

    public final double a() {
        int i = this.a;
        if (i == 0) {
            return 0.0d;
        }
        double d = this.b;
        double d2 = i;
        Double.isNaN(d2);
        return d / d2;
    }

    public final void b() {
        Arrays.fill(this.d, 0.0d);
        this.a = 0;
        this.b = 0.0d;
        this.c = 0;
    }

    public accd(byte[] bArr) {
        aqxo.p(true);
        this.d = new double[10];
        b();
    }
}
