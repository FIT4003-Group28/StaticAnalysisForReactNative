package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byyu  reason: default package */
/* loaded from: classes4.dex */
public final class byyu extends itb implements byzd {
    @dzsi
    byzb b;
    private final cqkj c;
    private final eff d;
    private final Executor e;
    private final gga f;
    private final dxio<byyp> g;
    private final bzgl h;
    private final dxio<cjmt> i;
    private final dxio<afha> j;
    private final cqat k;
    @dzsi
    private amub s;
    final bzgj a = new bzgj();
    @dzsi
    private View o = null;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;

    public byyu(cqkj cqkjVar, Executor executor, eff effVar, bzgl bzglVar, gga ggaVar, dxio<byyp> dxioVar, dxio<cjmt> dxioVar2, dxio<afha> dxioVar3, cqat cqatVar) {
        this.c = cqkjVar;
        this.e = executor;
        this.d = effVar;
        this.h = bzglVar;
        this.f = ggaVar;
        this.g = dxioVar;
        this.i = dxioVar2;
        this.j = dxioVar3;
        this.k = cqatVar;
    }

    static final View l(View view) {
        View a = cqhu.a(view, byza.a);
        dbsk.t(a, "Failed to find view with the expected id token.");
        return a;
    }

    private final boolean m() {
        amub amubVar = this.s;
        return this.q && amubVar != null && this.g.a().c().c(amubVar);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        if (!this.h.d()) {
            return;
        }
        this.b = new byzc(this.f, this.i.a(), this.g.a(), this.j, this.k);
        if (this.a.c()) {
            this.g.a().d(new bzgf(this) { // from class: byyt
                private final byyu a;

                {
                    this.a = this;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    this.a.j();
                }
            }, this.a, this.e);
        }
        j();
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        if (!this.h.d()) {
            return;
        }
        this.a.b();
        if (!this.p) {
            return;
        }
        k();
    }

    @Override // defpackage.byzd
    public final void e(amub amubVar) {
        bvrj.UI_THREAD.c();
        this.r = false;
        if (!this.h.d()) {
            return;
        }
        this.q = true;
        this.s = amubVar;
        j();
    }

    @Override // defpackage.byzd
    public final void f() {
        bvrj.UI_THREAD.c();
        if (!this.h.d()) {
            return;
        }
        this.q = false;
        this.s = null;
        j();
    }

    @Override // defpackage.byzd
    public final void i() {
        this.r = true;
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (this.g.a().c().h() != bzdj.STARTED || this.r) {
            if (!this.p) {
                return;
            }
            k();
        } else if (!this.p) {
            if (!m()) {
                if (!w()) {
                    return;
                }
                cqkf d = this.c.d(new byza(), this.d.a(), false);
                byzb byzbVar = this.b;
                if (byzbVar != null) {
                    d.e(byzbVar);
                }
                View c = d.c();
                this.o = c;
                c.setTag("TRANSIT_GUIDANCE_HEADER");
                this.d.e(efe.CURRENT_TRIP_BANNER, this.o);
                l(this.o);
                this.p = true;
                return;
            }
            k();
        } else if (m()) {
            k();
        } else {
            byzb byzbVar2 = this.b;
            if (byzbVar2 == null) {
                return;
            }
            cqkx.p(byzbVar2);
        }
    }

    final void k() {
        View findViewWithTag = this.d.a().findViewWithTag("TRANSIT_GUIDANCE_HEADER");
        View view = this.o;
        if (view == null || findViewWithTag == null || !findViewWithTag.equals(view)) {
            return;
        }
        l(this.o).setAnimation(null);
        this.d.d(efe.CURRENT_TRIP_BANNER);
        this.p = false;
    }
}
