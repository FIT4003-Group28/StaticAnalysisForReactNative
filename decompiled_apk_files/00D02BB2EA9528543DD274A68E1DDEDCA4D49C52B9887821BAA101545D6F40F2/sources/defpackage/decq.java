package defpackage;
/* compiled from: PG */
/* renamed from: decq  reason: default package */
/* loaded from: classes6.dex */
public final class decq extends Number implements Comparable<decq> {
    public static final decq a = a(0);
    public final int b;

    static {
        a(1);
        a(-1);
    }

    private decq(int i) {
        this.b = i;
    }

    public static decq a(int i) {
        return new decq(i);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(decq decqVar) {
        decq decqVar2 = decqVar;
        dbsk.s(decqVar2);
        return decr.b(this.b, decqVar2.b);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof decq) && this.b == ((decq) obj).b;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) longValue();
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.b;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.b & 4294967295L;
    }

    public final String toString() {
        return Long.toString(this.b & 4294967295L, 10);
    }
}
