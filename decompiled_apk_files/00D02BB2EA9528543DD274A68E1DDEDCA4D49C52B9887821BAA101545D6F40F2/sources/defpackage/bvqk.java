package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: bvqk  reason: default package */
/* loaded from: classes.dex */
final class bvqk implements Runnable {
    final /* synthetic */ bvrg a;
    final /* synthetic */ bvrj b;

    public bvqk(bvrg bvrgVar, bvrj bvrjVar) {
        this.a = bvrgVar;
        this.b = bvrjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        bvrg bvrgVar = this.a;
        bvrj bvrjVar = this.b;
        synchronized (bvrgVar.b) {
            Set<Object> c = bvrgVar.b.c(bvrjVar);
            dbsk.j(c.isEmpty(), "Attempt to unregister the executor for %s, which still has the following objects active: %s. These are likely EventBus listeners you forgot to unregister.", bvrjVar, c);
            z = bvrgVar.a.remove(bvrjVar) != null;
        }
        dbsk.g(z, "Tried to unregister thread %s, which isn't registered.", bvrjVar);
    }
}
