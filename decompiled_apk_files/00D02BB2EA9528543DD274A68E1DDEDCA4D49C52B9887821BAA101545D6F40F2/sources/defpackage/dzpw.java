package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzpw  reason: default package */
/* loaded from: classes6.dex */
final class dzpw implements Map.Entry {
    int a;
    final /* synthetic */ dzqa b;

    public dzpw(dzqa dzqaVar, int i) {
        this.b = dzqaVar;
        this.a = i;
    }

    public final long a() {
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
            if (this.b.b[this.a] == ((Long) entry.getValue()).longValue()) {
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
        return Long.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b.a[this.a];
        return (obj == null ? 0 : obj.hashCode()) ^ dzgv.d(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        long longValue = ((Long) obj).longValue();
        long[] jArr = this.b.b;
        int i = this.a;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final String toString() {
        return this.b.a[this.a] + "=>" + this.b.b[this.a];
    }
}
