package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
public final class o1 extends b5<o1, a> implements m6 {
    private static final o1 zzg;
    private static volatile w6<o1> zzh;
    private h5 zzc = b5.l();
    private h5 zzd = b5.l();
    private k5<h1> zze = b5.m();
    private k5<p1> zzf = b5.m();

    /* loaded from: classes.dex */
    public static final class a extends b5.a<o1, a> implements m6 {
        private a() {
            super(o1.zzg);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).d(i);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).a(iterable);
            return this;
        }

        public final a b(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).e(i);
            return this;
        }

        public final a b(Iterable<? extends Long> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).b(iterable);
            return this;
        }

        public final a c(Iterable<? extends h1> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).c(iterable);
            return this;
        }

        public final a d(Iterable<? extends p1> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).d(iterable);
            return this;
        }

        public final a j() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).z();
            return this;
        }

        public final a k() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((o1) this.f4062c).A();
            return this;
        }
    }

    static {
        o1 o1Var = new o1();
        zzg = o1Var;
        b5.a(o1.class, o1Var);
    }

    private o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzd = b5.l();
    }

    private final void B() {
        k5<h1> k5Var = this.zze;
        if (!k5Var.f()) {
            this.zze = b5.a(k5Var);
        }
    }

    private final void C() {
        k5<p1> k5Var = this.zzf;
        if (!k5Var.f()) {
            this.zzf = b5.a(k5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        h5 h5Var = this.zzc;
        if (!h5Var.f()) {
            this.zzc = b5.a(h5Var);
        }
        m3.a(iterable, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Iterable<? extends Long> iterable) {
        h5 h5Var = this.zzd;
        if (!h5Var.f()) {
            this.zzd = b5.a(h5Var);
        }
        m3.a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Iterable<? extends h1> iterable) {
        B();
        m3.a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i) {
        B();
        this.zze.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Iterable<? extends p1> iterable) {
        C();
        m3.a(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        C();
        this.zzf.remove(i);
    }

    public static a v() {
        return zzg.i();
    }

    public static o1 x() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzc = b5.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new o1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", h1.class, "zzf", p1.class});
            case 4:
                return zzg;
            case 5:
                w6<o1> w6Var = zzh;
                if (w6Var == null) {
                    synchronized (o1.class) {
                        w6Var = zzh;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzg);
                            zzh = w6Var;
                        }
                    }
                }
                return w6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final h1 b(int i) {
        return this.zze.get(i);
    }

    public final p1 c(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> n() {
        return this.zzc;
    }

    public final int o() {
        return this.zzc.size();
    }

    public final List<Long> p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final List<h1> r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final List<p1> t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }
}
