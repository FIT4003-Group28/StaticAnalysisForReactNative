package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dbwt  reason: default package */
/* loaded from: classes5.dex */
final class dbwt implements Map.Entry {
    final Object a;
    Object b;
    final /* synthetic */ dbwu c;

    public dbwt(dbwu dbwuVar, Object obj, Object obj2) {
        this.c = dbwuVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object put = this.c.put(this.a, obj);
        this.b = obj;
        return put;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
