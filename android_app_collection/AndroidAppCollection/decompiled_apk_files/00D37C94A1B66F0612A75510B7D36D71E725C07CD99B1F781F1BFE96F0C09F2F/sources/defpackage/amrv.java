package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amrv  reason: default package */
/* loaded from: classes.dex */
public abstract class amrv implements amxc {
    private transient Set a;
    private transient Collection b;
    private transient Map c;

    @Override // defpackage.amxc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amxc) {
            return r().equals(((amxc) obj).r());
        }
        return false;
    }

    public abstract Collection h();

    @Override // defpackage.amxc
    public final int hashCode() {
        return r().hashCode();
    }

    public Iterator i() {
        throw null;
    }

    public abstract Map k();

    public abstract Set l();

    @Override // defpackage.amxc
    public boolean p(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.amxc
    public Collection q() {
        Collection collection = this.b;
        if (collection == null) {
            Collection h = h();
            this.b = h;
            return h;
        }
        return collection;
    }

    @Override // defpackage.amxc
    public Map r() {
        Map map = this.c;
        if (map == null) {
            Map k = k();
            this.c = k;
            return k;
        }
        return map;
    }

    @Override // defpackage.amxc
    public Set s() {
        Set set = this.a;
        if (set == null) {
            Set l = l();
            this.a = l;
            return l;
        }
        return set;
    }

    public boolean t(Object obj) {
        for (Collection collection : r().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return r().toString();
    }
}
