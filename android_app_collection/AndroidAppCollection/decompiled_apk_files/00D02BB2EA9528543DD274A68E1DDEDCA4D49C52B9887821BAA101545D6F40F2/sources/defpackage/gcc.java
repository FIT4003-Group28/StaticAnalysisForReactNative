package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gcc  reason: default package */
/* loaded from: classes.dex */
public final class gcc implements gce {
    private final bvjj b;
    private final gcg c;
    private final hui d;
    private boolean h;
    private boolean f = false;
    public boolean a = true;
    private boolean g = false;
    private boolean i = false;
    private boolean j = false;
    private final crzo<Boolean> e = new crzo<>();

    public gcc(bvjj bvjjVar, gcg gcgVar, hui huiVar) {
        this.h = false;
        this.b = bvjjVar;
        this.c = gcgVar;
        this.d = huiVar;
        this.h = true;
    }

    private final boolean j(Activity activity) {
        boolean a = gct.a(activity.getResources().getConfiguration());
        boolean z = this.a;
        boolean z2 = z && a;
        if (z) {
            this.d.b(f(), z2);
        }
        if (z2 != this.f) {
            this.f = z2;
            if (f().equals(gcd.FOLLOW_SYSTEM) && !this.h && !this.g && !this.i && this.a) {
                ((ckco) this.d.b.a(ckjg.d)).a(this.f ? ckjb.a(1) : ckjb.a(2));
            }
            k(activity);
            if (!this.i && this.f && !this.j) {
                this.b.W(bvjk.C, Math.min(2, this.b.s(bvjk.C, 0) + 1));
                this.j = true;
            }
            this.e.b(Boolean.valueOf(this.f));
            cqkx.b();
            return true;
        }
        return false;
    }

    private static void k(Activity activity) {
        View findViewById = activity.findViewById(R.id.mainmap_container);
        if (findViewById instanceof gci) {
            ((gci) findViewById).NN();
        }
        View findViewById2 = activity.findViewById(R.id.header_container);
        if (findViewById2 != null) {
            View findViewById3 = findViewById2.findViewById(R.id.mod_app_bar);
            if (!(findViewById3 instanceof gci)) {
                return;
            }
            ((gci) findViewById3).NN();
        }
    }

    private static final void l(gcd gcdVar) {
        gcd gcdVar2 = gcd.FOLLOW_SYSTEM;
        int ordinal = gcdVar.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = -1;
        } else if (ordinal == 1) {
            i = 2;
        }
        rd.n(i);
    }

    @Override // defpackage.gce
    public final void a() {
        if (!this.c.a()) {
            rd.n(1);
        } else {
            l(f());
        }
    }

    @Override // defpackage.gce
    public final void b(Activity activity) {
        if (!this.c.a()) {
            return;
        }
        j(activity);
        this.h = false;
    }

    @Override // defpackage.gce
    public final void c() {
        if (!this.c.a()) {
            return;
        }
        this.d.a();
    }

    @Override // defpackage.gce
    public final void d(Activity activity) {
        if (!this.c.a()) {
            return;
        }
        j(activity);
    }

    @Override // defpackage.gce
    public final void e(gcd gcdVar) {
        if (!this.c.a()) {
            return;
        }
        this.b.ai(bvjk.B, gcdVar);
        this.g = true;
        l(gcdVar);
        this.g = false;
        if (!this.a) {
            return;
        }
        this.d.b(gcdVar, this.f);
    }

    @Override // defpackage.gce
    public final gcd f() {
        if (!this.c.a()) {
            return gcd.OFF;
        }
        return (gcd) this.b.H(bvjk.B, gcd.class, gcd.FOLLOW_SYSTEM);
    }

    @Override // defpackage.gce
    public final crzm<Boolean> g() {
        return this.e.a;
    }

    @Override // defpackage.gce
    public final boolean h() {
        return this.f;
    }

    @Override // defpackage.gce
    public final void i(boolean z, Activity activity) {
        if (!this.c.a() || this.a == z) {
            return;
        }
        this.a = z;
        this.i = true;
        if (!z) {
            this.d.a();
            l(gcd.OFF);
        } else {
            l(f());
        }
        boolean j = j(activity);
        if (z && !j) {
            k(activity);
        }
        this.i = false;
    }
}
