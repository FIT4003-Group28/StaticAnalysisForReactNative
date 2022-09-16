package defpackage;

import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
/* compiled from: PG */
/* renamed from: nuf  reason: default package */
/* loaded from: classes3.dex */
public final class nuf implements oak, oar, fdn, fdy, xgn {
    static final nva a = new nue(1, 1.777f, 1.777f);
    public boolean b;
    private final nuw c;
    private final fdo d;
    private final xgp e;
    private final PlaybackLifecycleMonitor f;
    private final boolean g;
    private Float h;
    private Float i;
    private String j;
    private float k;
    private boolean l;
    private boolean m;

    public nuf(fdo fdoVar, xgp xgpVar, PlaybackLifecycleMonitor playbackLifecycleMonitor, aacz aaczVar, nuw nuwVar) {
        this.d = fdoVar;
        this.e = xgpVar;
        this.f = playbackLifecycleMonitor;
        this.c = nuwVar;
        asxj asxjVar = aaczVar.b().e;
        boolean z = false;
        if ((asxjVar == null ? asxj.a : asxjVar).co) {
            asxj asxjVar2 = aaczVar.b().e;
            if ((asxjVar2 == null ? asxj.a : asxjVar2).cp) {
                z = true;
            }
        }
        this.g = z;
    }

    private final void f() {
        float floatValue;
        if (this.l) {
            float f = this.k;
            g(f, f);
            return;
        }
        float f2 = this.k;
        if (f2 == 0.0f) {
            return;
        }
        Float f3 = this.i;
        if (f3 != null) {
            floatValue = f3.floatValue();
        } else {
            Float f4 = this.h;
            floatValue = f4 != null ? f4.floatValue() : f2;
        }
        g(f2, floatValue);
        this.h = null;
        this.i = null;
        this.m = true;
    }

    private final void g(float f, float f2) {
        if (ggs.h(f)) {
            this.c.h(a);
            this.c.A(f);
        } else {
            this.c.A(f);
            this.c.f(1);
        }
        this.c.G(f2, true, false);
    }

    @Override // defpackage.xgn
    public final /* synthetic */ void a(wxp wxpVar) {
    }

    @Override // defpackage.xgn
    public final void b(wxr wxrVar) {
        wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
        int ordinal = wxrVar.a().ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                return;
            }
            this.l = false;
            return;
        }
        this.l = true;
        if (wxrVar.b() != xdb.MID_ROLL) {
            return;
        }
        this.i = Float.valueOf(this.c.i);
    }

    @Override // defpackage.fdn
    public final void c(String str, float f) {
        String str2 = this.j;
        if (str != str2 && (str == null || str2 == null || str.length() != str2.length() || !str.equals(str2))) {
            return;
        }
        if (!this.l && ggs.f(this.k, f)) {
            return;
        }
        this.k = f;
        f();
    }

    @Override // defpackage.fdy
    public final void d(int i) {
        if (i != 2 || this.m) {
            return;
        }
        f();
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
        boolean h = oas.h(i2);
        if (oas.h(i) != h) {
            if (h) {
                this.e.b(this);
                this.f.i(this);
                return;
            }
            this.e.k(this);
            this.f.a.remove(this);
        }
    }

    @Override // defpackage.oak
    public final void pg(oan oanVar, oan oanVar2) {
        Float f = null;
        String c = oanVar != null ? oanVar.h.c() : null;
        String c2 = oanVar2 != null ? oanVar2.h.c() : null;
        this.l = false;
        this.i = null;
        this.m = false;
        if (c != null) {
            zew.N(this.d.a, c, this);
        }
        if (c2 != null) {
            this.k = this.d.e(c2);
            zew.M(this.d.a, c2, this);
            this.c.B(this.k, this.b && this.g);
            this.c.H(5, 3, false);
            if (this.b && this.g) {
                f = Float.valueOf(1.333f);
            }
            this.h = f;
        } else {
            g(1.777f, 1.777f);
            this.k = 0.0f;
        }
        this.j = c2;
    }
}
