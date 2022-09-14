package defpackage;
/* compiled from: PG */
/* renamed from: csoq  reason: default package */
/* loaded from: classes5.dex */
final class csoq<K, V> extends csor<K, V> {
    private final K a;
    private final V b;

    public csoq(K k, V v) {
        if (k != null) {
            this.a = k;
            if (v != null) {
                this.b = v;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.csor
    public final K a() {
        return this.a;
    }

    @Override // defpackage.csor
    public final V b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csor) {
            csor csorVar = (csor) obj;
            if (this.a.equals(csorVar.a()) && this.b.equals(csorVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
        sb.append("KeyValue{key=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
