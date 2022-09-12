package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpsq  reason: default package */
/* loaded from: classes4.dex */
public final class bpsq {
    private static final dcqe a = dcqe.c("bpsq");
    private final dxio<akox> b;
    private final dxio<akzh> c;
    private final dxio<afwr> d;
    private bpsp e;
    @dzsi
    private bpsp f;
    @dzsi
    private bpsp g;

    public bpsq(dxio<akox> dxioVar, dxio<akzh> dxioVar2, dxio<afwr> dxioVar3) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
    }

    private final bpsp g() {
        alaa b = alad.b(this.c.a().p());
        this.b.a().o(b);
        bpso c = bpsp.c();
        ((bpse) c).a = dbsg.i(b.a());
        c.b(this.d.a().l().d(afwm.SATELLITE));
        return c.a();
    }

    private final void h(bpsp bpspVar) {
        if (bpspVar.a().a()) {
            akyc e = akyt.e(bpspVar.a().b());
            e.b = 0;
            this.b.a().q(e, null);
        }
        if (bpspVar.b().a()) {
            this.d.a().l().c(afwm.SATELLITE, bpspVar.b().b().booleanValue());
        }
    }

    public final boolean a(bpsp bpspVar) {
        if (this.e == null) {
            this.e = g();
        }
        bpsp bpspVar2 = this.f;
        if (bpspVar2 == null) {
            h(bpspVar);
            return false;
        }
        h(bpspVar2);
        this.g = this.f;
        this.f = null;
        return true;
    }

    public final void b() {
        e(false);
        bpsp bpspVar = this.e;
        if (bpspVar != null) {
            h(bpspVar);
            if (!this.e.a().a()) {
                return;
            }
            this.b.a().g(this.e.a().b());
            return;
        }
        bvoo.h("RapMapStatePreserver onStop called with no saved state", new Object[0]);
    }

    public final void c(Bundle bundle) {
        bpsp bpspVar = this.e;
        if (bpspVar != null) {
            bundle.putSerializable("rap_first_start_map_state", bpspVar);
        }
        e(false);
        bundle.putSerializable("rap_stop_map_state", this.f);
    }

    public final void d(@dzsi Bundle bundle) {
        if (bundle != null) {
            this.e = (bpsp) bundle.getSerializable("rap_first_start_map_state");
            this.f = (bpsp) bundle.get("rap_stop_map_state");
        }
    }

    public final void e(boolean z) {
        if (this.f == null) {
            if (!z || this.b.a().p) {
                this.f = g();
            } else {
                this.f = this.g;
            }
        }
    }

    public final void f() {
        a(bpsp.c().a());
    }
}
