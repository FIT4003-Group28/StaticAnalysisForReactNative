package defpackage;
/* compiled from: PG */
/* renamed from: aulr  reason: default package */
/* loaded from: classes2.dex */
public final class aulr extends aopi implements aoqv {
    private static volatile aorb F;
    public static final aulr a;
    public aunb A;
    public aunb B;
    public aunb C;
    public aunb D;
    public aunb E;
    private aoux G;
    private aunb H;
    public int b;
    public asow c;
    public asow d;
    public arag e;
    public aulq f;
    public ates g;
    public aulx h;
    public asgn i;
    public aunb j;
    public aunb k;
    public aunb l;
    public aunb m;
    public aunb n;
    public int o;
    public aunb p;
    public aunb q;
    public aubp r;
    public int t;
    public aunb u;
    public int v;
    public aunb w;
    public aunb x;
    public ault y;
    public aunb z;
    private byte I = 2;
    public aoob s = aoob.b;

    static {
        aulr aulrVar = new aulr();
        a = aulrVar;
        aopi.registerDefaultInstance(aulr.class, aulrVar);
    }

    private aulr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.I = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u0019\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fဌ\f\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u000f\u0010ည\u0010\u0011ᐉ\u0011\u0012ဌ\u0012\u0013ᐉ\u0013\u0014ဌ\u0014\u0015ᐉ\u0015\u0016ᐉ\u0016\u0017ဉ\u0017\u0018ᐉ\u0001\u0019ᐉ\u0018\u001aᐉ\u0019\u001bᐉ\u001a\u001cᐉ\u001b\u001dᐉ\u001c\u001eᐉ\u001d\u001fᐉ\u001e", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", aulk.g, "p", "q", "r", "s", "G", "t", aulk.e, "u", "v", aulk.f, "w", "x", "y", "d", "z", "A", "B", "C", "D", "H", "E"});
            case 3:
                return new aulr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = F;
                if (aorbVar == null) {
                    synchronized (aulr.class) {
                        aorbVar = F;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            F = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
