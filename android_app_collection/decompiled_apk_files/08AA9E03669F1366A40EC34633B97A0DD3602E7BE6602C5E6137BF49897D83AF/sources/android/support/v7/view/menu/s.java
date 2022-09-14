package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.g;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class s extends g implements SubMenu {

    /* renamed from: d  reason: collision with root package name */
    private g f796d;
    private h e;

    public s(Context context, g gVar, h hVar) {
        super(context);
        this.f796d = gVar;
        this.e = hVar;
    }

    @Override // android.support.v7.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f796d.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.g
    public boolean a() {
        return this.f796d.a();
    }

    @Override // android.support.v7.view.menu.g
    public boolean b() {
        return this.f796d.b();
    }

    public Menu p() {
        return this.f796d;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.e;
    }

    @Override // android.support.v7.view.menu.g
    public void a(g.a aVar) {
        this.f796d.a(aVar);
    }

    @Override // android.support.v7.view.menu.g
    public g m() {
        return this.f796d.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.g
    public boolean a(g gVar, MenuItem menuItem) {
        return super.a(gVar, menuItem) || this.f796d.a(gVar, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.d(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.c(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    @Override // android.support.v7.view.menu.g
    public boolean c(h hVar) {
        return this.f796d.c(hVar);
    }

    @Override // android.support.v7.view.menu.g
    public boolean d(h hVar) {
        return this.f796d.d(hVar);
    }
}
