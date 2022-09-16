package defpackage;
/* compiled from: PG */
/* renamed from: awzw  reason: default package */
/* loaded from: classes2.dex */
public final class awzw extends aopi implements aoqv {
    private static final awzw a;
    private static volatile aorb b;

    static {
        awzw awzwVar = new awzw();
        a = awzwVar;
        aopi.registerDefaultInstance(awzw.class, awzwVar);
    }

    private awzw() {
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
                return new awzw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awzw.class) {
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
