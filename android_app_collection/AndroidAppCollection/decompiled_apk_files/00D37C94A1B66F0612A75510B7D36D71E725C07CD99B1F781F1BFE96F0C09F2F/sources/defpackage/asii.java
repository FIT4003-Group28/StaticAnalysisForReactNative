package defpackage;
/* compiled from: PG */
/* renamed from: asii  reason: default package */
/* loaded from: classes2.dex */
public final class asii extends aopi implements aoqv {
    public static final asii a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public awbs d;
    public asjj e;
    public int f;

    static {
        asii asiiVar = new asii();
        a = asiiVar;
        aopi.registerDefaultInstance(asii.class, asiiVar);
    }

    private asii() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", asev.k});
            case 3:
                return new asii();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asii.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
