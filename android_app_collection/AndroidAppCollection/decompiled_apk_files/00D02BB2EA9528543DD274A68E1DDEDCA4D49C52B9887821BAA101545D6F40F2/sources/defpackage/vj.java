package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
/* compiled from: PG */
/* renamed from: vj  reason: default package */
/* loaded from: classes7.dex */
class vj extends nf {
    final ActionProvider b;
    final /* synthetic */ vo c;

    public vj(vo voVar, ActionProvider actionProvider) {
        this.c = voVar;
        this.b = actionProvider;
    }

    @Override // defpackage.nf
    public final View a() {
        return this.b.onCreateActionView();
    }

    @Override // defpackage.nf
    public final boolean e() {
        return this.b.onPerformDefaultAction();
    }

    @Override // defpackage.nf
    public final boolean f() {
        return this.b.hasSubMenu();
    }

    @Override // defpackage.nf
    public final void g(SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.b(subMenu));
    }
}
