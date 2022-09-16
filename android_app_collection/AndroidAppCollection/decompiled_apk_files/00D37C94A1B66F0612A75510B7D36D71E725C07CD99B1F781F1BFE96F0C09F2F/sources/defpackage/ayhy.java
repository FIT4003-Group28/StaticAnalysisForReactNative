package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayhy  reason: default package */
/* loaded from: classes2.dex */
public final class ayhy implements ayjs {
    final ayez a;
    boolean b = false;
    final /* synthetic */ ayia c;

    public ayhy(ayia ayiaVar, ayez ayezVar) {
        this.c = ayiaVar;
        this.a = ayezVar;
    }

    @Override // defpackage.ayjs
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.ayjs
    public final void b() {
        this.c.d.a(2, "READY");
        this.c.e.execute(new ayhx(this, 1));
    }

    @Override // defpackage.ayjs
    public final void c(Status status) {
        this.c.d.b(2, "{0} SHUTDOWN with {1}", this.a.c(), ayia.k(status));
        this.b = true;
        this.c.e.execute(new ayhw(this, status));
    }

    @Override // defpackage.ayjs
    public final void d() {
        aqxo.z(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.d.b(2, "{0} Terminated", this.a.c());
        axzn.b(this.c.c.d, this.a);
        this.c.f(this.a, false);
        this.c.e.execute(new ayhx(this));
    }
}
