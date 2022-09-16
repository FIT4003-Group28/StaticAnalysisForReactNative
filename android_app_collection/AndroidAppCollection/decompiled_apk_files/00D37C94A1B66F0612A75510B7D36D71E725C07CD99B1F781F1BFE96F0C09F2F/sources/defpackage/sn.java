package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: sn  reason: default package */
/* loaded from: classes4.dex */
final class sn implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ so a;
    private final MenuItem.OnMenuItemClickListener b;

    public sn(so soVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = soVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
