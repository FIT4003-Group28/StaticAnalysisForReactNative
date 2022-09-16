package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: qtt  reason: default package */
/* loaded from: classes4.dex */
public abstract class qtt extends BasePendingResult implements qtu {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtt(qso qsoVar, qsx qsxVar) {
        super(qsxVar);
        qnm.n(qsxVar, "GoogleApiClient must not be null");
        qnm.n(qsoVar, "Api must not be null");
        twx twxVar = qsoVar.b;
    }

    private final void b(RemoteException remoteException) {
        k(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void c(qsi qsiVar);

    public /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    public final void j(qsi qsiVar) {
        try {
            c(qsiVar);
        } catch (DeadObjectException e) {
            b(e);
            throw e;
        } catch (RemoteException e2) {
            b(e2);
        }
    }

    public final void k(Status status) {
        qnm.d(!status.c(), "Failed result must not be success");
        n(a(status));
    }
}
