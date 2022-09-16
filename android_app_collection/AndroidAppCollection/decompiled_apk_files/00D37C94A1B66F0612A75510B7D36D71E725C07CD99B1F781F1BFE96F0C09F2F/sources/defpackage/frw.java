package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.youtube.R;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: frw  reason: default package */
/* loaded from: classes3.dex */
public final class frw {
    private final oa a;
    private final agbz b;
    private final SparseArray c = new SparseArray();
    private int d;
    private boolean e;

    public frw(oa oaVar, agbz agbzVar) {
        this.a = oaVar;
        this.b = agbzVar;
    }

    public final synchronized void a(fry fryVar) {
        fryVar.getClass();
        int g = fryVar.g();
        if (this.c.get(g) != fryVar) {
            this.c.put(g, fryVar);
            this.a.supportInvalidateOptionsMenu();
        }
    }

    public final synchronized void b(Menu menu) {
        for (int i = 0; i < menu.size(); i++) {
            fry fryVar = (fry) this.c.get(menu.getItem(i).getItemId());
            if (fryVar != null) {
                fryVar.k();
            }
        }
    }

    public final synchronized void c(Collection collection) {
        this.c.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fry fryVar = (fry) it.next();
            this.c.put(fryVar.g(), fryVar);
        }
        this.a.supportInvalidateOptionsMenu();
    }

    public final void d(int i) {
        boolean z = this.e;
        if (!z || this.d != i) {
            this.d = i;
            if (z) {
                this.a.supportInvalidateOptionsMenu();
            }
            this.e = true;
        }
    }

    public final synchronized boolean e(MenuItem menuItem) {
        fry fryVar = (fry) this.c.get(menuItem.getItemId());
        if (fryVar == null) {
            return false;
        }
        return fryVar.m();
    }

    public final synchronized void f(Menu menu, MenuInflater menuInflater, yzh yzhVar) {
        if (!this.e) {
            Context b = this.a.getSupportActionBar().b();
            b.getClass();
            d(zhn.j(b, R.attr.colorButtonNormal).orElse(0));
        }
        hxb.j(menu, menuInflater, yzhVar, this.c, this.d, this.b);
    }
}
