package defpackage;
/* compiled from: PG */
/* renamed from: apgg  reason: default package */
/* loaded from: classes.dex */
public final class apgg extends aopi implements aoqv {
    public static final apgg a;
    private static volatile aorb c;
    public boolean b;
    private int d;

    static {
        apgg apggVar = new apgg();
        a = apggVar;
        aopi.registerDefaultInstance(apgg.class, apggVar);
    }

    private apgg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"d", "b"});
            case 3:
                return new apgg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apgg.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
