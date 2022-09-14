package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class s0 extends b5<s0, a> implements m6 {
    private static final s0 zzh;
    private static volatile w6<s0> zzi;
    private int zzc;
    private v0 zzd;
    private t0 zze;
    private boolean zzf;
    private String zzg = "";

    /* loaded from: classes.dex */
    public static final class a extends b5.a<s0, a> implements m6 {
        private a() {
            super(s0.zzh);
        }

        /* synthetic */ a(w0 w0Var) {
            this();
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((s0) this.f4062c).a(str);
            return this;
        }
    }

    static {
        s0 s0Var = new s0();
        zzh = s0Var;
        b5.a(s0.class, s0Var);
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static s0 v() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                w6<s0> w6Var = zzi;
                if (w6Var == null) {
                    synchronized (s0.class) {
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

    public final boolean n() {
        return (this.zzc & 1) != 0;
    }

    public final v0 o() {
        v0 v0Var = this.zzd;
        return v0Var == null ? v0.v() : v0Var;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final t0 q() {
        t0 t0Var = this.zze;
        return t0Var == null ? t0.y() : t0Var;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final String u() {
        return this.zzg;
    }
}
