package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bvz  reason: default package */
/* loaded from: classes.dex */
public final class bvz<R> implements Runnable, Comparable<bvz<?>>, bvs, cjv {
    private int A;
    private int B;
    public brk d;
    public btw e;
    public bro f;
    public int g;
    public int h;
    public bwe i;
    public bua j;
    public bvv<R> k;
    public int l;
    public btw m;
    public volatile bvt n;
    public volatile boolean o;
    public int p;
    public final bwj q;
    private final my<bvz<?>> t;
    private Thread u;
    private btw v;
    private Object w;
    private buj<?> x;
    private volatile boolean y;
    private boolean z;
    public final bvu<R> a = new bvu<>();
    private final List<Throwable> r = new ArrayList();
    private final cjz s = cjz.c();
    public final bvw<?> b = new bvw<>();
    public final bvx c = new bvx();

    public bvz(bwj bwjVar, my myVar) {
        this.q = bwjVar;
        this.t = myVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    private final void i() {
        this.u = Thread.currentThread();
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.o && this.n != null && !(z = this.n.a())) {
            this.A = f(this.A);
            this.n = h();
            if (this.A == 4) {
                c();
                return;
            }
        }
        if ((this.A == 6 || this.o) && !z) {
            j();
        }
    }

    private final void j() {
        k();
        bwx bwxVar = new bwx("Failed to load resource", new ArrayList(this.r));
        bvv<R> bvvVar = this.k;
        synchronized (bvvVar) {
            ((bwr) bvvVar).i = bwxVar;
        }
        synchronized (bvvVar) {
            ((bwr) bvvVar).b.a();
            if (((bwr) bvvVar).l) {
                ((bwr) bvvVar).h();
            } else if (!((bwr) bvvVar).a.b()) {
                if (!((bwr) bvvVar).j) {
                    ((bwr) bvvVar).j = true;
                    btw btwVar = ((bwr) bvvVar).e;
                    bwq d = ((bwr) bvvVar).a.d();
                    ((bwr) bvvVar).f(d.c() + 1);
                    bwr<?> bwrVar = (bwr) bvvVar;
                    bwrVar.d.a(bwrVar, btwVar, null);
                    Iterator<bwp> it = d.iterator();
                    while (it.hasNext()) {
                        bwp next = it.next();
                        next.b.execute(new bwm(bwrVar, next.a));
                    }
                    bwrVar.g();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.c.b()) {
            a();
        }
    }

    private final void k() {
        Throwable th;
        this.s.a();
        if (!this.y) {
            this.y = true;
            return;
        }
        if (this.r.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.r;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // defpackage.cjv
    public final cjz Nk() {
        return this.s;
    }

    public final void a() {
        this.c.c();
        bvw<?> bvwVar = this.b;
        bvwVar.a = null;
        bvwVar.b = null;
        bvwVar.c = null;
        bvu<R> bvuVar = this.a;
        bvuVar.c = null;
        bvuVar.d = null;
        bvuVar.m = null;
        bvuVar.g = null;
        bvuVar.j = null;
        bvuVar.h = null;
        bvuVar.n = null;
        bvuVar.i = null;
        bvuVar.o = null;
        bvuVar.a.clear();
        bvuVar.k = false;
        bvuVar.b.clear();
        bvuVar.l = false;
        this.y = false;
        this.d = null;
        this.e = null;
        this.j = null;
        this.f = null;
        this.k = null;
        this.A = 0;
        this.n = null;
        this.u = null;
        this.m = null;
        this.w = null;
        this.B = 0;
        this.x = null;
        this.o = false;
        this.r.clear();
        this.t.b(this);
    }

    @Override // defpackage.bvs
    public final void c() {
        this.p = 2;
        this.k.a(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(bvz<?> bvzVar) {
        bvz<?> bvzVar2 = bvzVar;
        int g = g() - bvzVar2.g();
        return g == 0 ? this.l - bvzVar2.l : g;
    }

    @Override // defpackage.bvs
    public final void d(btw btwVar, Object obj, buj<?> bujVar, int i, btw btwVar2) {
        this.m = btwVar;
        this.w = obj;
        this.x = bujVar;
        this.B = i;
        this.v = btwVar2;
        boolean z = false;
        if (btwVar != this.a.h().get(0)) {
            z = true;
        }
        this.z = z;
        if (Thread.currentThread() == this.u) {
            l();
            return;
        }
        this.p = 3;
        this.k.a(this);
    }

    @Override // defpackage.bvs
    public final void e(btw btwVar, Exception exc, buj<?> bujVar, int i) {
        bujVar.b();
        bwx bwxVar = new bwx("Fetching data failed", Collections.singletonList(exc));
        bwxVar.b(btwVar, i, bujVar.d());
        this.r.add(bwxVar);
        if (Thread.currentThread() != this.u) {
            this.p = 2;
            this.k.a(this);
            return;
        }
        i();
    }

    public final int f(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                if (!this.i.a()) {
                    return f(2);
                }
                return 2;
            } else if (i2 == 1) {
                if (!this.i.b()) {
                    return f(3);
                }
                return 3;
            } else if (i2 == 2) {
                return 4;
            } else {
                if (i2 == 3 || i2 == 5) {
                    return 6;
                }
                String a = bvy.a(i);
                StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        throw null;
    }

    private final bvt h() {
        int i = this.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return new bxe(this.a, this);
            }
            if (i2 == 2) {
                bvu<R> bvuVar = this.a;
                return new bvp(bvuVar.h(), bvuVar, this);
            } else if (i2 == 3) {
                return new bxj(this.a, this);
            } else {
                if (i2 == 5) {
                    return null;
                }
                String a = bvy.a(i);
                StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        }
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj<?> bujVar = this.x;
        try {
            try {
                if (this.o) {
                    j();
                    if (bujVar == null) {
                        return;
                    }
                    return;
                }
                int i = this.p;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    this.A = f(1);
                    this.n = h();
                    i();
                } else if (i2 == 1) {
                    i();
                } else if (i2 == 2) {
                    l();
                } else {
                    String str = i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                    StringBuilder sb = new StringBuilder(str.length() + 25);
                    sb.append("Unrecognized run reason: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                if (bujVar == null) {
                    return;
                }
                bujVar.b();
            } finally {
                if (bujVar != null) {
                    bujVar.b();
                }
            }
        } catch (bvo e) {
            throw e;
        } catch (Throwable th) {
            if (this.A != 5) {
                this.r.add(th);
                j();
            }
            if (!this.o) {
                throw th;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x022e, TryCatch #11 {bwx -> 0x0233, blocks: (B:3:0x0002, B:5:0x000a, B:101:0x020b, B:8:0x0011, B:25:0x005b, B:100:0x0208, B:12:0x002a, B:17:0x0034, B:19:0x003e, B:24:0x0048, B:26:0x0065, B:99:0x0203, B:109:0x0223, B:110:0x0228), top: B:188:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0201 A[EDGE_INSN: B:200:0x0201->B:98:0x0201 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4 A[LOOP:1: B:28:0x007e->B:96:0x01f4, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvz.l():void");
    }
}
