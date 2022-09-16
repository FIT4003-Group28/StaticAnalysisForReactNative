package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.geo.imagery.viewer.api.PhotoHandle;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxbs  reason: default package */
/* loaded from: classes4.dex */
public final class bxbs extends bnsq implements bwzo {
    @dzsi
    public cjql A;
    public bunk B;
    private final ni C;
    private final ScaleGestureDetector D;
    @dzsi
    private dftx E;
    @dzsi
    private dfty F;
    private final dfqt G;
    private boolean H;
    private final bxbr I;
    private final bxbq J;
    private boolean K;
    public btvo a;
    public bvrb b;
    public buti c;
    public ckcw d;
    public btrm e;
    public amfi f;
    public ahkg g;
    public bwzj h;
    public final bwuw i;
    public final bwux j;
    public final dfqu k;
    public final dfrh l;
    public final Runnable m;
    public final dfuo n;
    public final dfrm o;
    public final bwvl p;
    @dzsi
    public cjqp q;
    public final dfro r;
    @dzsi
    public dfqt s;
    @dzsi
    public dfro t;
    @dzsi
    public Runnable u;
    @dzsi
    public dhjz v;
    @dzsi
    public UserOrientation w;
    public boolean x;
    public boolean y;
    @dzsi
    public cjql z;

    public bxbs(Context context) {
        super(context);
        bxbl bxblVar = new bxbl(this);
        this.r = bxblVar;
        bxbm bxbmVar = new bxbm(this);
        this.G = bxbmVar;
        this.H = false;
        this.I = new bxbr(this);
        this.x = false;
        this.K = true;
        this.y = false;
        this.z = null;
        this.A = null;
        ((bxbt) bttc.a(bxbt.class, this)).xB(this);
        bxbq bxbqVar = new bxbq();
        this.J = bxbqVar;
        bwuw bwuwVar = new bwuw(bxbqVar, this.b, this.a.getImageryViewerParameters(), this.f, new bwzi(this.d), getResources(), this.c, true);
        this.i = bwuwVar;
        dfum dfumVar = new dfum(bxbqVar, getResources());
        dfrm dfrmVar = new dfrm(context, bxbqVar, Arrays.asList(bxblVar));
        this.o = dfrmVar;
        bwux bwuxVar = new bwux(bwuwVar, dfrmVar, dfumVar, new bxbn(this), new dbsz(this) { // from class: bxbg
            private final bxbs a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final bxbs bxbsVar = this.a;
                final dftp dftpVar = (dftp) obj;
                final cjqp cjqpVar = bxbsVar.q;
                if (cjqpVar == null) {
                    return;
                }
                bxbsVar.post(new Runnable(bxbsVar, dftpVar, cjqpVar) { // from class: bxbk
                    private final bxbs a;
                    private final dftp b;
                    private final cjqp c;

                    {
                        this.a = bxbsVar;
                        this.b = dftpVar;
                        this.c = cjqpVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bxbs bxbsVar2 = this.a;
                        dftp dftpVar2 = this.b;
                        cjqp cjqpVar2 = this.c;
                        if (bxbsVar2.z == null && dftpVar2.a) {
                            bxbsVar2.z = cjqpVar2.d(cjtd.a(dtyb.eo));
                        }
                        if (bxbsVar2.A != null || !dftpVar2.b) {
                            return;
                        }
                        bxbsVar2.A = cjqpVar2.d(cjtd.a(dtyb.dW));
                    }
                });
            }
        }, this.a.getEnableFeatureParameters().y);
        this.j = bwuxVar;
        setRenderer(bwuxVar);
        dfuo dfuoVar = new dfuo(bwuxVar.b, dfrmVar, dfumVar);
        this.n = dfuoVar;
        Executor executor = new Executor(this) { // from class: bxbh
            private final bxbs a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        };
        Executor executor2 = new Executor(this) { // from class: bxbi
            private final bxbs a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.g(runnable);
            }
        };
        dfrh dfrhVar = new dfrh(executor, executor2, bwuxVar.b, bxbqVar, dfrmVar, dfumVar, dfuoVar);
        this.l = dfrhVar;
        dfua dfuaVar = bwuxVar.b;
        dfuk dfukVar = bwuwVar.a;
        dbsk.s(dfukVar);
        dbsk.s(dfrhVar);
        dfqu dfquVar = new dfqu(executor, executor2, dfuaVar, dfukVar, bxbqVar, dfrmVar, dfrhVar, dfumVar, dfuoVar, bxbmVar);
        this.k = dfquVar;
        Runnable runnable = new Runnable(this) { // from class: bxbj
            private final bxbs a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bxbs bxbsVar = this.a;
                cjql cjqlVar = bxbsVar.z;
                if (cjqlVar != null) {
                    bxbsVar.h.a(cjqlVar, deaf.DRAG, dtyb.eo, bxbsVar.h(), null);
                }
            }
        };
        dftx dftxVar = new dftx(dfrmVar, dfquVar);
        this.E = dftxVar;
        dfty dftyVar = new dfty(dftxVar, dfquVar, dfuoVar, runnable);
        this.F = dftyVar;
        this.C = new ni(context, dftyVar);
        this.D = new ScaleGestureDetector(context, dftyVar);
        this.p = new bwvl(bwuxVar.c, this.B);
        this.m = new bxbo(this);
        dfrmVar.i(0.0f, 90.0f);
        dfrmVar.f(90.0f);
        c();
    }

    private final void m(boolean z) {
        ahkg ahkgVar = this.g;
        if (ahkgVar == null) {
            return;
        }
        if (z) {
            if (this.H) {
                return;
            }
            ahkgVar.a(this.I, ahkf.FAST);
            this.H = true;
        } else if (!this.H) {
        } else {
            ahkgVar.b(this.I);
            this.H = false;
        }
    }

    @dzsi
    private final ams n() {
        ne f = od.f(this);
        if (f instanceof ams) {
            return (ams) f;
        }
        return null;
    }

    @Override // defpackage.bwzo
    public final void aJ(@dzsi dggg dgggVar, @dzsi UserOrientation userOrientation) {
        throw null;
    }

    @Override // defpackage.bnsq, defpackage.bnss
    public final void c() {
        super.c();
        m(this.y);
    }

    @Override // defpackage.bnsq, defpackage.bnss
    public final void d() {
        super.d();
        m(false);
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ams n = n();
        if (n == null || !n.k(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ams n = n();
        if (n == null || !n.l(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @dzsi
    public final dggg h() {
        PhotoHandle a;
        dfrh dfrhVar = this.l;
        if (dfrhVar == null || (a = dfrhVar.a()) == null) {
            return null;
        }
        dggf bZ = dggg.d.bZ();
        int a2 = dfsm.a(a.b().b);
        if (a2 == 0) {
            a2 = 1;
        }
        dgge f = bwuu.f(a2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar = (dggg) bZ.b;
        dgggVar.b = f.l;
        dgggVar.a |= 1;
        String str = a.b().c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar2 = (dggg) bZ.b;
        str.getClass();
        dgggVar2.a |= 2;
        dgggVar2.c = str;
        return bZ.bK();
    }

    @Override // defpackage.bwzo
    public final boolean i() {
        boolean z = !this.y;
        this.y = z;
        m(z);
        sendAccessibilityEvent(8);
        return this.y;
    }

    public final void j(dggg dgggVar, @dzsi UserOrientation userOrientation, @dzsi dhjz dhjzVar) {
        dftc bZ = dftd.d.bZ();
        String str = dgggVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftd dftdVar = (dftd) bZ.b;
        str.getClass();
        dftdVar.a |= 2;
        dftdVar.c = str;
        dgge b = dgge.b(dgggVar.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        int g = bwuu.g(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftd dftdVar2 = (dftd) bZ.b;
        dftdVar2.b = g - 1;
        dftdVar2.a |= 1;
        dftd bK = bZ.bK();
        if (userOrientation != null) {
            this.w = userOrientation;
            this.v = null;
        } else if (dhjzVar != null) {
            this.v = dhjzVar;
            this.w = null;
        }
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        dfqu dfquVar = this.k;
        new dfqz(dfquVar.h, dfquVar.i, dfquVar.j, dfquVar.a, dfquVar.b, dfquVar.d, dfquVar.c, dfquVar.f, dfquVar.g).a(bK, dhjzVar);
    }

    @dzsi
    public final Animator k(dhjx dhjxVar, long j) {
        PhotoHandle a = this.l.a();
        if (a == null) {
            return null;
        }
        return this.l.b(a, dhjxVar, j, null);
    }

    public final dhjx l() {
        return this.o.e;
    }

    @Override // defpackage.bnsq, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a = this;
    }

    @Override // defpackage.bnsq, android.view.View
    public final void onDetachedFromWindow() {
        e();
        this.q = null;
        this.t = null;
        this.E = null;
        this.F = null;
        this.J.a = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @dzsi Rect rect) {
        super.onFocusChanged(z, i, rect);
        ams n = n();
        if (n != null) {
            n.m(z, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.K) {
            return false;
        }
        this.j.b(10);
        boolean onTouchEvent = this.D.onTouchEvent(motionEvent);
        dfty dftyVar = this.F;
        if (!this.D.isInProgress()) {
            ni niVar = this.C;
            if (niVar != null) {
                niVar.a(motionEvent);
            }
            if (motionEvent.getActionMasked() == 1 && dftyVar != null) {
                dftw dftwVar = dftyVar.a.a;
                if (dftwVar != null) {
                    dftwVar.f();
                }
                if (dftyVar.e) {
                    dftyVar.e = false;
                    dftyVar.d = false;
                } else if (dftyVar.d) {
                    boolean a = dftyVar.b.a(motionEvent);
                    dftyVar.d = false;
                    Runnable runnable = dftyVar.c;
                    if (runnable != null && a) {
                        runnable.run();
                    }
                }
                ams n = n();
                if (n != null) {
                    n.n();
                }
            }
        }
        return onTouchEvent;
    }

    @Override // defpackage.bwzo
    public final boolean q() {
        throw null;
    }

    public void setActionListener(@dzsi dfqt dfqtVar) {
        this.s = dfqtVar;
    }

    public void setCameraListener(@dzsi dfro dfroVar) {
        this.t = dfroVar;
        if (dfroVar != null) {
            dfroVar.a(l());
        }
    }

    public void setCompassMode(boolean z) {
        this.y = z;
        m(z);
    }

    public void setEnableSingleTap(boolean z) {
        this.k.k = z;
    }

    public void setFrameListener(@dzsi Runnable runnable) {
        this.u = runnable;
    }

    public void setHideNavArrows(boolean z) {
        bwux bwuxVar = this.j;
        if (bwuxVar != null) {
            bwuxVar.a.setHideNavArrows(z);
        }
    }

    public void setOnGestureListener(@dzsi dftw dftwVar) {
        dftx dftxVar = this.E;
        if (dftxVar != null) {
            dftxVar.a = dftwVar;
        }
    }

    public void setOrientation(float f, float f2) {
        this.o.i(f, f2);
    }

    public void setPageLoggingContext(@dzsi cjqp cjqpVar) {
        this.q = cjqpVar;
    }

    public void setPin(akqq akqqVar) {
        bwvl bwvlVar = this.p;
        bwvk bwvkVar = new bwvk(bwvlVar, akqqVar);
        dwyy bZ = dwyz.b.bZ();
        bZ.a(akra.f(akqqVar).U());
        bwvlVar.e.a(bZ.bK(), new bwvj(bwvkVar), bvrj.BACKGROUND_THREADPOOL);
    }

    public void setTouchEnabled(boolean z) {
        this.K = z;
    }

    @Override // defpackage.bwzo
    public final UserOrientation w() {
        throw null;
    }

    public void setRouteArrow(double d, double d2) {
        dfua dfuaVar = this.j.b;
        if (dfuaVar != null) {
            synchronized (dfuaVar.b) {
                Renderer renderer = dfuaVar.a;
                if (renderer == null) {
                    return;
                }
                RendererSwigJNI.Renderer_setRouteArrow(renderer.a, renderer, d, d2);
            }
        }
    }

    public void setWireframeRendering(boolean z) {
        dfua dfuaVar;
        bwux bwuxVar = this.j;
        if (bwuxVar == null || (dfuaVar = bwuxVar.b) == null) {
            return;
        }
        synchronized (dfuaVar.b) {
            Renderer renderer = dfuaVar.a;
            if (renderer == null) {
                return;
            }
            RendererSwigJNI.Renderer_setWireframeRendering(renderer.a, renderer, z);
        }
    }
}
