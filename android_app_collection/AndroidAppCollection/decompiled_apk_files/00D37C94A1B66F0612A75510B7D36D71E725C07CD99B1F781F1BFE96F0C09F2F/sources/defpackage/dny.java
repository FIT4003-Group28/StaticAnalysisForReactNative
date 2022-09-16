package defpackage;
/* compiled from: PG */
/* renamed from: dny  reason: default package */
/* loaded from: classes3.dex */
public final class dny extends aopi implements aoqv {
    public static final dny a;
    private static volatile aorb g;
    public int b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    public aoob e = aoob.b;
    public aoob f = aoob.b;

    static {
        dny dnyVar = new dny();
        a = dnyVar;
        aopi.registerDefaultInstance(dny.class, dnyVar);
    }

    private dny() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new dny();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (dny.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
