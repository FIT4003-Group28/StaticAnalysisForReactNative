package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cnpl  reason: default package */
/* loaded from: classes.dex */
public abstract class cnpl extends LifecycleCallback implements DialogInterface.OnCancelListener {
    private final Handler a;
    public volatile boolean b;
    public final AtomicReference<cnpi> c;
    protected final cnmq d;

    public cnpl(cnrx cnrxVar, cnmq cnmqVar) {
        super(cnrxVar);
        this.c = new AtomicReference<>(null);
        this.a = new cojb(Looper.getMainLooper());
        this.d = cnmqVar;
    }

    private static final int b(cnpi cnpiVar) {
        if (cnpiVar == null) {
            return -1;
        }
        return cnpiVar.a;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void c() {
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        this.b = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f(ConnectionResult connectionResult, int i);

    protected abstract void g();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new cnpi(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        cnpi cnpiVar = this.c.get();
        if (cnpiVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", cnpiVar.a);
        bundle.putInt("failed_status", cnpiVar.b.c);
        bundle.putParcelable("failed_resolution", cnpiVar.b.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<cnpi> r0 = r4.c
            java.lang.Object r0 = r0.get()
            cnpi r0 = (defpackage.cnpi) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L2e
            r6 = 2
            if (r5 == r6) goto L11
        Lf:
            r1 = 0
            goto L5d
        L11:
            cnmq r5 = r4.d
            android.app.Activity r6 = r4.n()
            int r5 = r5.i(r6)
            if (r5 != 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r0 != 0) goto L22
            return
        L22:
            com.google.android.gms.common.ConnectionResult r6 = r0.b
            int r6 = r6.c
            r7 = 18
            if (r6 != r7) goto L5d
            if (r5 == r7) goto L2d
            goto L5d
        L2d:
            return
        L2e:
            r5 = -1
            if (r6 != r5) goto L32
            goto L5d
        L32:
            if (r6 != 0) goto Lf
            if (r0 != 0) goto L37
            return
        L37:
            r5 = 13
            if (r7 == 0) goto L41
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L41:
            cnpi r6 = new cnpi
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            com.google.android.gms.common.ConnectionResult r3 = r0.b
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = b(r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<cnpi> r5 = r4.c
            r5.set(r6)
            r0 = r6
            goto Lf
        L5d:
            if (r1 == 0) goto L63
            r4.k()
            return
        L63:
            if (r0 == 0) goto L6c
            com.google.android.gms.common.ConnectionResult r5 = r0.b
            int r6 = r0.a
            r4.f(r5, r6)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnpl.j(int, int, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        this.c.set(null);
        g();
    }

    public final void l(ConnectionResult connectionResult, int i) {
        cnpi cnpiVar = new cnpi(connectionResult, i);
        if (this.c.compareAndSet(null, cnpiVar)) {
            this.a.post(new cnpk(this, cnpiVar));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        f(new ConnectionResult(13, null), b(this.c.get()));
        k();
    }
}
