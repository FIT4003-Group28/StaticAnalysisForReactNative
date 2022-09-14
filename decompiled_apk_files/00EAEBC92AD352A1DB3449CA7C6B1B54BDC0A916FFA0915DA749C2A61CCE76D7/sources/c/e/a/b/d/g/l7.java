package c.e.a.b.d.g;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes.dex */
public final class l7 implements Comparable<l7>, Map.Entry<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final Comparable f4283b;

    /* renamed from: c  reason: collision with root package name */
    private V f4284c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ c7 f4285d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public l7(c7 c7Var, K k, V v) {
        this.f4285d = c7Var;
        this.f4283b = k;
        this.f4284c = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(c7 c7Var, Map.Entry<K, V> entry) {
        this(c7Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(l7 l7Var) {
        return ((Comparable) getKey()).compareTo((Comparable) l7Var.getKey());
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
        return a(this.f4283b, entry.getKey()) && a(this.f4284c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f4283b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f4284c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4283b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f4284c;
        if (v != 0) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f4285d.f();
        V v2 = this.f4284c;
        this.f4284c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4283b);
        String valueOf2 = String.valueOf(this.f4284c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
