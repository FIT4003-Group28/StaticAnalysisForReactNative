package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: uh  reason: default package */
/* loaded from: classes.dex */
public final class uh implements uc {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList<ui> c = new ArrayList<>();
    final aim<Menu, Menu> d = new aim<>();

    public uh(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.uc
    public final boolean a(ud udVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.uc
    public final boolean b(ud udVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.uc
    public final void c(ud udVar) {
        throw null;
    }

    @Override // defpackage.uc
    public final void d(ud udVar, Menu menu) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu e(Menu menu) {
        Menu menu2 = this.d.get(menu);
        if (menu2 == null) {
            vw vwVar = new vw(this.b, menu);
            this.d.put(menu, vwVar);
            return vwVar;
        }
        return menu2;
    }

    public final ActionMode f(ud udVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ui uiVar = this.c.get(i);
            if (uiVar != null && uiVar.b == udVar) {
                return uiVar;
            }
        }
        ui uiVar2 = new ui(this.b, udVar);
        this.c.add(uiVar2);
        return uiVar2;
    }
}
