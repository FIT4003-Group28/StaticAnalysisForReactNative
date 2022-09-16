package defpackage;
/* compiled from: PG */
/* renamed from: arda  reason: default package */
/* loaded from: classes2.dex */
public final class arda extends aopi implements aoqv {
    public static final arda a;
    private static volatile aorb d;
    public double b;
    public double c;
    private int e;

    static {
        arda ardaVar = new arda();
        a = ardaVar;
        aopi.registerDefaultInstance(arda.class, ardaVar);
    }

    private arda() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new arda();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arda.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
