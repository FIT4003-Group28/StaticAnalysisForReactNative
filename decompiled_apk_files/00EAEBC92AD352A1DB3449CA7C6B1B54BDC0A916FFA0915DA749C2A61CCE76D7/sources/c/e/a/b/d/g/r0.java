package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
public final class r0 extends b5<r0, a> implements m6 {
    private static final r0 zzl;
    private static volatile w6<r0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private k5<s0> zzf = b5.m();
    private boolean zzg;
    private t0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<r0, a> implements m6 {
        private a() {
            super(r0.zzl);
        }

        /* synthetic */ a(w0 w0Var) {
            this();
        }

        public final a a(int i, s0 s0Var) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((r0) this.f4062c).a(i, s0Var);
            return this;
        }

        public final a a(String str) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((r0) this.f4062c).a(str);
            return this;
        }

        public final s0 a(int i) {
            return ((r0) this.f4062c).b(i);
        }

        public final String j() {
            return ((r0) this.f4062c).p();
        }

        public final int k() {
            return ((r0) this.f4062c).r();
        }
    }

    static {
        r0 r0Var = new r0();
        zzl = r0Var;
        b5.a(r0.class, r0Var);
    }

    private r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, s0 s0Var) {
        s0Var.getClass();
        k5<s0> k5Var = this.zzf;
        if (!k5Var.f()) {
            this.zzf = b5.a(k5Var);
        }
        this.zzf.set(i, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a z() {
        return zzl.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", s0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                w6<r0> w6Var = zzm;
                if (w6Var == null) {
                    synchronized (r0.class) {
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

    public final s0 b(int i) {
        return this.zzf.get(i);
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

    public final List<s0> q() {
        return this.zzf;
    }

    public final int r() {
        return this.zzf.size();
    }

    public final boolean s() {
        return (this.zzc & 8) != 0;
    }

    public final t0 t() {
        t0 t0Var = this.zzh;
        return t0Var == null ? t0.y() : t0Var;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zzc & 64) != 0;
    }

    public final boolean y() {
        return this.zzk;
    }
}
