package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzkj  reason: default package */
/* loaded from: classes6.dex */
public final class dzkj implements Map.Entry {
    protected final long a;
    protected final double b;

    public dzkj(long j, double d) {
        this.a = j;
        this.b = d;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return entry.getKey() != null && (entry.getKey() instanceof Long) && entry.getValue() != null && (entry.getValue() instanceof Double) && this.a == ((Long) entry.getKey()).longValue() && this.b == ((Double) entry.getValue()).doubleValue();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.a);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Double.valueOf(this.b);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return dzgv.d(this.a) ^ dzgv.c(this.b);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        Double d = (Double) obj;
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a + "->" + this.b;
    }
}
