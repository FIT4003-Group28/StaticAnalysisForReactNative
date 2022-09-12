package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzio  reason: default package */
/* loaded from: classes6.dex */
final class dzio implements Map.Entry<Integer, Integer> {
    int a;
    final /* synthetic */ dzis b;

    public dzio(dzis dzisVar, int i) {
        this.b = dzisVar;
        this.a = i;
    }

    public final int a() {
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
        return this.b.b[this.a] == ((Integer) entry.getKey()).intValue() && this.b.c[this.a] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getKey() {
        return Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getValue() {
        return Integer.valueOf(this.b.c[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        dzis dzisVar = this.b;
        int[] iArr = dzisVar.b;
        int i = this.a;
        return dzisVar.c[i] ^ iArr[i];
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
