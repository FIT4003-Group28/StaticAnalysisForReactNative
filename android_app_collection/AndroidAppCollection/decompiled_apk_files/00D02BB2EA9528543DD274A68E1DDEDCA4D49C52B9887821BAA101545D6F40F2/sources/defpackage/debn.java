package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: debn  reason: default package */
/* loaded from: classes6.dex */
public final class debn<K, V> extends dcbm<K, V> implements Serializable, dcha {
    final dcha<K, V> a;
    transient Collection<Map.Entry<K, V>> b;
    transient Map<K, Collection<V>> c;

    public debn(dcha<K, V> dchaVar) {
        dbsk.s(dchaVar);
        this.a = dchaVar;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final boolean H(dcka<? extends K, ? extends V> dckaVar) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : dckaVar.I()) {
            z |= n(entry.getKey(), entry.getValue());
        }
        return true == z;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Collection<Map.Entry<K, V>> I() {
        Collection<Map.Entry<K, V>> collection = this.b;
        if (collection == null) {
            debj debjVar = new debj(this.a.I());
            this.b = debjVar;
            return debjVar;
        }
        return collection;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final Map<K, Collection<V>> L() {
        Map<K, Collection<V>> map = this.c;
        if (map == null) {
            debm debmVar = new debm(this, this.a.L());
            this.c = debmVar;
            return debmVar;
        }
        return map;
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final void M(K k, Iterable<? extends V> iterable) {
        throw null;
    }

    @Override // defpackage.dcbp, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbm
    protected final dcha<K, V> a() {
        return this.a;
    }

    @Override // defpackage.dcbm, defpackage.dcbp
    protected final /* bridge */ /* synthetic */ dcka b() {
        return this.a;
    }

    @Override // defpackage.dcbm, defpackage.dcha
    public final List<V> c(K k) {
        return new debk(this.a.c(k));
    }

    @Override // defpackage.dcbm, defpackage.dcha
    public final List<V> e(K k, Iterable<? extends V> iterable) {
        dcha<K, V> dchaVar = this.a;
        ArrayList c = dchl.c(iterable);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            Object obj = c.get(i);
            dbsk.x(k, "null key in entry (%s, %s)", k, obj);
            dbsk.x(obj, "null value in entry (%s, %s)", k, obj);
        }
        return dchaVar.e(k, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcbm, defpackage.dcbp, defpackage.dcka
    public final /* bridge */ /* synthetic */ Collection f(Object obj) {
        return f(obj);
    }

    @Override // defpackage.dcbp, defpackage.dcka
    public final boolean n(K k, V v) {
        dbsk.x(k, "null key in entry (%s, %s)", k, v);
        dbsk.x(v, "null value in entry (%s, %s)", k, v);
        return this.a.n(k, v);
    }
}
