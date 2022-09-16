package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rh  reason: default package */
/* loaded from: classes4.dex */
public final class rh implements rd {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList c = new ArrayList();
    final agd d = new agd();

    public rh(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 == null) {
            sw swVar = new sw(this.b, menu);
            this.d.put(menu, swVar);
            return swVar;
        }
        return menu2;
    }

    @Override // defpackage.rd
    public final void a(re reVar) {
        this.a.onDestroyActionMode(e(reVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rd
    public final boolean b(re reVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(reVar), new so(this.b, menuItem));
    }

    @Override // defpackage.rd
    public final boolean c(re reVar, Menu menu) {
        return this.a.onCreateActionMode(e(reVar), f(menu));
    }

    @Override // defpackage.rd
    public final boolean d(re reVar, Menu menu) {
        return this.a.onPrepareActionMode(e(reVar), f(menu));
    }

    public final ActionMode e(re reVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ri riVar = (ri) this.c.get(i);
            if (riVar != null && riVar.b == reVar) {
                return riVar;
            }
        }
        ri riVar2 = new ri(this.b, reVar);
        this.c.add(riVar2);
        return riVar2;
    }
}
