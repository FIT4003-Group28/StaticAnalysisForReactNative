package defpackage;
/* compiled from: PG */
/* renamed from: apxn  reason: default package */
/* loaded from: classes2.dex */
public final class apxn extends aopi implements aoqv {
    public static final apxn a;
    private static volatile aorb d;
    public int b;
    public aoob c = aoob.b;

    static {
        apxn apxnVar = new apxn();
        a = apxnVar;
        aopi.registerDefaultInstance(apxn.class, apxnVar);
    }

    private apxn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ည\u0000", new Object[]{"b", "c"});
            case 3:
                return new apxn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apxn.class) {
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
