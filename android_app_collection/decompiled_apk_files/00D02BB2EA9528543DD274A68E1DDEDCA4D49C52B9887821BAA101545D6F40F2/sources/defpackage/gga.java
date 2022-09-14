package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.File;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: gga  reason: default package */
/* loaded from: classes.dex */
public abstract class gga extends affm implements dxiw {
    private static final dcqe k = dcqe.c("gga");
    public dxiu<Object> aV;
    public gfq aW;
    public cklq aX;
    public boolean aY;
    public boolean aZ;
    public boolean ba;
    public int bb;
    public final ggf bc;
    Queue<gfz> bd;
    private boolean l;

    public gga() {
        cxbe cxbeVar = cxbe.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (czhz.a() && cxbeVar.c > 0 && elapsedRealtime <= SystemClock.elapsedRealtime() && ((cxbeVar.j.b == null || elapsedRealtime <= cxbeVar.j.b.longValue()) && cxbeVar.e == 0)) {
            cxbeVar.e = elapsedRealtime;
            cxbeVar.i.c = true;
        }
        this.aY = false;
        this.aZ = false;
        this.ba = false;
        this.l = false;
        this.bb = 0;
        this.bc = new ggf();
        this.bd = dclw.a();
    }

    @Deprecated
    public static gga L(Context context) {
        if (context instanceof gga) {
            return (gga) context;
        }
        if (context instanceof ContextWrapper) {
            return L(((ContextWrapper) context).getBaseContext());
        }
        throw new ClassCastException();
    }

    public final void A() {
        bvrj.UI_THREAD.c();
        ggf ggfVar = this.bc;
        bvrj.UI_THREAD.c();
        ggfVar.b.b();
        if (ggfVar.b != ggf.a) {
            ggfVar.d();
        }
        q();
        w();
    }

    public final void B(@dzsi final Runnable runnable) {
        bvrj.UI_THREAD.c();
        this.bc.a().a(new Runnable(this, runnable) { // from class: gfx
            private final gga a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar = this.a;
                Runnable runnable2 = this.b;
                bvrj.UI_THREAD.c();
                if (ggaVar.g().J()) {
                    return;
                }
                ggaVar.A();
                if (runnable2 == null) {
                    return;
                }
                runnable2.run();
            }
        });
    }

    public final void C(fd fdVar, gfu gfuVar, gfs... gfsVarArr) {
        bvrj.UI_THREAD.c();
        gn g = g();
        if (!this.aY || g.J()) {
            Queue<gfz> queue = this.bd;
            gfl gflVar = new gfl();
            if (fdVar != null) {
                gflVar.a = fdVar;
                if (gfuVar != null) {
                    gflVar.b = gfuVar;
                    dcdc<gfs> t = dcdc.t(gfsVarArr);
                    if (t != null) {
                        gflVar.c = t;
                        String str = gflVar.a == null ? " fragment" : "";
                        if (gflVar.b == null) {
                            str = str.concat(" fragmentTag");
                        }
                        if (gflVar.c == null) {
                            str = String.valueOf(str).concat(" fragmentSearchTags");
                        }
                        if (!str.isEmpty()) {
                            String valueOf = String.valueOf(str);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        } else {
                            queue.add(new gfm(gflVar.a, gflVar.b, gflVar.c));
                            return;
                        }
                    }
                    throw new NullPointerException("Null fragmentSearchTags");
                }
                throw new NullPointerException("Null fragmentTag");
            }
            throw new NullPointerException("Null fragment");
        }
        gz b = g().b();
        fd d = this.aW.d();
        if ((!(fdVar instanceof gfn) || !(d instanceof gfn) || gfuVar != gfu.ACTIVITY_FRAGMENT || !gfu.ACTIVITY_FRAGMENT.a(this.aW.h(0)) || !((gfn) fdVar).a() || !((gfn) d).a()) && (!gfu.DIALOG_FRAGMENT.a(this.aW.h(0)) || gfuVar != gfu.ACTIVITY_FRAGMENT)) {
            if (gfuVar != gfu.ACTIVITY_FRAGMENT) {
                b.y(fdVar, gfuVar.c);
            } else {
                g.aq();
                fd H = g.H(gfuVar.c);
                if (H != null) {
                    b.u(H);
                }
                b.y(fdVar, gfuVar.c);
            }
            b.z(gfu.b(fdVar.getClass(), gfuVar, gfsVarArr));
            b.f();
            g.aq();
            return;
        }
        H(fdVar, gfuVar, new gfs[0]);
    }

    public final void D(ggg gggVar) {
        C(gggVar.Ny(), gggVar.Nx(), (gfs[]) gggVar.aO().toArray(new gfs[0]));
    }

    public final void E(ggg gggVar) {
        F(gggVar, false);
    }

    public final void F(ggg gggVar, boolean z) {
        G(gggVar, z, null);
    }

    public final void G(ggg gggVar, boolean z, @dzsi gfs gfsVar) {
        bvrj.UI_THREAD.c();
        if (z) {
            this.l = true;
            if (gfsVar != null) {
                x(gfsVar);
            } else {
                w();
            }
            this.l = false;
            D(gggVar);
            return;
        }
        H(gggVar.Ny(), gggVar.Nx(), (gfs[]) gggVar.aO().toArray(new gfs[0]));
    }

    public final void H(fd fdVar, gfu gfuVar, gfs... gfsVarArr) {
        bvrj.UI_THREAD.c();
        this.l = true;
        gn g = g();
        gf i = this.aW.i(0);
        int c = i == null ? -1 : i.c();
        if (c >= 0) {
            g.i(null, c, 1);
        }
        this.l = false;
        C(fdVar, gfuVar, gfsVarArr);
        r().f();
    }

    public final boolean I() {
        bvrj.UI_THREAD.c();
        return this.l;
    }

    @dzsi
    public final fd J(gfu gfuVar) {
        return this.aW.b(gfuVar);
    }

    @dzsi
    public final fd K() {
        return this.aW.d();
    }

    @Override // defpackage.dxiw
    public final dxis<Object> NK() {
        return this.aV;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalCacheDirs() {
        try {
            return super.getExternalCacheDirs();
        } catch (Exception e) {
            bvoo.j(e);
            return new File[0];
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(@dzsi String str) {
        try {
            return super.getExternalFilesDirs(str);
        } catch (Exception e) {
            bvoo.j(e);
            return new File[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        this.aY = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.aY = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public void onPause() {
        this.ba = false;
        this.aX.e();
        super.onPause();
    }

    @Override // defpackage.rb, android.app.Activity
    protected final void onPostCreate(@dzsi Bundle bundle) {
        super.onPostCreate(bundle);
        bvrj.UI_THREAD.c();
        if (this.bd.isEmpty()) {
            return;
        }
        dcdc r = dcdc.r(this.bd);
        this.bd.clear();
        int size = r.size();
        for (int i = 0; i < size; i++) {
            gfz gfzVar = (gfz) r.get(i);
            C(gfzVar.a(), gfzVar.b(), (gfs[]) gfzVar.c().toArray(new gfs[0]));
        }
        if (this.bd.isEmpty()) {
            return;
        }
        bvoo.h("PushFragmentParamsQueue should be empty, but had size: %s", Integer.valueOf(this.bd.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public void onResume() {
        super.onResume();
        this.ba = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public void onStart() {
        super.onStart();
        this.aZ = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public void onStop() {
        this.aZ = false;
        super.onStop();
    }

    protected abstract void q();

    public abstract efc r();

    public abstract void s();

    @Override // defpackage.rb, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        this.bb = i;
    }

    public void u() {
    }

    public final void w() {
        this.aW.c();
    }

    public final void x(gfs gfsVar) {
        gfq gfqVar = this.aW;
        int g = gfqVar.g(gfsVar);
        if (g > 0) {
            gfqVar.a.h(gfqVar.h(g), 0);
            return;
        }
        this.aW.c();
    }

    @dzsi
    public final <T> T z(Class<T> cls) {
        if (!this.aW.e(cls)) {
            return null;
        }
        T t = (T) K();
        while (t != null) {
            if (t.getClass().equals(cls)) {
                return t;
            }
            bvrj.UI_THREAD.c();
            fd K = K();
            if (K == null || this.bc.b(K)) {
                return null;
            }
            g().f();
            t = (T) K();
        }
        return null;
    }
}
