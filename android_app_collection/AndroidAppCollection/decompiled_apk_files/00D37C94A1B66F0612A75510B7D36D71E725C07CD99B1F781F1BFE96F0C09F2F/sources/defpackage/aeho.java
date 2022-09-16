package defpackage;
/* compiled from: PG */
/* renamed from: aeho  reason: default package */
/* loaded from: classes.dex */
public final class aeho extends aopi implements aoqv {
    public static final aeho a;
    private static volatile aorb f;
    public int b;
    public ajfw c;
    public int d;
    public int e;

    static {
        aeho aehoVar = new aeho();
        a = aehoVar;
        aopi.registerDefaultInstance(aeho.class, aehoVar);
    }

    private aeho() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဍ\u0001\u0003ဍ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aeho();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aeho.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
