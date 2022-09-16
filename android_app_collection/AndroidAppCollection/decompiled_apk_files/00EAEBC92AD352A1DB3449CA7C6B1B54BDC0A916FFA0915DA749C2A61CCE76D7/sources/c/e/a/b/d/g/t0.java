package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class t0 extends b5<t0, b> implements m6 {
    private static final t0 zzi;
    private static volatile w6<t0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* loaded from: classes.dex */
    public enum a implements d5 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4419b;

        static {
            new y0();
        }

        a(int i) {
            this.f4419b = i;
        }

        public static a a(int i) {
            if (i != 0) {
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i == 4) {
                    return BETWEEN;
                }
                return null;
            }
            return UNKNOWN_COMPARISON_TYPE;
        }

        public static f5 j() {
            return x0.f4511a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4419b + " name=" + name() + '>';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends b5.a<t0, b> implements m6 {
        private b() {
            super(t0.zzi);
        }

        /* synthetic */ b(w0 w0Var) {
            this();
        }
    }

    static {
        t0 t0Var = new t0();
        zzi = t0Var;
        b5.a(t0.class, t0Var);
    }

    private t0() {
    }

    public static t0 y() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new t0();
            case 2:
                return new b(null);
            case 3:
                return b5.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.j(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                w6<t0> w6Var = zzj;
                if (w6Var == null) {
                    synchronized (t0.class) {
                        w6Var = zzj;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzi);
                            zzj = w6Var;
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

    public final a o() {
        a a2 = a.a(this.zzd);
        return a2 == null ? a.UNKNOWN_COMPARISON_TYPE : a2;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final String s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 16) != 0;
    }

    public final String x() {
        return this.zzh;
    }
}
