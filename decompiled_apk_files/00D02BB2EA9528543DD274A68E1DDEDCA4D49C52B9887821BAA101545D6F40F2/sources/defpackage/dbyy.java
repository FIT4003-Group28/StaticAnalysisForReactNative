package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbyy  reason: default package */
/* loaded from: classes.dex */
public interface dbyy<K, V> extends Map<K, V> {
    dbyy<V, K> i();

    Set<V> j();

    @Override // defpackage.dbyy
    V put(K k, V v);
}
