package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rmj  reason: default package */
/* loaded from: classes4.dex */
public class rmj implements rml {
    public final rlx w;

    public rmj(rlx rlxVar) {
        qnm.b(rlxVar);
        this.w = rlxVar;
    }

    public final Context I() {
        return this.w.a;
    }

    public final rjp J() {
        return this.w.g;
    }

    public final rjw K() {
        return this.w.c();
    }

    public final rkn L() {
        return this.w.f();
    }

    public final rlf M() {
        return this.w.h();
    }

    public final rps N() {
        return this.w.q();
    }

    public final void O() {
        if (Thread.currentThread() == this.w.aH().c) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    public final void P() {
        rjm rjmVar = this.w.f;
    }

    public final void Q() {
        qyh qyhVar = this.w.y;
    }

    @Override // defpackage.rml
    public final rks aG() {
        return this.w.aG();
    }

    @Override // defpackage.rml
    public final rlu aH() {
        return this.w.aH();
    }

    public void n() {
        this.w.aH().n();
    }
}
