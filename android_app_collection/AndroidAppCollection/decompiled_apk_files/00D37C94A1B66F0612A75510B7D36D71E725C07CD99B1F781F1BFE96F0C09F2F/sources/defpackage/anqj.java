package defpackage;
/* compiled from: PG */
/* renamed from: anqj  reason: default package */
/* loaded from: classes.dex */
public final class anqj extends aopi implements aoqv {
    public static final anqj a;
    private static volatile aorb b;

    static {
        anqj anqjVar = new anqj();
        a = anqjVar;
        aopi.registerDefaultInstance(anqj.class, anqjVar);
    }

    private anqj() {
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
                return new anqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anqj.class) {
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
