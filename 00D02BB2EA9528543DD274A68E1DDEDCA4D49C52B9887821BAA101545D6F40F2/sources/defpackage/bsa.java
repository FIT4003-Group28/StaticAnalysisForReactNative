package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: bsa  reason: default package */
/* loaded from: classes.dex */
public final class bsa implements ComponentCallbacks2, cgp {
    private static final chw e;
    protected final brc a;
    protected final Context b;
    final cgo c;
    public final CopyOnWriteArrayList<chv<Object>> d;
    private final cgw f;
    private final cgv g;
    private final cgz h;
    private final Runnable i;
    private final cgb j;
    private chw k;

    static {
        chw d = chw.d(Bitmap.class);
        d.G();
        e = d;
        chw.d(cfg.class).G();
        chw.a(bwe.b).n(bro.LOW).q(true);
    }

    public bsa(brc brcVar, cgo cgoVar, cgv cgvVar, Context context) {
        cgb cgqVar;
        cgw cgwVar = new cgw();
        cge cgeVar = brcVar.g;
        this.h = new cgz();
        brx brxVar = new brx(this);
        this.i = brxVar;
        this.a = brcVar;
        this.c = cgoVar;
        this.g = cgvVar;
        this.f = cgwVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        brz brzVar = new brz(this, cgwVar);
        if (akm.d(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            cgqVar = new cgd(applicationContext, brzVar);
        } else {
            cgqVar = new cgq();
        }
        this.j = cgqVar;
        if (cjp.g()) {
            cjp.c(brxVar);
        } else {
            cgoVar.a(this);
        }
        cgoVar.a(cgqVar);
        this.d = new CopyOnWriteArrayList<>(brcVar.b.d);
        a(brcVar.b.a());
        synchronized (brcVar.f) {
            if (brcVar.f.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            brcVar.f.add(this);
        }
    }

    protected final synchronized void a(chw chwVar) {
        this.k = chwVar.clone().E();
    }

    public final synchronized void b() {
        cgw cgwVar = this.f;
        cgwVar.c = true;
        for (chs chsVar : cjp.i(cgwVar.a)) {
            if (chsVar.d()) {
                chsVar.c();
                cgwVar.b.add(chsVar);
            }
        }
    }

    public final synchronized void c() {
        cgw cgwVar = this.f;
        cgwVar.c = false;
        for (chs chsVar : cjp.i(cgwVar.a)) {
            if (!chsVar.e() && !chsVar.d()) {
                chsVar.a();
            }
        }
        cgwVar.b.clear();
    }

    @Override // defpackage.cgp
    public final synchronized void d() {
        c();
        this.h.d();
    }

    @Override // defpackage.cgp
    public final synchronized void e() {
        b();
        this.h.e();
    }

    @Override // defpackage.cgp
    public final synchronized void f() {
        this.h.f();
        for (cij<?> cijVar : cjp.i(this.h.a)) {
            l(cijVar);
        }
        this.h.a.clear();
        cgw cgwVar = this.f;
        for (chs chsVar : cjp.i(cgwVar.a)) {
            cgwVar.a(chsVar);
        }
        cgwVar.b.clear();
        this.c.b(this);
        this.c.b(this.j);
        cjp.d().removeCallbacks(this.i);
        brc brcVar = this.a;
        synchronized (brcVar.f) {
            if (!brcVar.f.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            brcVar.f.remove(this);
        }
    }

    public final brw<Bitmap> g() {
        return j(Bitmap.class).e(e);
    }

    public final brw<Drawable> h() {
        return j(Drawable.class);
    }

    public final brw<Drawable> i(String str) {
        brw<Drawable> h = h();
        h.j(str);
        return h;
    }

    public final <ResourceType> brw<ResourceType> j(Class<ResourceType> cls) {
        return new brw<>(this.a, this, cls, this.b);
    }

    public final void k(View view) {
        l(new bry(view));
    }

    public final void l(cij<?> cijVar) {
        if (cijVar == null) {
            return;
        }
        boolean m = m(cijVar);
        chs j = cijVar.j();
        if (m) {
            return;
        }
        brc brcVar = this.a;
        synchronized (brcVar.f) {
            for (bsa bsaVar : brcVar.f) {
                if (bsaVar.m(cijVar)) {
                    return;
                }
            }
            if (j == null) {
                return;
            }
            cijVar.i(null);
            j.b();
        }
    }

    final synchronized boolean m(cij<?> cijVar) {
        chs j = cijVar.j();
        if (j == null) {
            return true;
        }
        if (!this.f.a(j)) {
            return false;
        }
        this.h.a.remove(cijVar);
        cijVar.i(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n(cij<?> cijVar, chs chsVar) {
        this.h.a.add(cijVar);
        cgw cgwVar = this.f;
        cgwVar.a.add(chsVar);
        if (!cgwVar.c) {
            chsVar.a();
            return;
        }
        chsVar.b();
        cgwVar.b.add(chsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized chw o() {
        return this.k;
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

    public final synchronized void p(chw chwVar) {
        a(chwVar);
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
