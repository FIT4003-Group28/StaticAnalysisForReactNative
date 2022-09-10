package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: vn  reason: default package */
/* loaded from: classes7.dex */
final class vn implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ vo a;
    private final MenuItem.OnMenuItemClickListener b;

    public vn(vo voVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = voVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
