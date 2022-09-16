package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aif  reason: default package */
/* loaded from: classes.dex */
public class aif<K, V> extends aim<K, V> implements Map<K, V> {
    ahz a;
    aib b;
    aid c;

    public aif() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> boolean c(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final boolean a(Collection<?> collection) {
        int i = this.j;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(i(i2))) {
                m(i2);
            }
        }
        return i != this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] b(T[] tArr, int i) {
        int i2 = this.j;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.i[i3 + i3 + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ahz ahzVar = this.a;
        if (ahzVar == null) {
            ahz ahzVar2 = new ahz(this);
            this.a = ahzVar2;
            return ahzVar2;
        }
        return ahzVar;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        aib aibVar = this.b;
        if (aibVar == null) {
            aib aibVar2 = new aib(this);
            this.b = aibVar2;
            return aibVar2;
        }
        return aibVar;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        f(this.j + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        aid aidVar = this.c;
        if (aidVar == null) {
            aid aidVar2 = new aid(this);
            this.c = aidVar2;
            return aidVar2;
        }
        return aidVar;
    }

    public aif(int i) {
        super(i);
    }

    public aif(aim aimVar) {
        l(aimVar);
    }
}
