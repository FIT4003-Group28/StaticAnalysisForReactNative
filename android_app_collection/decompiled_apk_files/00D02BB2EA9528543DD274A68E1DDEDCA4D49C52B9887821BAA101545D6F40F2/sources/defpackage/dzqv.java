package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzqv  reason: default package */
/* loaded from: classes6.dex */
final class dzqv implements Map.Entry, dzqo {
    int a;
    final /* synthetic */ dzqz b;

    public dzqv(dzqz dzqzVar, int i) {
        this.b = dzqzVar;
        this.a = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.b.b[this.a];
        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
            Object obj3 = this.b.c[this.a];
            if (obj3 == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (obj3.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.c[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b.b[this.a];
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b.c[this.a];
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.b.c;
        int i = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        return this.b.b[this.a] + "=>" + this.b.c[this.a];
    }
}
