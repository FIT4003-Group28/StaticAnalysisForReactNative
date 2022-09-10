package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcjw  reason: default package */
/* loaded from: classes5.dex */
final class dcjw<K, V> extends dcjv<K, V> implements Set<Map.Entry<K, V>> {
    public dcjw(Set<Map.Entry<K, V>> set) {
        super(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return dcnm.s(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return dcnm.r(this);
    }
}
