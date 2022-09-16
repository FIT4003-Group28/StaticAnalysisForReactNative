package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
public final class p1 extends b5<p1, a> implements m6 {
    private static final p1 zzf;
    private static volatile w6<p1> zzg;
    private int zzc;
    private int zzd;
    private h5 zze = b5.l();

    /* loaded from: classes.dex */
    public static final class a extends b5.a<p1, a> implements m6 {
        private a() {
            super(p1.zzf);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((p1) this.f4062c).c(i);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((p1) this.f4062c).a(iterable);
            return this;
        }
    }

    static {
        p1 p1Var = new p1();
        zzf = p1Var;
        b5.a(p1.class, p1Var);
    }

    private p1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        h5 h5Var = this.zze;
        if (!h5Var.f()) {
            this.zze = b5.a(h5Var);
        }
        m3.a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
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
                return new p1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                w6<p1> w6Var = zzg;
                if (w6Var == null) {
                    synchronized (p1.class) {
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

    public final long b(int i) {
        return this.zze.b(i);
    }

    public final boolean n() {
        return (this.zzc & 1) != 0;
    }

    public final int o() {
        return this.zzd;
    }

    public final List<Long> p() {
        return this.zze;
    }

    public final int q() {
        return this.zze.size();
    }
}
