package defpackage;
/* compiled from: PG */
/* renamed from: dnu  reason: default package */
/* loaded from: classes3.dex */
public final class dnu extends aopi implements aoqv {
    public static final dnu a;
    private static volatile aorb v;
    public int b;
    public long r;
    public long s;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public int i = 1000;
    public long j = -1;
    public long k = -1;
    public long l = -1;
    public int m = 1000;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long t = -1;
    public long u = -1;

    static {
        dnu dnuVar = new dnu();
        a = dnuVar;
        aopi.registerDefaultInstance(dnu.class, dnuVar);
    }

    private dnu() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", dnn.f, "j", "k", "l", "m", dnn.f, "n", "o", "p", "q", "r", "s", "t", "u"});
            case 3:
                return new dnu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (dnu.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
