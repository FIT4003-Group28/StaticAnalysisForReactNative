package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.j.c;
import android.support.v7.view.menu.i;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuItemWrapperJB.java */
/* loaded from: classes.dex */
public class j extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, android.support.v4.d.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.support.v7.view.menu.i
    i.a a(ActionProvider actionProvider) {
        return new a(this.f745a, actionProvider);
    }

    /* compiled from: MenuItemWrapperJB.java */
    /* loaded from: classes.dex */
    class a extends i.a implements ActionProvider.VisibilityListener {

        /* renamed from: c  reason: collision with root package name */
        c.b f782c;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.v4.j.c
        public View a(MenuItem menuItem) {
            return this.f777a.onCreateActionView(menuItem);
        }

        @Override // android.support.v4.j.c
        public boolean b() {
            return this.f777a.overridesItemVisibility();
        }

        @Override // android.support.v4.j.c
        public boolean c() {
            return this.f777a.isVisible();
        }

        @Override // android.support.v4.j.c
        public void a(c.b bVar) {
            this.f782c = bVar;
            this.f777a.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f782c != null) {
                this.f782c.a(z);
            }
        }
    }
}
