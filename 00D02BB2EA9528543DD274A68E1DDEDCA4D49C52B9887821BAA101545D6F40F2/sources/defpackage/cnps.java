package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cnps  reason: default package */
/* loaded from: classes5.dex */
final class cnps implements cnru {
    final /* synthetic */ cnpu a;

    public cnps(cnpu cnpuVar) {
        this.a = cnpuVar;
    }

    @Override // defpackage.cnru
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            cnpu cnpuVar = this.a;
            Bundle bundle2 = cnpuVar.c;
            if (bundle2 == null) {
                cnpuVar.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
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
            cnpuVar.d = connectionResult;
            cnpuVar.n();
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.cnru
    public final void c(int i, boolean z) {
        Lock lock;
        ConnectionResult connectionResult;
        this.a.g.lock();
        try {
            cnpu cnpuVar = this.a;
            if (!cnpuVar.f && (connectionResult = cnpuVar.e) != null && connectionResult.c()) {
                cnpu cnpuVar2 = this.a;
                cnpuVar2.f = true;
                cnpuVar2.b.Pj(i);
                lock = this.a.g;
                lock.unlock();
            }
            cnpu cnpuVar3 = this.a;
            cnpuVar3.f = false;
            cnpuVar3.o(i, z);
            lock = this.a.g;
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }
}
