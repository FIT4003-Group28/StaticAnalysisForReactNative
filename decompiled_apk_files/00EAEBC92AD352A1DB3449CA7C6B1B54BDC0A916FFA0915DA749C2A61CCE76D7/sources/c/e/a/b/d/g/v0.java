package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.List;
/* loaded from: classes.dex */
public final class v0 extends b5<v0, a> implements m6 {
    private static final v0 zzh;
    private static volatile w6<v0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private k5<String> zzg = b5.m();

    /* loaded from: classes.dex */
    public static final class a extends b5.a<v0, a> implements m6 {
        private a() {
            super(v0.zzh);
        }

        /* synthetic */ a(w0 w0Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b implements d5 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4465b;

        static {
            new z0();
        }

        b(int i) {
            this.f4465b = i;
        }

        public static b a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static f5 j() {
            return d1.f4099a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4465b + " name=" + name() + '>';
        }
    }

    static {
        v0 v0Var = new v0();
        zzh = v0Var;
        b5.a(v0.class, v0Var);
    }

    private v0() {
    }

    public static v0 v() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.e.a.b.d.g.b5
    public final Object a(int i, Object obj, Object obj2) {
        switch (w0.f4486a[i - 1]) {
            case 1:
                return new v0();
            case 2:
                return new a(null);
            case 3:
                return b5.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.j(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                w6<v0> w6Var = zzi;
                if (w6Var == null) {
                    synchronized (v0.class) {
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

    public final b o() {
        b a2 = b.a(this.zzd);
        return a2 == null ? b.UNKNOWN_MATCH_TYPE : a2;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final List<String> t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzg.size();
    }
}
