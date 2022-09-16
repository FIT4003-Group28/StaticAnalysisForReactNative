package defpackage;
/* compiled from: PG */
/* renamed from: fda  reason: default package */
/* loaded from: classes3.dex */
public final class fda extends aopi implements aoqv {
    public static final fda a;
    private static volatile aorb o;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;
    public long l;
    public long m;
    public int n;
    public aoqp j = aoqp.a;
    public String c = "";
    public boolean k = true;

    static {
        fda fdaVar = new fda();
        a = fdaVar;
        aopi.registerDefaultInstance(fda.class, fdaVar);
    }

    private fda() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\b2\tဇ\u0007\nဂ\b\u000bဂ\t\fင\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", fcz.a, "k", "l", "m", "n"});
            case 3:
                return new fda();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (fda.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
