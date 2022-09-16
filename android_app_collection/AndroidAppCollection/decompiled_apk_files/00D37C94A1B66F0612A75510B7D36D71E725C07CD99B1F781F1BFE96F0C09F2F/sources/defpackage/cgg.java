package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cgg  reason: default package */
/* loaded from: classes2.dex */
public class cgg implements ComponentCallbacks2, cse {
    private static final ctm e;
    protected final cfk a;
    protected final Context b;
    final csd c;
    public final CopyOnWriteArrayList d;
    private final csm f;
    private final csl g;
    private final csp h;
    private final Runnable i;
    private final crr j;
    private ctm k;

    static {
        ctm a = ctm.a(Bitmap.class);
        a.L();
        e = a;
        ctm.a(cqy.class).L();
        ctm ctmVar = (ctm) ((ctm) ctm.b(ckb.b).B(cfv.LOW)).K();
    }

    public cgg(cfk cfkVar, csd csdVar, csl cslVar, Context context) {
        crr csfVar;
        csm csmVar = new csm();
        hy hyVar = cfkVar.g;
        this.h = new csp();
        cge cgeVar = new cge(this);
        this.i = cgeVar;
        this.a = cfkVar;
        this.c = csdVar;
        this.g = cslVar;
        this.f = csmVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        cgf cgfVar = new cgf(this, csmVar);
        if (ake.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            csfVar = new crt(applicationContext, cgfVar);
        } else {
            csfVar = new csf();
        }
        this.j = csfVar;
        if (cvd.m()) {
            cvd.j(cgeVar);
        } else {
            csdVar.a(this);
        }
        csdVar.a(csfVar);
        this.d = new CopyOnWriteArrayList(cfkVar.b.d);
        p(cfkVar.b.a());
        synchronized (cfkVar.f) {
            if (cfkVar.f.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cfkVar.f.add(this);
        }
    }

    public cgd a(Class cls) {
        return new cgd(this.a, this, cls, this.b);
    }

    public cgd b() {
        return a(Bitmap.class).l(e);
    }

    public cgd c() {
        return a(Drawable.class);
    }

    public cgd d(Drawable drawable) {
        return c().e(drawable);
    }

    public cgd e(Integer num) {
        return c().g(num);
    }

    public cgd f(Object obj) {
        return c().h(obj);
    }

    public cgd g(byte[] bArr) {
        return c().i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ctm h() {
        return this.k;
    }

    public final void i(View view) {
        j(new ctt(view));
    }

    public final void j(ctz ctzVar) {
        if (ctzVar == null) {
            return;
        }
        boolean r = r(ctzVar);
        cth c = ctzVar.c();
        if (r) {
            return;
        }
        cfk cfkVar = this.a;
        synchronized (cfkVar.f) {
            for (cgg cggVar : cfkVar.f) {
                if (cggVar.r(ctzVar)) {
                    return;
                }
            }
            if (c == null) {
                return;
            }
            ctzVar.h(null);
            c.c();
        }
    }

    @Override // defpackage.cse
    public final synchronized void k() {
        this.h.k();
        for (ctz ctzVar : cvd.g(this.h.a)) {
            j(ctzVar);
        }
        this.h.a.clear();
        csm csmVar = this.f;
        for (cth cthVar : cvd.g(csmVar.a)) {
            csmVar.a(cthVar);
        }
        csmVar.b.clear();
        this.c.e(this);
        this.c.e(this.j);
        cvd.f().removeCallbacks(this.i);
        cfk cfkVar = this.a;
        synchronized (cfkVar.f) {
            if (!cfkVar.f.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cfkVar.f.remove(this);
        }
    }

    @Override // defpackage.cse
    public final synchronized void l() {
        o();
        this.h.l();
    }

    @Override // defpackage.cse
    public final synchronized void m() {
        n();
        this.h.m();
    }

    public final synchronized void n() {
        csm csmVar = this.f;
        csmVar.c = true;
        for (cth cthVar : cvd.g(csmVar.a)) {
            if (cthVar.n()) {
                cthVar.f();
                csmVar.b.add(cthVar);
            }
        }
    }

    public final synchronized void o() {
        csm csmVar = this.f;
        csmVar.c = false;
        for (cth cthVar : cvd.g(csmVar.a)) {
            if (!cthVar.l() && !cthVar.n()) {
                cthVar.b();
            }
        }
        csmVar.b.clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void p(ctm ctmVar) {
        this.k = (ctm) ((ctm) ctmVar.clone()).q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(ctz ctzVar, cth cthVar) {
        this.h.a.add(ctzVar);
        csm csmVar = this.f;
        csmVar.a.add(cthVar);
        if (!csmVar.c) {
            cthVar.b();
            return;
        }
        cthVar.c();
        csmVar.b.add(cthVar);
    }

    final synchronized boolean r(ctz ctzVar) {
        cth c = ctzVar.c();
        if (c == null) {
            return true;
        }
        if (!this.f.a(c)) {
            return false;
        }
        this.h.a.remove(ctzVar);
        ctzVar.h(null);
        return true;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String obj = super.toString();
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(obj).length();
        sb = new StringBuilder(length + 21 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append("{tracker=");
        sb.append(valueOf);
        sb.append(", treeNode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
