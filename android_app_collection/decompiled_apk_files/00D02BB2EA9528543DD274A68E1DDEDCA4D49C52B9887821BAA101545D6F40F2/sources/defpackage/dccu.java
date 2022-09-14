package defpackage;

import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccu  reason: default package */
/* loaded from: classes.dex */
public final class dccu<K extends Enum<K>, V> extends dcdi<K, V> {
    private final transient EnumMap<K, V> a;

    public dccu(EnumMap<K, V> enumMap) {
        this.a = enumMap;
        dbsk.a(!enumMap.isEmpty());
    }

    @Override // defpackage.dcdn
    public final dcpd<K> SJ() {
        return dcgh.a(this.a.keySet().iterator());
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return false;
    }

    @Override // defpackage.dcdn, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.dcdi
    public final dcpd<Map.Entry<K, V>> e() {
        return dcjz.r(this.a.entrySet().iterator());
    }

    @Override // defpackage.dcdn, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dccu) {
            obj = ((dccu) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.dcdn, java.util.Map
    public final V get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.dcdn
    Object writeReplace() {
        return new dcct(this.a);
    }
}
