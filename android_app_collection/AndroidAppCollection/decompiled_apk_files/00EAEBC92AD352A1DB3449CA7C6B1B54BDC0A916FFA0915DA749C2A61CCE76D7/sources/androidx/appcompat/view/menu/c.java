package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f1016a;

    /* renamed from: b  reason: collision with root package name */
    private Map<a.g.g.a.b, MenuItem> f1017b;

    /* renamed from: c  reason: collision with root package name */
    private Map<a.g.g.a.c, SubMenu> f1018c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f1016a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof a.g.g.a.b) {
            a.g.g.a.b bVar = (a.g.g.a.b) menuItem;
            if (this.f1017b == null) {
                this.f1017b = new a.e.a();
            }
            MenuItem menuItem2 = this.f1017b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            k kVar = new k(this.f1016a, bVar);
            this.f1017b.put(bVar, kVar);
            return kVar;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (subMenu instanceof a.g.g.a.c) {
            a.g.g.a.c cVar = (a.g.g.a.c) subMenu;
            if (this.f1018c == null) {
                this.f1018c = new a.e.a();
            }
            SubMenu subMenu2 = this.f1018c.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            t tVar = new t(this.f1016a, cVar);
            this.f1018c.put(cVar, tVar);
            return tVar;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        Map<a.g.g.a.b, MenuItem> map = this.f1017b;
        if (map == null) {
            return;
        }
        Iterator<a.g.g.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Map<a.g.g.a.b, MenuItem> map = this.f1017b;
        if (map != null) {
            map.clear();
        }
        Map<a.g.g.a.c, SubMenu> map2 = this.f1018c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        Map<a.g.g.a.b, MenuItem> map = this.f1017b;
        if (map == null) {
            return;
        }
        Iterator<a.g.g.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
