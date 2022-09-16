package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ayku  reason: default package */
/* loaded from: classes2.dex */
final class ayku implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ aylt b;
    final /* synthetic */ Future c;
    final /* synthetic */ Future d;
    final /* synthetic */ aylv e;

    public ayku(aylv aylvVar, Collection collection, aylt ayltVar, Future future, Future future2) {
        this.e = aylvVar;
        this.a = collection;
        this.b = ayltVar;
        this.c = future;
        this.d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status;
        for (aylt ayltVar : this.a) {
            if (ayltVar != this.b) {
                ayltVar.a.c(aylv.c);
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
        aylv aylvVar = this.e;
        ayjh ayjhVar = aylvVar.C.a.z;
        synchronized (ayjhVar.a) {
            ayjhVar.b.remove(aylvVar);
            if (ayjhVar.b.isEmpty()) {
                status = ayjhVar.c;
                ayjhVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            ayjhVar.d.y.j(status);
        }
    }
}
