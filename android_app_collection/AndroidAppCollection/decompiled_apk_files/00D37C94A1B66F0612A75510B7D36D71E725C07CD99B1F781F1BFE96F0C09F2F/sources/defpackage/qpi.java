package defpackage;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: qpi  reason: default package */
/* loaded from: classes4.dex */
final class qpi extends qpq {
    private final AtomicReference a;
    private final Handler b;

    public qpi(qpj qpjVar) {
        this.a = new AtomicReference(qpjVar);
        this.b = new rfm(qpjVar.r);
    }

    @Override // defpackage.qpr
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        qpjVar.b = applicationMetadata;
        qpjVar.m = applicationMetadata.a;
        qpjVar.n = str2;
        qpjVar.e = str;
        synchronized (qpj.a) {
        }
    }

    @Override // defpackage.qpr
    public final void b(int i) {
        if (((qpj) this.a.get()) != null) {
            synchronized (qpj.a) {
            }
        }
    }

    @Override // defpackage.qpr
    public final void c(int i) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        qpjVar.m = null;
        qpjVar.n = null;
        qpj.p();
        if (qpjVar.o == null) {
            return;
        }
        this.b.post(new qpe(qpjVar, i));
    }

    @Override // defpackage.qpr
    public final void d(int i) {
        if (((qpj) this.a.get()) == null) {
            return;
        }
        qpj.p();
    }

    @Override // defpackage.qpr
    public final void e(ApplicationStatus applicationStatus) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        this.b.post(new qpg(qpjVar, applicationStatus));
    }

    @Override // defpackage.qpr
    public final void f(int i) {
        if (((qpj) this.a.get()) == null) {
            return;
        }
        qpj.p();
    }

    @Override // defpackage.qpr
    public final void g(int i) {
    }

    @Override // defpackage.qpr
    public final void h(DeviceStatus deviceStatus) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        this.b.post(new qpf(qpjVar, deviceStatus));
    }

    @Override // defpackage.qpr
    public final void i(int i) {
        qpj p = p();
        if (p == null || i == 0) {
            return;
        }
        p.I(2);
    }

    @Override // defpackage.qpr
    public final void j(int i) {
    }

    @Override // defpackage.qpr
    public final void k(String str, String str2) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        this.b.post(new qph(qpjVar, str, str2));
    }

    @Override // defpackage.qpr
    public final void l(long j) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        qpjVar.n(j, 0);
    }

    @Override // defpackage.qpr
    public final void m(long j, int i) {
        qpj qpjVar = (qpj) this.a.get();
        if (qpjVar == null) {
            return;
        }
        qpjVar.n(j, i);
    }

    @Override // defpackage.qpr
    public final void n() {
        Object obj = qpj.a;
    }

    @Override // defpackage.qpr
    public final void o(byte[] bArr) {
        if (((qpj) this.a.get()) == null) {
            return;
        }
        Object obj = qpj.a;
        int length = bArr.length;
    }

    public final qpj p() {
        qpj qpjVar = (qpj) this.a.getAndSet(null);
        if (qpjVar == null) {
            return null;
        }
        qpjVar.k();
        return qpjVar;
    }
}
