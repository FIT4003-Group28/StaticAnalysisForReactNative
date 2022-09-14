package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import c.e.a.b.d.g.o1;
/* loaded from: classes.dex */
public final class g1 extends b5<g1, a> implements m6 {
    private static final g1 zzh;
    private static volatile w6<g1> zzi;
    private int zzc;
    private int zzd;
    private o1 zze;
    private o1 zzf;
    private boolean zzg;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<g1, a> implements m6 {
        private a() {
            super(g1.zzh);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((g1) this.f4062c).b(i);
            return this;
        }

        public final a a(o1.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((g1) this.f4062c).a((o1) aVar.i());
            return this;
        }

        public final a a(o1 o1Var) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((g1) this.f4062c).b(o1Var);
            return this;
        }

        public final a a(boolean z) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((g1) this.f4062c).a(z);
            return this;
        }
    }

    static {
        g1 g1Var = new g1();
        zzh = g1Var;
        b5.a(g1.class, g1Var);
    }

    private g1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(o1 o1Var) {
        o1Var.getClass();
        this.zze = o1Var;
        this.zzc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(o1 o1Var) {
        o1Var.getClass();
        this.zzf = o1Var;
        this.zzc |= 4;
    }

    public static a u() {
        return zzh.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new g1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                w6<g1> w6Var = zzi;
                if (w6Var == null) {
                    synchronized (g1.class) {
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

    public final int o() {
        return this.zzd;
    }

    public final o1 p() {
        o1 o1Var = this.zze;
        return o1Var == null ? o1.x() : o1Var;
    }

    public final boolean q() {
        return (this.zzc & 4) != 0;
    }

    public final o1 r() {
        o1 o1Var = this.zzf;
        return o1Var == null ? o1.x() : o1Var;
    }

    public final boolean s() {
        return (this.zzc & 8) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }
}
