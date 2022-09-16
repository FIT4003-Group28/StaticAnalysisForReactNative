package defpackage;

import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: icm  reason: default package */
/* loaded from: classes3.dex */
public final class icm implements airt, ynl {
    public ahia a = null;
    final /* synthetic */ ico b;

    public icm(ico icoVar) {
        this.b = icoVar;
    }

    public final void a(aikd aikdVar) {
        iet aF = this.b.aF();
        if (!aikdVar.a() || aF == null) {
            return;
        }
        aF.f.e();
    }

    public final void b(ahhx ahhxVar) {
        iet aF = this.b.aF();
        if (aF != null) {
            ico icoVar = this.b;
            if (icoVar.bf == null) {
                return;
            }
            boolean p = icoVar.af.p();
            boolean z = false;
            boolean z2 = !((this.b.bf.b & 8) != 0);
            if (aF.s && !aF.t && ahhxVar.f() >= 15000) {
                aF.t = true;
                aF.u = false;
                iet.i(aF.e, 1.0f, 200L, 0L);
            }
            ReelPlayerProgressPresenter reelPlayerProgressPresenter = aF.e;
            reelPlayerProgressPresenter.c = ahhxVar.e();
            reelPlayerProgressPresenter.a = ahhxVar.f();
            if (ahhxVar.j()) {
                reelPlayerProgressPresenter.b = SystemClock.elapsedRealtime();
            }
            reelPlayerProgressPresenter.c();
            if (this.b.aq.d()) {
                return;
            }
            idy idyVar = aF.n;
            if (z2 && !p) {
                z = true;
            }
            if (!z) {
                return;
            }
            long f = ahhxVar.f() - ahhxVar.e();
            if (f < 0) {
                return;
            }
            idj idjVar = (idj) idyVar;
            if (f >= idjVar.s || hqs.d(idjVar.e) || !idjVar.c.b()) {
                return;
            }
            if (!idjVar.t) {
                idjVar.t = true;
                idjVar.c.c();
            }
            hqs.c(idjVar.e, true);
            if (idjVar.x == null) {
                return;
            }
            idjVar.i.oi().u(new acte(idjVar.x), null);
            idjVar.x = null;
        }
    }

    public final void c(ahia ahiaVar) {
        ico icoVar;
        artv artvVar;
        this.a = null;
        iet aF = this.b.aF();
        if (aF != null) {
            int a = ahiaVar.a();
            if (a == 2) {
                aF.p = true;
                aF.f.b();
                aF.d.b();
                aF.e.d(false);
                aF.p();
            } else if (a == 3) {
                aF.e.d(true);
                aF.p();
            } else if (a == 5 || a == 6) {
                aF.d.e();
            }
        }
        int a2 = ahiaVar.a();
        if (a2 != 7) {
            if (a2 != 8) {
                return;
            }
            synchronized (this.b.bt) {
                ico icoVar2 = this.b;
                icoVar2.bw = true;
                icoVar2.aO();
            }
            this.b.aj.h(3);
            this.b.ba(new Runnable() { // from class: icl
                @Override // java.lang.Runnable
                public final void run() {
                    icm.this.b.av.b();
                }
            });
            return;
        }
        artv artvVar2 = this.b.bf;
        if (artvVar2 != null) {
            aulb b = aulb.b(artvVar2.j);
            if (b == null) {
                b = aulb.REEL_LOOP_BEHAVIOR_UNKNOWN;
            }
            if (b == aulb.REEL_LOOP_BEHAVIOR_REPEAT) {
                this.b.av.V(0L);
                boolean p = this.b.af.p();
                ico icoVar3 = this.b;
                if ((icoVar3.bf.b & 8) != 0 || p) {
                    return;
                }
                final ias iasVar = icoVar3.aq;
                if (!iasVar.d() || !iasVar.c.b() || iasVar.h) {
                    return;
                }
                AccessibilityManager accessibilityManager = iasVar.e;
                if (accessibilityManager == null || accessibilityManager.isTouchExplorationEnabled()) {
                    iasVar.a();
                    return;
                }
                if (!iasVar.h) {
                    iasVar.h = true;
                    iasVar.c.c();
                }
                hqs.c(iasVar.d, true);
                iasVar.c(false);
                if (iasVar.i > 0) {
                    iasVar.d.postDelayed(new Runnable() { // from class: iaq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ias.this.a();
                        }
                    }, iasVar.i);
                }
                if (iasVar.f == null || iasVar.a != 1) {
                    return;
                }
                iasVar.a = 3;
                iasVar.b.oi().u(new acte(iasVar.f), null);
                return;
            }
        }
        ico icoVar4 = this.b;
        if (icoVar4.bf != null) {
            if (!icoVar4.ax.b()) {
                this.b.bh(true, true);
                return;
            } else if (!this.b.aI().n || (artvVar = (icoVar = this.b).bf) == null || (artvVar.b & 8) != 0) {
                return;
            } else {
                icoVar.bg(iah.a(3), false);
                return;
            }
        }
        rzc rzcVar = icoVar4.bC;
        if (rzcVar != null && rzcVar.a.equals(ahiaVar.b())) {
            ico icoVar5 = this.b;
            icoVar5.bC = null;
            icoVar5.bg(iah.a(2), true);
            return;
        }
        this.a = ahiaVar;
        if (aF == null) {
            return;
        }
        aF.d.e();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().e.aa(new icc(this, 3), ick.a), airwVar.G().j.aa(new icc(this, 4), ick.a), airwVar.G().h.aa(new icc(this, 5), ick.a)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahhx) obj);
                return null;
            } else if (i == 1) {
                c((ahia) obj);
                return null;
            } else if (i == 2) {
                a((aikd) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhx.class, ahia.class, aikd.class};
    }
}
