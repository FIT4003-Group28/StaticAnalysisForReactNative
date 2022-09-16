package defpackage;
/* compiled from: PG */
/* renamed from: aowa  reason: default package */
/* loaded from: classes.dex */
public final class aowa extends aopi implements aoqv {
    public static final aowa a;
    private static volatile aorb c;
    public boolean b;
    private int d;

    static {
        aowa aowaVar = new aowa();
        a = aowaVar;
        aopi.registerDefaultInstance(aowa.class, aowaVar);
    }

    private aowa() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0000\u0011ဇ\u0007", new Object[]{"d", "b"});
            case 3:
                return new aowa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aowa.class) {
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
