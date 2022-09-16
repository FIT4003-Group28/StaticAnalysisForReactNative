package defpackage;

import java.util.Collection;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: amyl  reason: default package */
/* loaded from: classes.dex */
public final class amyl {
    private final Collection<amyk> b = new HashSet();
    public int a = 0;

    public final synchronized void a(amyk amykVar) {
        this.b.add(amykVar);
    }

    public final synchronized void b(amyk amykVar) {
        this.b.remove(amykVar);
    }

    public final void c() {
        HashSet<amyk> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.b);
        }
        for (amyk amykVar : hashSet) {
            amykVar.a();
        }
    }

    public final synchronized int d() {
        return this.a;
    }
}
