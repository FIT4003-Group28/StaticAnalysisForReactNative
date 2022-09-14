package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import c.e.a.b.d.g.r0;
import c.e.a.b.d.g.u0;
import java.util.List;
/* loaded from: classes.dex */
public final class q0 extends b5<q0, a> implements m6 {
    private static final q0 zzi;
    private static volatile w6<q0> zzj;
    private int zzc;
    private int zzd;
    private k5<u0> zze = b5.m();
    private k5<r0> zzf = b5.m();
    private boolean zzg;
    private boolean zzh;

    /* loaded from: classes.dex */
    public static final class a extends b5.a<q0, a> implements m6 {
        private a() {
            super(q0.zzi);
        }

        /* synthetic */ a(w0 w0Var) {
            this();
        }

        public final a a(int i, r0.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q0) this.f4062c).a(i, (r0) aVar.i());
            return this;
        }

        public final a a(int i, u0.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((q0) this.f4062c).a(i, (u0) aVar.i());
            return this;
        }

        public final u0 a(int i) {
            return ((q0) this.f4062c).b(i);
        }

        public final r0 b(int i) {
            return ((q0) this.f4062c).c(i);
        }

        public final int j() {
            return ((q0) this.f4062c).q();
        }

        public final int k() {
            return ((q0) this.f4062c).s();
        }
    }

    static {
        q0 q0Var = new q0();
        zzi = q0Var;
        b5.a(q0.class, q0Var);
    }

    private q0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, r0 r0Var) {
        r0Var.getClass();
        k5<r0> k5Var = this.zzf;
        if (!k5Var.f()) {
            this.zzf = b5.a(k5Var);
        }
        this.zzf.set(i, r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, u0 u0Var) {
        u0Var.getClass();
        k5<u0> k5Var = this.zze;
        if (!k5Var.f()) {
            this.zze = b5.a(k5Var);
        }
        this.zze.set(i, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", u0.class, "zzf", r0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                w6<q0> w6Var = zzj;
                if (w6Var == null) {
                    synchronized (q0.class) {
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

    public final u0 b(int i) {
        return this.zze.get(i);
    }

    public final r0 c(int i) {
        return this.zzf.get(i);
    }

    public final boolean n() {
        return (this.zzc & 1) != 0;
    }

    public final int o() {
        return this.zzd;
    }

    public final List<u0> p() {
        return this.zze;
    }

    public final int q() {
        return this.zze.size();
    }

    public final List<r0> r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzf.size();
    }
}
