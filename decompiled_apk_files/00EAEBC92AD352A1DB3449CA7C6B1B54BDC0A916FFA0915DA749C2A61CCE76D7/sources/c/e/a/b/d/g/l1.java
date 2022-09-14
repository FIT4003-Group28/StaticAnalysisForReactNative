package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import c.e.a.b.d.g.m1;
import java.util.List;
/* loaded from: classes.dex */
public final class l1 extends b5<l1, a> implements m6 {
    private static final l1 zzd;
    private static volatile w6<l1> zze;
    private k5<m1> zzc = b5.m();

    /* loaded from: classes.dex */
    public static final class a extends b5.a<l1, a> implements m6 {
        private a() {
            super(l1.zzd);
        }

        /* synthetic */ a(r1 r1Var) {
            this();
        }

        public final a a(m1.a aVar) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            ((l1) this.f4062c).a((m1) aVar.i());
            return this;
        }

        public final m1 a(int i) {
            return ((l1) this.f4062c).b(0);
        }
    }

    static {
        l1 l1Var = new l1();
        zzd = l1Var;
        b5.a(l1.class, l1Var);
    }

    private l1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(m1 m1Var) {
        m1Var.getClass();
        k5<m1> k5Var = this.zzc;
        if (!k5Var.f()) {
            this.zzc = b5.a(k5Var);
        }
        this.zzc.add(m1Var);
    }

    public static a o() {
        return zzd.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (r1.f4381a[i - 1]) {
            case 1:
                return new l1();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", m1.class});
            case 4:
                return zzd;
            case 5:
                w6<l1> w6Var = zze;
                if (w6Var == null) {
                    synchronized (l1.class) {
                        w6Var = zze;
                        if (w6Var == null) {
                            w6Var = new b5.c<>(zzd);
                            zze = w6Var;
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

    public final m1 b(int i) {
        return this.zzc.get(0);
    }

    public final List<m1> n() {
        return this.zzc;
    }
}
