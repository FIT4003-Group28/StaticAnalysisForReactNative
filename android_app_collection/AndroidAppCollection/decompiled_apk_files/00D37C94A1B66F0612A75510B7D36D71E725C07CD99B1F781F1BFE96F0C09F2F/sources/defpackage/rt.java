package defpackage;

import android.content.Context;
import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: rt  reason: default package */
/* loaded from: classes4.dex */
class rt {
    final Context a;
    public agd b;

    public rt(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof hw) {
            hw hwVar = (hw) menuItem;
            if (this.b == null) {
                this.b = new agd();
            }
            MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            so soVar = new so(this.a, hwVar);
            this.b.put(hwVar, soVar);
            return soVar;
        }
        return menuItem;
    }
}
