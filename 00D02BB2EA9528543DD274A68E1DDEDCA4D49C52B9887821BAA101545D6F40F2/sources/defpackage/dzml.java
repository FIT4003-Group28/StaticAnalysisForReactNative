package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzml  reason: default package */
/* loaded from: classes6.dex */
final class dzml implements Map.Entry, dzme {
    int a;
    final /* synthetic */ dzmp b;

    public dzml(dzmp dzmpVar, int i) {
        this.b = dzmpVar;
        this.a = i;
    }

    @Override // defpackage.dzme
    public final long a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    /* renamed from: b */
    public final Long getKey() {
        return Long.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.b.a[this.a] == ((Long) entry.getKey()).longValue()) {
            Object obj2 = this.b.b[this.a];
            if (obj2 == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int d = dzgv.d(this.b.a[this.a]);
        Object obj = this.b.b[this.a];
        return d ^ (obj == null ? 0 : obj.hashCode());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.b.b;
        int i = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        return this.b.a[this.a] + "=>" + this.b.b[this.a];
    }
}
