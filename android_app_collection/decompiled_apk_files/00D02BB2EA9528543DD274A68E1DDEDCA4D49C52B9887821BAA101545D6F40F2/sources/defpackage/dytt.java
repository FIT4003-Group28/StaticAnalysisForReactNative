package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: dytt  reason: default package */
/* loaded from: classes6.dex */
final class dytt implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ dyur b;
    final /* synthetic */ Future c;
    final /* synthetic */ Future d;
    final /* synthetic */ dyut e;

    public dytt(dyut dyutVar, Collection collection, dyur dyurVar, Future future, Future future2) {
        this.e = dyutVar;
        this.a = collection;
        this.b = dyurVar;
        this.c = future;
        this.d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (dyur dyurVar : this.a) {
            if (dyurVar != this.b) {
                dyurVar.a.e(dyut.g);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.d;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.e.p();
    }
}
