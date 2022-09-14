package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class t0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c  reason: collision with root package name */
    protected volatile boolean f6922c;

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicReference<v0> f6923d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f6924e;

    /* renamed from: f  reason: collision with root package name */
    protected final com.google.android.gms.common.e f6925f;

    /* JADX INFO: Access modifiers changed from: protected */
    public t0(h hVar) {
        this(hVar, com.google.android.gms.common.e.a());
    }

    private t0(h hVar, com.google.android.gms.common.e eVar) {
        super(hVar);
        this.f6923d = new AtomicReference<>(null);
        this.f6924e = new c.e.a.b.d.b.d(Looper.getMainLooper());
        this.f6925f = eVar;
    }

    private static int a(v0 v0Var) {
        if (v0Var == null) {
            return -1;
        }
        return v0Var.b();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(int i, int i2, Intent intent) {
        v0 v0Var = this.f6923d.get();
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                int b2 = this.f6925f.b(a());
                if (b2 != 0) {
                    z = false;
                }
                if (v0Var == null) {
                    return;
                }
                if (v0Var.a().q() == 18 && b2 == 18) {
                    return;
                }
            }
            z = false;
        } else if (i2 != -1) {
            if (i2 == 0) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                v0 v0Var2 = new v0(new com.google.android.gms.common.b(i3, null, v0Var.a().toString()), a(v0Var));
                this.f6923d.set(v0Var2);
                v0Var = v0Var2;
            }
            z = false;
        }
        if (z) {
            g();
        } else if (v0Var == null) {
        } else {
            a(v0Var.a(), v0Var.b());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f6923d.set(bundle.getBoolean("resolving_error", false) ? new v0(new com.google.android.gms.common.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(com.google.android.gms.common.b bVar, int i);

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void b(Bundle bundle) {
        super.b(bundle);
        v0 v0Var = this.f6923d.get();
        if (v0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", v0Var.b());
            bundle.putInt("failed_status", v0Var.a().q());
            bundle.putParcelable("failed_resolution", v0Var.a().s());
        }
    }

    public final void b(com.google.android.gms.common.b bVar, int i) {
        v0 v0Var = new v0(bVar, i);
        if (this.f6923d.compareAndSet(null, v0Var)) {
            this.f6924e.post(new u0(this, v0Var));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        this.f6922c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void e() {
        super.e();
        this.f6922c = false;
    }

    protected abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.f6923d.set(null);
        f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a(new com.google.android.gms.common.b(13, null), a(this.f6923d.get()));
        g();
    }
}
