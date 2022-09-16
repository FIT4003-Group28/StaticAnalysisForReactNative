package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* compiled from: PG */
/* renamed from: vk  reason: default package */
/* loaded from: classes7.dex */
final class vk extends vj implements ActionProvider.VisibilityListener {
    private vh d;

    public vk(vo voVar, Context context, ActionProvider actionProvider) {
        super(voVar, actionProvider);
    }

    @Override // defpackage.nf
    public final View b(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    @Override // defpackage.nf
    public final boolean c() {
        return this.b.overridesItemVisibility();
    }

    @Override // defpackage.nf
    public final boolean d() {
        return this.b.isVisible();
    }

    @Override // defpackage.nf
    public final void h(vh vhVar) {
        this.d = vhVar;
        this.b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        vh vhVar = this.d;
        if (vhVar != null) {
            vhVar.a.j.C();
        }
    }
}
