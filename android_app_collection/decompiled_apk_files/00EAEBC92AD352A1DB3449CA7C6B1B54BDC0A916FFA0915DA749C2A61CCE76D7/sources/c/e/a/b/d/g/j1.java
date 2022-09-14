package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class j1 extends b5<j1, a> implements m6 {
    private static final j1 zzf;
    private static volatile w6<j1> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<j1, a> implements m6 {
        private a() {
            super(j1.zzf);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }
    }

    static {
        j1 j1Var = new j1();
        zzf = j1Var;
        b5.a(j1.class, j1Var);
    }

    private j1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new j1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                w6<j1> w6Var = zzg;
                if (w6Var == null) {
                    synchronized (j1.class) {
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
