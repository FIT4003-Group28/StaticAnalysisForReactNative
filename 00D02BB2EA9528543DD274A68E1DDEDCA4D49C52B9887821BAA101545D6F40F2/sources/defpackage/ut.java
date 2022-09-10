package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* compiled from: PG */
/* renamed from: ut  reason: default package */
/* loaded from: classes7.dex */
class ut {
    final Context a;
    public aim<kz, MenuItem> b;
    public aim<la, SubMenu> c;

    public ut(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof kz) {
            kz kzVar = (kz) menuItem;
            if (this.b == null) {
                this.b = new aim<>();
            }
            MenuItem menuItem2 = this.b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            vo voVar = new vo(this.a, kzVar);
            this.b.put(kzVar, voVar);
            return voVar;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu b(SubMenu subMenu) {
        if (subMenu instanceof la) {
            la laVar = (la) subMenu;
            if (this.c == null) {
                this.c = new aim<>();
            }
            SubMenu subMenu2 = this.c.get(laVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            wc wcVar = new wc(this.a, laVar);
            this.c.put(laVar, wcVar);
            return wcVar;
        }
        return subMenu;
    }
}
