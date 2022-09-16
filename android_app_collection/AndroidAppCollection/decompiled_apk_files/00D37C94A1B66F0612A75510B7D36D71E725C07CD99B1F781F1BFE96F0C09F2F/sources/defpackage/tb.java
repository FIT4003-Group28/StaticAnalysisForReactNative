package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: PG */
/* renamed from: tb  reason: default package */
/* loaded from: classes4.dex */
public final class tb extends sf implements SubMenu {
    public final sf j;
    public final si k;

    public tb(Context context, sf sfVar, si siVar) {
        super(context);
        this.j = sfVar;
        this.k = siVar;
    }

    @Override // defpackage.sf
    public final sf a() {
        return this.j.a();
    }

    @Override // defpackage.sf
    public final String d() {
        int i = this.k.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.k;
    }

    @Override // defpackage.sf
    public final void p(sd sdVar) {
        this.j.p(sdVar);
    }

    @Override // defpackage.sf, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.k.setIcon(i);
        return this;
    }

    @Override // defpackage.sf, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.j.setQwertyMode(z);
    }

    @Override // defpackage.sf
    public final boolean t(si siVar) {
        return this.j.t(siVar);
    }

    @Override // defpackage.sf
    public final boolean u(sf sfVar, MenuItem menuItem) {
        return super.u(sfVar, menuItem) || this.j.u(sfVar, menuItem);
    }

    @Override // defpackage.sf
    public final boolean v(si siVar) {
        return this.j.v(siVar);
    }

    @Override // defpackage.sf
    public final boolean w() {
        return this.j.w();
    }

    @Override // defpackage.sf
    public final boolean x() {
        return this.j.x();
    }

    @Override // defpackage.sf
    public final boolean y() {
        return this.j.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.k.setIcon(drawable);
        return this;
    }
}
