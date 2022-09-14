package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnpz  reason: default package */
/* loaded from: classes.dex */
public final class cnpz extends cnpl {
    public final aih<cnpa<?>> a;
    private final cnrn f;

    public cnpz(cnrx cnrxVar, cnrn cnrnVar) {
        super(cnrxVar, cnmq.a);
        this.a = new aih<>();
        this.f = cnrnVar;
        this.e.b("ConnectionlessLifecycleHelper", this);
    }

    private final void b() {
        if (!this.a.isEmpty()) {
            this.f.d(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void Sh() {
        b();
    }

    @Override // defpackage.cnpl, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c() {
        super.c();
        b();
    }

    @Override // defpackage.cnpl, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        cnrn cnrnVar = this.f;
        synchronized (cnrn.e) {
            if (cnrnVar.l == this) {
                cnrnVar.l = null;
                cnrnVar.m.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnpl
    public final void f(ConnectionResult connectionResult, int i) {
        this.f.j(connectionResult, i);
    }

    @Override // defpackage.cnpl
    protected final void g() {
        this.f.f();
    }
}
