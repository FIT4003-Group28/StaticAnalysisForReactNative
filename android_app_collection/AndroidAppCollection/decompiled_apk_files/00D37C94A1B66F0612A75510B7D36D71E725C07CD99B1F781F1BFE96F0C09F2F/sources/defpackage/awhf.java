package defpackage;
/* compiled from: PG */
/* renamed from: awhf  reason: default package */
/* loaded from: classes2.dex */
public final class awhf extends aopi implements aoqv {
    public static final awhf a;
    private static volatile aorb e;
    public int b;
    public aoob c = aoob.b;
    public int d;

    static {
        awhf awhfVar = new awhf();
        a = awhfVar;
        aopi.registerDefaultInstance(awhf.class, awhfVar);
    }

    private awhf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", awbk.q});
            case 3:
                return new awhf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awhf.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
