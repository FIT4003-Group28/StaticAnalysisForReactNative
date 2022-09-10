package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcao  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcao<K, V> extends dcdi<K, V> {
    private final int a;

    public dcao(int i) {
        this.a = i;
    }

    public abstract dcdn<K, Integer> a();

    public abstract V b(int i);

    @Override // defpackage.dcdi, defpackage.dcdn
    public final dcep<K> d() {
        return this.a == a().size() ? a().keySet() : super.d();
    }

    @Override // defpackage.dcdi
    public final dcpd<Map.Entry<K, V>> e() {
        return new dcan(this);
    }

    @Override // defpackage.dcdn, java.util.Map
    public final V get(Object obj) {
        Integer num = a().get(obj);
        if (num == null) {
            return null;
        }
        return b(num.intValue());
    }

    @Override // java.util.Map
    public final int size() {
        return this.a;
    }
}
