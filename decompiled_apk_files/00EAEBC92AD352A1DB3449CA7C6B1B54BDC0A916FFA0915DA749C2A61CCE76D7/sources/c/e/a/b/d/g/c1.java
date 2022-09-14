package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
/* loaded from: classes.dex */
public final class c1 extends b5<c1, a> implements m6 {
    private static final c1 zzf;
    private static volatile w6<c1> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* loaded from: classes.dex */
    public static final class a extends b5.a<c1, a> implements m6 {
        private a() {
            super(c1.zzf);
        }

        /* synthetic */ a(f1 f1Var) {
            this();
        }
    }

    static {
        c1 c1Var = new c1();
        zzf = c1Var;
        b5.a(c1.class, c1Var);
    }

    private c1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (f1.f4145a[i - 1]) {
            case 1:
                return new c1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                w6<c1> w6Var = zzg;
                if (w6Var == null) {
                    synchronized (c1.class) {
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

    public final String n() {
        return this.zzd;
    }

    public final String o() {
        return this.zze;
    }
}
