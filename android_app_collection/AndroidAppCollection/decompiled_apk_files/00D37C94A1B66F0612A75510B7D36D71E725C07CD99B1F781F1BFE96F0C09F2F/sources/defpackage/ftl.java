package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ftl  reason: default package */
/* loaded from: classes3.dex */
public final class ftl implements fud {
    public boolean a = false;
    public BottomUiContainer b;
    public fue c;
    private final ghj e;

    public ftl(aacz aaczVar, ghk ghkVar) {
        long j;
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (((atfwVar == null ? atfw.a : atfwVar).b & 32768) != 0) {
                atfw atfwVar2 = b.k;
                aufi aufiVar = (atfwVar2 == null ? atfw.a : atfwVar2).l;
                j = (aufiVar == null ? aufi.a : aufiVar).b;
                this.e = ghkVar.a(etk.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
            }
        }
        j = d;
        this.e = ghkVar.a(etk.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
    }

    private final int k() {
        fue fueVar = this.c;
        if (fueVar != null) {
            return fueVar.a();
        }
        return 0;
    }

    @Override // defpackage.fud
    public final BottomUiContainer a() {
        return this.b;
    }

    @Override // defpackage.fud
    public final fue b() {
        return this.c;
    }

    @Override // defpackage.fud
    public final void c(boolean z) {
        int k = k();
        if (k == 1) {
            if (!z) {
                return;
            }
        } else if (k == 0) {
            return;
        }
        this.b.i(3);
    }

    @Override // defpackage.fud
    public final void d(BottomUiContainer bottomUiContainer) {
        if (this.a) {
            return;
        }
        this.a = true;
        bottomUiContainer.getClass();
        this.b = bottomUiContainer;
    }

    @Override // defpackage.fud
    public final void e(fue fueVar) {
    }

    @Override // defpackage.fud
    public final void f() {
        this.c = null;
    }

    @Override // defpackage.fud
    public final void g(fue fueVar) {
        this.c = fueVar;
        if (fueVar.b()) {
            this.e.a();
        }
    }

    @Override // defpackage.fud
    public final void h(int i) {
        zgd.t(this.b, zgd.e(i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.fud
    public final void i(fub fubVar) {
        this.b.a = fubVar;
    }

    @Override // defpackage.fud
    public final boolean j(fue fueVar) {
        return (fueVar.a() == 1 || k() != 1) && !(fueVar.b() && !this.e.b());
    }
}
