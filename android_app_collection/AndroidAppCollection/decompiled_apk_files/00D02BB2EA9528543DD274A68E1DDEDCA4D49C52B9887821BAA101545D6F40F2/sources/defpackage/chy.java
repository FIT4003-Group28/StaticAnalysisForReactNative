package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chy  reason: default package */
/* loaded from: classes.dex */
public final class chy<R> implements chs, cii, chx {
    public final Object a;
    public final Object b;
    public final Class<R> c;
    public final chp<?> d;
    public final int e;
    public final int f;
    public final bro g;
    public final List<chv<R>> h;
    private final chv<R> j;
    private final Context k;
    private final brk l;
    private final cij<R> m;
    private final ciu<? super R> n;
    private final Executor o;
    private bxd<R> p;
    private bwk q;
    private long r;
    private volatile bwl s;
    private Drawable t;
    private int u;
    private int v;
    private boolean w;
    private RuntimeException x;
    private final cjz i = cjz.c();
    private int y = 1;

    public chy(Context context, brk brkVar, Object obj, Object obj2, Class<R> cls, chp<?> chpVar, int i, int i2, bro broVar, cij<R> cijVar, chv<R> chvVar, List<chv<R>> list, bwl bwlVar, ciu<? super R> ciuVar, Executor executor) {
        this.a = obj;
        this.k = context;
        this.l = brkVar;
        this.b = obj2;
        this.c = cls;
        this.d = chpVar;
        this.e = i;
        this.f = i2;
        this.g = broVar;
        this.m = cijVar;
        this.j = chvVar;
        this.h = list;
        this.s = bwlVar;
        this.n = ciuVar;
        this.o = executor;
        if (this.x != null || !brkVar.g.a(brg.class)) {
            return;
        }
        this.x = new RuntimeException("Glide request origin trace");
    }

    private final void k() {
        if (!this.w) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    private final Drawable l() {
        int i;
        if (this.t == null) {
            chp<?> chpVar = this.d;
            Drawable drawable = chpVar.g;
            this.t = drawable;
            if (drawable == null && (i = chpVar.h) > 0) {
                Resources.Theme theme = this.k.getTheme();
                brk brkVar = this.l;
                this.t = cet.a(brkVar, brkVar, i, theme);
            }
        }
        return this.t;
    }

    private static int m(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final void n(bwx bwxVar, int i) {
        boolean z;
        this.i.a();
        synchronized (this.a) {
            String valueOf = String.valueOf(this.b);
            int i2 = this.u;
            int i3 = this.v;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Load failed for ");
            sb.append(valueOf);
            sb.append(" with size [");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("]");
            sb.toString();
            List<Throwable> a = bwxVar.a();
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Root cause (");
                sb2.append(i5);
                sb2.append(" of ");
                sb2.append(size);
                sb2.append(")");
                sb2.toString();
                a.get(i4);
                i4 = i5;
            }
            this.q = null;
            this.y = 5;
            boolean z2 = true;
            this.w = true;
            List<chv<R>> list = this.h;
            if (list != null) {
                z = false;
                for (chv<R> chvVar : list) {
                    z |= chvVar.Nl(bwxVar);
                }
            } else {
                z = false;
            }
            chv<R> chvVar2 = this.j;
            if (chvVar2 == null || !chvVar2.Nl(bwxVar)) {
                z2 = false;
            }
            if (!(z | z2)) {
                this.m.a(l());
            }
            this.w = false;
        }
    }

    @Override // defpackage.chs
    public final void a() {
        synchronized (this.a) {
            k();
            this.i.a();
            this.r = SystemClock.elapsedRealtimeNanos();
            if (this.b == null) {
                if (cjp.b(this.e, this.f)) {
                    this.u = this.e;
                    this.v = this.f;
                }
                n(new bwx("Received null model"), 5);
                return;
            }
            int i = this.y;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i != 4) {
                this.y = 3;
                if (cjp.b(this.e, this.f)) {
                    j(this.e, this.f);
                } else {
                    this.m.g(this);
                }
                int i2 = this.y;
                if (i2 == 2 || i2 == 3) {
                    this.m.k(l());
                }
                return;
            }
            i(this.p, 5);
        }
    }

    @Override // defpackage.chs
    public final void b() {
        synchronized (this.a) {
            k();
            this.i.a();
            if (this.y != 6) {
                k();
                this.i.a();
                this.m.h(this);
                bwk bwkVar = this.q;
                bwv bwvVar = null;
                if (bwkVar != null) {
                    synchronized (bwkVar.c) {
                        bwkVar.a.e(bwkVar.b);
                    }
                    this.q = null;
                }
                bxd<R> bxdVar = this.p;
                if (bxdVar != null) {
                    this.p = null;
                    bwvVar = bxdVar;
                }
                this.m.c(l());
                this.y = 6;
                if (bwvVar == null) {
                    return;
                }
                bwvVar.f();
            }
        }
    }

    @Override // defpackage.chs
    public final void c() {
        synchronized (this.a) {
            if (d()) {
                b();
            }
        }
    }

    @Override // defpackage.chs
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.chs
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.chs
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 6;
        }
        return z;
    }

    @Override // defpackage.chx
    public final void g(bwx bwxVar) {
        n(bwxVar, 5);
    }

    @Override // defpackage.chx
    public final Object h() {
        this.i.a();
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, bxd<?>, bxd<R>, bxd] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [cij<R>, cij] */
    /* JADX WARN: Type inference failed for: r4v3, types: [chv, chv<R>] */
    @Override // defpackage.chx
    public final void i(bxd<?> bxdVar, int i) {
        Throwable th;
        boolean z;
        this.i.a();
        bwv bwvVar = null;
        try {
            try {
                synchronized (this.a) {
                    try {
                        this.q = null;
                        if (bxdVar == 0) {
                            String valueOf = String.valueOf(this.c);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
                            sb.append("Expected to receive a Resource<R> with an object of ");
                            sb.append(valueOf);
                            sb.append(" inside, but instead got null.");
                            g(new bwx(sb.toString()));
                            return;
                        }
                        Object b = bxdVar.b();
                        if (b != null && this.c.isAssignableFrom(b.getClass())) {
                            this.y = 4;
                            this.p = bxdVar;
                            if (this.l.h <= 3) {
                                String simpleName = b.getClass().getSimpleName();
                                String a = btj.a(i);
                                String valueOf2 = String.valueOf(this.b);
                                int i2 = this.u;
                                int i3 = this.v;
                                double elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.r;
                                double d = cji.a;
                                Double.isNaN(elapsedRealtimeNanos);
                                double d2 = elapsedRealtimeNanos * d;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 95 + a.length() + String.valueOf(valueOf2).length());
                                sb2.append("Finished loading ");
                                sb2.append(simpleName);
                                sb2.append(" from ");
                                sb2.append(a);
                                sb2.append(" for ");
                                sb2.append(valueOf2);
                                sb2.append(" with size [");
                                sb2.append(i2);
                                sb2.append("x");
                                sb2.append(i3);
                                sb2.append("] in ");
                                sb2.append(d2);
                                sb2.append(" ms");
                                sb2.toString();
                            }
                            boolean z2 = true;
                            this.w = true;
                            List<chv<R>> list = this.h;
                            if (list != null) {
                                z = false;
                                for (chv<R> chvVar : list) {
                                    z |= chvVar.Nm(b, i);
                                    if (chvVar instanceof chq) {
                                        z |= ((chq) chvVar).c();
                                    }
                                }
                            } else {
                                z = false;
                            }
                            chv<R> chvVar2 = this.j;
                            if (chvVar2 == 0 || !chvVar2.Nm(b, i)) {
                                z2 = false;
                            }
                            if (!(z2 | z)) {
                                this.m.b(b, this.n.a(i));
                            }
                            this.w = false;
                            return;
                        }
                        this.p = null;
                        String valueOf3 = String.valueOf(this.c);
                        String valueOf4 = String.valueOf(b != null ? b.getClass() : "");
                        String valueOf5 = String.valueOf(b);
                        String valueOf6 = String.valueOf((Object) bxdVar);
                        String str = b != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
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
                        g(new bwx(sb3.toString()));
                        ((bwv) bxdVar).f();
                    } catch (Throwable th2) {
                        th = th2;
                        bxdVar = (bxd<R>) null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            bwvVar = bxdVar;
                            if (bwvVar != null) {
                                bwvVar.f();
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #2 {all -> 0x019a, blocks: (B:30:0x00e7, B:36:0x013f, B:12:0x007c, B:14:0x0084, B:16:0x0089, B:24:0x00cc, B:19:0x009e, B:21:0x00a2, B:22:0x00b1), top: B:67:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193 A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:4:0x000a, B:6:0x000f, B:45:0x018c, B:47:0x0193, B:48:0x0196, B:55:0x019e, B:44:0x0188, B:61:0x01a6, B:58:0x01a3), top: B:65:0x000a }] */
    @Override // defpackage.cii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chy.j(int, int):void");
    }
}
