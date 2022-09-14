package c.e.a.b.d.g;

import c.e.a.b.d.g.a1;
import c.e.a.b.d.g.b5;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class b1 extends b5<b1, a> implements m6 {
    private static final b1 zzl;
    private static volatile w6<b1> zzm;
    private int zzc;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private String zze = "";
    private k5<c1> zzg = b5.m();
    private k5<a1> zzh = b5.m();
    private k5<q0> zzi = b5.m();
    private String zzj = "";

    /* loaded from: classes.dex */
    public static final class a extends b5.a<b1, a> implements m6 {
        private a() {
            super(b1.zzl);
        }

        /* synthetic */ a(f1 f1Var) {
            this();
        }

        public final a1 a(int i) {
            return ((b1) this.f4062c).b(i);
        }

        public final a a(int i, a1.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((b1) this.f4062c).a(i, (a1) aVar.i());
            return this;
        }

        public final int j() {
            return ((b1) this.f4062c).s();
        }

        public final List<q0> k() {
            return Collections.unmodifiableList(((b1) this.f4062c).t());
        }

        public final a l() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((b1) this.f4062c).z();
            return this;
        }
    }

    static {
        b1 b1Var = new b1();
        zzl = b1Var;
        b5.a(b1.class, b1Var);
    }

    private b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, a1 a1Var) {
        a1Var.getClass();
        k5<a1> k5Var = this.zzh;
        if (!k5Var.f()) {
            this.zzh = b5.a(k5Var);
        }
        this.zzh.set(i, a1Var);
    }

    public static a v() {
        return zzl.i();
    }

    public static b1 x() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzi = b5.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (f1.f4145a[i - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", c1.class, "zzh", a1.class, "zzi", q0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                w6<b1> w6Var = zzm;
                if (w6Var == null) {
                    synchronized (b1.class) {
                        w6Var = zzm;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzl);
                            zzm = w6Var;
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

    public final a1 b(int i) {
        return this.zzh.get(i);
    }

    public final boolean n() {
        return (this.zzc & 1) != 0;
    }

    public final long o() {
        return this.zzd;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final String q() {
        return this.zze;
    }

    public final List<c1> r() {
        return this.zzg;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final List<q0> t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzk;
    }
}
