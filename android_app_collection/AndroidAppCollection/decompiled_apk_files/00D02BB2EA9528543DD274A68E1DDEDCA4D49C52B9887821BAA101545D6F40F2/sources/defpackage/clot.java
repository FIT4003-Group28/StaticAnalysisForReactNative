package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: clot  reason: default package */
/* loaded from: classes5.dex */
public class clot extends cllr implements clog {
    private int A;
    private clrc B;
    private boolean C;
    private boolean D;
    protected final clol[] b;
    public final clmt c;
    public final CopyOnWriteArraySet<cmon> d;
    public final CopyOnWriteArraySet<clre> e;
    public final CopyOnWriteArraySet<cmgf> f;
    public final CopyOnWriteArraySet<cmbx> g;
    public final CopyOnWriteArraySet<cltm> h;
    public final CopyOnWriteArraySet<cmoy> i;
    public final CopyOnWriteArraySet<clrt> j;
    public final clqv k;
    public final cllq l;
    public final clox m;
    public Surface n;
    public int o;
    public int p;
    public float q;
    public boolean r;
    public cltl s;
    private final clos t;
    private final cllm u;
    private final clpc v;
    private final clpd w;
    private boolean x;
    private TextureView y;
    private int z;

    public clot(clor clorVar) {
        clqv clqvVar = clorVar.f;
        this.k = clqvVar;
        this.B = clorVar.h;
        this.o = 1;
        this.r = false;
        clos closVar = new clos(this);
        this.t = closVar;
        CopyOnWriteArraySet<cmon> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.d = copyOnWriteArraySet;
        CopyOnWriteArraySet<clre> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.e = copyOnWriteArraySet2;
        this.f = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<cmbx> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.g = copyOnWriteArraySet3;
        this.h = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<cmoy> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.i = copyOnWriteArraySet4;
        CopyOnWriteArraySet<clrt> copyOnWriteArraySet5 = new CopyOnWriteArraySet<>();
        this.j = copyOnWriteArraySet5;
        Handler handler = new Handler(clorVar.g);
        clop clopVar = clorVar.b;
        ArrayList arrayList = new ArrayList();
        clly cllyVar = (clly) clopVar;
        arrayList.add(new cmoi(cllyVar.a, cllyVar.b, handler, closVar));
        arrayList.add(new clsr(cllyVar.a, cllyVar.b, handler, closVar, new clsn(clrd.a(cllyVar.a), new clsg(new clrh[0]))));
        arrayList.add(new cmgg(closVar, handler.getLooper()));
        arrayList.add(new cmby(closVar, handler.getLooper()));
        arrayList.add(new cmpa());
        clol[] clolVarArr = (clol[]) arrayList.toArray(new clol[0]);
        this.b = clolVarArr;
        this.q = 1.0f;
        this.p = 0;
        Collections.emptyList();
        this.C = true;
        clmt clmtVar = new clmt(clolVarArr, clorVar.d, clorVar.k, clorVar.e, clqvVar, clorVar.i, clorVar.l, clorVar.c, clorVar.g);
        this.c = clmtVar;
        clmtVar.b(closVar);
        copyOnWriteArraySet4.add(clqvVar);
        copyOnWriteArraySet.add(clqvVar);
        copyOnWriteArraySet5.add(clqvVar);
        copyOnWriteArraySet2.add(clqvVar);
        copyOnWriteArraySet3.add(clqvVar);
        cllm cllmVar = new cllm(clorVar.a, handler, closVar);
        this.u = cllmVar;
        boolean z = cllmVar.a;
        cllq cllqVar = new cllq(clorVar.a, handler, closVar);
        this.l = cllqVar;
        clrc clrcVar = cllqVar.a;
        if (!cmny.b(null, null)) {
            cllqVar.a = null;
            cllqVar.b = 0;
            cmmn.b(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        clox cloxVar = new clox(clorVar.a, handler, closVar);
        this.m = cloxVar;
        int i = this.B.b;
        if (cloxVar.d != 3) {
            cloxVar.d = 3;
            cloxVar.a();
            clos closVar2 = (clos) cloxVar.b;
            cltl v = v(closVar2.a.m);
            if (!v.equals(closVar2.a.s)) {
                clot clotVar = closVar2.a;
                clotVar.s = v;
                Iterator<cltm> it = clotVar.h.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        clpc clpcVar = new clpc(clorVar.a);
        this.v = clpcVar;
        clpcVar.a = false;
        clpd clpdVar = new clpd(clorVar.a);
        this.w = clpdVar;
        clpdVar.a = false;
        this.s = v(this.m);
        u(1, 3, this.B);
        u(2, 4, Integer.valueOf(this.o));
        u(1, R.styleable.AppCompatTheme_switchStyle, Boolean.valueOf(this.r));
    }

    public static cltl v(clox cloxVar) {
        return new cltl(cmny.a >= 28 ? cloxVar.c.getStreamMinVolume(cloxVar.d) : 0, cloxVar.c.getStreamMaxVolume(cloxVar.d));
    }

    public static int w(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public final void b(TextureView textureView) {
        t();
        TextureView textureView2 = this.y;
        if (textureView2 != null) {
            if (textureView2.getSurfaceTextureListener() == this.t) {
                this.y.setSurfaceTextureListener(null);
            }
            this.y = null;
        }
        if (textureView != null) {
            t();
            u(2, 8, null);
        }
        this.y = textureView;
        if (textureView == null) {
            o(null, true);
            p(0, 0);
            return;
        }
        textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this.t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            o(null, true);
            p(0, 0);
            return;
        }
        o(new Surface(surfaceTexture), true);
        p(textureView.getWidth(), textureView.getHeight());
    }

    public final int c() {
        t();
        return this.c.c();
    }

    @Override // defpackage.clog
    public final void d(int i, long j) {
        t();
        clqv clqvVar = this.k;
        if (!clqvVar.d) {
            clqvVar.P();
            clqvVar.d = true;
            clqvVar.a.e(new cmmx() { // from class: clpe
                @Override // defpackage.cmmx
                public final void a(Object obj) {
                    apqn apqnVar = (apqn) obj;
                }
            });
        }
        this.c.d(i, j);
    }

    public final void e(boolean z) {
        t();
        cllq cllqVar = this.l;
        c();
        int d = cllqVar.d(z);
        r(z, d, w(z, d));
    }

    public final boolean f() {
        t();
        return this.c.n.l;
    }

    @Override // defpackage.clog
    public final int g() {
        t();
        return this.c.g();
    }

    public final long h() {
        t();
        return this.c.h();
    }

    @Override // defpackage.clog
    public final long i() {
        t();
        return this.c.i();
    }

    @Override // defpackage.clog
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.clog
    public final int k() {
        throw null;
    }

    @Override // defpackage.clog
    public final int l() {
        throw null;
    }

    @Override // defpackage.clog
    public final long m() {
        throw null;
    }

    @Override // defpackage.clog
    public final clpb n() {
        throw null;
    }

    public final void o(Surface surface, boolean z) {
        clol[] clolVarArr;
        ArrayList<cloj> arrayList = new ArrayList();
        for (clol clolVar : this.b) {
            if (clolVar.a() == 2) {
                cloj f = this.c.f(clolVar);
                f.d(1);
                f.c(surface);
                f.b();
                arrayList.add(f);
            }
        }
        Surface surface2 = this.n;
        if (surface2 != null && surface2 != surface) {
            try {
                for (cloj clojVar : arrayList) {
                    clojVar.e();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.c.e(false, new cllz(5, new TimeoutException("Detaching surface timed out."), null, -1, null, 4, 3, false));
            }
            if (this.x) {
                this.n.release();
            }
        }
        this.n = surface;
        this.x = z;
    }

    public final void p(int i, int i2) {
        if (i == this.z && i2 == this.A) {
            return;
        }
        this.z = i;
        this.A = i2;
        Iterator<cmon> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().M(i, i2);
        }
    }

    public final void q() {
        u(1, 2, Float.valueOf(this.q * this.l.c));
    }

    public final void r(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 0;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
            i = -1;
        }
        if (z2 && i != 1) {
            i3 = 1;
        }
        clmt clmtVar = this.c;
        cloc clocVar = clmtVar.n;
        if (clocVar.l == z2 && clocVar.m == i3) {
            return;
        }
        clmtVar.j++;
        cloc g = clocVar.g(z2, i3);
        Handler handler = clmtVar.d.d.a;
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        handler.obtainMessage(1, i4, i3).sendToTarget();
        clmtVar.p(g, false, 4, 0, i2, false);
    }

    public final void s() {
        int c = c();
        if (c == 2 || c == 3) {
            t();
            boolean z = this.c.n.p;
            f();
            f();
        }
    }

    public final void t() {
        if (Looper.myLooper() != this.c.i) {
            if (this.C) {
                throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            }
            cmna.a("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.D ? null : new IllegalStateException());
            this.D = true;
        }
    }

    public final void u(int i, int i2, Object obj) {
        clol[] clolVarArr;
        for (clol clolVar : this.b) {
            if (clolVar.a() == i) {
                cloj f = this.c.f(clolVar);
                f.d(i2);
                f.c(obj);
                f.b();
            }
        }
    }

    public final void x() {
        t();
        this.l.d(f());
        this.c.e(true, null);
        Collections.emptyList();
    }
}
