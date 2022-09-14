package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnpt  reason: default package */
/* loaded from: classes5.dex */
final class cnpt implements cnru {
    final /* synthetic */ cnpu a;

    public cnpt(cnpu cnpuVar) {
        this.a = cnpuVar;
    }

    @Override // defpackage.cnru
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            this.a.n();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.cnru
    public final void b(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            cnpu cnpuVar = this.a;
            cnpuVar.e = connectionResult;
            cnpuVar.n();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.cnru
    public final void c(int i, boolean z) {
        Lock lock;
        this.a.g.lock();
        try {
            cnpu cnpuVar = this.a;
            if (!cnpuVar.f) {
                cnpuVar.f = true;
                cnpuVar.a.Pj(i);
                lock = this.a.g;
            } else {
                cnpuVar.f = false;
                cnpuVar.o(i, z);
                lock = this.a.g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }
}
