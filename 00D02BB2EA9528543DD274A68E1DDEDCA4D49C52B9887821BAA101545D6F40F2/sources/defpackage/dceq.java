package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dceq  reason: default package */
/* loaded from: classes.dex */
public final class dceq<K, V> extends dcdz<K, V> {
    public final dcet<K, V> a() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.a.entrySet();
        if (entrySet.isEmpty()) {
            return dcay.a;
        }
        dcdg dcdgVar = new dcdg(entrySet.size());
        int i = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            dcep K = dcep.K(entry.getValue());
            if (!K.isEmpty()) {
                dcdgVar.f(key, K);
                i += K.size();
            }
        }
        return new dcet<>(dcdgVar.b(), i);
    }

    public final void b(K k, V v) {
        super.h(k, v);
    }

    public final void c(K k, V... vArr) {
        super.g(k, Arrays.asList(vArr));
    }

    @Override // defpackage.dcdz
    public final Collection<V> e() {
        return new dbzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcdz
    public final /* bridge */ /* synthetic */ void h(Object obj, Object obj2) {
        super.h(obj, obj2);
    }
}
