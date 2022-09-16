package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.Observable;
import java.util.Observer;
/* compiled from: PG */
/* renamed from: iwb  reason: default package */
/* loaded from: classes3.dex */
public final class iwb implements Observer {
    private final adft a;
    private final iwa b;
    private MenuItem c;

    public iwb(adft adftVar, iwa iwaVar) {
        adftVar.getClass();
        this.a = adftVar;
        iwaVar.getClass();
        this.b = iwaVar;
        iwaVar.addObserver(this);
    }

    private static MediaRouteButton c(MenuItem menuItem) {
        return (MediaRouteButton) iy.c(menuItem);
    }

    public final void a() {
        MenuItem menuItem = this.b.a;
        MenuItem menuItem2 = this.c;
        if (menuItem2 == menuItem) {
            return;
        }
        if (menuItem2 != null) {
            b();
        }
        if (menuItem == null) {
            return;
        }
        this.a.addObserver(this);
        this.a.b(c(menuItem));
        this.b.d(this.a.j());
        this.c = menuItem;
    }

    public final void b() {
        MenuItem menuItem = this.c;
        if (menuItem == null) {
            return;
        }
        this.a.i(c(menuItem));
        this.a.deleteObserver(this);
        this.c = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        adft adftVar = this.a;
        if (observable == adftVar) {
            this.b.d(adftVar.j());
        } else if (observable != this.b) {
        } else {
            a();
        }
    }
}
