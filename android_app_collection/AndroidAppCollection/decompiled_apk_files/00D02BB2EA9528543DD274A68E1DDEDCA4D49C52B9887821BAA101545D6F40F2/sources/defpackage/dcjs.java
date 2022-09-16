package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcjs  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcjs<K, V> extends AbstractMap<K, V> {
    public abstract Iterator<Map.Entry<K, V>> a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        dcgh.r(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new dcjr(this);
    }
}
