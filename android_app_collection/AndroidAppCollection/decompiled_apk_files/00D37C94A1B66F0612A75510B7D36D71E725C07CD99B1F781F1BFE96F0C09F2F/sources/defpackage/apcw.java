package defpackage;
/* compiled from: PG */
/* renamed from: apcw  reason: default package */
/* loaded from: classes.dex */
public final class apcw extends aopi implements aoqv {
    public static final apcw a;
    private static volatile aorb b;

    static {
        apcw apcwVar = new apcw();
        a = apcwVar;
        aopi.registerDefaultInstance(apcw.class, apcwVar);
    }

    private apcw() {
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
                return new apcw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apcw.class) {
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
