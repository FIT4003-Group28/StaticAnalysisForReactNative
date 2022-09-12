package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzhw  reason: default package */
/* loaded from: classes6.dex */
public final class dzhw<V> implements dzjh<V> {
    protected final int a;
    protected final V b;

    public dzhw(int i, V v) {
        this.a = i;
        this.b = v;
    }

    @Override // defpackage.dzjh
    public final int a() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer) && this.a == ((Integer) entry.getKey()).intValue()) {
            V v = this.b;
            if (v == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (v.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer getKey() {
        return Integer.valueOf(this.a);
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.a;
        V v = this.b;
        return i ^ (v == null ? 0 : v.hashCode());
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a + "->" + this.b;
    }
}
