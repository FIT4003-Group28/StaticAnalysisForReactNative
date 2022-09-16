package defpackage;

import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
/* compiled from: PG */
/* renamed from: kjk  reason: default package */
/* loaded from: classes3.dex */
public final class kjk implements fdy, fze, ezg, ezc, feg, ahzu {
    public final kjg a;
    public final PlaybackLifecycleMonitor b;
    public final feh c;
    public kjf d;
    public boolean e;
    public boolean f;
    public ezh g;
    private final yni h;
    private final airw i;
    private kjf m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final aacz q;
    private final jvo r;
    private final kjj k = new kjj(this);
    private final kjh l = new kjh(this);
    private final aypf j = new aypf();

    public kjk(kjg kjgVar, PlaybackLifecycleMonitor playbackLifecycleMonitor, feh fehVar, yni yniVar, airw airwVar, aacz aaczVar, jvo jvoVar) {
        this.a = kjgVar;
        this.b = playbackLifecycleMonitor;
        this.c = fehVar;
        this.h = yniVar;
        this.i = airwVar;
        this.q = aaczVar;
        this.r = jvoVar;
    }

    @Override // defpackage.ezc
    public final void a(ezw ezwVar, avhn avhnVar) {
        if (ezwVar != null) {
            this.d = new kjf(ezwVar.c(), avhnVar);
            g();
        }
    }

    @Override // defpackage.fdy
    public final void d(int i) {
        if (i == 0) {
            this.d = null;
            g();
        } else if (i == 1) {
            this.n = false;
        }
        h();
    }

    @Override // defpackage.ahzu
    public final void e(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        h();
    }

    @Override // defpackage.ahzu
    public final void f(avhn avhnVar) {
        kjf kjfVar = this.d;
        if (kjfVar == null || avhnVar == null) {
            return;
        }
        this.d = new kjf(kjfVar.a, avhnVar);
        g();
    }

    public final void h() {
        int i = this.b.b;
        if (!this.e && !this.f && this.c.b && i != 1 && i != 5) {
            if (i == 3) {
                if (((jwi) this.r.get()).aT.c.E()) {
                    i = 3;
                }
            }
            if (!this.p && ((!this.o || i == 2 || i == 4) && !this.n)) {
                this.a.kT();
                return;
            }
        }
        this.a.kU();
    }

    @Override // defpackage.feg
    public final void kF() {
        if (eog.aq(this.q)) {
            this.j.c();
        } else {
            this.h.m(this.k);
        }
        this.h.m(this.l);
        h();
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        if (i == 0) {
            this.m = null;
        } else if (i != 2) {
        } else {
            this.m = new kjf(fypVar.b.f(), fypVar.b.e());
            g();
            h();
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        if (eog.aq(this.q)) {
            this.j.g(this.k.g(this.i));
        } else {
            this.h.g(this.k);
        }
        this.h.g(this.l);
        h();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        boolean z = this.o;
        boolean z2 = this.p;
        this.o = this.g.g().d();
        boolean z3 = this.g.g() == ezx.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
        this.p = z3;
        boolean z4 = this.o;
        if (z4 == z && z3 == z2) {
            return;
        }
        if (z4 != z) {
            g();
        }
        h();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void g() {
        kjf kjfVar;
        if (!this.o || (kjfVar = this.m) == null) {
            this.a.g(this.d);
        } else {
            this.a.g(kjfVar);
        }
    }
}
