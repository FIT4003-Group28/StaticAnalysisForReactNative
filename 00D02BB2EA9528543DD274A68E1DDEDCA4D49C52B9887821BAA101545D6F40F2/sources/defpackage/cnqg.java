package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnqg  reason: default package */
/* loaded from: classes.dex */
final class cnqg implements cnuc {
    public final boolean a;
    private final WeakReference<cnqp> b;
    private final Api<?> c;

    public cnqg(cnqp cnqpVar, Api<?> api, boolean z) {
        this.b = new WeakReference<>(cnqpVar);
        this.c = api;
        this.a = z;
    }

    @Override // defpackage.cnuc
    public final void a(ConnectionResult connectionResult) {
        Lock lock;
        cnqp cnqpVar = this.b.get();
        if (cnqpVar == null) {
            return;
        }
        cnwc.c(Looper.myLooper() == cnqpVar.a.m.c, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        cnqpVar.b.lock();
        try {
            if (!cnqpVar.o(0)) {
                lock = cnqpVar.b;
            } else {
                if (!connectionResult.c()) {
                    cnqpVar.k(connectionResult, this.c, this.a);
                }
                if (cnqpVar.i()) {
                    cnqpVar.j();
                }
                lock = cnqpVar.b;
            }
            lock.unlock();
        } catch (Throwable th) {
            cnqpVar.b.unlock();
            throw th;
        }
    }
}
