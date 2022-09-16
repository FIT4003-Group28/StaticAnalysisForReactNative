package defpackage;

import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gr  reason: default package */
/* loaded from: classes.dex */
public final class gr extends an {
    public static final aq a = new gq();
    public final boolean g;
    public final HashMap<String, fd> d = new HashMap<>();
    public final HashMap<String, gr> e = new HashMap<>();
    public final HashMap<String, aw> f = new HashMap<>();
    public boolean h = false;
    public boolean i = false;

    public gr(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.an
    public final void a() {
        if (gn.a(3)) {
            String str = "onCleared called for " + this;
        }
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(fd fdVar) {
        if (!this.i && !this.d.containsKey(fdVar.n)) {
            this.d.put(fdVar.n, fdVar);
            if (!gn.a(2)) {
                return;
            }
            String str = "Updating retained Fragments: Added " + fdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(fd fdVar) {
        if (this.d.containsKey(fdVar.n) && this.g) {
            return this.h;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(fd fdVar) {
        if (!this.i && this.d.remove(fdVar.n) != null && gn.a(2)) {
            String str = "Updating retained Fragments: Removed " + fdVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gr grVar = (gr) obj;
            if (this.d.equals(grVar.d) && this.e.equals(grVar.e) && this.f.equals(grVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<fd> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
