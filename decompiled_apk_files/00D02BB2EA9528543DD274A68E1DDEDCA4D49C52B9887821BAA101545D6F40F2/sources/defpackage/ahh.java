package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ahh  reason: default package */
/* loaded from: classes.dex */
public final class ahh<K, V> extends aho<K, V> {
    public final HashMap<K, ahk<K, V>> a = new HashMap<>();

    @Override // defpackage.aho
    public final ahk<K, V> a(K k) {
        return this.a.get(k);
    }

    @Override // defpackage.aho
    public final V b(K k) {
        V v = (V) super.b(k);
        this.a.remove(k);
        return v;
    }

    public final boolean c(K k) {
        return this.a.containsKey(k);
    }
}
