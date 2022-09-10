package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdi  reason: default package */
/* loaded from: classes.dex */
abstract class dcdi<K, V> extends dcdn<K, V> {
    @Override // defpackage.dcdn
    public final dcep<Map.Entry<K, V>> SM() {
        return new dcdh(this);
    }

    @Override // defpackage.dcdn
    public dcep<K> d() {
        return new dcds(this);
    }

    public abstract dcpd<Map.Entry<K, V>> e();

    @Override // defpackage.dcdn
    public final dccr<V> g() {
        return new dcdw(this);
    }
}
