package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class q1 extends b5<q1, a> implements m6 {
    private static final q1 zzj;
    private static volatile w6<q1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<q1, a> implements m6 {
        private a() {
            super(q1.zzj);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(double d2) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).a(d2);
            return this;
        }

        public final a a(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).a(str);
            return this;
        }

        public final a b(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).b(j);
            return this;
        }

        public final a b(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).b(str);
            return this;
        }

        public final a j() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).z();
            return this;
        }

        public final a k() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).A();
            return this;
        }

        public final a l() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q1) this.f4062c).B();
            return this;
        }
    }

    static {
        q1 q1Var = new q1();
        zzj = q1Var;
        b5.a(q1.class, q1Var);
    }

    private q1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzc &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(double d2) {
        this.zzc |= 32;
        this.zzi = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a x() {
        return zzj.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new q1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                w6<q1> w6Var = zzk;
                if (w6Var == null) {
                    synchronized (q1.class) {
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

    public final long o() {
        return this.zzd;
    }

    public final String p() {
        return this.zze;
    }

    public final boolean q() {
        return (this.zzc & 4) != 0;
    }

    public final String r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzc & 8) != 0;
    }

    public final long t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zzc & 32) != 0;
    }

    public final double v() {
        return this.zzi;
    }
}
