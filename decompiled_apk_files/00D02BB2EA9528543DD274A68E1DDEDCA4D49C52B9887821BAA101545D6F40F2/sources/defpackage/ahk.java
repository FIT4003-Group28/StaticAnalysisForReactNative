package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ahk  reason: default package */
/* loaded from: classes.dex */
public final class ahk<K, V> implements Map.Entry<K, V> {
    public final K a;
    public final V b;
    ahk<K, V> c;
    public ahk<K, V> d;

    public ahk(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahk)) {
            return false;
        }
        ahk ahkVar = (ahk) obj;
        return this.a.equals(ahkVar.a) && this.b.equals(ahkVar.b);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
