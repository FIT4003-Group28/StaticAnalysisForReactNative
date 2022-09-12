package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wc  reason: default package */
/* loaded from: classes7.dex */
public final class wc extends vw implements SubMenu {
    private final la d;

    public wc(Context context, la laVar) {
        super(context, laVar);
        this.d = laVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.d.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(this.d.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.d.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.d.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.d.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.d.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.d.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }
}
