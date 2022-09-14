package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class h1 extends b5<h1, a> implements m6 {
    private static final h1 zzf;
    private static volatile w6<h1> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<h1, a> implements m6 {
        private a() {
            super(h1.zzf);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((h1) this.f4062c).b(i);
            return this;
        }

        public final a a(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((h1) this.f4062c).a(j);
            return this;
        }
    }

    static {
        h1 h1Var = new h1();
        zzf = h1Var;
        b5.a(h1.class, h1Var);
    }

    private h1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a r() {
        return zzf.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new h1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                w6<h1> w6Var = zzg;
                if (w6Var == null) {
                    synchronized (h1.class) {
                        w6Var = zzg;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzf);
                            zzg = w6Var;
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

    public final int o() {
        return this.zzd;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final long q() {
        return this.zze;
    }
}
