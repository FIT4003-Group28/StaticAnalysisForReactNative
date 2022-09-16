package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amyw  reason: default package */
/* loaded from: classes.dex */
final class amyw extends amzf {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public amyw(Map map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.amzf, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.amzf, java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new amyz(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.amzf, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection h;
        synchronized (this.g) {
            Collection collection = (Collection) super.get(obj);
            h = collection == null ? null : ancv.h(collection, this.g);
        }
        return h;
    }

    @Override // defpackage.amzf, java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new amzb(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}
