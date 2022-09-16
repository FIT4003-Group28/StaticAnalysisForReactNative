package defpackage;
/* compiled from: PG */
/* renamed from: aogg  reason: default package */
/* loaded from: classes.dex */
public final class aogg extends aopi implements aoqv {
    public static final aogg a;
    private static volatile aorb b;

    static {
        aogg aoggVar = new aogg();
        a = aoggVar;
        aopi.registerDefaultInstance(aogg.class, aoggVar);
    }

    private aogg() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aogg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aogg.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
