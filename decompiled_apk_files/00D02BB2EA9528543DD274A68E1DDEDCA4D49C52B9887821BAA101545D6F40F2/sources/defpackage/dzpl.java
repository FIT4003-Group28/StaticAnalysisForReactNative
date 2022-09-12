package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzpl  reason: default package */
/* loaded from: classes6.dex */
final class dzpl implements Map.Entry {
    int a;
    final /* synthetic */ dzpp b;

    public dzpl(dzpp dzppVar, int i) {
        this.b = dzppVar;
        this.a = i;
    }

    public final int a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.b.a[this.a];
        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
            if (this.b.b[this.a] == ((Integer) entry.getValue()).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b.a[this.a];
        return (obj == null ? 0 : obj.hashCode()) ^ this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        int intValue = ((Integer) obj).intValue();
        int[] iArr = this.b.b;
        int i = this.a;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final String toString() {
        return this.b.a[this.a] + "=>" + this.b.b[this.a];
    }
}
