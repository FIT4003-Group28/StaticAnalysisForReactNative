package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcjn  reason: default package */
/* loaded from: classes5.dex */
final class dcjn extends dcjt {
    final /* synthetic */ dcjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcjn(dcjo dcjoVar) {
        super(dcjoVar);
        this.a = dcjoVar;
    }

    @Override // defpackage.dcjt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (this.a.containsKey(obj)) {
            this.a.a.remove(obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.dcnj, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        dcjo dcjoVar = this.a;
        Map<K, V> map = dcjoVar.a;
        dbsl<? super Map.Entry<K, V>> dbslVar = dcjoVar.b;
        Iterator it = map.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (dbslVar.a(entry) && collection.contains(entry.getKey())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dcnj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        dcjo dcjoVar = this.a;
        Map<K, V> map = dcjoVar.a;
        dbsl<? super Map.Entry<K, V>> dbslVar = dcjoVar.b;
        Iterator it = map.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (dbslVar.a(entry) && !collection.contains(entry.getKey())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return dchl.d(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dchl.d(iterator()).toArray(tArr);
    }
}
