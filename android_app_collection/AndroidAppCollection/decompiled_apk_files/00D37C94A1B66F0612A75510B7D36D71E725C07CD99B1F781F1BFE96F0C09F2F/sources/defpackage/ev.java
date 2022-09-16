package defpackage;

import android.support.v4.app.FragmentState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ev  reason: default package */
/* loaded from: classes3.dex */
public final class ev {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ep d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dp a(String str) {
        et etVar = (et) this.b.get(str);
        if (etVar != null) {
            return etVar.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dp b(String str) {
        for (et etVar : this.b.values()) {
            if (etVar != null) {
                dp dpVar = etVar.b;
                if (!str.equals(dpVar.l)) {
                    dpVar = dpVar.B.a.b(str);
                }
                if (dpVar != null) {
                    return dpVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FragmentState c(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return (FragmentState) this.c.put(str, fragmentState);
        }
        return (FragmentState) this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final et d(String str) {
        return (et) this.b.get(str);
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (et etVar : this.b.values()) {
            if (etVar != null) {
                arrayList.add(etVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
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
    public final void g(dp dpVar) {
        if (!this.a.contains(dpVar)) {
            synchronized (this.a) {
                this.a.add(dpVar);
            }
            dpVar.r = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + dpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(et etVar) {
        dp dpVar = etVar.b;
        if (l(dpVar.l)) {
            return;
        }
        this.b.put(dpVar.l, etVar);
        if (dpVar.f180J) {
            if (dpVar.I) {
                this.d.d(dpVar);
            } else {
                this.d.f(dpVar);
            }
            dpVar.f180J = false;
        }
        if (!eo.X(2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Added fragment to active set ");
        sb.append(dpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(et etVar) {
        dp dpVar = etVar.b;
        if (dpVar.I) {
            this.d.f(dpVar);
        }
        if (((et) this.b.put(dpVar.l, null)) != null && eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(dpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(dp dpVar) {
        synchronized (this.a) {
            this.a.remove(dpVar);
        }
        dpVar.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(String str) {
        return this.b.get(str) != null;
    }
}
