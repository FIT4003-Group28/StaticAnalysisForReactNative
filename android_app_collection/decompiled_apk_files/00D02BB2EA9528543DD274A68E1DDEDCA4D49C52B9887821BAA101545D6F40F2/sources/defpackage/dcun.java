package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dcun  reason: default package */
/* loaded from: classes5.dex */
final class dcun implements Comparable<dcun> {
    final BigDecimal a;
    final BigDecimal b;
    final BigDecimal c;

    public dcun(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dcun dcunVar) {
        dcun dcunVar2 = dcunVar;
        int compareTo = this.a.compareTo(dcunVar2.a);
        return (compareTo == 0 && (compareTo = this.b.compareTo(dcunVar2.b)) == 0) ? this.c.compareTo(dcunVar2.c) : compareTo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcun)) {
            return false;
        }
        dcun dcunVar = (dcun) obj;
        return this.a.equals(dcunVar.a) && this.b.equals(dcunVar.b) && this.c.equals(dcunVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
