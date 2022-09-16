package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* compiled from: PG */
/* renamed from: sk  reason: default package */
/* loaded from: classes4.dex */
final class sk extends sj implements ActionProvider.VisibilityListener {
    private sh c;

    public sk(ActionProvider actionProvider) {
        super(actionProvider);
    }

    @Override // defpackage.jp
    public final View b(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    @Override // defpackage.jp
    public final boolean e() {
        return this.b.isVisible();
    }

    @Override // defpackage.jp
    public final boolean g() {
        return this.b.overridesItemVisibility();
    }

    @Override // defpackage.jp
    public final void h(sh shVar) {
        this.c = shVar;
        this.b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        sh shVar = this.c;
        if (shVar != null) {
            shVar.a.j.C();
        }
    }
}
