package android.support.v4.j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f504a;

    /* renamed from: b  reason: collision with root package name */
    private a f505b;

    /* renamed from: c  reason: collision with root package name */
    private b f506c;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    public abstract View a();

    public void a(SubMenu subMenu) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public c(Context context) {
        this.f504a = context;
    }

    public View a(MenuItem menuItem) {
        return a();
    }

    public void a(boolean z) {
        if (this.f505b != null) {
            this.f505b.a(z);
        }
    }

    public void a(a aVar) {
        this.f505b = aVar;
    }

    public void a(b bVar) {
        if (this.f506c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f506c = bVar;
    }

    public void f() {
        this.f506c = null;
        this.f505b = null;
    }
}
