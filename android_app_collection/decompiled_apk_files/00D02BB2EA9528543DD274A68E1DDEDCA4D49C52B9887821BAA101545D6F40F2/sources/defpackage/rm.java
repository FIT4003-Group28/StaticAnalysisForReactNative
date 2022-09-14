package defpackage;

import android.view.Menu;
import android.view.MenuItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public final class rm implements uc {
    final /* synthetic */ rv a;
    private final uc b;

    public rm(rv rvVar, uc ucVar) {
        this.a = rvVar;
        this.b = ucVar;
    }

    @Override // defpackage.uc
    public final boolean a(ud udVar, Menu menu) {
        uh uhVar = (uh) this.b;
        return uhVar.a.onCreateActionMode(uhVar.f(udVar), uhVar.e(menu));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uc
    public final boolean b(ud udVar, MenuItem menuItem) {
        uh uhVar = (uh) this.b;
        return uhVar.a.onActionItemClicked(uhVar.f(udVar), new vo(uhVar.b, menuItem));
    }

    @Override // defpackage.uc
    public final void c(ud udVar) {
        uh uhVar = (uh) this.b;
        uhVar.a.onDestroyActionMode(uhVar.f(udVar));
        rv rvVar = this.a;
        if (rvVar.o != null) {
            rvVar.h.getDecorView().removeCallbacks(this.a.p);
        }
        rv rvVar2 = this.a;
        if (rvVar2.n != null) {
            rvVar2.B();
            rv rvVar3 = this.a;
            oi B = od.B(rvVar3.n);
            B.b(0.0f);
            rvVar3.q = B;
            this.a.q.f(new rl(this));
        }
        rv rvVar4 = this.a;
        rvVar4.m = null;
        od.L(rvVar4.s);
    }

    @Override // defpackage.uc
    public final void d(ud udVar, Menu menu) {
        od.L(this.a.s);
        uh uhVar = (uh) this.b;
        uhVar.a.onPrepareActionMode(uhVar.f(udVar), uhVar.e(menu));
    }
}
