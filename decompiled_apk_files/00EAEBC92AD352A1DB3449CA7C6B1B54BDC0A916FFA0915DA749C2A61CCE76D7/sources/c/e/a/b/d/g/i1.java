package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import c.e.a.b.d.g.k1;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i1 extends b5<i1, a> implements m6 {
    private static final i1 zzi;
    private static volatile w6<i1> zzj;
    private int zzc;
    private k5<k1> zzd = b5.m();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<i1, a> implements m6 {
        private a() {
            super(i1.zzi);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(int i, k1.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(i, (k1) aVar.i());
            return this;
        }

        public final a a(int i, k1 k1Var) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(i, k1Var);
            return this;
        }

        public final a a(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(j);
            return this;
        }

        public final a a(k1.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a((k1) aVar.i());
            return this;
        }

        public final a a(k1 k1Var) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(k1Var);
            return this;
        }

        public final a a(Iterable<? extends k1> iterable) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).a(str);
            return this;
        }

        public final k1 a(int i) {
            return ((i1) this.f4062c).b(i);
        }

        public final a b(int i) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).c(i);
            return this;
        }

        public final a b(long j) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).b(j);
            return this;
        }

        public final List<k1> j() {
            return Collections.unmodifiableList(((i1) this.f4062c).n());
        }

        public final int k() {
            return ((i1) this.f4062c).o();
        }

        public final a l() {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((i1) this.f4062c).A();
            return this;
        }

        public final String m() {
            return ((i1) this.f4062c).p();
        }

        public final long n() {
            return ((i1) this.f4062c).r();
        }

        public final long o() {
            return ((i1) this.f4062c).t();
        }
    }

    static {
        i1 i1Var = new i1();
        zzi = i1Var;
        b5.a(i1.class, i1Var);
    }

    private i1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzd = b5.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, k1 k1Var) {
        k1Var.getClass();
        z();
        this.zzd.set(i, k1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(k1 k1Var) {
        k1Var.getClass();
        z();
        this.zzd.add(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends k1> iterable) {
        z();
        m3.a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        z();
        this.zzd.remove(i);
    }

    public static a x() {
        return zzi.i();
    }

    private final void z() {
        k5<k1> k5Var = this.zzd;
        if (!k5Var.f()) {
            this.zzd = b5.a(k5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new i1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", k1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                w6<i1> w6Var = zzj;
                if (w6Var == null) {
                    synchronized (i1.class) {
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

    public final k1 b(int i) {
        return this.zzd.get(i);
    }

    public final List<k1> n() {
        return this.zzd;
    }

    public final int o() {
        return this.zzd.size();
    }

    public final String p() {
        return this.zze;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final long r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final long t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zzc & 8) != 0;
    }

    public final int v() {
        return this.zzh;
    }
}
