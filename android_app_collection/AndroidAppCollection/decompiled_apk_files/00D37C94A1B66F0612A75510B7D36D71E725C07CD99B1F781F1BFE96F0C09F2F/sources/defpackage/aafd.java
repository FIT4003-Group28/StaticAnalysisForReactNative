package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: aafd  reason: default package */
/* loaded from: classes.dex */
public final class aafd {
    private final Set a;

    public aafd() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public final boolean a(apzg apzgVar, apzg apzgVar2) {
        if (akzj.f(apzgVar, apzgVar2)) {
            return true;
        }
        if (apzgVar != null && apzgVar2 != null) {
            for (aafc aafcVar : this.a) {
                if (aafcVar.a(apzgVar, apzgVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void c(ifv ifvVar) {
        synchronized (this) {
            this.a.add(ifvVar);
        }
    }

    public final void d(ifv ifvVar) {
        synchronized (this) {
            this.a.remove(ifvVar);
        }
    }

    public aafd(Set set) {
        set.getClass();
        this.a = set;
    }
}
