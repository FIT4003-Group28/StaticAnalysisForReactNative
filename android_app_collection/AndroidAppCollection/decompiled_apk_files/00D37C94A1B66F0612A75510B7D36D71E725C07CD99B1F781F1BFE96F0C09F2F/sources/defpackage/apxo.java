package defpackage;
/* compiled from: PG */
/* renamed from: apxo  reason: default package */
/* loaded from: classes2.dex */
public final class apxo extends aopi implements aoqv {
    public static final apxo a;
    private static volatile aorb d;
    public int b;
    public aoob c = aoob.b;

    static {
        apxo apxoVar = new apxo();
        a = apxoVar;
        aopi.registerDefaultInstance(apxo.class, apxoVar);
    }

    private apxo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
            case 3:
                return new apxo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apxo.class) {
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
