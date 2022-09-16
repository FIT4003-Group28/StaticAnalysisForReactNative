package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ahyz  reason: default package */
/* loaded from: classes.dex */
public class ahyz {
    public boolean A;
    public boolean B;
    public boolean C;
    public ahhw D;
    public aika E;
    public Map F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J  reason: collision with root package name */
    public long f48J;
    public long K;
    public FormatStreamModel[] M;
    public final ahyy O;
    public final ahyw P;
    public final ahyv Q;
    private final ahxx a;
    private aypg b;
    public final airr r;
    public final ahyp s;
    public final adzz t;
    public final ScheduledExecutorService u;
    public final Executor v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object L = new Object();
    public final ahyt N = new ahyt(this);

    public ahyz(airr airrVar, ahxx ahxxVar, ahyp ahypVar, adzz adzzVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.r = airrVar;
        ahypVar.getClass();
        this.s = ahypVar;
        adzzVar.getClass();
        this.t = adzzVar;
        scheduledExecutorService.getClass();
        this.u = scheduledExecutorService;
        executor.getClass();
        this.v = executor;
        this.a = ahxxVar;
        this.O = new ahyy(this);
        this.P = new ahyw(this);
        this.Q = new ahyv(this);
    }

    private final boolean g() {
        return this.a != null;
    }

    public final void a() {
        this.s.nf();
    }

    public final void b() {
        if (!g() || this.b != null) {
            return;
        }
        this.a.d();
        this.b = this.a.a().G(aypa.a()).aa(new ayqb() { // from class: ahyq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahyz.this.s.nO(((ahxu) obj).a);
            }
        }, ahqs.m);
        d();
    }

    public final void c() {
        if (!g() || this.b == null) {
            return;
        }
        this.a.c();
        azof.f((AtomicReference) this.b);
        this.b = null;
    }

    public final void d() {
        if (g()) {
            this.a.b();
        }
    }

    public final void e() {
        ahhw ahhwVar = this.D;
        if (ahhwVar == null) {
            return;
        }
        boolean z = false;
        if (ahhwVar.l() && this.D.b() != null && this.D.b().G()) {
            z = true;
        }
        if (this.E == aika.PLAYBACK_INTERRUPTED) {
            return;
        }
        if (this.E.h()) {
            if (!this.w || this.D.k() != null) {
                this.s.l(this.w ? ControlsOverlayStyle.j : ControlsOverlayStyle.i);
            } else {
                this.s.l(ControlsOverlayStyle.m);
            }
        } else if (!this.E.c(aika.READY)) {
        } else {
            if (this.w) {
                if (!this.D.l()) {
                    if (!this.C) {
                        if (this.z) {
                            this.s.l(ControlsOverlayStyle.e);
                            return;
                        } else {
                            this.s.l(ControlsOverlayStyle.f);
                            return;
                        }
                    }
                    this.s.l(this.B ? ControlsOverlayStyle.b : ControlsOverlayStyle.c);
                    return;
                }
                this.s.l(z ? ControlsOverlayStyle.h : ControlsOverlayStyle.g);
            } else if (!this.D.l()) {
                if (!this.C) {
                    if (this.z) {
                        this.s.l(ControlsOverlayStyle.d);
                        return;
                    } else {
                        this.s.l(ControlsOverlayStyle.a);
                        return;
                    }
                }
                this.s.l(this.B ? ControlsOverlayStyle.b : ControlsOverlayStyle.c);
            } else {
                this.s.l(z ? ControlsOverlayStyle.l : ControlsOverlayStyle.k);
            }
        }
    }

    public final void f() {
        this.s.o(this.G, this.H, this.I, Math.min(Math.max(this.f48J, this.K), this.I));
    }
}
