package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: cto  reason: default package */
/* loaded from: classes3.dex */
public final class cto implements cth, cty, ctn {
    private final Object b;
    private final ctl c;
    private final ctj d;
    private final Context e;
    private final cfs f;
    private final Object g;
    private final Class h;
    private final ctd i;
    private final int j;
    private final int k;
    private final cfv l;
    private final ctz m;
    private final List n;
    private final cuh o;
    private final Executor p;
    private cku q;
    private ckh r;
    private long s;
    private volatile cki t;
    private Drawable u;
    private Drawable v;
    private int w;
    private int x;
    private boolean y;
    private RuntimeException z;
    private final cvl a = cvl.a();
    private int A = 1;

    public cto(Context context, cfs cfsVar, Object obj, Object obj2, Class cls, ctd ctdVar, int i, int i2, cfv cfvVar, ctz ctzVar, ctl ctlVar, List list, ctj ctjVar, cki ckiVar, cuh cuhVar, Executor executor) {
        this.b = obj;
        this.e = context;
        this.f = cfsVar;
        this.g = obj2;
        this.h = cls;
        this.i = ctdVar;
        this.j = i;
        this.k = i2;
        this.l = cfvVar;
        this.m = ctzVar;
        this.c = ctlVar;
        this.n = list;
        this.d = ctjVar;
        this.t = ckiVar;
        this.o = cuhVar;
        this.p = executor;
        if (this.z != null || !cfsVar.g.a(cfo.class)) {
            return;
        }
        this.z = new RuntimeException("Glide request origin trace");
    }

    private static int h(int i, float f) {
        return i == Integer.MIN_VALUE ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : Math.round(f * i);
    }

    private final Drawable i() {
        int i;
        if (this.v == null) {
            ctd ctdVar = this.i;
            Drawable drawable = ctdVar.f;
            this.v = drawable;
            if (drawable == null && (i = ctdVar.g) > 0) {
                this.v = o(i);
            }
        }
        return this.v;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.e.getTheme();
        cfs cfsVar = this.f;
        return cqp.a(cfsVar, cfsVar, i, theme);
    }

    private final void p() {
        if (!this.y) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    private final boolean q() {
        ctj ctjVar = this.d;
        return ctjVar == null || ctjVar.h(this);
    }

    private final boolean r() {
        ctj ctjVar = this.d;
        return ctjVar == null || !ctjVar.a().j();
    }

    private final void s(ckq ckqVar) {
        boolean z;
        int i;
        this.a.b();
        synchronized (this.b) {
            String valueOf = String.valueOf(this.g);
            int i2 = this.w;
            int i3 = this.x;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Load failed for ");
            sb.append(valueOf);
            sb.append(" with size [");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("]");
            Log.w("Glide", sb.toString(), ckqVar);
            List a = ckqVar.a();
            int size = a.size();
            for (int i4 = 0; i4 < size; i4++) {
                Throwable th = (Throwable) a.get(i4);
            }
            this.r = null;
            this.A = 5;
            this.y = true;
            List<ctl> list = this.n;
            if (list != null) {
                z = false;
                for (ctl ctlVar : list) {
                    z |= ctlVar.jY(ckqVar, this.g, this.m, r());
                }
            } else {
                z = false;
            }
            ctl ctlVar2 = this.c;
            if (ctlVar2 != null) {
                ctlVar2.jY(ckqVar, this.g, this.m, r());
            }
            if (!z && q()) {
                if (this.u == null) {
                    ctd ctdVar = this.i;
                    Drawable drawable = ctdVar.d;
                    this.u = drawable;
                    if (drawable == null && (i = ctdVar.e) > 0) {
                        this.u = o(i);
                    }
                }
                Drawable drawable2 = this.u;
                if (drawable2 == null) {
                    drawable2 = i();
                }
                this.m.e(drawable2);
            }
            this.y = false;
            ctj ctjVar = this.d;
            if (ctjVar != null) {
                ctjVar.d(this);
            }
        }
    }

    @Override // defpackage.ctn
    public final Object a() {
        this.a.b();
        return this.b;
    }

    @Override // defpackage.cth
    public final void b() {
        synchronized (this.b) {
            p();
            this.a.b();
            this.s = cuy.b();
            if (this.g == null) {
                if (cvd.o(this.j, this.k)) {
                    this.w = this.j;
                    this.x = this.k;
                }
                s(new ckq("Received null model"));
                return;
            }
            int i = this.A;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i != 4) {
                this.A = 3;
                if (cvd.o(this.j, this.k)) {
                    g(this.j, this.k);
                } else {
                    this.m.d(this);
                }
                int i2 = this.A;
                if ((i2 == 2 || i2 == 3) && q()) {
                    this.m.f(i());
                }
                return;
            }
            e(this.q, 5);
        }
    }

    @Override // defpackage.cth
    public final void c() {
        synchronized (this.b) {
            p();
            this.a.b();
            if (this.A != 6) {
                p();
                this.a.b();
                this.m.g(this);
                ckh ckhVar = this.r;
                cko ckoVar = null;
                if (ckhVar != null) {
                    synchronized (ckhVar.c) {
                        ckhVar.a.f(ckhVar.b);
                    }
                    this.r = null;
                }
                cku ckuVar = this.q;
                if (ckuVar != null) {
                    this.q = null;
                    ckoVar = ckuVar;
                }
                ctj ctjVar = this.d;
                if (ctjVar == null || ctjVar.g(this)) {
                    this.m.a(i());
                }
                this.A = 6;
                if (ckoVar == null) {
                    return;
                }
                ckoVar.f();
            }
        }
    }

    @Override // defpackage.ctn
    public final void d(ckq ckqVar) {
        s(ckqVar);
    }

    @Override // defpackage.ctn
    public final void e(cku ckuVar, int i) {
        Throwable th;
        cko ckoVar;
        boolean z;
        this.a.b();
        cko ckoVar2 = null;
        try {
            try {
                synchronized (this.b) {
                    try {
                        this.r = null;
                        if (ckuVar == null) {
                            String valueOf = String.valueOf(this.h);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
                            sb.append("Expected to receive a Resource<R> with an object of ");
                            sb.append(valueOf);
                            sb.append(" inside, but instead got null.");
                            d(new ckq(sb.toString()));
                            return;
                        }
                        Object c = ckuVar.c();
                        if (c != null && this.h.isAssignableFrom(c.getClass())) {
                            ctj ctjVar = this.d;
                            if (ctjVar == null || ctjVar.i(this)) {
                                boolean r = r();
                                this.A = 4;
                                this.q = ckuVar;
                                if (this.f.h <= 3) {
                                    String simpleName = c.getClass().getSimpleName();
                                    String e = acx.e(i);
                                    String valueOf2 = String.valueOf(this.g);
                                    int i2 = this.w;
                                    int i3 = this.x;
                                    double a = cuy.a(this.s);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 95 + e.length() + String.valueOf(valueOf2).length());
                                    sb2.append("Finished loading ");
                                    sb2.append(simpleName);
                                    sb2.append(" from ");
                                    sb2.append(e);
                                    sb2.append(" for ");
                                    sb2.append(valueOf2);
                                    sb2.append(" with size [");
                                    sb2.append(i2);
                                    sb2.append("x");
                                    sb2.append(i3);
                                    sb2.append("] in ");
                                    sb2.append(a);
                                    sb2.append(" ms");
                                }
                                this.y = true;
                                List<ctl> list = this.n;
                                if (list != null) {
                                    z = false;
                                    for (ctl ctlVar : list) {
                                        z |= ctlVar.jZ(c, i);
                                        if (ctlVar instanceof ctf) {
                                            z |= ((ctf) ctlVar).c();
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                ctl ctlVar2 = this.c;
                                if (ctlVar2 != null) {
                                    ctlVar2.jZ(c, i);
                                }
                                if (!z) {
                                    this.m.b(c, this.o.a(i, r));
                                }
                                this.y = false;
                                ctj ctjVar2 = this.d;
                                if (ctjVar2 != null) {
                                    ctjVar2.e(this);
                                }
                                return;
                            }
                            this.q = null;
                            this.A = 4;
                            ckoVar = (cko) ckuVar;
                            ckoVar.f();
                        }
                        this.q = null;
                        String valueOf3 = String.valueOf(this.h);
                        String valueOf4 = String.valueOf(c != null ? c.getClass() : "");
                        String valueOf5 = String.valueOf(c);
                        String valueOf6 = String.valueOf(ckuVar);
                        String str = c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 71 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + str.length());
                        sb3.append("Expected to receive an object of ");
                        sb3.append(valueOf3);
                        sb3.append(" but instead got ");
                        sb3.append(valueOf4);
                        sb3.append("{");
                        sb3.append(valueOf5);
                        sb3.append("} inside Resource{");
                        sb3.append(valueOf6);
                        sb3.append("}.");
                        sb3.append(str);
                        d(new ckq(sb3.toString()));
                        ckoVar = (cko) ckuVar;
                        ckoVar.f();
                    } catch (Throwable th2) {
                        th = th2;
                        ckuVar = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            ckoVar2 = ckuVar;
                            if (ckoVar2 != null) {
                                ckoVar2.f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.cth
    public final void f() {
        synchronized (this.b) {
            if (n()) {
                c();
            }
        }
    }

    @Override // defpackage.cty
    public final void g(int i, int i2) {
        Class cls;
        int i3;
        chy chyVar;
        boolean z;
        Executor executor;
        ckn cknVar;
        int i4;
        Object obj;
        cko ckoVar;
        ckn cknVar2;
        int i5;
        ckh ckhVar;
        cto ctoVar = this;
        ctoVar.a.b();
        synchronized (ctoVar.b) {
            if (ctoVar.A == 3) {
                ctoVar.A = 2;
                float f = ctoVar.i.a;
                ctoVar.w = h(i, f);
                ctoVar.x = h(i2, f);
                cki ckiVar = ctoVar.t;
                cfs cfsVar = ctoVar.f;
                Object obj2 = ctoVar.g;
                ctd ctdVar = ctoVar.i;
                chy chyVar2 = ctdVar.k;
                int i6 = ctoVar.w;
                int i7 = ctoVar.x;
                Class cls2 = ctdVar.o;
                Class cls3 = ctoVar.h;
                cfv cfvVar = ctoVar.l;
                ckb ckbVar = ctdVar.b;
                Map map = ctdVar.n;
                boolean z2 = ctdVar.l;
                boolean z3 = ctdVar.q;
                cic cicVar = ctdVar.m;
                boolean z4 = ctdVar.h;
                boolean z5 = ctdVar.r;
                Executor executor2 = ctoVar.p;
                ake akeVar = ckiVar.g;
                ckn cknVar3 = new ckn(obj2, chyVar2, i6, i7, map, cls2, cls3, cicVar);
                synchronized (ckiVar) {
                    if (!z4) {
                        cls = cls2;
                        i3 = i6;
                        chyVar = chyVar2;
                        obj = obj2;
                        z = z5;
                        executor = executor2;
                        ckoVar = null;
                        cknVar = cknVar3;
                        i4 = i7;
                    } else {
                        try {
                            cko a = ckiVar.d.a(cknVar3);
                            if (a != null) {
                                a.d();
                            }
                            if (a == null) {
                                cku b = ckiVar.e.b(cknVar3);
                                if (b == null) {
                                    cknVar2 = cknVar3;
                                    cls = cls2;
                                    i5 = i7;
                                    i3 = i6;
                                    chyVar = chyVar2;
                                    obj = obj2;
                                    z = z5;
                                    executor = executor2;
                                    ckoVar = null;
                                } else if (b instanceof cko) {
                                    cknVar2 = cknVar3;
                                    cls = cls2;
                                    i5 = i7;
                                    i3 = i6;
                                    chyVar = chyVar2;
                                    ckoVar = (cko) b;
                                    z = z5;
                                    executor = executor2;
                                    obj = obj2;
                                } else {
                                    cknVar2 = cknVar3;
                                    z = z5;
                                    executor = executor2;
                                    cls = cls2;
                                    i3 = i6;
                                    chyVar = chyVar2;
                                    i5 = i7;
                                    obj = obj2;
                                    ckoVar = new cko(b, true, true, cknVar2, ckiVar);
                                }
                                if (ckoVar != null) {
                                    ckoVar.d();
                                    cknVar = cknVar2;
                                    ckiVar.d.b(cknVar, ckoVar);
                                } else {
                                    cknVar = cknVar2;
                                }
                                i4 = i5;
                                if (ckoVar == null) {
                                    ckoVar = null;
                                }
                            } else {
                                cls = cls2;
                                i3 = i6;
                                chyVar = chyVar2;
                                z = z5;
                                executor = executor2;
                                cknVar = cknVar3;
                                i4 = i7;
                                obj = obj2;
                                ckoVar = a;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (ckoVar == null) {
                        ckm ckmVar = (ckm) ckiVar.f.a.get(cknVar);
                        if (ckmVar != null) {
                            ckmVar.b(ctoVar, executor);
                            ckhVar = new ckh(ckiVar, ctoVar, ckmVar);
                        } else {
                            Executor executor3 = executor;
                            ckm ckmVar2 = (ckm) ckiVar.a.d.a();
                            hy.N(ckmVar2);
                            ckmVar2.h(cknVar, z4, z);
                            ckd ckdVar = ckiVar.c;
                            cjw cjwVar = (cjw) ckdVar.a.a();
                            hy.N(cjwVar);
                            int i8 = ckdVar.b;
                            ckdVar.b = i8 + 1;
                            cjs cjsVar = cjwVar.a;
                            ckg ckgVar = cjwVar.q;
                            cjsVar.c = cfsVar;
                            cjsVar.d = obj;
                            cjsVar.m = chyVar;
                            cjsVar.e = i3;
                            cjsVar.f = i4;
                            cjsVar.o = ckbVar;
                            try {
                                cjsVar.g = cls;
                                cjsVar.r = ckgVar;
                                cjsVar.j = cls3;
                                cjsVar.n = cfvVar;
                                cjsVar.h = cicVar;
                                cjsVar.i = map;
                                cjsVar.p = z2;
                                cjsVar.q = z3;
                                cjwVar.d = cfsVar;
                                cjwVar.e = chyVar;
                                cjwVar.f = cfvVar;
                                cjwVar.g = i3;
                                cjwVar.h = i4;
                                cjwVar.i = ckbVar;
                                cjwVar.j = cicVar;
                                cjwVar.k = ckmVar2;
                                cjwVar.l = i8;
                                cjwVar.p = 1;
                                ckiVar.f.a.put(cknVar, ckmVar2);
                                ctoVar = this;
                                ckmVar2.b(ctoVar, executor3);
                                ckmVar2.g(cjwVar);
                                ckhVar = new ckh(ckiVar, ctoVar, ckmVar2);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        ctoVar.e(ckoVar, 5);
                        ckhVar = null;
                    }
                    ctoVar.r = ckhVar;
                    if (ctoVar.A != 2) {
                        ctoVar.r = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.cth
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 4;
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 6;
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.A == 4;
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean m(cth cthVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        ctd ctdVar;
        cfv cfvVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        ctd ctdVar2;
        cfv cfvVar2;
        int size2;
        if (!(cthVar instanceof cto)) {
            return false;
        }
        synchronized (this.b) {
            i = this.j;
            i2 = this.k;
            obj = this.g;
            cls = this.h;
            ctdVar = this.i;
            cfvVar = this.l;
            List list = this.n;
            size = list != null ? list.size() : 0;
        }
        cto ctoVar = (cto) cthVar;
        synchronized (ctoVar.b) {
            i3 = ctoVar.j;
            i4 = ctoVar.k;
            obj2 = ctoVar.g;
            cls2 = ctoVar.h;
            ctdVar2 = ctoVar.i;
            cfvVar2 = ctoVar.l;
            List list2 = ctoVar.n;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && cvd.k(obj, obj2) && cls.equals(cls2) && ctdVar.equals(ctdVar2) && cfvVar == cfvVar2 && size == size2;
    }

    @Override // defpackage.cth
    public final boolean n() {
        boolean z;
        synchronized (this.b) {
            int i = this.A;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(cls);
        int length = String.valueOf(obj2).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj2);
        sb.append("[model=");
        sb.append(valueOf);
        sb.append(", transcodeClass=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
