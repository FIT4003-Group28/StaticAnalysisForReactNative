package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class n1 extends b5<n1, b> implements m6 {
    private static final n1 zzf;
    private static volatile w6<n1> zzg;
    private int zzc;
    private int zzd = 1;
    private k5<j1> zze = b5.m();

    /* loaded from: classes.dex */
    public enum a implements d5 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4313b;

        static {
            new t1();
        }

        a(int i) {
            this.f4313b = i;
        }

        public static a a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return PROVISIONING;
                }
                return null;
            }
            return RADS;
        }

        public static f5 j() {
            return s1.f4399a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4313b + " name=" + name() + '>';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends b5.a<n1, b> implements m6 {
        private b() {
            super(n1.zzf);
        }

        /* synthetic */ b(r1 r1Var) {
            this();
        }
    }

    static {
        n1 n1Var = new n1();
        zzf = n1Var;
        b5.a(n1.class, n1Var);
    }

    private n1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new n1();
            case 2:
                return new b(null);
            case 3:
                return b5.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.j(), "zze", j1.class});
            case 4:
                return zzf;
            case 5:
                w6<n1> w6Var = zzg;
                if (w6Var == null) {
                    synchronized (n1.class) {
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
}
