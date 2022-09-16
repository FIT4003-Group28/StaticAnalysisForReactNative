package defpackage;

import android.os.Build;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexp  reason: default package */
/* loaded from: classes.dex */
public final class aexp implements afng {
    final affj a;
    final aevy b;
    final aeyf c;
    final aexo d;
    public pht e;
    public aexv f;
    public aexs g;
    public att h;
    public int i;
    public int j;
    public int k = 0;
    public int l = 0;
    pxs m;
    public boolean n;
    public volatile SurfaceControl o;
    public volatile SurfaceControl.Transaction p;
    public volatile Surface q;
    public Surface r;
    boolean s;
    private final aevx t;
    private final pha u;
    private Future v;
    private final ScheduledExecutorService w;

    public aexp(pht phtVar, aevy aevyVar, ScheduledExecutorService scheduledExecutorService, affj affjVar, aeyf aeyfVar, aexv aexvVar, aexs aexsVar, att attVar, aexo aexoVar, aevx aevxVar, pha phaVar) {
        this.e = phtVar;
        this.b = aevyVar;
        this.w = scheduledExecutorService;
        this.a = affjVar;
        this.c = aeyfVar;
        this.f = aexvVar;
        this.g = aexsVar;
        this.h = attVar;
        this.d = aexoVar;
        this.t = aevxVar;
        this.u = phaVar;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:19:0x003b, B:21:0x0041, B:27:0x0053, B:29:0x0057, B:31:0x0062, B:40:0x007e, B:42:0x0082, B:44:0x008c, B:46:0x009b, B:48:0x009f, B:45:0x0094, B:49:0x00ac, B:30:0x005e, B:32:0x0068, B:34:0x006e, B:37:0x0077, B:14:0x002c, B:15:0x002f, B:17:0x0035), top: B:64:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:19:0x003b, B:21:0x0041, B:27:0x0053, B:29:0x0057, B:31:0x0062, B:40:0x007e, B:42:0x0082, B:44:0x008c, B:46:0x009b, B:48:0x009f, B:45:0x0094, B:49:0x00ac, B:30:0x005e, B:32:0x0068, B:34:0x006e, B:37:0x0077, B:14:0x002c, B:15:0x002f, B:17:0x0035), top: B:64:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:19:0x003b, B:21:0x0041, B:27:0x0053, B:29:0x0057, B:31:0x0062, B:40:0x007e, B:42:0x0082, B:44:0x008c, B:46:0x009b, B:48:0x009f, B:45:0x0094, B:49:0x00ac, B:30:0x005e, B:32:0x0068, B:34:0x006e, B:37:0x0077, B:14:0x002c, B:15:0x002f, B:17:0x0035), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean p(defpackage.afbi r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexp.p(afbi):java.lang.Boolean");
    }

    private final void q(afbi afbiVar, String str, Exception exc) {
        if (afbiVar != null) {
            afbiVar.b.g(new afkn(afkl.DEFAULT, str, this.d.g(), "c.MediaViewManager", exc, null));
        }
    }

    private final void r(pkd pkdVar, pxs pxsVar) {
        long k = this.b.s.k();
        pkc d = this.e.d(pkdVar);
        d.f(1);
        d.e(pxsVar);
        d.d();
        d.b(k);
    }

    private final boolean s(pxs pxsVar) {
        if (this.m != pxsVar) {
            r(this.h, pxsVar);
            r(this.g, pxsVar);
            this.m = pxsVar;
            return true;
        }
        return false;
    }

    private final boolean t(Surface surface) {
        String sb;
        if (this.r == surface) {
            return false;
        }
        pha phaVar = this.u;
        if (phaVar != null && surface == null) {
            phaVar.c.execute(new pgp(phaVar));
        }
        long k = this.b.s.k();
        pkc d = this.e.d(this.f);
        d.f(1);
        d.e(surface);
        d.d();
        d.b(k);
        affj affjVar = this.a;
        Surface surface2 = this.r;
        afte afteVar = afte.ANDROID_EXOPLAYER_V2;
        if (affjVar.a) {
            if (surface == null) {
                if (surface2 == null) {
                    sb = "oldsur.null";
                } else if (surface2.isValid()) {
                    int identityHashCode = System.identityHashCode(surface2);
                    StringBuilder sb2 = new StringBuilder(35);
                    sb2.append("oldsur.valid-oldsurhash.");
                    sb2.append(identityHashCode);
                    sb = sb2.toString();
                } else {
                    int identityHashCode2 = System.identityHashCode(surface2);
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("oldsur.invalid-oldsurhash.");
                    sb3.append(identityHashCode2);
                    sb = sb3.toString();
                }
                affi affiVar = affi.SET_NULL_SURFACE;
                afnk afnkVar = afnk.NONE;
                String a = afmk.a(Thread.currentThread().getStackTrace());
                StringBuilder sb4 = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(sb).length());
                sb4.append(a);
                sb4.append("-");
                sb4.append(sb);
                affjVar.p(affiVar, afteVar, 0, afnkVar, sb4.toString(), null);
            } else {
                affjVar.p(affi.SET_SURFACE, afteVar, System.identityHashCode(surface), afnk.NONE, null, null);
            }
        }
        this.r = surface;
        return true;
    }

    @Override // defpackage.afng
    public final void a() {
        p(this.b.n);
    }

    @Override // defpackage.afng
    public final void b() {
    }

    @Override // defpackage.afng
    public final void c() {
        this.a.k(afte.ANDROID_EXOPLAYER_V2);
        afnh afnhVar = this.b.m;
        if (this.n && l()) {
            if (afnhVar != null && (this.i != afnhVar.e() || this.j != afnhVar.c())) {
                j();
            }
            g();
        }
        this.t.d(7);
        p(this.b.n);
    }

    @Override // defpackage.afng
    public final void d() {
        this.a.l(afte.ANDROID_EXOPLAYER_V2);
        if (this.o != null && this.o.isValid() && this.p != null) {
            this.k = 0;
            this.l = 0;
            this.p.reparent(this.o, null).setBufferSize(this.o, 0, 0).setVisibility(this.o, false).apply();
        }
        this.t.c(7, 13);
        afbi afbiVar = this.b.n;
        p(afbiVar);
        if (afbiVar == null || !afbiVar.a().aR()) {
            return;
        }
        q(afbiVar, "surfaceunavailable", null);
    }

    @Override // defpackage.afng
    public final void e() {
        this.a.m(afte.ANDROID_EXOPLAYER_V2);
        this.d.ar();
    }

    public final afnk f(afnh afnhVar, afbi afbiVar) {
        afjz afjzVar = this.b.s;
        return afeu.e(afbiVar.b(), afnhVar, afbiVar.a(), afjzVar, afbiVar.n.c, afbiVar.a().g, afjzVar.n || this.s, afbiVar.q && !afbiVar.p);
    }

    public final void g() {
        int i;
        int i2;
        afnh afnhVar = this.b.m;
        SurfaceControl surfaceControl = this.o;
        if (surfaceControl == null || !surfaceControl.isValid() || this.p == null) {
            return;
        }
        SurfaceControl surfaceControl2 = null;
        SurfaceControl f = afnhVar != null ? afnhVar.f() : null;
        boolean z = false;
        if (f == null || !f.isValid() || (i = this.i) == 0 || (i2 = this.j) == 0) {
            this.k = 0;
            this.l = 0;
        } else {
            this.k = i;
            this.l = i2;
            surfaceControl2 = f;
        }
        SurfaceControl.Transaction bufferSize = this.p.reparent(surfaceControl, surfaceControl2).setBufferSize(surfaceControl, this.k, this.l);
        if (surfaceControl2 != null) {
            z = true;
        }
        bufferSize.setVisibility(surfaceControl, z).apply();
    }

    public final void h() {
        i();
        this.r = null;
    }

    public final void i() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && this.b.s.n().K) {
            z = true;
        }
        this.n = z;
        Future future = this.v;
        if (future != null && !future.isDone()) {
            this.v.cancel(true);
            this.v = null;
        }
        if (this.o != null) {
            this.o.release();
        }
        if (this.q != null) {
            this.q.release();
        }
        if (this.p != null) {
            this.p.close();
        }
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.n) {
            this.v = this.w.submit(new Runnable() { // from class: aexn
                @Override // java.lang.Runnable
                public final void run() {
                    aexp aexpVar = aexp.this;
                    aexpVar.p = new SurfaceControl.Transaction();
                    aexpVar.o = new SurfaceControl.Builder().setName("MEDIALIB_SURFACE_CONTROL").setBufferSize(0, 0).build();
                    aexpVar.q = new Surface(aexpVar.o);
                }
            });
        }
    }

    public final void j() {
        afnh afnhVar = this.b.m;
        if (afnhVar == null || !afnhVar.E()) {
            return;
        }
        afnhVar.v(this.i, this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z) {
        afnh afnhVar = this.b.m;
        if (afnhVar != null) {
            if (z) {
                afnhVar.g(1);
                afkj.d(afki.MLPLAYER, "Stayawake ON");
                return;
            }
            afnhVar.rO(1);
            afkj.d(afki.MLPLAYER, "Stayawake OFF");
        }
    }

    public final boolean l() {
        afnh afnhVar = this.b.m;
        return afnhVar != null && afnhVar.C().equals(afnk.SURFACE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        afbi afbiVar = this.b.n;
        try {
            t(null);
            return true;
        } catch (InterruptedException e) {
            q(afbiVar, "player.fatalexception", e);
            return false;
        } catch (TimeoutException e2) {
            this.r = null;
            q(afbiVar, "player.exception", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(afbi afbiVar) {
        boolean z = false;
        if (afbiVar == null) {
            return false;
        }
        aevy aevyVar = this.b;
        afjz afjzVar = aevyVar.s;
        affx affxVar = aevyVar.c;
        boolean z2 = afjzVar.n || (affxVar.b && !affxVar.c);
        if (this.s != z2) {
            z = true;
        }
        this.s = z2;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(afnh afnhVar, afbi afbiVar, boolean z) {
        afnh afnhVar2 = this.b.m;
        boolean z2 = true;
        if (afnhVar2 != afnhVar) {
            if (afnhVar2 != null) {
                if (!this.b.s.o().aA) {
                    k(false);
                }
                afnhVar2.k();
                afnhVar2.s(null);
                this.a.f(null, afte.ANDROID_EXOPLAYER_V2);
            }
            boolean z3 = afnhVar2 == null;
            boolean z4 = afnhVar == null;
            this.b.m = afnhVar;
            if (z3 ^ z4) {
                this.c.c(afbiVar);
            }
        }
        if (afnhVar != null) {
            afjz afjzVar = this.b.s;
            afnhVar.s(this);
            this.a.f(this, afte.ANDROID_EXOPLAYER_V2);
            if (afbiVar != null) {
                affj affjVar = this.a;
                aetv aetvVar = afbiVar.b;
                if (affjVar.a && affjVar.c == null) {
                    affjVar.o(affi.UNEXPECTED_NULL_MEDIA_VIEW_LISTENER, afte.ANDROID_EXOPLAYER_V2);
                    affjVar.a(aetvVar);
                }
                if (!afbiVar.p) {
                    this.b.c.c();
                    this.b.c.e(afbiVar.c(), afbiVar.a());
                }
                n(afbiVar);
                afnk f = f(afnhVar, afbiVar);
                this.a.g(f, afte.ANDROID_EXOPLAYER_V2);
                this.b.c.f(afbiVar.a(), afbiVar.b());
                awbw awbwVar = afbiVar.a().c.v;
                if (awbwVar == null) {
                    awbwVar = awbw.a;
                }
                afnhVar.w(awbwVar.n);
                afnhVar.t(f);
                if (afnhVar2 != afnhVar) {
                    g();
                }
                View h = afnhVar.h();
                if (afnhVar.C().equals(afnk.GL_GVR) && h != null) {
                    ((afmx) h).F(afbiVar.n.c == 4 ? 2 : 1);
                }
                if (!z || afbiVar.c.b == 4) {
                    z2 = false;
                }
                k(z2);
            }
            j();
        }
        return p(afbiVar).booleanValue();
    }
}
