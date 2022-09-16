package defpackage;
/* compiled from: PG */
/* renamed from: baae  reason: default package */
/* loaded from: classes2.dex */
public final class baae extends aopi implements aoqv {
    public static final baae a;
    private static volatile aorb w;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public baac t;
    public baac u;
    public aoqp v = aoqp.a;

    static {
        baae baaeVar = new baae();
        a = baaeVar;
        aopi.registerDefaultInstance(baae.class, baaeVar);
    }

    private baae() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0012\rဉ\u0013\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016ဌ\u0011\u0017ဂ\r\u0018ဂ\u000e", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "t", "u", "d", "e", "v", baad.a, "g", "j", "h", "m", "n", "s", axce.t, "o", "p"});
            case 3:
                return new baae();
            case 4:
                return new aopa((float[]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (baae.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
