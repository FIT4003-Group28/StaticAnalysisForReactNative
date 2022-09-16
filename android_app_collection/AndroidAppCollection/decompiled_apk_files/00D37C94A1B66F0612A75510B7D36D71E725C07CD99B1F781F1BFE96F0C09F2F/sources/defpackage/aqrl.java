package defpackage;
/* compiled from: PG */
/* renamed from: aqrl  reason: default package */
/* loaded from: classes2.dex */
public final class aqrl extends aopi implements aoqv {
    public static final aqrl a;
    private static volatile aorb b;

    static {
        aqrl aqrlVar = new aqrl();
        a = aqrlVar;
        aopi.registerDefaultInstance(aqrl.class, aqrlVar);
    }

    private aqrl() {
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
                return new aqrl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqrl.class) {
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
