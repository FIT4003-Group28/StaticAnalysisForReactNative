package defpackage;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: ofo  reason: default package */
/* loaded from: classes3.dex */
public final class ofo implements ezg {
    public final ezh a;
    public final azqb b;
    public ViewGroup c;
    public azqb d;
    public final azpw e = azpw.Y();
    public final azpw f = azpw.Y();
    private final oet g;
    private final azqb h;
    private oeu i;

    public ofo(azqb azqbVar, oet oetVar, ezh ezhVar, azqb azqbVar2) {
        this.g = oetVar;
        this.a = ezhVar;
        this.h = azqbVar2;
        this.b = azqbVar;
    }

    public static boolean c(ezx ezxVar) {
        return ezxVar == ezx.WATCH_WHILE_MAXIMIZED || ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || ezxVar == ezx.WATCH_WHILE_MINIMIZED;
    }

    public final void a() {
        oeu oeuVar = this.i;
        oeu oeuVar2 = oeuVar;
        if (oeuVar == null) {
            oeuVar2 = this.d.get();
        }
        oeu oeuVar3 = this.i;
        if (oeuVar3 != null && oeuVar3 != oeuVar2) {
            CoordinatorLayout coordinatorLayout = ((DefaultWatchPanelViewController) oeuVar3).n;
            if (coordinatorLayout.getParent() != null) {
                this.c.removeView(coordinatorLayout);
                this.i.p(null);
            }
        }
        if (this.i != oeuVar2) {
            this.g.a = oeuVar2;
        }
        CoordinatorLayout coordinatorLayout2 = ((DefaultWatchPanelViewController) oeuVar2).n;
        if (coordinatorLayout2.getParent() == null) {
            this.c.addView(coordinatorLayout2);
        }
        this.i = oeuVar2;
        this.f.sh(oeuVar2);
        oeuVar2.p(((oez) this.h.get()).n().c);
    }

    public final void b() {
        a();
        oaj n = ((oez) this.h.get()).n();
        n.b.add(new ofm(this));
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!c(ezxVar)) {
            return;
        }
        b();
        this.a.j(this);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
