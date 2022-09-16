package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amyz  reason: default package */
/* loaded from: classes.dex */
public final class amyz extends amzj {
    private static final long serialVersionUID = 0;

    public amyz(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = !(obj instanceof Map.Entry) ? false : a().contains(amxp.m((Map.Entry) obj));
        }
        return contains;
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean r;
        synchronized (this.g) {
            r = araa.r(a(), collection);
        }
        return r;
    }

    @Override // defpackage.amzj, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean j;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            j = amyv.j(a(), obj);
        }
        return j;
    }

    @Override // defpackage.amzc, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amyy(this, super.iterator());
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = !(obj instanceof Map.Entry) ? false : a().remove(amxp.m((Map.Entry) obj));
        }
        return remove;
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean o;
        synchronized (this.g) {
            o = arey.o(a().iterator(), collection);
        }
        return o;
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.g) {
            Iterator it = a().iterator();
            collection.getClass();
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set a = a();
            objArr = new Object[a.size()];
            amxp.e(a, objArr);
        }
        return objArr;
    }

    @Override // defpackage.amzc, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        synchronized (this.g) {
            Set a = a();
            int size = a.size();
            if (objArr.length < size) {
                objArr = amyv.o(objArr, size);
            }
            amxp.e(a, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }
}
