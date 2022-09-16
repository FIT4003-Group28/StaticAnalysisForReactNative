package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: okd  reason: default package */
/* loaded from: classes3.dex */
public final class okd implements ezg, fud {
    public final ftl a;
    public final Rect b;
    public final yzm c;
    private final ezh e;
    private final azqb f;
    private ezx g;
    private boolean h;

    public okd(ftl ftlVar, ezh ezhVar, yzm yzmVar, aynx aynxVar, azqb azqbVar) {
        this.a = ftlVar;
        this.e = ezhVar;
        this.c = yzmVar;
        aynxVar.Z(new ayqb() { // from class: okc
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                okd okdVar = okd.this;
                zaw zawVar = (zaw) obj;
                if (okdVar.a.b == null) {
                    return;
                }
                yzg yzgVar = zawVar.a.b;
                Rect rect = new Rect();
                if (okdVar.c.m()) {
                    rect.set(zawVar.a.a);
                } else if (okdVar.c.l() && !yzgVar.a.isEmpty()) {
                    rect.set(yzgVar.b(), yzgVar.d(), yzgVar.c(), yzgVar.a());
                }
                if (okdVar.b.equals(rect)) {
                    return;
                }
                okdVar.b.set(rect);
                okdVar.a.b.setPadding(okdVar.b.left, 0, okdVar.b.right, 0);
            }
        });
        this.b = new Rect();
        this.f = azqbVar;
        ezhVar.i(this);
    }

    private final void k(boolean z) {
        yzm yzmVar = this.c;
        if (yzmVar != null) {
            yzmVar.j(z);
        }
    }

    @Override // defpackage.fud
    public final BottomUiContainer a() {
        return this.a.b;
    }

    @Override // defpackage.fud
    public final fue b() {
        return this.a.c;
    }

    @Override // defpackage.fud
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.fud
    public final void d(BottomUiContainer bottomUiContainer) {
        ftl ftlVar = this.a;
        if (ftlVar.a) {
            return;
        }
        ftlVar.d(bottomUiContainer);
    }

    @Override // defpackage.fud
    public final void e(fue fueVar) {
        if (this.e.g().b()) {
            this.a.b.l(fueVar.c());
        }
    }

    @Override // defpackage.fud
    public final void f() {
        this.a.f();
        k(false);
    }

    @Override // defpackage.fud
    public final void g(fue fueVar) {
        this.a.g(fueVar);
        this.h = true;
        k(true);
    }

    @Override // defpackage.fud
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.fud
    public final void i(fub fubVar) {
        this.a.i(fubVar);
    }

    @Override // defpackage.fud
    public final boolean j(fue fueVar) {
        return this.a.j(fueVar) && !this.e.g().e();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        boolean b = ezxVar2.b();
        ezx ezxVar3 = ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        ezx ezxVar4 = ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        boolean z = false;
        boolean z2 = this.g != ezxVar2 && !this.h;
        if (b || (ezxVar == ezxVar3 && ezxVar2 != ezxVar4 && z2)) {
            c(false);
            ((srr) this.f.get()).a();
        }
        this.h = false;
        ftl ftlVar = this.a;
        fue fueVar = ftlVar.c;
        boolean z3 = fueVar != null && fueVar.c();
        BottomUiContainer bottomUiContainer = ftlVar.b;
        if (z3 || !b) {
            z = true;
        }
        bottomUiContainer.l(z);
        fue fueVar2 = this.a.c;
        if (fueVar2 != null && fueVar2.c()) {
            k(true);
        }
        if (!ezxVar2.l()) {
            this.g = ezxVar2;
        }
    }
}
