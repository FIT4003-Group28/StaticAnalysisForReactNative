package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ftj  reason: default package */
/* loaded from: classes3.dex */
public abstract class ftj implements akev {
    private final fud c;
    private final Handler d;
    private final fti e;
    private final azqb f;
    private final Set g = new CopyOnWriteArraySet();
    private akex h;
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    static final long a = TimeUnit.SECONDS.toMillis(4);

    public ftj(fud fudVar, Handler handler, azqb azqbVar, fti ftiVar) {
        this.c = fudVar;
        this.d = handler;
        this.e = ftiVar;
        this.f = azqbVar;
    }

    protected abstract fuf c(BottomUiContainer bottomUiContainer);

    public final akew d() {
        return (akew) this.f.get();
    }

    public final void e(akev akevVar) {
        this.g.add(akevVar);
        akex akexVar = this.h;
        if (akexVar != null) {
            akevVar.lf(akexVar);
        }
    }

    public final void f(akex akexVar) {
        g(akexVar, 3);
    }

    public final void g(akex akexVar, int i) {
        if (this.c.a() == null || akexVar == null || !akexVar.equals(this.h)) {
            return;
        }
        this.c.a().i(i);
    }

    public final void h(akev akevVar) {
        this.g.remove(akevVar);
    }

    public final void i(akex akexVar) {
        fue a2;
        amk amkVar;
        BottomUiContainer a3 = this.c.a();
        if (a3 == null || akexVar == null || !j(akexVar) || (a2 = this.e.a(akexVar)) == null || !this.c.j(a2)) {
            return;
        }
        ftr m = BottomUiContainer.m(this, akexVar);
        if (akexVar.k()) {
            m.b();
            m.a(3);
            return;
        }
        this.c.e(a2);
        a3.o(a2, c(a3), m);
        boolean k = k(akexVar);
        a3.j = k;
        if (k || (amkVar = a3.g) == null) {
            return;
        }
        amkVar.d();
    }

    protected boolean j(akex akexVar) {
        return true;
    }

    protected boolean k(akex akexVar) {
        return false;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akex akexVar = (akex) obj;
        this.h = null;
        this.c.f();
        akev h = akexVar.h();
        if (h != null) {
            h.le(akexVar, i);
        }
        for (akev akevVar : this.g) {
            akevVar.le(akexVar, i);
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        long j;
        final akex akexVar = (akex) obj;
        this.h = akexVar;
        this.c.g(this.e.a(akexVar));
        int f = akexVar.f();
        if (f != -2) {
            if (f == -1) {
                j = a;
            } else if (f != 0) {
                j = akexVar.f();
            } else {
                j = b;
            }
            this.d.postDelayed(new Runnable() { // from class: fth
                @Override // java.lang.Runnable
                public final void run() {
                    ftj.this.g(akexVar, 2);
                }
            }, j);
        }
        akev h = akexVar.h();
        if (h != null) {
            h.lf(akexVar);
        }
        for (akev akevVar : this.g) {
            akevVar.lf(akexVar);
        }
    }
}
