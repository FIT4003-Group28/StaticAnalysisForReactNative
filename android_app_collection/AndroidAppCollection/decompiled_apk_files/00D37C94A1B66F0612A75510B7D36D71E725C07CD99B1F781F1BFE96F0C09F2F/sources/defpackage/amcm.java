package defpackage;
/* compiled from: PG */
/* renamed from: amcm  reason: default package */
/* loaded from: classes.dex */
public final class amcm extends aopi implements aoqv {
    public static final amcm a;
    private static volatile aorb e;
    public int b;
    public long c;
    public long d;

    static {
        amcm amcmVar = new amcm();
        a = amcmVar;
        aopi.registerDefaultInstance(amcm.class, amcmVar);
    }

    private amcm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new amcm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (amcm.class) {
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
