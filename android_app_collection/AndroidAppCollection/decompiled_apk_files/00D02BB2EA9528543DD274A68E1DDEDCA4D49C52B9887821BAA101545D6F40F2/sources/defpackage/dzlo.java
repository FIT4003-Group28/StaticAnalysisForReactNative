package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzlo  reason: default package */
/* loaded from: classes6.dex */
final class dzlo implements Map.Entry<Long, Integer> {
    int a;
    final /* synthetic */ dzls b;

    public dzlo(dzls dzlsVar, int i) {
        this.b = dzlsVar;
        this.a = i;
    }

    public final long a() {
        return this.b.b[this.a];
    }

    public final int b() {
        return this.b.c[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.b.b[this.a] == ((Long) entry.getKey()).longValue() && this.b.c[this.a] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Long getKey() {
        return Long.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getValue() {
        return Integer.valueOf(this.b.c[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return dzgv.d(this.b.b[this.a]) ^ this.b.c[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer setValue(Integer num) {
        int intValue = num.intValue();
        int[] iArr = this.b.c;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final String toString() {
        return this.b.b[this.a] + "=>" + this.b.c[this.a];
    }
}
