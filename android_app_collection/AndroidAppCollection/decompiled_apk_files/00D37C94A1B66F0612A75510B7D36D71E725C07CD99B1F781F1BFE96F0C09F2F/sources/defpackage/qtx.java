package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: qtx  reason: default package */
/* loaded from: classes4.dex */
public abstract class qtx extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    protected final qrq c;
    private final Handler d;

    public qtx(qux quxVar, qrq qrqVar) {
        super(quxVar);
        this.b = new AtomicReference(null);
        this.d = new rfm(Looper.getMainLooper());
        this.c = qrqVar;
    }

    private static final int o(qtv qtvVar) {
        if (qtvVar == null) {
            return -1;
        }
        return qtvVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        qtv qtvVar = new qtv(connectionResult, i);
        if (this.b.compareAndSet(null, qtvVar)) {
            this.d.post(new qtw(this, qtvVar));
        }
    }

    public final void b(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        f(connectionResult, i);
    }

    public final void c() {
        this.b.set(null);
        g();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i, int i2, Intent intent) {
        qtv qtvVar = (qtv) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.c.g(l());
                if (g == 0) {
                    c();
                    return;
                } else if (qtvVar == null) {
                    return;
                } else {
                    if (qtvVar.b.c == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            c();
            return;
        } else if (i2 == 0) {
            if (qtvVar == null) {
                return;
            }
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            b(new ConnectionResult(i3, null, qtvVar.b.toString()), o(qtvVar));
            return;
        }
        if (qtvVar != null) {
            b(qtvVar.b, qtvVar.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new qtv(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void f(ConnectionResult connectionResult, int i);

    protected abstract void g();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        qtv qtvVar = (qtv) this.b.get();
        if (qtvVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", qtvVar.a);
        bundle.putInt("failed_status", qtvVar.b.c);
        bundle.putParcelable("failed_resolution", qtvVar.b.d);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        this.a = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b(new ConnectionResult(13, null), o((qtv) this.b.get()));
    }
}
