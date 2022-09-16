package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amro  reason: default package */
/* loaded from: classes.dex */
abstract class amro extends amrv implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public amro(Map map) {
        aqxo.p(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    public Collection c(Collection collection) {
        throw null;
    }

    public Collection d(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.amxc
    public final int g() {
        return this.b;
    }

    @Override // defpackage.amrv
    public final Collection h() {
        return new amru(this);
    }

    @Override // defpackage.amrv
    public final Iterator i() {
        return new amrc(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j(Object obj, List list, amrl amrlVar) {
        if (list instanceof RandomAccess) {
            return new amrh(this, obj, list, amrlVar);
        }
        return new amrn(this, obj, list, amrlVar);
    }

    @Override // defpackage.amrv
    public Map k() {
        return new amrb(this, this.a);
    }

    @Override // defpackage.amrv
    public Set l() {
        return new amre(this, this.a);
    }

    @Override // defpackage.amxc
    public final void m() {
        for (Collection collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            aqxo.p(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.amxc
    public final boolean o(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.amrv, defpackage.amxc
    public final boolean p(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a = a();
            if (a.add(obj2)) {
                this.b++;
                this.a.put(obj, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }
}
