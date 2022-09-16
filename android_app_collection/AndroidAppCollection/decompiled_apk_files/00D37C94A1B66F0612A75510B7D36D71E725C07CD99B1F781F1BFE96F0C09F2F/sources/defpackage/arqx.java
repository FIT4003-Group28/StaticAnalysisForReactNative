package defpackage;
/* compiled from: PG */
/* renamed from: arqx  reason: default package */
/* loaded from: classes2.dex */
public final class arqx extends aopi implements aoqv {
    public static final arqx a;
    private static volatile aorb d;
    public int b;
    public aoob c = aoob.b;
    private int e;

    static {
        arqx arqxVar = new arqx();
        a = arqxVar;
        aopi.registerDefaultInstance(arqx.class, arqxVar);
    }

    private arqx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"e", "b", aqvj.k, "c"});
            case 3:
                return new arqx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arqx.class) {
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
