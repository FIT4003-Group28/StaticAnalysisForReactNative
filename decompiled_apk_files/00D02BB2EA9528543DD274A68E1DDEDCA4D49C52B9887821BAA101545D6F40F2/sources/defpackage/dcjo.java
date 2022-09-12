package defpackage;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcjo  reason: default package */
/* loaded from: classes5.dex */
public final class dcjo<K, V> extends dcjg<K, V> {
    final Set<Map.Entry<K, V>> c;

    public dcjo(Map<K, V> map, dbsl<? super Map.Entry<K, V>> dbslVar) {
        super(map, dbslVar);
        this.c = dcnm.q(map.entrySet(), this.b);
    }

    @Override // defpackage.dcjy
    public final Set<Map.Entry<K, V>> a() {
        return new dcjm(this);
    }

    @Override // defpackage.dcjy
    public final Set<K> j() {
        return new dcjn(this);
    }
}
