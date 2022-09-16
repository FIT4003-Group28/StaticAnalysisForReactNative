package defpackage;

import android.os.RemoteException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: awna  reason: default package */
/* loaded from: classes3.dex */
final class awna<R> implements Runnable {
    public final awnb<R> a;
    public final awmz b;
    public final dehn<R> c;

    public awna(dehn<R> dehnVar, awnb<R> awnbVar, awmz awmzVar) {
        this.c = dehnVar;
        this.a = awnbVar;
        this.b = awmzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(dehn<R> dehnVar) {
        try {
            this.a.a(deha.r(dehnVar));
        } catch (CancellationException e) {
            b(new avlo(drtc.CANCELLED, e));
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            dbsk.s(cause);
            if (cause instanceof avlo) {
                b((avlo) cause);
            } else if (!(cause instanceof awmq)) {
                b(new avlo(drtc.INTERNAL, cause));
                dbue.b(cause);
                throw new RuntimeException(cause);
            } else {
                this.b.a(awnd.b);
            }
        }
    }

    private final void b(avlo avloVar) {
        this.b.a(avloVar.a.bS());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this.c);
        } catch (RemoteException unused) {
            drte drteVar = awnd.a;
        }
    }
}
