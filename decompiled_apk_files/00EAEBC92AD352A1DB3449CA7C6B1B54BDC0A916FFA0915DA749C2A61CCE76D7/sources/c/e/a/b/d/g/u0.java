package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class u0 extends b5<u0, a> implements m6 {
    private static final u0 zzj;
    private static volatile w6<u0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private s0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<u0, a> implements m6 {
        private a() {
            super(u0.zzj);
        }

        /* synthetic */ a(w0 w0Var) {
            this();
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((u0) this.f4062c).a(str);
            return this;
        }
    }

    static {
        u0 u0Var = new u0();
        zzj = u0Var;
        b5.a(u0.class, u0Var);
    }

    private u0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a v() {
        return zzj.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new u0();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                w6<u0> w6Var = zzk;
                if (w6Var == null) {
                    synchronized (u0.class) {
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

    public final int o() {
        return this.zzd;
    }

    public final String p() {
        return this.zze;
    }

    public final s0 q() {
        s0 s0Var = this.zzf;
        return s0Var == null ? s0.v() : s0Var;
    }

    public final boolean r() {
        return this.zzg;
    }

    public final boolean s() {
        return this.zzh;
    }

    public final boolean t() {
        return (this.zzc & 32) != 0;
    }

    public final boolean u() {
        return this.zzi;
    }
}
