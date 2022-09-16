package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: vom  reason: default package */
/* loaded from: classes4.dex */
final class vom extends von implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public vom(vnu vnuVar) {
        super(vnuVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.von
    protected final void b(vnu vnuVar) {
        try {
            this.b.setOnCancelListener(this);
            CancellationSignal cancellationSignal = this.b;
            vod vodVar = vnuVar.c.e;
            synchronized (vodVar.a.i) {
                int i = vodVar.a.l;
                if (i != 0) {
                    aqxo.A(i > 0, "Refcount went negative!", i);
                    vodVar.a.l++;
                } else {
                    throw new CancellationException("database is closed");
                }
            }
            Cursor rawQueryWithFactory = vnuVar.c.a.rawQueryWithFactory(new vov(vnuVar.a), vnuVar.b, null, null, cancellationSignal);
            vnuVar.c.e.a();
            if (!isCancelled() && rawQueryWithFactory != null) {
                rawQueryWithFactory.getCount();
            }
            if (o(rawQueryWithFactory)) {
                return;
            }
            uut.q(rawQueryWithFactory);
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
