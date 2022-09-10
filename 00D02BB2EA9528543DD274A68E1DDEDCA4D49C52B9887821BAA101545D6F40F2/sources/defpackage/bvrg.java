package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: bvrg  reason: default package */
/* loaded from: classes.dex */
public final class bvrg {
    public final ConcurrentHashMap<bvrj, bvql> a = new ConcurrentHashMap<>(bvrj.values().length);
    public final dcna<bvrj, Object> b = dckm.c(bvrj.class).c().a();

    public final void a(bvrj bvrjVar, bvql bvqlVar) {
        boolean z = true;
        dbsk.b(bvrjVar != bvrj.CURRENT, "Cannot register an executor for CURRENT.");
        bvql putIfAbsent = this.a.putIfAbsent(bvrjVar, bvqlVar);
        if (putIfAbsent != null) {
            z = false;
        }
        dbsk.j(z, "Thread %s already has a ThreadExecutor registered: %s", bvrjVar, putIfAbsent);
    }

    public final String toString() {
        int length = bvrj.values().length;
        EnumSet copyOf = EnumSet.copyOf((Collection) this.a.keySet());
        StringBuilder sb = new StringBuilder(length * 40);
        sb.append(getClass().getSimpleName());
        sb.append("[Registered:");
        sb.append(copyOf.toString());
        sb.append(" Unregistered:");
        sb.append(EnumSet.complementOf(copyOf).toString());
        sb.append("]");
        return sb.toString();
    }
}
