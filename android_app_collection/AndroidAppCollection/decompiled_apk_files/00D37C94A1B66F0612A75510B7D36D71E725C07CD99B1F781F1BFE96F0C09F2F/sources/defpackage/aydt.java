package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aydt  reason: default package */
/* loaded from: classes2.dex */
public abstract class aydt implements ayju {
    public ayfc a;
    public final Object b = new Object();
    public final aymt c;
    public final ayjx d;
    public int e;
    public boolean f;
    public boolean g;
    public final aymk h;
    public ayeq i;
    public axzb j;
    public volatile boolean k;
    public boolean l;
    private boolean m;
    private boolean n;
    private Runnable o;
    private boolean p;

    /* JADX INFO: Access modifiers changed from: protected */
    public aydt(int i, aymk aymkVar, aymt aymtVar) {
        this.c = aymtVar;
        ayjx ayjxVar = new ayjx(this, axyp.a, i, aymkVar, aymtVar);
        this.d = ayjxVar;
        this.a = ayjxVar;
        this.j = axzb.b;
        this.n = false;
        this.h = aymkVar;
    }

    @Override // defpackage.ayju
    public final void a(aymm aymmVar) {
        this.i.d(aymmVar);
    }

    public final void b() {
        boolean c;
        synchronized (this.b) {
            c = c();
        }
        if (c) {
            this.i.e();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.f && this.e < 32768 && !this.g) {
                z = true;
            }
        }
        return z;
    }

    public final void d(Status status, ayep ayepVar, ayat ayatVar) {
        if (!this.m) {
            this.m = true;
            this.h.l(status);
            this.i.a(status, ayepVar, ayatVar);
            aymt aymtVar = this.c;
            if (status.f()) {
                aymtVar.c++;
            } else {
                aymtVar.d++;
            }
        }
    }

    @Override // defpackage.ayju
    public final void e(boolean z) {
        aqxo.z(this.l, "status should have been reported on deframer closed");
        this.n = true;
        if (this.p && z) {
            f(Status.n.withDescription("Encountered end-of-stream mid-frame"), true, new ayat());
        }
        Runnable runnable = this.o;
        if (runnable != null) {
            runnable.run();
            this.o = null;
        }
    }

    public final void f(Status status, boolean z, ayat ayatVar) {
        ayep ayepVar = ayep.PROCESSED;
        status.getClass();
        ayatVar.getClass();
        if (this.l) {
            if (!z) {
                return;
            }
            z = true;
        }
        this.l = true;
        this.p = status.f();
        synchronized (this.b) {
            this.g = true;
        }
        if (this.n) {
            this.o = null;
            d(status, ayepVar, ayatVar);
            return;
        }
        this.o = new aydo(this, status, ayepVar, ayatVar);
        if (z) {
            this.a.close();
            return;
        }
        ayjx ayjxVar = (ayjx) this.a;
        if (ayjxVar.b()) {
            return;
        }
        if (ayjxVar.c()) {
            ayjxVar.close();
        } else {
            ayjxVar.f = true;
        }
    }
}
