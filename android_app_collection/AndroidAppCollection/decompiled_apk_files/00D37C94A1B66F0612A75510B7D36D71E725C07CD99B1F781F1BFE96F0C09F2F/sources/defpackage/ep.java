package defpackage;

import java.util.HashMap;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ep  reason: default package */
/* loaded from: classes3.dex */
public final class ep extends ac {
    public static final ae a = new aqk(1);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public ep(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ac
    public final void b() {
        if (eo.X(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dp dpVar) {
        if (!this.i && !this.d.containsKey(dpVar.l)) {
            this.d.put(dpVar.l, dpVar);
            if (!eo.X(2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(dpVar);
        }
    }

    public final void e(String str) {
        ep epVar = (ep) this.e.get(str);
        if (epVar != null) {
            epVar.b();
            this.e.remove(str);
        }
        aj ajVar = (aj) this.f.get(str);
        if (ajVar != null) {
            ajVar.c();
            this.f.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ep epVar = (ep) obj;
            if (this.d.equals(epVar.d) && this.e.equals(epVar.e) && this.f.equals(epVar.f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dp dpVar) {
        if (!this.i && this.d.remove(dpVar.l) != null && eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(dpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(dp dpVar) {
        if (this.d.containsKey(dpVar.l) && this.g) {
            return this.h;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
