package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzjc  reason: default package */
/* loaded from: classes.dex */
final class dzjc implements Map.Entry, dzjh {
    int a;
    final /* synthetic */ dzjg b;

    public dzjc(dzjg dzjgVar) {
        this.b = dzjgVar;
    }

    public dzjc(dzjg dzjgVar, int i) {
        this.b = dzjgVar;
        this.a = i;
    }

    @Override // defpackage.dzjh
    public final int a() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.b.a[this.a] == ((Integer) entry.getKey()).intValue()) {
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
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getKey() {
        return Integer.valueOf(this.b.a[this.a]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        dzjg dzjgVar = this.b;
        int[] iArr = dzjgVar.a;
        int i = this.a;
        int i2 = iArr[i];
        Object obj = dzjgVar.b[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
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
