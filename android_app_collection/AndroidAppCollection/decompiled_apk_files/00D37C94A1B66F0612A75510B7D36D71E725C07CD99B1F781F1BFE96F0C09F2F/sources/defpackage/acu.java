package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acu  reason: default package */
/* loaded from: classes.dex */
public class acu implements Iterable {
    public acq b;
    public acq c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public acq a(Object obj) {
        acq acqVar = this.b;
        while (acqVar != null && !acqVar.a.equals(obj)) {
            acqVar = acqVar.c;
        }
        return acqVar;
    }

    public Object b(Object obj, Object obj2) {
        acq a = a(obj);
        if (a != null) {
            return a.b;
        }
        e(obj, obj2);
        return null;
    }

    public Object c(Object obj) {
        acq a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (act actVar : this.d.keySet()) {
                actVar.jD(a);
            }
        }
        acq acqVar = a.d;
        acq acqVar2 = a.c;
        if (acqVar != null) {
            acqVar.c = acqVar2;
        } else {
            this.b = acqVar2;
        }
        acq acqVar3 = a.c;
        if (acqVar3 != null) {
            acqVar3.d = acqVar;
        } else {
            this.c = acqVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acq e(Object obj, Object obj2) {
        acq acqVar = new acq(obj, obj2);
        this.e++;
        acq acqVar2 = this.c;
        if (acqVar2 == null) {
            this.b = acqVar;
        } else {
            acqVar2.c = acqVar;
            acqVar.d = acqVar2;
        }
        this.c = acqVar;
        return acqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acu)) {
            return false;
        }
        acu acuVar = (acu) obj;
        if (this.e != acuVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = acuVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((acs) it).next();
            Map.Entry next2 = ((acs) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public final acr f() {
        acr acrVar = new acr(this);
        this.d.put(acrVar, false);
        return acrVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((acs) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        aco acoVar = new aco(this.b, this.c);
        this.d.put(acoVar, false);
        return acoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((acs) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
