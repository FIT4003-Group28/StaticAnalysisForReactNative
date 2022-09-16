package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
public final class k1 extends b5<k1, a> implements m6 {
    private static final k1 zzj;
    private static volatile w6<k1> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private k5<k1> zzi = b5.m();

    /* loaded from: classes.dex */
    public static final class a extends b5.a<k1, a> implements m6 {
        private a() {
            super(k1.zzj);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(double d2) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).a(d2);
            return this;
        }

        public final a a(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).a(j);
            return this;
        }

        public final a a(a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).e((k1) aVar.i());
            return this;
        }

        public final a a(Iterable<? extends k1> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).a(iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).a(str);
            return this;
        }

        public final a b(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).b(str);
            return this;
        }

        public final a j() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).C();
            return this;
        }

        public final a k() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).D();
            return this;
        }

        public final a l() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).E();
            return this;
        }

        public final int m() {
            return ((k1) this.f4062c).z();
        }

        public final a n() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((k1) this.f4062c).G();
            return this;
        }
    }

    static {
        k1 k1Var = new k1();
        zzj = k1Var;
        b5.a(k1.class, k1Var);
    }

    private k1() {
    }

    public static a A() {
        return zzj.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        this.zzc &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    private final void F() {
        k5<k1> k5Var = this.zzi;
        if (!k5Var.f()) {
            this.zzi = b5.a(k5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        this.zzi = b5.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(double d2) {
        this.zzc |= 16;
        this.zzh = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends k1> iterable) {
        F();
        m3.a(iterable, this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(k1 k1Var) {
        k1Var.getClass();
        F();
        this.zzi.add(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new k1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", k1.class});
            case 4:
                return zzj;
            case 5:
                w6<k1> w6Var = zzk;
                if (w6Var == null) {
                    synchronized (k1.class) {
                        w6Var = zzk;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzj);
                            zzk = w6Var;
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

    public final boolean n() {
        return (this.zzc & 1) != 0;
    }

    public final String o() {
        return this.zzd;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final long s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final float u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 16) != 0;
    }

    public final double x() {
        return this.zzh;
    }

    public final List<k1> y() {
        return this.zzi;
    }

    public final int z() {
        return this.zzi.size();
    }
}
