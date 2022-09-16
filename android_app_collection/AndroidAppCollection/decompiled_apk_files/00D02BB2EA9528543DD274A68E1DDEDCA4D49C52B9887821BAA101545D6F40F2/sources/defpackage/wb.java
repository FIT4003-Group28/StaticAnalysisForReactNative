package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: PG */
/* renamed from: wb  reason: default package */
/* loaded from: classes7.dex */
public final class wb extends vf implements SubMenu {
    public final vf j;
    public final vi k;

    public wb(Context context, vf vfVar, vi viVar) {
        super(context);
        this.j = vfVar;
        this.k = viVar;
    }

    @Override // defpackage.vf
    public final boolean A(vi viVar) {
        return this.j.A(viVar);
    }

    @Override // defpackage.vf
    public final String f() {
        int i = this.k.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // defpackage.vf
    public final void g(vd vdVar) {
        this.j.g(vdVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.k;
    }

    @Override // defpackage.vf
    public final boolean i() {
        return this.j.i();
    }

    @Override // defpackage.vf
    public final boolean j() {
        return this.j.j();
    }

    @Override // defpackage.vf
    public final boolean k() {
        return this.j.k();
    }

    @Override // defpackage.vf
    public final boolean l(vf vfVar, MenuItem menuItem) {
        return super.l(vfVar, menuItem) || this.j.l(vfVar, menuItem);
    }

    @Override // defpackage.vf, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.k.setIcon(i);
        return this;
    }

    @Override // defpackage.vf, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.j.setQwertyMode(z);
    }

    @Override // defpackage.vf
    public final vf y() {
        return this.j.y();
    }

    @Override // defpackage.vf
    public final boolean z(vi viVar) {
        return this.j.z(viVar);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.k.setIcon(drawable);
        return this;
    }
}
