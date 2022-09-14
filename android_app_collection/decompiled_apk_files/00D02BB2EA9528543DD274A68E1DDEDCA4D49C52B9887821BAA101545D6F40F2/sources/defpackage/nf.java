package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: PG */
/* renamed from: nf  reason: default package */
/* loaded from: classes7.dex */
public abstract class nf {
    public vh a;

    public abstract View a();

    public View b(MenuItem menuItem) {
        return a();
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(SubMenu subMenu) {
    }

    public void h(vh vhVar) {
        if (this.a != null) {
            String str = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?";
        }
        this.a = vhVar;
    }
}
