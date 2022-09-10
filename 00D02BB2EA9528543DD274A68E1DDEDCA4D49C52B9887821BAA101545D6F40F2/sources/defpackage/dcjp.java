package defpackage;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcjp  reason: default package */
/* loaded from: classes5.dex */
public final class dcjp<K, V> extends dcjg<K, V> {
    final dbsl<? super K> c;

    public dcjp(Map<K, V> map, dbsl<? super K> dbslVar, dbsl<? super Map.Entry<K, V>> dbslVar2) {
        super(map, dbslVar2);
        this.c = dbslVar;
    }

    @Override // defpackage.dcjy
    public final Set<Map.Entry<K, V>> a() {
        return dcnm.q(this.a.entrySet(), this.b);
    }

    @Override // defpackage.dcjg, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj) && this.c.a(obj);
    }

    @Override // defpackage.dcjy
    public final Set<K> j() {
        return dcnm.q(this.a.keySet(), this.c);
    }
}
