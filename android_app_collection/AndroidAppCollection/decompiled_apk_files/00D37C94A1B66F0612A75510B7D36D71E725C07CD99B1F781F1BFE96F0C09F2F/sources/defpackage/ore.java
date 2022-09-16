package defpackage;
/* compiled from: PG */
/* renamed from: ore  reason: default package */
/* loaded from: classes4.dex */
public final class ore extends aopi implements aoqv {
    public static final ore a;
    private static volatile aorb f;
    public int b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    public int e;

    static {
        ore oreVar = new ore();
        a = oreVar;
        aopi.registerDefaultInstance(ore.class, oreVar);
    }

    private ore() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ည\u0000\u0005ည\u0001\u0006ဌ\u0002", new Object[]{"b", "c", "d", "e", aqfh.a});
            case 3:
                return new ore();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ore.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
