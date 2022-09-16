package defpackage;
/* compiled from: PG */
/* renamed from: dnl  reason: default package */
/* loaded from: classes3.dex */
public final class dnl extends aopi implements aoqv {
    public static final dnl a;
    private static volatile aorb h;
    public int b;
    public int c;
    public boolean f;
    public boolean d = true;
    public String e = "unknown_host";
    public boolean g = true;

    static {
        dnl dnlVar = new dnl();
        a = dnlVar;
        aopi.registerDefaultInstance(dnl.class, dnlVar);
    }

    private dnl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", dnn.b, "d", "e", "f", "g"});
            case 3:
                return new dnl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (dnl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
