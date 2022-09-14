package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: decs  reason: default package */
/* loaded from: classes6.dex */
public final class decs extends Number implements Comparable<decs>, Serializable {
    public final long a;

    static {
        new decs(0L);
        new decs(1L);
        new decs(-1L);
    }

    private decs(long j) {
        this.a = j;
    }

    public static decs a(long j) {
        return new decs(j);
    }

    public static decs b(String str) {
        return c(str, 10);
    }

    public static decs c(String str, int i) {
        return a(decu.e(str, i));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(decs decsVar) {
        decs decsVar2 = decsVar;
        dbsk.s(decsVar2);
        return decu.b(this.a, decsVar2.a);
    }

    public final BigInteger d() {
        BigInteger valueOf = BigInteger.valueOf(this.a & Long.MAX_VALUE);
        return this.a < 0 ? valueOf.setBit(63) : valueOf;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.a;
        double d = Long.MAX_VALUE & j;
        if (j < 0) {
            Double.isNaN(d);
            return d + 9.223372036854776E18d;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof decs) && this.a == ((decs) obj).a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.a;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public final int hashCode() {
        return decn.a(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        return decu.f(this.a);
    }
}
