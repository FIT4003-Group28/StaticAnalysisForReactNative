package defpackage;

import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: abro  reason: default package */
/* loaded from: classes.dex */
public final class abro implements accg {
    public accf a;
    public Handler b;
    public boolean c;
    public final Runnable d = new abrm(this);
    private final absy e;
    private boolean f;

    public abro(absy absyVar) {
        absyVar.getClass();
        this.e = absyVar;
    }

    @Override // defpackage.accg
    public final void a(Surface surface, long j) {
        if (!this.c) {
            return;
        }
        this.e.e(surface);
        this.e.a(j);
    }

    @Override // defpackage.accg
    public final void c(accf accfVar, Handler handler) {
        this.a = accfVar;
        this.b = handler;
    }

    @Override // defpackage.accg
    public final void d(Surface surface) {
        this.e.e(surface);
    }

    @Override // defpackage.accg
    public final boolean e() {
        if (!this.c) {
            zep.b("Cannot pause when video source not started.");
            return false;
        } else if (this.f) {
            return true;
        } else {
            this.e.c(true);
            this.f = true;
            return true;
        }
    }

    @Override // defpackage.accg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.accg
    public final boolean g() {
        if (!this.c) {
            zep.b("Cannot resume when video source not started.");
            return false;
        } else if (!this.f) {
            return true;
        } else {
            this.e.c(false);
            this.f = false;
            return true;
        }
    }

    @Override // defpackage.accg
    public final boolean h() {
        if (this.c) {
            return true;
        }
        this.e.b(true);
        this.c = true;
        return true;
    }

    @Override // defpackage.accg
    public final void i() {
        if (this.c) {
            j();
        }
    }

    @Override // defpackage.accg
    public final void j() {
        if (!this.c) {
            return;
        }
        this.e.b(false);
        this.c = false;
        this.f = false;
    }

    @Override // defpackage.accg
    public final void b(acce acceVar, Handler handler) {
        this.e.d(acceVar == null ? null : new abrn(acceVar), handler);
    }
}
