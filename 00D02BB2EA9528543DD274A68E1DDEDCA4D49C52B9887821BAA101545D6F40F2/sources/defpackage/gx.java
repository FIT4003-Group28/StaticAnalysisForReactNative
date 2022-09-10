package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public final class gx {
    public final ArrayList<fd> a = new ArrayList<>();
    public final HashMap<String, gw> b = new HashMap<>();
    public gr c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(gw gwVar) {
        fd fdVar = gwVar.a;
        if (i(fdVar.n)) {
            return;
        }
        this.b.put(fdVar.n, gwVar);
        if (fdVar.K) {
            if (fdVar.J) {
                this.c.c(fdVar);
            } else {
                this.c.e(fdVar);
            }
            fdVar.K = false;
        }
        if (!gn.a(2)) {
            return;
        }
        String str = "Added fragment to active set " + fdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fd fdVar) {
        if (!this.a.contains(fdVar)) {
            synchronized (this.a) {
                this.a.add(fdVar);
            }
            fdVar.t = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(fd fdVar) {
        synchronized (this.a) {
            this.a.remove(fdVar);
        }
        fdVar.t = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(gw gwVar) {
        fd fdVar = gwVar.a;
        if (fdVar.J) {
            this.c.e(fdVar);
        }
        if (this.b.put(fdVar.n, null) != null && gn.a(2)) {
            String str = "Removed fragment from active set " + fdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<gw> f() {
        ArrayList arrayList = new ArrayList();
        for (gw gwVar : this.b.values()) {
            if (gwVar != null) {
                arrayList.add(gwVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<fd> g() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<fd> h() {
        ArrayList arrayList = new ArrayList();
        for (gw gwVar : this.b.values()) {
            if (gwVar != null) {
                arrayList.add(gwVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(String str) {
        return this.b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gw j(String str) {
        return this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fd k(String str) {
        for (gw gwVar : this.b.values()) {
            if (gwVar != null) {
                fd fdVar = gwVar.a;
                if (!str.equals(fdVar.n)) {
                    fdVar = fdVar.C.a.k(str);
                }
                if (fdVar != null) {
                    return fdVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fd l(String str) {
        gw gwVar = this.b.get(str);
        if (gwVar != null) {
            return gwVar.a;
        }
        return null;
    }
}
