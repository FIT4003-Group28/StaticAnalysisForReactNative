package defpackage;
/* compiled from: PG */
/* renamed from: awcm  reason: default package */
/* loaded from: classes2.dex */
public final class awcm extends aopi implements aoqv {
    public static final awcm a;
    private static volatile aorb e;
    public boolean b;
    public int c;
    public int d;
    private int f;

    static {
        awcm awcmVar = new awcm();
        a = awcmVar;
        aopi.registerDefaultInstance(awcm.class, awcmVar);
    }

    private awcm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0007င\u0004", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new awcm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awcm.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
