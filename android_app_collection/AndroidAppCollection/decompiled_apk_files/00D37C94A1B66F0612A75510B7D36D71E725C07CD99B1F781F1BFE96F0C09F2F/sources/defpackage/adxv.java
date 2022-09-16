package defpackage;
/* compiled from: PG */
/* renamed from: adxv  reason: default package */
/* loaded from: classes.dex */
public final class adxv extends aopi implements aoqv {
    public static final adxv a;
    private static volatile aorb b;

    static {
        adxv adxvVar = new adxv();
        a = adxvVar;
        aopi.registerDefaultInstance(adxv.class, adxvVar);
    }

    private adxv() {
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
                return new adxv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (adxv.class) {
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
