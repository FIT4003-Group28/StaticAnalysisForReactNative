package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.SubMenu;
/* compiled from: MenuWrapperFactory.java */
/* loaded from: classes.dex */
public final class o {
    public static MenuItem a(Context context, android.support.v4.d.a.b bVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new j(context, bVar);
        }
        return new i(context, bVar);
    }

    public static SubMenu a(Context context, android.support.v4.d.a.c cVar) {
        return new t(context, cVar);
    }
}
