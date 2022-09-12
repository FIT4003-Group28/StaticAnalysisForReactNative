package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dsti  reason: default package */
/* loaded from: classes.dex */
final class dsti implements Map.Entry, Comparable<dsti> {
    public final Comparable a;
    public Object b;
    final /* synthetic */ dstl c;

    public dsti(dstl dstlVar, Comparable comparable, Object obj) {
        this.c = dstlVar;
        this.a = comparable;
        this.b = obj;
    }

    private static final boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dsti dstiVar) {
        return this.a.compareTo(dstiVar.a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.g();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
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
