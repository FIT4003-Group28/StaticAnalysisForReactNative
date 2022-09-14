package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzop  reason: default package */
/* loaded from: classes6.dex */
final class dzop implements Map.Entry {
    int a;
    final /* synthetic */ dzot b;

    public dzop(dzot dzotVar, int i) {
        this.b = dzotVar;
        this.a = i;
    }

    public final boolean a() {
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
            if (this.b.b[this.a] == ((Boolean) entry.getValue()).booleanValue()) {
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
        return Boolean.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b.a[this.a];
        return (obj == null ? 0 : obj.hashCode()) ^ (true != this.b.b[this.a] ? 1237 : 1231);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean[] zArr = this.b.b;
        int i = this.a;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final String toString() {
        return this.b.a[this.a] + "=>" + this.b.b[this.a];
    }
}
