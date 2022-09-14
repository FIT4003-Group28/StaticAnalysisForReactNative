package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
abstract class c<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    final Context f745a;

    /* renamed from: c  reason: collision with root package name */
    private Map<android.support.v4.d.a.b, MenuItem> f746c;

    /* renamed from: d  reason: collision with root package name */
    private Map<android.support.v4.d.a.c, SubMenu> f747d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, T t) {
        super(t);
        this.f745a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof android.support.v4.d.a.b) {
            android.support.v4.d.a.b bVar = (android.support.v4.d.a.b) menuItem;
            if (this.f746c == null) {
                this.f746c = new android.support.v4.i.a();
            }
            MenuItem menuItem2 = this.f746c.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            MenuItem a2 = o.a(this.f745a, bVar);
            this.f746c.put(bVar, a2);
            return a2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (subMenu instanceof android.support.v4.d.a.c) {
            android.support.v4.d.a.c cVar = (android.support.v4.d.a.c) subMenu;
            if (this.f747d == null) {
                this.f747d = new android.support.v4.i.a();
            }
            SubMenu subMenu2 = this.f747d.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            SubMenu a2 = o.a(this.f745a, cVar);
            this.f747d.put(cVar, a2);
            return a2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.f746c != null) {
            this.f746c.clear();
        }
        if (this.f747d != null) {
            this.f747d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.f746c == null) {
            return;
        }
        Iterator<android.support.v4.d.a.b> it = this.f746c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.f746c == null) {
            return;
        }
        Iterator<android.support.v4.d.a.b> it = this.f746c.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
