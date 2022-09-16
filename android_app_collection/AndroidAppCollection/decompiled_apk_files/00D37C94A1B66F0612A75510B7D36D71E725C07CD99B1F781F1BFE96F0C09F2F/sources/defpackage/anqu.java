package defpackage;
/* compiled from: PG */
/* renamed from: anqu  reason: default package */
/* loaded from: classes.dex */
public final class anqu extends aopi implements aoqv {
    public static final anqu a;
    private static volatile aorb b;

    static {
        anqu anquVar = new anqu();
        a = anquVar;
        aopi.registerDefaultInstance(anqu.class, anquVar);
    }

    private anqu() {
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
                return newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new anqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anqu.class) {
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
