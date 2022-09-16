package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nfq  reason: default package */
/* loaded from: classes3.dex */
public final class nfq implements nfk {
    public final Activity a;
    public final gck b;
    public final eo c;
    public final acth d;
    public final fyy e;
    public final gbq f;
    public final ezh g;
    public final yzm h;
    public final azpx i = azpm.e().aO();
    public final nfp j;
    public SwipeToContainerFrameLayout k;
    public FrameLayout l;
    public apzg m;
    public boolean n;
    public apzg o;
    public boolean p;
    public hml q;
    public Object r;
    public final yel s;
    public final gcc t;
    private final SharedPreferences u;
    private final eze v;
    private final airr w;
    private final aynx x;

    public nfq(oa oaVar, SharedPreferences sharedPreferences, gck gckVar, eo eoVar, fyy fyyVar, acth acthVar, ezh ezhVar, gbq gbqVar, fqd fqdVar, yzm yzmVar, eze ezeVar, gcc gccVar, yel yelVar, airr airrVar, airw airwVar) {
        oaVar.getSavedStateRegistry().b("swipe_to_camera_bundle", new bli() { // from class: nfl
            @Override // defpackage.bli
            public final Bundle a() {
                nfq nfqVar = nfq.this;
                Bundle bundle = new Bundle(1);
                apzg apzgVar = nfqVar.m;
                if (apzgVar != null) {
                    bundle.putByteArray("on_swipe_left_endpoint", apzgVar.toByteArray());
                }
                return bundle;
            }
        });
        Bundle a = oaVar.getSavedStateRegistry().a("swipe_to_camera_bundle");
        this.a = oaVar;
        this.u = sharedPreferences;
        this.b = gckVar;
        this.c = eoVar;
        this.e = fyyVar;
        this.d = acthVar;
        this.g = ezhVar;
        this.f = gbqVar;
        this.h = yzmVar;
        apzg apzgVar = null;
        byte[] byteArray = a != null ? a.getByteArray("on_swipe_left_endpoint") : null;
        if (byteArray != null) {
            try {
                apzgVar = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
            } catch (aopx unused) {
            }
        }
        this.m = apzgVar;
        this.v = ezeVar;
        this.j = new nfp(this);
        this.t = gccVar;
        this.s = yelVar;
        this.w = airrVar;
        this.x = airwVar.aa();
        fqdVar.g(new nfo(this));
    }

    private final void u() {
        if (this.m == null) {
            FrameLayout frameLayout = this.l;
            if (frameLayout == null) {
                return;
            }
            SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
            swipeToContainerFrameLayout.f = null;
            swipeToContainerFrameLayout.removeView(frameLayout);
            this.l = null;
        } else if (this.l != null) {
        } else {
            SwipeToContainerFrameLayout swipeToContainerFrameLayout2 = this.k;
            if (!swipeToContainerFrameLayout2.h) {
                return;
            }
            swipeToContainerFrameLayout2.f = this;
            LayoutInflater.from(this.a).inflate(R.layout.swipe_to_camera_container, this.k);
            this.l = (FrameLayout) this.k.findViewById(R.id.swipe_to_camera_container);
        }
    }

    @Override // defpackage.ezi
    public final boolean a(apzg apzgVar) {
        this.o = apzgVar;
        return this.l != null && this.k.f();
    }

    @Override // defpackage.nfk
    public final eo b() {
        hml hmlVar = this.q;
        if (hmlVar == null) {
            return null;
        }
        return hmlVar.mL();
    }

    @Override // defpackage.hmn
    public final void c() {
        this.p = true;
        t();
    }

    @Override // defpackage.nfk
    public final ayoi d() {
        return this.i.R();
    }

    @Override // defpackage.nfk
    public final void e() {
        this.k = (SwipeToContainerFrameLayout) this.a.findViewById(R.id.slim_status_bar_player_container);
        this.j.a();
        this.i.c(new sev(1));
        u();
        if (this.k.h) {
            hml hmlVar = (hml) this.c.f("creation_fragment");
            this.q = hmlVar;
            if (hmlVar != null) {
                hmlVar.as = this;
                this.r = this.t.c(1);
            }
        }
        final nfp nfpVar = this.j;
        nfpVar.getClass();
        final aypv aypvVar = new aypv() { // from class: nfm
            @Override // defpackage.aypv
            public final void a() {
                nfp.this.run();
            }
        };
        this.x.C(lyd.q).u(kth.q).Z(new ayqb() { // from class: nfn
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                aypv.this.a();
            }
        });
    }

    @Override // defpackage.hmn
    public final void f() {
        this.h.o(2);
    }

    @Override // defpackage.nfk
    public final void g(apzg apzgVar) {
        if (!hml.bb(apzgVar)) {
            this.m = null;
            t();
            u();
            return;
        }
        this.m = apzgVar;
        u();
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
        if (swipeToContainerFrameLayout.h) {
            return;
        }
        SharedPreferences sharedPreferences = this.u;
        if (swipeToContainerFrameLayout.i || sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean("enable_swipe_container", true).apply();
        swipeToContainerFrameLayout.i = true;
    }

    @Override // defpackage.nfk
    public final void h(Rect rect) {
        this.k.g.set(rect);
    }

    @Override // defpackage.nfk
    public final void i(int i, int i2, int i3, int i4) {
        if (this.l == null) {
            return;
        }
        if (this.v.b() == null || this.v.b().d() == 0) {
            i2 = 0;
        }
        this.l.setPadding(i, i2, i3, i4);
    }

    @Override // defpackage.nfk
    public final boolean j() {
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.k;
        return swipeToContainerFrameLayout != null && swipeToContainerFrameLayout.h;
    }

    @Override // defpackage.nfk
    public final boolean k() {
        hml hmlVar = this.q;
        if (hmlVar == null) {
            return t();
        }
        return hmlVar.bd();
    }

    @Override // defpackage.nfk
    public final boolean l(int i, KeyEvent keyEvent) {
        hml hmlVar;
        return this.n && (hmlVar = this.q) != null && hmlVar.ar.a(i, keyEvent);
    }

    @Override // defpackage.nfk
    public final boolean m(int i) {
        hml hmlVar;
        return this.n && (hmlVar = this.q) != null && hmlVar.ar.b(i);
    }

    @Override // defpackage.nfk
    public final boolean p(int i) {
        hml hmlVar;
        return this.n && (hmlVar = this.q) != null && hmlVar.ar.c(i);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar != ezx.NONE) {
            t();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void q(int i, float f) {
        nfp nfpVar = this.j;
        nfpVar.d = i;
        nfpVar.c = f;
        nfpVar.a = true;
        if (this.q == null) {
            this.b.i(3);
            this.r = this.t.c(1);
            this.e.h(2);
        }
        if (!this.w.O()) {
            this.j.run();
        }
    }

    @Override // defpackage.nfr
    public final void r(int i, float f) {
        s(f >= 0.5f);
        q(i, f);
    }

    public final void s(boolean z) {
        yzm yzmVar = this.h;
        int i = 1;
        if (true == z) {
            i = 2;
        }
        yzmVar.k(i);
    }

    public final boolean t() {
        return this.l != null && this.k.c();
    }
}
