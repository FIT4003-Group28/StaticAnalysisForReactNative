package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: sm  reason: default package */
/* loaded from: classes4.dex */
final class sm implements MenuItem.OnActionExpandListener {
    final /* synthetic */ so a;
    private final MenuItem.OnActionExpandListener b;

    public sm(so soVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = soVar;
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
