package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: datp  reason: default package */
/* loaded from: classes5.dex */
final class datp implements Map.Entry {
    final /* synthetic */ dats a;
    private final int b;

    public datp(dats datsVar, int i) {
        this.a = datsVar;
        this.b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return dbsd.a(getKey(), entry.getKey()) && dbsd.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        dats datsVar = this.a;
        int i = this.b;
        if (i < 0 || i >= datsVar.a) {
            return null;
        }
        return datsVar.b[i + i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.b(this.b);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return this.a.c(this.b, obj);
    }
}
