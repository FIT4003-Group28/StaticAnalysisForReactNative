package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: vm  reason: default package */
/* loaded from: classes7.dex */
final class vm implements MenuItem.OnActionExpandListener {
    final /* synthetic */ vo a;
    private final MenuItem.OnActionExpandListener b;

    public vm(vo voVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = voVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
