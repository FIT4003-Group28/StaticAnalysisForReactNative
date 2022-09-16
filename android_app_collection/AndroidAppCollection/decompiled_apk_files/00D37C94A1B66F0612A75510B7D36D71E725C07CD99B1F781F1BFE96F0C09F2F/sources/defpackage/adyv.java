package defpackage;
/* compiled from: PG */
/* renamed from: adyv  reason: default package */
/* loaded from: classes.dex */
public final class adyv extends aopi implements aoqv {
    public static final adyv a;
    private static volatile aorb b;

    static {
        adyv adyvVar = new adyv();
        a = adyvVar;
        aopi.registerDefaultInstance(adyv.class, adyvVar);
    }

    private adyv() {
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
                return new adyv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (adyv.class) {
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
