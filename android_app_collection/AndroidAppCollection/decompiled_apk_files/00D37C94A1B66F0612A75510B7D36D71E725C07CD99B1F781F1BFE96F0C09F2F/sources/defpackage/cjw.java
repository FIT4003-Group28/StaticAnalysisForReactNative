package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjw  reason: default package */
/* loaded from: classes2.dex */
public final class cjw implements Runnable, Comparable, cjq, cvi {
    private int A;
    private int B;
    public cfs d;
    public chy e;
    public cfv f;
    public int g;
    public int h;
    public ckb i;
    public cic j;
    public cjt k;
    public int l;
    public chy m;
    public volatile cjr n;
    public volatile boolean o;
    public int p;
    public final ckg q;
    private final jk t;
    private Thread u;
    private chy v;
    private Object w;
    private cil x;
    private volatile boolean y;
    private boolean z;
    public final cjs a = new cjs();
    private final List r = new ArrayList();
    private final cvl s = cvl.a();
    public final cju b = new cju();
    public final cjv c = new cjv();

    public cjw(ckg ckgVar, jk jkVar) {
        this.q = ckgVar;
        this.t = jkVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ce A[EDGE_INSN: B:184:0x01ce->B:84:0x01ce ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x01fb, TryCatch #9 {ckq -> 0x0200, blocks: (B:3:0x0002, B:5:0x000a, B:87:0x01d8, B:8:0x0011, B:25:0x005b, B:86:0x01d5, B:98:0x01f7, B:99:0x01fa, B:12:0x002a, B:17:0x0034, B:19:0x003e, B:24:0x0048), top: B:174:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[LOOP:1: B:28:0x007c->B:82:0x01c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjw.i():void");
    }

    private final void j() {
        l();
        ckq ckqVar = new ckq("Failed to load resource", new ArrayList(this.r));
        cjt cjtVar = this.k;
        synchronized (cjtVar) {
            ((ckm) cjtVar).g = ckqVar;
        }
        synchronized (cjtVar) {
            ((ckm) cjtVar).b.b();
            if (((ckm) cjtVar).j) {
                ((ckm) cjtVar).e();
            } else if (!((ckm) cjtVar).a.e()) {
                if (!((ckm) cjtVar).h) {
                    ((ckm) cjtVar).h = true;
                    chy chyVar = ((ckm) cjtVar).c;
                    ckl c = ((ckm) cjtVar).a.c();
                    ((ckm) cjtVar).d(c.a() + 1);
                    ckm ckmVar = (ckm) cjtVar;
                    ckmVar.m.b(ckmVar, chyVar, null);
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        ckk ckkVar = (ckk) it.next();
                        ckkVar.b.execute(new ckj(ckmVar, ckkVar.a, 1));
                    }
                    ckmVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.c.c()) {
            b();
        }
    }

    private final void k() {
        this.u = Thread.currentThread();
        cuy.b();
        boolean z = false;
        while (!this.o && this.n != null && !(z = this.n.b())) {
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

    private final void l() {
        Throwable th;
        this.s.b();
        if (!this.y) {
            this.y = true;
            return;
        }
        if (this.r.isEmpty()) {
            th = null;
        } else {
            List list = this.r;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void b() {
        this.c.a();
        cju cjuVar = this.b;
        cjuVar.a = null;
        cjuVar.b = null;
        cjuVar.c = null;
        cjs cjsVar = this.a;
        cjsVar.c = null;
        cjsVar.d = null;
        cjsVar.m = null;
        cjsVar.g = null;
        cjsVar.j = null;
        cjsVar.h = null;
        cjsVar.n = null;
        cjsVar.i = null;
        cjsVar.o = null;
        cjsVar.a.clear();
        cjsVar.k = false;
        cjsVar.b.clear();
        cjsVar.l = false;
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

    @Override // defpackage.cjq
    public final void c() {
        this.p = 2;
        this.k.jW(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cjw cjwVar = (cjw) obj;
        int g = g() - cjwVar.g();
        return g == 0 ? this.l - cjwVar.l : g;
    }

    @Override // defpackage.cjq
    public final void d(chy chyVar, Exception exc, cil cilVar, int i) {
        cilVar.c();
        ckq ckqVar = new ckq("Fetching data failed", Collections.singletonList(exc));
        ckqVar.b(chyVar, i, cilVar.a());
        this.r.add(ckqVar);
        if (Thread.currentThread() != this.u) {
            this.p = 2;
            this.k.jW(this);
            return;
        }
        k();
    }

    @Override // defpackage.cjq
    public final void e(chy chyVar, Object obj, cil cilVar, int i, chy chyVar2) {
        this.m = chyVar;
        this.w = obj;
        this.x = cilVar;
        this.B = i;
        this.v = chyVar2;
        boolean z = false;
        if (chyVar != this.a.e().get(0)) {
            z = true;
        }
        this.z = z;
        if (Thread.currentThread() == this.u) {
            i();
            return;
        }
        this.p = 3;
        this.k.jW(this);
    }

    @Override // defpackage.cvi
    public final cvl jX() {
        return this.s;
    }

    public final int f(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                if (!this.i.b()) {
                    return f(2);
                }
                return 2;
            } else if (i2 == 1) {
                if (!this.i.a()) {
                    return f(3);
                }
                return 3;
            } else if (i2 == 2) {
                return 4;
            } else {
                if (i2 == 3 || i2 == 5) {
                    return 6;
                }
                String l = ake.l(i);
                StringBuilder sb = new StringBuilder(l.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(l);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        throw null;
    }

    private final cjr h() {
        int i = this.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return new ckv(this.a, this);
            }
            if (i2 == 2) {
                cjs cjsVar = this.a;
                return new cjn(cjsVar.e(), cjsVar, this);
            } else if (i2 == 3) {
                return new ckz(this.a, this);
            } else {
                if (i2 == 5) {
                    return null;
                }
                String l = ake.l(i);
                StringBuilder sb = new StringBuilder(l.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(l);
                throw new IllegalStateException(sb.toString());
            }
        }
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cil cilVar = this.x;
        try {
            try {
                if (this.o) {
                    j();
                    if (cilVar == null) {
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
                    k();
                } else if (i2 == 1) {
                    k();
                } else if (i2 == 2) {
                    i();
                } else {
                    String str = i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                    StringBuilder sb = new StringBuilder(str.length() + 25);
                    sb.append("Unrecognized run reason: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                if (cilVar == null) {
                    return;
                }
                cilVar.c();
            } finally {
                if (cilVar != null) {
                    cilVar.c();
                }
            }
        } catch (cjm e) {
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
}
