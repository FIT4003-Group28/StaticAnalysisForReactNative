package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
/* compiled from: PG */
/* renamed from: sj  reason: default package */
/* loaded from: classes4.dex */
class sj extends jp {
    final ActionProvider b;

    public sj(ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // defpackage.jp
    public final View a() {
        return this.b.onCreateActionView();
    }

    @Override // defpackage.jp
    public final void c(SubMenu subMenu) {
        this.b.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.jp
    public final boolean d() {
        return this.b.hasSubMenu();
    }

    @Override // defpackage.jp
    public final boolean f() {
        return this.b.onPerformDefaultAction();
    }
}
