package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class a1 extends b5<a1, a> implements m6 {
    private static final a1 zzh;
    private static volatile w6<a1> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<a1, a> implements m6 {
        private a() {
            super(a1.zzh);
        }

        /* synthetic */ a(f1 f1Var) {
            this();
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((a1) this.f4062c).a(str);
            return this;
        }

        public final String j() {
            return ((a1) this.f4062c).n();
        }

        public final boolean k() {
            return ((a1) this.f4062c).o();
        }

        public final boolean l() {
            return ((a1) this.f4062c).p();
        }

        public final boolean m() {
            return ((a1) this.f4062c).q();
        }

        public final int n() {
            return ((a1) this.f4062c).r();
        }
    }

    static {
        a1 a1Var = new a1();
        zzh = a1Var;
        b5.a(a1.class, a1Var);
    }

    private a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (f1.f4145a[i - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                w6<a1> w6Var = zzi;
                if (w6Var == null) {
                    synchronized (a1.class) {
                        w6Var = zzi;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzh);
                            zzi = w6Var;
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

    public final String n() {
        return this.zzd;
    }

    public final boolean o() {
        return this.zze;
    }

    public final boolean p() {
        return this.zzf;
    }

    public final boolean q() {
        return (this.zzc & 8) != 0;
    }

    public final int r() {
        return this.zzg;
    }
}
