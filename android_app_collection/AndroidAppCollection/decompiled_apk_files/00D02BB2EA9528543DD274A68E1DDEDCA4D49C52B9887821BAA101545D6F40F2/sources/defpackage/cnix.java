package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cnix  reason: default package */
/* loaded from: classes5.dex */
public final class cnix {
    private final dbsz<RemoteException> a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public cnix(dbsz<RemoteException> dbszVar) {
        this.a = dbszVar;
    }

    public final void a(RemoteException remoteException) {
        if (cmwk.a("CAR.CLIENT", 4)) {
            remoteException.getMessage();
            int i = cnjc.a;
        }
        if (this.b.getAndSet(true)) {
            if (!cmwk.a("CAR.CLIENT", 3)) {
                return;
            }
            int i2 = cnjc.a;
            return;
        }
        this.a.NU(remoteException);
    }

    public final <V> V b(cnjk<V> cnjkVar, V v) {
        try {
            return cnjkVar.call();
        } catch (RemoteException e) {
            a(e);
            return v;
        }
    }

    public final void c(RemoteException remoteException) {
        a(remoteException);
        cniy.b(remoteException);
    }

    public final <V> V d(cnjk<V> cnjkVar) {
        try {
            return cnjkVar.call();
        } catch (RemoteException e) {
            c(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final void e(Exception exc) {
        if (exc instanceof RemoteException) {
            c((RemoteException) exc);
        }
        if (exc instanceof IllegalStateException) {
            cniy.c((IllegalStateException) exc);
        }
        throw new RuntimeException("Unexpected exception", exc);
    }

    public final <V> V f(cnjk<V> cnjkVar) {
        try {
            return cnjkVar.call();
        } catch (RemoteException | IllegalStateException e) {
            e(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final void g(cnjl cnjlVar) {
        try {
            cnjlVar.a();
        } catch (RemoteException | IllegalStateException e) {
            e(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    public final <V> V h(cnjk<V> cnjkVar) {
        try {
            return cnjkVar.call();
        } catch (RemoteException | IllegalStateException e) {
            if (e instanceof RemoteException) {
                c((RemoteException) e);
            }
            if (e instanceof IllegalStateException) {
                cniy.a((IllegalStateException) e);
            }
            throw new RuntimeException("Unexpected exception", e);
        }
    }
}
