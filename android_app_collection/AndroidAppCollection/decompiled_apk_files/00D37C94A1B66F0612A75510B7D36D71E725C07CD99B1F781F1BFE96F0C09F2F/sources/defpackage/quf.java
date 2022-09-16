package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: quf  reason: default package */
/* loaded from: classes4.dex */
public final class quf extends qtx {
    public final afy d;
    private final quq f;

    public quf(qux quxVar, quq quqVar) {
        super(quxVar, qrq.a);
        this.d = new afy();
        this.f = quqVar;
        this.e.c("ConnectionlessLifecycleHelper", this);
    }

    private final void o() {
        if (!this.d.isEmpty()) {
            this.f.g(this);
        }
    }

    @Override // defpackage.qtx
    protected final void f(ConnectionResult connectionResult, int i) {
        this.f.e(connectionResult, i);
    }

    @Override // defpackage.qtx
    protected final void g() {
        this.f.f();
    }

    @Override // defpackage.qtx, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        super.i();
        o();
    }

    @Override // defpackage.qtx, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        quq quqVar = this.f;
        synchronized (quq.c) {
            if (quqVar.m == this) {
                quqVar.m = null;
                quqVar.n.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        o();
    }
}
