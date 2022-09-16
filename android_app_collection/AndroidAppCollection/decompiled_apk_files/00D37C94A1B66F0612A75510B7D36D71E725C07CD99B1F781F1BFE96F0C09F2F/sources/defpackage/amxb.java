package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amxb  reason: default package */
/* loaded from: classes.dex */
abstract class amxb extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set == null) {
            Set b = b();
            this.a = b;
            return b;
        }
        return set;
    }

    public Set g() {
        return new amwy(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set == null) {
            Set g = g();
            this.b = g;
            return g;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection == null) {
            amxa amxaVar = new amxa(this);
            this.c = amxaVar;
            return amxaVar;
        }
        return collection;
    }
}
