package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: fyy  reason: default package */
/* loaded from: classes3.dex */
public final class fyy implements AccessibilityManager.AccessibilityStateChangeListener, fqb, adny, fdv, fqc, ynl {
    public final Context a;
    public final fqd b;
    public final AccessibilityStateReceiver c;
    public final fdw d;
    public boolean f;
    private final yni g;
    private final fyx h;
    private final adoa i;
    private boolean k;
    private Boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    public final Set e = new HashSet();
    private final Set j = new HashSet();

    public fyy(Context context, adoa adoaVar, AccessibilityStateReceiver accessibilityStateReceiver, fqd fqdVar, yni yniVar, fyx fyxVar, fdw fdwVar) {
        this.a = context;
        this.b = fqdVar;
        this.g = yniVar;
        this.h = fyxVar;
        this.i = adoaVar;
        this.c = accessibilityStateReceiver;
        this.d = fdwVar;
    }

    private final void p(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        i();
    }

    @Override // defpackage.fqc
    public final void a() {
        this.m = false;
        this.i.i(this);
        i();
        this.g.m(this);
    }

    @Override // defpackage.fqc
    public final void b() {
        boolean z = true;
        this.m = true;
        this.i.g(this);
        if (this.i.e() == null) {
            z = false;
        }
        this.o = z;
        i();
        g(this.a.getResources().getConfiguration());
        this.g.g(this);
    }

    @Override // defpackage.fdv
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.fdv
    public final void d(boolean z) {
        this.n = false;
        i();
    }

    @Override // defpackage.fdv
    public final void e(boolean z) {
        this.n = true;
        i();
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        if (this.f != z) {
            this.f = z;
            i();
        }
    }

    public final void h(int i) {
        this.j.add(Integer.valueOf(i));
        i();
    }

    public final void i() {
        ylr.c();
        this.l = null;
        boolean o = o();
        if (this.q == o) {
            return;
        }
        this.q = o;
        for (mcn mcnVar : this.e) {
            mcnVar.d.p();
            if (o && mcnVar.g != null) {
                Handler handler = mcnVar.f;
                ScrollSelectionController scrollSelectionController = mcnVar.e;
                scrollSelectionController.getClass();
                handler.post(new mcm(scrollSelectionController));
            }
        }
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        p(false);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                fyw fywVar = (fyw) obj;
                i();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{fyw.class};
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        p(true);
    }

    public final void m(int i) {
        this.j.remove(Integer.valueOf(i));
        i();
    }

    public final void n(boolean z) {
        if (z != this.k) {
            this.k = z;
            i();
        }
    }

    public final boolean o() {
        Boolean bool = this.l;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        if (!this.m || !this.n || this.o || this.p || !this.j.isEmpty() || (this.k && (!this.f || !this.h.f()))) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.l = valueOf;
        return valueOf.booleanValue();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        i();
    }
}
