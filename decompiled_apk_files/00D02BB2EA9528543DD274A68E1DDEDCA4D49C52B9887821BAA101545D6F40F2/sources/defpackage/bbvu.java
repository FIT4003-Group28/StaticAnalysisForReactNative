package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bbvu  reason: default package */
/* loaded from: classes3.dex */
public final class bbvu implements Comparable<bbvu> {
    private final int a;
    private final int b;

    public bbvu(int i, int i2) {
        int min;
        boolean z = true;
        dbsk.a(i > 0);
        dbsk.a(i2 <= 0 ? false : z);
        debb.d("a", i);
        debb.d("b", i2);
        if (i == 0) {
            min = i2;
        } else if (i2 == 0) {
            min = i;
        } else {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            int i3 = i >> numberOfTrailingZeros;
            int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
            int i4 = i2 >> numberOfTrailingZeros2;
            while (i3 != i4) {
                int i5 = i3 - i4;
                int i6 = (i5 >> 31) & i5;
                int i7 = (i5 - i6) - i6;
                i4 += i6;
                i3 = i7 >> Integer.numberOfTrailingZeros(i7);
            }
            min = i3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
        }
        this.a = i / min;
        this.b = i2 / min;
    }

    public final float a() {
        return this.a / this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(bbvu bbvuVar) {
        if (equals(bbvuVar)) {
            return 0;
        }
        return (this.a * bbvuVar.b) - (bbvuVar.a * this.b);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bbvu)) {
            return false;
        }
        bbvu bbvuVar = (bbvu) obj;
        return this.a == bbvuVar.a && this.b == bbvuVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{bbvu.class, Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("/");
        sb.append(i2);
        return sb.toString();
    }
}
