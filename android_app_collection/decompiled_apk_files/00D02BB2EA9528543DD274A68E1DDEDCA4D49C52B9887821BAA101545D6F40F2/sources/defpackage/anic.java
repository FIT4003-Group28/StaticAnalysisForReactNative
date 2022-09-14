package defpackage;
/* compiled from: PG */
/* renamed from: anic  reason: default package */
/* loaded from: classes2.dex */
final class anic<K, V> extends anik<K, V> {
    public final K a;
    public final V b;

    public anic(K k, V v) {
        if (k != null) {
            this.a = k;
            if (v != null) {
                this.b = v;
                return;
            }
            throw new NullPointerException("Null item");
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.anik
    public final K a() {
        return this.a;
    }

    @Override // defpackage.anik
    public final V b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anik) {
            anik anikVar = (anik) obj;
            if (this.a.equals(anikVar.a()) && this.b.equals(anikVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(valueOf2).length());
        sb.append("KeyItemPair{key=");
        sb.append(valueOf);
        sb.append(", item=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
